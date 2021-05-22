package io.grpc.examples.notice.server;

import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.notice.AddRequest;
import io.grpc.examples.notice.NoticeGrpc;
import io.grpc.examples.notice.Reply;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Daniel Liu
 */
public class NoticeClient {
    private static final Logger logger = Logger.getLogger(NoticeClient.class.getName());

    private NoticeGrpc.NoticeBlockingStub blockingStub;
    private NoticeGrpc.NoticeStub asyncStub;

    public NoticeClient(Channel channel) {
        blockingStub = NoticeGrpc.newBlockingStub(channel);
        asyncStub = NoticeGrpc.newStub(channel);
    }

    public static void main(String[] args) throws InterruptedException {
        Channel channel = ManagedChannelBuilder
                .forTarget("localhost:9090")
                .usePlaintext()
                .build();
        NoticeClient client = new NoticeClient(channel);

        List<StreamObserver<Reply>> streamObservers = generateStreamReply(5);

        for (StreamObserver<Reply> observer : streamObservers) {
            Thread.sleep(3_000);
            StreamObserver<AddRequest> streamObserver = client.asyncStub.subscript(observer);
//            for (int i = 0; i < 10; i++) {
//                streamObserver.onNext(AddRequest.newBuilder().setName("" + i).build());
//            }
        }
//        streamObserver.onCompleted();
        Thread.sleep(20_000);
    }

    public static List<StreamObserver<Reply>> generateStreamReply(int size) {
        List<StreamObserver<Reply>> res = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            final int id = i;
            StreamObserver<Reply> streamReply = new StreamObserver<Reply>() {
                @Override
                public void onNext(Reply value) {
                    System.out.println(value.getMessage());
                }

                @Override
                public void onError(Throwable t) {
                }

                @Override
                public void onCompleted() {
                    System.out.println("服务端调用了onCompleted");
                }
            };
            res.add(streamReply);
        }
        return res;
    }
}
