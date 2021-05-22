package io.grpc.examples.chatroom;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: chatroom.proto")
public final class ChatroomGrpc {

  private ChatroomGrpc() {}

  public static final String SERVICE_NAME = "chatroom.Chatroom";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Person,
      io.grpc.examples.chatroom.EnterResponse> getEnterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enter",
      requestType = io.grpc.examples.chatroom.Person.class,
      responseType = io.grpc.examples.chatroom.EnterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Person,
      io.grpc.examples.chatroom.EnterResponse> getEnterMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Person, io.grpc.examples.chatroom.EnterResponse> getEnterMethod;
    if ((getEnterMethod = ChatroomGrpc.getEnterMethod) == null) {
      synchronized (ChatroomGrpc.class) {
        if ((getEnterMethod = ChatroomGrpc.getEnterMethod) == null) {
          ChatroomGrpc.getEnterMethod = getEnterMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.chatroom.Person, io.grpc.examples.chatroom.EnterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatroom.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatroom.EnterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ChatroomMethodDescriptorSupplier("Enter"))
              .build();
        }
      }
    }
    return getEnterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Message,
      io.grpc.examples.chatroom.Empty> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = io.grpc.examples.chatroom.Message.class,
      responseType = io.grpc.examples.chatroom.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Message,
      io.grpc.examples.chatroom.Empty> getSendMessageMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Message, io.grpc.examples.chatroom.Empty> getSendMessageMethod;
    if ((getSendMessageMethod = ChatroomGrpc.getSendMessageMethod) == null) {
      synchronized (ChatroomGrpc.class) {
        if ((getSendMessageMethod = ChatroomGrpc.getSendMessageMethod) == null) {
          ChatroomGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.chatroom.Message, io.grpc.examples.chatroom.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatroom.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatroom.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ChatroomMethodDescriptorSupplier("SendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Person,
      io.grpc.examples.chatroom.Message> getReceiveMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveMessage",
      requestType = io.grpc.examples.chatroom.Person.class,
      responseType = io.grpc.examples.chatroom.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Person,
      io.grpc.examples.chatroom.Message> getReceiveMessageMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.chatroom.Person, io.grpc.examples.chatroom.Message> getReceiveMessageMethod;
    if ((getReceiveMessageMethod = ChatroomGrpc.getReceiveMessageMethod) == null) {
      synchronized (ChatroomGrpc.class) {
        if ((getReceiveMessageMethod = ChatroomGrpc.getReceiveMessageMethod) == null) {
          ChatroomGrpc.getReceiveMessageMethod = getReceiveMessageMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.chatroom.Person, io.grpc.examples.chatroom.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReceiveMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatroom.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.chatroom.Message.getDefaultInstance()))
              .setSchemaDescriptor(new ChatroomMethodDescriptorSupplier("ReceiveMessage"))
              .build();
        }
      }
    }
    return getReceiveMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatroomStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatroomStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatroomStub>() {
        @java.lang.Override
        public ChatroomStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatroomStub(channel, callOptions);
        }
      };
    return ChatroomStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatroomBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatroomBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatroomBlockingStub>() {
        @java.lang.Override
        public ChatroomBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatroomBlockingStub(channel, callOptions);
        }
      };
    return ChatroomBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatroomFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ChatroomFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ChatroomFutureStub>() {
        @java.lang.Override
        public ChatroomFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ChatroomFutureStub(channel, callOptions);
        }
      };
    return ChatroomFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ChatroomImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 进入聊天室
     * </pre>
     */
    public void enter(io.grpc.examples.chatroom.Person request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.EnterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnterMethod(), responseObserver);
    }

    /**
     * <pre>
     * 发送消息
     * </pre>
     */
    public void sendMessage(io.grpc.examples.chatroom.Message request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * 接收新消息
     * </pre>
     */
    public void receiveMessage(io.grpc.examples.chatroom.Person request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chatroom.Person,
                io.grpc.examples.chatroom.EnterResponse>(
                  this, METHODID_ENTER)))
          .addMethod(
            getSendMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.chatroom.Message,
                io.grpc.examples.chatroom.Empty>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getReceiveMessageMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.examples.chatroom.Person,
                io.grpc.examples.chatroom.Message>(
                  this, METHODID_RECEIVE_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class ChatroomStub extends io.grpc.stub.AbstractAsyncStub<ChatroomStub> {
    private ChatroomStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatroomStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatroomStub(channel, callOptions);
    }

    /**
     * <pre>
     * 进入聊天室
     * </pre>
     */
    public void enter(io.grpc.examples.chatroom.Person request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.EnterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 发送消息
     * </pre>
     */
    public void sendMessage(io.grpc.examples.chatroom.Message request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 接收新消息
     * </pre>
     */
    public void receiveMessage(io.grpc.examples.chatroom.Person request,
        io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReceiveMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChatroomBlockingStub extends io.grpc.stub.AbstractBlockingStub<ChatroomBlockingStub> {
    private ChatroomBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatroomBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatroomBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 进入聊天室
     * </pre>
     */
    public io.grpc.examples.chatroom.EnterResponse enter(io.grpc.examples.chatroom.Person request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 发送消息
     * </pre>
     */
    public io.grpc.examples.chatroom.Empty sendMessage(io.grpc.examples.chatroom.Message request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 接收新消息
     * </pre>
     */
    public java.util.Iterator<io.grpc.examples.chatroom.Message> receiveMessage(
        io.grpc.examples.chatroom.Person request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReceiveMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChatroomFutureStub extends io.grpc.stub.AbstractFutureStub<ChatroomFutureStub> {
    private ChatroomFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatroomFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ChatroomFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 进入聊天室
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chatroom.EnterResponse> enter(
        io.grpc.examples.chatroom.Person request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 发送消息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.chatroom.Empty> sendMessage(
        io.grpc.examples.chatroom.Message request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTER = 0;
  private static final int METHODID_SEND_MESSAGE = 1;
  private static final int METHODID_RECEIVE_MESSAGE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatroomImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatroomImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER:
          serviceImpl.enter((io.grpc.examples.chatroom.Person) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.EnterResponse>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((io.grpc.examples.chatroom.Message) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.Empty>) responseObserver);
          break;
        case METHODID_RECEIVE_MESSAGE:
          serviceImpl.receiveMessage((io.grpc.examples.chatroom.Person) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.chatroom.Message>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatroomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatroomBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.chatroom.ChatroomProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Chatroom");
    }
  }

  private static final class ChatroomFileDescriptorSupplier
      extends ChatroomBaseDescriptorSupplier {
    ChatroomFileDescriptorSupplier() {}
  }

  private static final class ChatroomMethodDescriptorSupplier
      extends ChatroomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatroomMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatroomGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatroomFileDescriptorSupplier())
              .addMethod(getEnterMethod())
              .addMethod(getSendMessageMethod())
              .addMethod(getReceiveMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
