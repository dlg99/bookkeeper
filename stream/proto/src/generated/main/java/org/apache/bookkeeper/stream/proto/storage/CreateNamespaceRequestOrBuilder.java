// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage.proto

package org.apache.bookkeeper.stream.proto.storage;

public interface CreateNamespaceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.storage.CreateNamespaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.bookkeeper.proto.stream.NamespaceConfiguration ns_conf = 2;</code>
   * @return Whether the nsConf field is set.
   */
  boolean hasNsConf();
  /**
   * <code>.bookkeeper.proto.stream.NamespaceConfiguration ns_conf = 2;</code>
   * @return The nsConf.
   */
  org.apache.bookkeeper.stream.proto.NamespaceConfiguration getNsConf();
  /**
   * <code>.bookkeeper.proto.stream.NamespaceConfiguration ns_conf = 2;</code>
   */
  org.apache.bookkeeper.stream.proto.NamespaceConfigurationOrBuilder getNsConfOrBuilder();
}