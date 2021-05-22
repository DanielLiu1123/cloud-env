package io.grpc.examples.chatroom.service;

import io.grpc.examples.chatroom.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Daniel Liu
 */
public class ChatroomService extends ChatroomGrpc.ChatroomImplBase {
    /**
     * name -> observer
     */
    private final Map<String, StreamObserver<Message>> receiveMessageObservers = new ConcurrentHashMap<>();
    /**
     * name -> message
     */
    private final Map<String, List<Message>> messages = new ConcurrentHashMap<>();

    @Override
    public void enter(Person request, StreamObserver<EnterResponse> responseObserver) {
        String name = request.getName();
        responseObserver.onNext(EnterResponse.newBuilder()
                .setMessage("恭喜你," + name + ",你已成功进入聊天室!")
                .build());
        // 通知其他人有新人加入
        for (Map.Entry<String, StreamObserver<Message>> entry : receiveMessageObservers.entrySet()) {
            entry.getValue().onNext(Message.newBuilder().setMessage("通知" + entry.getKey() + "有人新人加入,名字是" + request.getName()).build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void sendMessage(Message message, StreamObserver<Empty> responseObserver) {
        // 添加到消息map
        List<Message> messageByName = messages.get(message.getPerson().getName());
        if (messageByName == null) {
            messageByName = Collections.synchronizedList(new ArrayList<>());
            messageByName.add(message);
            messages.put(message.getPerson().getName(), messageByName);
        } else {
            messageByName.add(message);
        }

        // 通知其他人新消息
        for (Map.Entry<String, StreamObserver<Message>> entry : receiveMessageObservers.entrySet()) {
            entry.getValue().onNext(Message.newBuilder()
                    .setMessage(entry.getKey() + ": 收到来自[" + message.getPerson().getName() + "]的消息: " + message.getMessage()).build());
        }

        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void receiveMessage(Person person, StreamObserver<Message> responseObserver) {
        receiveMessageObservers.putIfAbsent(person.getName(), responseObserver);
        responseObserver.onNext(Message.newBuilder()
                .setMessage(person.getName() + "正在接收消息").build());
//        responseObserver.onCompleted();
    }

}
