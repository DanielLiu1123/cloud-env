package io.grpc.examples.chatroom.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.examples.chatroom.service.ChatroomService;
import io.grpc.examples.notice.server.NoticeServer;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author Daniel Liu
 */
public class ChatroomServer {
    private static final Logger logger = Logger.getLogger(ChatroomServer.class.getName());

    private final int port;
    private final Server server;

    public ChatroomServer(int port) {
        this.port = port;
        server = ServerBuilder.forPort(port)
                .addService(new ChatroomService())
                .build();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ChatroomServer server = new ChatroomServer(9898);
        server.server.start();
        logger.info("ChatroomServer在端口[" + server.port + "]启动...");
        server.server.awaitTermination();
    }
}
