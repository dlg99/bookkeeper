// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage.proto

package org.apache.bookkeeper.stream.proto.storage;

public interface CreateStreamResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.storage.CreateStreamResponse)
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
   * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
   * @return Whether the streamProps field is set.
   */
  boolean hasStreamProps();
  /**
   * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
   * @return The streamProps.
   */
  org.apache.bookkeeper.stream.proto.StreamProperties getStreamProps();
  /**
   * <code>.bookkeeper.proto.stream.StreamProperties stream_props = 2;</code>
   */
  org.apache.bookkeeper.stream.proto.StreamPropertiesOrBuilder getStreamPropsOrBuilder();
}