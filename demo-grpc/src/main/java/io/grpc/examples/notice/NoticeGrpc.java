package io.grpc.examples.notice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The notice service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: notification.proto")
public final class NoticeGrpc {

  private NoticeGrpc() {}

  public static final String SERVICE_NAME = "notice.Notice";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.notice.AddRequest,
      io.grpc.examples.notice.Reply> getNoticeSubscriberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NoticeSubscriber",
      requestType = io.grpc.examples.notice.AddRequest.class,
      responseType = io.grpc.examples.notice.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.notice.AddRequest,
      io.grpc.examples.notice.Reply> getNoticeSubscriberMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.notice.AddRequest, io.grpc.examples.notice.Reply> getNoticeSubscriberMethod;
    if ((getNoticeSubscriberMethod = NoticeGrpc.getNoticeSubscriberMethod) == null) {
      synchronized (NoticeGrpc.class) {
        if ((getNoticeSubscriberMethod = NoticeGrpc.getNoticeSubscriberMethod) == null) {
          NoticeGrpc.getNoticeSubscriberMethod = getNoticeSubscriberMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.notice.AddRequest, io.grpc.examples.notice.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NoticeSubscriber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.notice.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.notice.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new NoticeMethodDescriptorSupplier("NoticeSubscriber"))
              .build();
        }
      }
    }
    return getNoticeSubscriberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.notice.AddRequest,
      io.grpc.examples.notice.Reply> getSubscriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscript",
      requestType = io.grpc.examples.notice.AddRequest.class,
      responseType = io.grpc.examples.notice.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.notice.AddRequest,
      io.grpc.examples.notice.Reply> getSubscriptMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.notice.AddRequest, io.grpc.examples.notice.Reply> getSubscriptMethod;
    if ((getSubscriptMethod = NoticeGrpc.getSubscriptMethod) == null) {
      synchronized (NoticeGrpc.class) {
        if ((getSubscriptMethod = NoticeGrpc.getSubscriptMethod) == null) {
          NoticeGrpc.getSubscriptMethod = getSubscriptMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.notice.AddRequest, io.grpc.examples.notice.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.notice.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.notice.Reply.getDefaultInstance()))
              .setSchemaDescriptor(new NoticeMethodDescriptorSupplier("Subscript"))
              .build();
        }
      }
    }
    return getSubscriptMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NoticeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NoticeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NoticeStub>() {
        @java.lang.Override
        public NoticeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NoticeStub(channel, callOptions);
        }
      };
    return NoticeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NoticeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NoticeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NoticeBlockingStub>() {
        @java.lang.Override
        public NoticeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NoticeBlockingStub(channel, callOptions);
        }
      };
    return NoticeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NoticeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NoticeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NoticeFutureStub>() {
        @java.lang.Override
        public NoticeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NoticeFutureStub(channel, callOptions);
        }
      };
    return NoticeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The notice service definition.
   * </pre>
   */
  public static abstract class NoticeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 通知订阅者
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.notice.AddRequest> noticeSubscriber(
        io.grpc.stub.StreamObserver<io.grpc.examples.notice.Reply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getNoticeSubscriberMethod(), responseObserver);
    }

    /**
     * <pre>
     * 订阅
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.notice.AddRequest> subscript(
        io.grpc.stub.StreamObserver<io.grpc.examples.notice.Reply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubscriptMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNoticeSubscriberMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.examples.notice.AddRequest,
                io.grpc.examples.notice.Reply>(
                  this, METHODID_NOTICE_SUBSCRIBER)))
          .addMethod(
            getSubscriptMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.examples.notice.AddRequest,
                io.grpc.examples.notice.Reply>(
                  this, METHODID_SUBSCRIPT)))
          .build();
    }
  }

  /**
   * <pre>
   * The notice service definition.
   * </pre>
   */
  public static final class NoticeStub extends io.grpc.stub.AbstractAsyncStub<NoticeStub> {
    private NoticeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoticeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NoticeStub(channel, callOptions);
    }

    /**
     * <pre>
     * 通知订阅者
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.notice.AddRequest> noticeSubscriber(
        io.grpc.stub.StreamObserver<io.grpc.examples.notice.Reply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getNoticeSubscriberMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 订阅
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.notice.AddRequest> subscript(
        io.grpc.stub.StreamObserver<io.grpc.examples.notice.Reply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSubscriptMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The notice service definition.
   * </pre>
   */
  public static final class NoticeBlockingStub extends io.grpc.stub.AbstractBlockingStub<NoticeBlockingStub> {
    private NoticeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoticeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NoticeBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The notice service definition.
   * </pre>
   */
  public static final class NoticeFutureStub extends io.grpc.stub.AbstractFutureStub<NoticeFutureStub> {
    private NoticeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoticeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NoticeFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_NOTICE_SUBSCRIBER = 0;
  private static final int METHODID_SUBSCRIPT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NoticeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NoticeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTICE_SUBSCRIBER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.noticeSubscriber(
              (io.grpc.stub.StreamObserver<io.grpc.examples.notice.Reply>) responseObserver);
        case METHODID_SUBSCRIPT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscript(
              (io.grpc.stub.StreamObserver<io.grpc.examples.notice.Reply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NoticeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NoticeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.notice.notification.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Notice");
    }
  }

  private static final class NoticeFileDescriptorSupplier
      extends NoticeBaseDescriptorSupplier {
    NoticeFileDescriptorSupplier() {}
  }

  private static final class NoticeMethodDescriptorSupplier
      extends NoticeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NoticeMethodDescriptorSupplier(String methodName) {
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
      synchronized (NoticeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NoticeFileDescriptorSupplier())
              .addMethod(getNoticeSubscriberMethod())
              .addMethod(getSubscriptMethod())
              .build();
        }
      }
    }
    return result;
  }
}
