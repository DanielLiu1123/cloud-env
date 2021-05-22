package io.grpc.examples.chatroom.server;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.chatroom.ChatroomGrpc;
import io.grpc.examples.chatroom.EnterResponse;
import io.grpc.examples.chatroom.Message;
import io.grpc.examples.chatroom.Person;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.List;

/**
 * @author Daniel Liu
 */
public class ChatroomClient {
    private final Channel channel;
    private final ChatroomGrpc.ChatroomBlockingStub blockingStub;
    private final ChatroomGrpc.ChatroomStub asyncStub;

    public ChatroomClient(int port) {
        this.channel = ManagedChannelBuilder.forTarget("localhost:" + port)
                .usePlaintext()
                .build();
        blockingStub = ChatroomGrpc.newBlockingStub(channel);
        asyncStub = ChatroomGrpc.newStub(channel);
    }

    public static void main(String[] args) throws InterruptedException {
        ChatroomClient client = new ChatroomClient(9898);

        List<String> names = Arrays.asList("a", "b", "c");

        for (String name : names) {
            Thread.sleep(3_000);
            Person person = Person.newBuilder()
                    .setName(name).build();
            // 进入聊天室
            EnterResponse response = client.blockingStub.enter(person);
            System.out.println(response.getMessage());
            // 接收消息
            client.asyncStub.receiveMessage(person, new StreamObserver<Message>() {
                @Override
                public void onNext(Message value) {
                    System.out.println(value.getMessage());
                }

                @Override
                public void onError(Throwable t) {

                }

                @Override
                public void onCompleted() {

                }
            });
            // 发送消息
            client.blockingStub.sendMessage(Message.newBuilder()
                    .setPerson(person)
                    .setMessage("大家好,我是" + name).build());
        }

        Thread.sleep(30_1000);
    }
}
