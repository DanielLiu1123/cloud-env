package io.grpc.examples.notice.service;

import io.grpc.examples.notice.AddRequest;
import io.grpc.examples.notice.NoticeGrpc;
import io.grpc.examples.notice.Reply;
import io.grpc.stub.StreamObserver;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Daniel Liu
 */
public class NoticeService extends NoticeGrpc.NoticeImplBase {

    // name -> addRequest
    private final Map<Integer, StreamObserver<Reply>> subscribers = new ConcurrentHashMap<>();
    private AtomicInteger count = new AtomicInteger(0);
    private AtomicInteger generateId = new AtomicInteger(0);


    @Override
    public StreamObserver<AddRequest> noticeSubscriber(StreamObserver<Reply> responseObserver) {
        return new StreamObserver<AddRequest>() {
            @Override
            public void onNext(AddRequest addRequest) {
                responseObserver.onNext(Reply.newBuilder().setMessage(addRequest.getName() + "新增成功").build());
                System.out.println(addRequest.getName());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<AddRequest> subscript(StreamObserver<Reply> responseObserver) {
        int id = generateId.incrementAndGet();
        // 先通知其他订阅者有新的订阅者加入
        for (Map.Entry<Integer, StreamObserver<Reply>> entry : subscribers.entrySet()) {
            entry.getValue().onNext(Reply.newBuilder().setMessage("你好[" + entry.getKey() + "],有新的订阅者加入,他的id为[" + id + "]").build());
        }
        subscribers.putIfAbsent(id, responseObserver);
        StreamObserver<AddRequest> requestStreamObserver = new StreamObserver<AddRequest>() {
            final int connectionId = id;
            // 当client端调用onNext时, server端的回调
            @Override
            public void onNext(AddRequest addRequest) {
                count.incrementAndGet();
                responseObserver.onNext(Reply.newBuilder().setMessage(addRequest.getName() + "新增成功").build());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("error...");
                subscribers.remove(connectionId);
            }

            // 当client端调用onCompleted时, server端的回调
            @Override
            public void onCompleted() {
                responseObserver.onNext(Reply.newBuilder()
                        .setMessage("新增" + count.get() + "个订阅成功")
                        .build());
                responseObserver.onCompleted();
            }
        };
        return requestStreamObserver;
    }

    public Map<Integer, StreamObserver<Reply>> getSubscribers() {
        return subscribers;
    }
}
