// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notification.proto

package io.grpc.examples.notice;

public final class notification {
  private notification() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_notice_AddRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_notice_AddRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_notice_Reply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_notice_Reply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022notification.proto\022\006notice\"\032\n\nAddReque" +
      "st\022\014\n\004name\030\001 \001(\t\"\030\n\005Reply\022\017\n\007message\030\001 \001" +
      "(\t2{\n\006Notice\022;\n\020NoticeSubscriber\022\022.notic" +
      "e.AddRequest\032\r.notice.Reply\"\000(\0010\001\0224\n\tSub" +
      "script\022\022.notice.AddRequest\032\r.notice.Repl" +
      "y\"\000(\0010\001B)\n\027io.grpc.examples.noticeB\014noti" +
      "ficationP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_notice_AddRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_notice_AddRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_notice_AddRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_notice_Reply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_notice_Reply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_notice_Reply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}