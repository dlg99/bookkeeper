// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.apache.bookkeeper.stream.proto.common;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.common.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string hostname = 1;</code>
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   * <code>string hostname = 1;</code>
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString
      getHostnameBytes();

  /**
   * <code>int32 port = 2;</code>
   * @return The port.
   */
  int getPort();
}
