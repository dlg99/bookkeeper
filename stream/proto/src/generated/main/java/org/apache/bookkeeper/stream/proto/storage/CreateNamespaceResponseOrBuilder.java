// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage.proto

package org.apache.bookkeeper.stream.proto.storage;

public interface CreateNamespaceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.storage.CreateNamespaceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.bookkeeper.proto.storage.StatusCode code = 1;</code>
   * @return The code.
   */
  org.apache.bookkeeper.stream.proto.storage.StatusCode getCode();

  /**
   * <code>.bookkeeper.proto.stream.NamespaceProperties ns_props = 2;</code>
   * @return Whether the nsProps field is set.
   */
  boolean hasNsProps();
  /**
   * <code>.bookkeeper.proto.stream.NamespaceProperties ns_props = 2;</code>
   * @return The nsProps.
   */
  org.apache.bookkeeper.stream.proto.NamespaceProperties getNsProps();
  /**
   * <code>.bookkeeper.proto.stream.NamespaceProperties ns_props = 2;</code>
   */
  org.apache.bookkeeper.stream.proto.NamespacePropertiesOrBuilder getNsPropsOrBuilder();
}