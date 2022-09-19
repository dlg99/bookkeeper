// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_rpc.proto

package org.apache.bookkeeper.stream.proto.kv.rpc;

public final class KvRpc {
  private KvRpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_RoutingHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_RoutingHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_ResponseHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_ResponseHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_RangeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_RangeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_RangeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_RangeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_PutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_PutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_PutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_PutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_IncrementResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_IncrementResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_DeleteRangeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_DeleteRangeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_DeleteRangeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_DeleteRangeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_RequestOp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_RequestOp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_ResponseOp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_ResponseOp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_Compare_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_Compare_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_TxnRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_TxnRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_kv_rpc_TxnResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_kv_rpc_TxnResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014kv_rpc.proto\022\027bookkeeper.proto.kv.rpc\032" +
      "\010kv.proto\032\rstorage.proto\"C\n\rRoutingHeade" +
      "r\022\021\n\tstream_id\030\001 \001(\003\022\020\n\010range_id\030\002 \001(\003\022\r" +
      "\n\005r_key\030\003 \001(\014\"\204\001\n\016ResponseHeader\0222\n\004code" +
      "\030\001 \001(\0162$.bookkeeper.proto.storage.Status" +
      "Code\022>\n\016routing_header\030c \001(\0132&.bookkeepe" +
      "r.proto.kv.rpc.RoutingHeader\"\262\004\n\014RangeRe" +
      "quest\022\013\n\003key\030\001 \001(\014\022\021\n\trange_end\030\002 \001(\014\022\r\n" +
      "\005limit\030\003 \001(\003\022\020\n\010revision\030\004 \001(\003\022C\n\nsort_o" +
      "rder\030\005 \001(\0162/.bookkeeper.proto.kv.rpc.Ran" +
      "geRequest.SortOrder\022E\n\013sort_target\030\006 \001(\016" +
      "20.bookkeeper.proto.kv.rpc.RangeRequest." +
      "SortTarget\022\024\n\014serializable\030\007 \001(\010\022\021\n\tkeys" +
      "_only\030\010 \001(\010\022\022\n\ncount_only\030\t \001(\010\022\030\n\020min_m" +
      "od_revision\030\n \001(\003\022\030\n\020max_mod_revision\030\013 " +
      "\001(\003\022\033\n\023min_create_revision\030\014 \001(\003\022\033\n\023max_" +
      "create_revision\030\r \001(\003\0226\n\006header\030c \001(\0132&." +
      "bookkeeper.proto.kv.rpc.RoutingHeader\".\n" +
      "\tSortOrder\022\010\n\004NONE\020\000\022\n\n\006ASCEND\020\001\022\013\n\007DESC" +
      "END\020\002\"B\n\nSortTarget\022\007\n\003KEY\020\000\022\013\n\007VERSION\020" +
      "\001\022\n\n\006CREATE\020\002\022\007\n\003MOD\020\003\022\t\n\005VALUE\020\004\"\221\001\n\rRa" +
      "ngeResponse\0227\n\006header\030\001 \001(\0132\'.bookkeeper" +
      ".proto.kv.rpc.ResponseHeader\022*\n\003kvs\030\002 \003(" +
      "\0132\035.bookkeeper.proto.kv.KeyValue\022\014\n\004more" +
      "\030\003 \001(\010\022\r\n\005count\030\004 \001(\003\"\306\001\n\nPutRequest\022\013\n\003" +
      "key\030\001 \001(\014\022\r\n\005value\030\002 \001(\014\022\r\n\005lease\030\003 \001(\003\022" +
      "\017\n\007prev_kv\030\004 \001(\010\022\024\n\014ignore_value\030\005 \001(\010\022\024" +
      "\n\014ignore_lease\030\006 \001(\010\0226\n\006header\030c \001(\0132&.b" +
      "ookkeeper.proto.kv.rpc.RoutingHeader\022\030\n\020" +
      "expected_version\030d \001(\003\"v\n\013PutResponse\0227\n" +
      "\006header\030\001 \001(\0132\'.bookkeeper.proto.kv.rpc." +
      "ResponseHeader\022.\n\007prev_kv\030\002 \001(\0132\035.bookke" +
      "eper.proto.kv.KeyValue\"z\n\020IncrementReque" +
      "st\022\013\n\003key\030\001 \001(\014\022\016\n\006amount\030\002 \001(\003\022\021\n\tget_t" +
      "otal\030\003 \001(\010\0226\n\006header\030c \001(\0132&.bookkeeper." +
      "proto.kv.rpc.RoutingHeader\"b\n\021IncrementR" +
      "esponse\0227\n\006header\030\001 \001(\0132\'.bookkeeper.pro" +
      "to.kv.rpc.ResponseHeader\022\024\n\014total_amount" +
      "\030\002 \001(\003\"}\n\022DeleteRangeRequest\022\013\n\003key\030\001 \001(" +
      "\014\022\021\n\trange_end\030\002 \001(\014\022\017\n\007prev_kv\030\003 \001(\010\0226\n" +
      "\006header\030c \001(\0132&.bookkeeper.proto.kv.rpc." +
      "RoutingHeader\"\220\001\n\023DeleteRangeResponse\0227\n" +
      "\006header\030\001 \001(\0132\'.bookkeeper.proto.kv.rpc." +
      "ResponseHeader\022\017\n\007deleted\030\002 \001(\003\022/\n\010prev_" +
      "kvs\030\003 \003(\0132\035.bookkeeper.proto.kv.KeyValue" +
      "\"\337\001\n\tRequestOp\022>\n\rrequest_range\030\001 \001(\0132%." +
      "bookkeeper.proto.kv.rpc.RangeRequestH\000\022:" +
      "\n\013request_put\030\002 \001(\0132#.bookkeeper.proto.k" +
      "v.rpc.PutRequestH\000\022K\n\024request_delete_ran" +
      "ge\030\003 \001(\0132+.bookkeeper.proto.kv.rpc.Delet" +
      "eRangeRequestH\000B\t\n\007request\"\347\001\n\nResponseO" +
      "p\022@\n\016response_range\030\001 \001(\0132&.bookkeeper.p" +
      "roto.kv.rpc.RangeResponseH\000\022<\n\014response_" +
      "put\030\002 \001(\0132$.bookkeeper.proto.kv.rpc.PutR" +
      "esponseH\000\022M\n\025response_delete_range\030\003 \001(\013" +
      "2,.bookkeeper.proto.kv.rpc.DeleteRangeRe" +
      "sponseH\000B\n\n\010response\"\375\002\n\007Compare\022>\n\006resu" +
      "lt\030\001 \001(\0162..bookkeeper.proto.kv.rpc.Compa" +
      "re.CompareResult\022>\n\006target\030\002 \001(\0162..bookk" +
      "eeper.proto.kv.rpc.Compare.CompareTarget" +
      "\022\013\n\003key\030\003 \001(\014\022\021\n\007version\030\004 \001(\003H\000\022\031\n\017crea" +
      "te_revision\030\005 \001(\003H\000\022\026\n\014mod_revision\030\006 \001(" +
      "\003H\000\022\017\n\005value\030\007 \001(\014H\000\"@\n\rCompareResult\022\t\n" +
      "\005EQUAL\020\000\022\013\n\007GREATER\020\001\022\010\n\004LESS\020\002\022\r\n\tNOT_E" +
      "QUAL\020\003\"<\n\rCompareTarget\022\013\n\007VERSION\020\000\022\n\n\006" +
      "CREATE\020\001\022\007\n\003MOD\020\002\022\t\n\005VALUE\020\003B\016\n\014target_u" +
      "nion\"\341\001\n\nTxnRequest\0221\n\007compare\030\001 \003(\0132 .b" +
      "ookkeeper.proto.kv.rpc.Compare\0223\n\007succes" +
      "s\030\002 \003(\0132\".bookkeeper.proto.kv.rpc.Reques" +
      "tOp\0223\n\007failure\030\003 \003(\0132\".bookkeeper.proto." +
      "kv.rpc.RequestOp\0226\n\006header\030c \001(\0132&.bookk" +
      "eeper.proto.kv.rpc.RoutingHeader\"\221\001\n\013Txn" +
      "Response\0227\n\006header\030\001 \001(\0132\'.bookkeeper.pr" +
      "oto.kv.rpc.ResponseHeader\022\021\n\tsucceeded\030\002" +
      " \001(\010\0226\n\tresponses\030\003 \003(\0132#.bookkeeper.pro" +
      "to.kv.rpc.ResponseOp2\335\003\n\014TableService\022X\n" +
      "\005Range\022%.bookkeeper.proto.kv.rpc.RangeRe" +
      "quest\032&.bookkeeper.proto.kv.rpc.RangeRes" +
      "ponse\"\000\022R\n\003Put\022#.bookkeeper.proto.kv.rpc" +
      ".PutRequest\032$.bookkeeper.proto.kv.rpc.Pu" +
      "tResponse\"\000\022e\n\006Delete\022+.bookkeeper.proto" +
      ".kv.rpc.DeleteRangeRequest\032,.bookkeeper." +
      "proto.kv.rpc.DeleteRangeResponse\"\000\022R\n\003Tx" +
      "n\022#.bookkeeper.proto.kv.rpc.TxnRequest\032$" +
      ".bookkeeper.proto.kv.rpc.TxnResponse\"\000\022d" +
      "\n\tIncrement\022).bookkeeper.proto.kv.rpc.In" +
      "crementRequest\032*.bookkeeper.proto.kv.rpc" +
      ".IncrementResponse\"\000B-\n)org.apache.bookk" +
      "eeper.stream.proto.kv.rpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.bookkeeper.stream.proto.kv.Kv.getDescriptor(),
          org.apache.bookkeeper.stream.proto.storage.Storage.getDescriptor(),
        });
    internal_static_bookkeeper_proto_kv_rpc_RoutingHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bookkeeper_proto_kv_rpc_RoutingHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_RoutingHeader_descriptor,
        new java.lang.String[] { "StreamId", "RangeId", "RKey", });
    internal_static_bookkeeper_proto_kv_rpc_ResponseHeader_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bookkeeper_proto_kv_rpc_ResponseHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_ResponseHeader_descriptor,
        new java.lang.String[] { "Code", "RoutingHeader", });
    internal_static_bookkeeper_proto_kv_rpc_RangeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bookkeeper_proto_kv_rpc_RangeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_RangeRequest_descriptor,
        new java.lang.String[] { "Key", "RangeEnd", "Limit", "Revision", "SortOrder", "SortTarget", "Serializable", "KeysOnly", "CountOnly", "MinModRevision", "MaxModRevision", "MinCreateRevision", "MaxCreateRevision", "Header", });
    internal_static_bookkeeper_proto_kv_rpc_RangeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bookkeeper_proto_kv_rpc_RangeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_RangeResponse_descriptor,
        new java.lang.String[] { "Header", "Kvs", "More", "Count", });
    internal_static_bookkeeper_proto_kv_rpc_PutRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bookkeeper_proto_kv_rpc_PutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_PutRequest_descriptor,
        new java.lang.String[] { "Key", "Value", "Lease", "PrevKv", "IgnoreValue", "IgnoreLease", "Header", "ExpectedVersion", });
    internal_static_bookkeeper_proto_kv_rpc_PutResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_bookkeeper_proto_kv_rpc_PutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_PutResponse_descriptor,
        new java.lang.String[] { "Header", "PrevKv", });
    internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_descriptor,
        new java.lang.String[] { "Key", "Amount", "GetTotal", "Header", });
    internal_static_bookkeeper_proto_kv_rpc_IncrementResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_bookkeeper_proto_kv_rpc_IncrementResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_IncrementResponse_descriptor,
        new java.lang.String[] { "Header", "TotalAmount", });
    internal_static_bookkeeper_proto_kv_rpc_DeleteRangeRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_bookkeeper_proto_kv_rpc_DeleteRangeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_DeleteRangeRequest_descriptor,
        new java.lang.String[] { "Key", "RangeEnd", "PrevKv", "Header", });
    internal_static_bookkeeper_proto_kv_rpc_DeleteRangeResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_bookkeeper_proto_kv_rpc_DeleteRangeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_DeleteRangeResponse_descriptor,
        new java.lang.String[] { "Header", "Deleted", "PrevKvs", });
    internal_static_bookkeeper_proto_kv_rpc_RequestOp_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_bookkeeper_proto_kv_rpc_RequestOp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_RequestOp_descriptor,
        new java.lang.String[] { "RequestRange", "RequestPut", "RequestDeleteRange", "Request", });
    internal_static_bookkeeper_proto_kv_rpc_ResponseOp_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_bookkeeper_proto_kv_rpc_ResponseOp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_ResponseOp_descriptor,
        new java.lang.String[] { "ResponseRange", "ResponsePut", "ResponseDeleteRange", "Response", });
    internal_static_bookkeeper_proto_kv_rpc_Compare_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_bookkeeper_proto_kv_rpc_Compare_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_Compare_descriptor,
        new java.lang.String[] { "Result", "Target", "Key", "Version", "CreateRevision", "ModRevision", "Value", "TargetUnion", });
    internal_static_bookkeeper_proto_kv_rpc_TxnRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_bookkeeper_proto_kv_rpc_TxnRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_TxnRequest_descriptor,
        new java.lang.String[] { "Compare", "Success", "Failure", "Header", });
    internal_static_bookkeeper_proto_kv_rpc_TxnResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_bookkeeper_proto_kv_rpc_TxnResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_kv_rpc_TxnResponse_descriptor,
        new java.lang.String[] { "Header", "Succeeded", "Responses", });
    org.apache.bookkeeper.stream.proto.kv.Kv.getDescriptor();
    org.apache.bookkeeper.stream.proto.storage.Storage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}