package io.grpc.examples.notice.server;

import cn.hutool.core.thread.ThreadUtil;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.examples.notice.AddRequest;
import io.grpc.examples.notice.Reply;
import io.grpc.examples.notice.service.NoticeService;
import io.grpc.stub.StreamObserver;
import io.netty.util.concurrent.DefaultThreadFactory;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author Daniel Liu
 */
public class NoticeServer {
    private static final Logger logger = Logger.getLogger(NoticeServer.class.getName());

    private final Server server;
    private final int port;
    private final NoticeService noticeService;

    public NoticeServer(int port) {
        NoticeService service = new NoticeService();
        noticeService = service;
        this.server = ServerBuilder
                .forPort(port)
                .addService(service)
                .build();
        this.port = port;
    }

    public void start() throws IOException {
        server.start();
        logger.info("NoticeServer在端口[" + port + "]启动...");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            shutdown();
            logger.info("关闭服务...");
        }));
    }

    public void awaitUntilShutdown() throws InterruptedException {
        server.awaitTermination();
    }

    public void shutdown() {
        server.shutdown();
    }

    public static void main(String[] args) throws Exception {
        NoticeServer server = new NoticeServer(9090);
        server.start();
//        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1, new DefaultThreadFactory("pool"));
//        executorService.scheduleWithFixedDelay(() -> {
//            Map<Integer, StreamObserver<Reply>> subscribers = server.noticeService.getSubscribers();
//            System.out.println("定时通知订阅者: " + Thread.currentThread().getName() + " -> " + subscribers.size());
//            for (Map.Entry<Integer, StreamObserver<Reply>> entry : subscribers.entrySet()) {
//                entry.getValue().onNext(Reply.newBuilder().setMessage("通知" + entry.getKey()).build());
//            }
//        }, 10, 10, TimeUnit.SECONDS);
        server.awaitUntilShutdown();
    }
}
