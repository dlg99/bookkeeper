// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cluster.proto

package org.apache.bookkeeper.stream.proto.cluster;

public final class Cluster {
  private Cluster() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_cluster_ServerAssignmentData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_cluster_ServerAssignmentData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_ServersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_ServersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bookkeeper_proto_cluster_ClusterMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bookkeeper_proto_cluster_ClusterMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rcluster.proto\022\030bookkeeper.proto.cluste" +
      "r\"*\n\024ServerAssignmentData\022\022\n\ncontainers\030" +
      "\001 \003(\003\"\306\001\n\025ClusterAssignmentData\022M\n\007serve" +
      "rs\030\001 \003(\0132<.bookkeeper.proto.cluster.Clus" +
      "terAssignmentData.ServersEntry\032^\n\014Server" +
      "sEntry\022\013\n\003key\030\001 \001(\t\022=\n\005value\030\002 \001(\0132..boo" +
      "kkeeper.proto.cluster.ServerAssignmentDa" +
      "ta:\0028\001\"1\n\017ClusterMetadata\022\036\n\026num_storage" +
      "_containers\030\001 \001(\003B.\n*org.apache.bookkeep" +
      "er.stream.proto.clusterP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_bookkeeper_proto_cluster_ServerAssignmentData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bookkeeper_proto_cluster_ServerAssignmentData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_cluster_ServerAssignmentData_descriptor,
        new java.lang.String[] { "Containers", });
    internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_descriptor,
        new java.lang.String[] { "Servers", });
    internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_ServersEntry_descriptor =
      internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_descriptor.getNestedTypes().get(0);
    internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_ServersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_cluster_ClusterAssignmentData_ServersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_bookkeeper_proto_cluster_ClusterMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bookkeeper_proto_cluster_ClusterMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bookkeeper_proto_cluster_ClusterMetadata_descriptor,
        new java.lang.String[] { "NumStorageContainers", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}