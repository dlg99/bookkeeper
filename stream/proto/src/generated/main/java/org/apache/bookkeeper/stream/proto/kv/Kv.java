// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv.proto

package org.apache.bookkeeper.stream.proto.kv;

public final class Kv {
  private Kv() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_KeyValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_KeyValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_Event_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010kv.proto\022\023bookkeeper.proto.kv\"\244\001\n\010KeyV" +
      "alue\022\013\n\003key\030\001 \001(\014\022\027\n\017create_revision\030\002 \001" +
      "(\003\022\024\n\014mod_revision\030\003 \001(\003\022\017\n\007version\030\004 \001(" +
      "\003\022\r\n\005value\030\005 \001(\014\022\021\n\tis_number\030\006 \001(\010\022\024\n\014n" +
      "umber_value\030\007 \001(\003\022\023\n\013expire_time\030\010 \001(\003\"\270" +
      "\001\n\005Event\0222\n\004type\030\001 \001(\0162$.bookkeeper.prot" +
      "o.kv.Event.EventType\022)\n\002kv\030\002 \001(\0132\035.bookk" +
      "eeper.proto.kv.KeyValue\022.\n\007prev_kv\030\003 \001(\013" +
      "2\035.bookkeeper.proto.kv.KeyValue\" \n\tEvent" +
      "Type\022\007\n\003PUT\020\000\022\n\n\006DELETE\020\001B)\n%org.apache." +
      "bookkeeper.stream.proto.kvP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bookkeeper_proto_kv_KeyValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bookkeeper_proto_kv_KeyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_KeyValue_descriptor,
        new java.lang.String[] { "Key", "CreateRevision", "ModRevision", "Version", "Value", "IsNumber", "NumberValue", "ExpireTime", });
    internal_static_bookkeeper_proto_kv_Event_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bookkeeper_proto_kv_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_Event_descriptor,
        new java.lang.String[] { "Type", "Kv", "PrevKv", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
