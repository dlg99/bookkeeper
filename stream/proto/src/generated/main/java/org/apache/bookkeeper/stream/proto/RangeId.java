// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stream.proto

package org.apache.bookkeeper.stream.proto;

/**
 * Protobuf type {@code bookkeeper.proto.stream.RangeId}
 */
public final class RangeId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.stream.RangeId)
    RangeIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RangeId.newBuilder() to construct.
  private RangeId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RangeId() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RangeId();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RangeId(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            scId_ = input.readInt64();
            break;
          }
          case 16: {

            streamId_ = input.readInt64();
            break;
          }
          case 24: {

            rangeId_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_RangeId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_RangeId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.RangeId.class, org.apache.bookkeeper.stream.proto.RangeId.Builder.class);
  }

  public static final int SC_ID_FIELD_NUMBER = 1;
  private long scId_;
  /**
   * <code>int64 sc_id = 1;</code>
   * @return The scId.
   */
  @java.lang.Override
  public long getScId() {
    return scId_;
  }

  public static final int STREAM_ID_FIELD_NUMBER = 2;
  private long streamId_;
  /**
   * <code>int64 stream_id = 2;</code>
   * @return The streamId.
   */
  @java.lang.Override
  public long getStreamId() {
    return streamId_;
  }

  public static final int RANGE_ID_FIELD_NUMBER = 3;
  private long rangeId_;
  /**
   * <code>int64 range_id = 3;</code>
   * @return The rangeId.
   */
  @java.lang.Override
  public long getRangeId() {
    return rangeId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (scId_ != 0L) {
      output.writeInt64(1, scId_);
    }
    if (streamId_ != 0L) {
      output.writeInt64(2, streamId_);
    }
    if (rangeId_ != 0L) {
      output.writeInt64(3, rangeId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, scId_);
    }
    if (streamId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, streamId_);
    }
    if (rangeId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, rangeId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.RangeId)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.RangeId other = (org.apache.bookkeeper.stream.proto.RangeId) obj;

    if (getScId()
        != other.getScId()) return false;
    if (getStreamId()
        != other.getStreamId()) return false;
    if (getRangeId()
        != other.getRangeId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SC_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScId());
    hash = (37 * hash) + STREAM_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStreamId());
    hash = (37 * hash) + RANGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRangeId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.RangeId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.RangeId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code bookkeeper.proto.stream.RangeId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.stream.RangeId)
      org.apache.bookkeeper.stream.proto.RangeIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_RangeId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_RangeId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.RangeId.class, org.apache.bookkeeper.stream.proto.RangeId.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.RangeId.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      scId_ = 0L;

      streamId_ = 0L;

      rangeId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_RangeId_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.RangeId getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.RangeId.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.RangeId build() {
      org.apache.bookkeeper.stream.proto.RangeId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.RangeId buildPartial() {
      org.apache.bookkeeper.stream.proto.RangeId result = new org.apache.bookkeeper.stream.proto.RangeId(this);
      result.scId_ = scId_;
      result.streamId_ = streamId_;
      result.rangeId_ = rangeId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.bookkeeper.stream.proto.RangeId) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.RangeId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.RangeId other) {
      if (other == org.apache.bookkeeper.stream.proto.RangeId.getDefaultInstance()) return this;
      if (other.getScId() != 0L) {
        setScId(other.getScId());
      }
      if (other.getStreamId() != 0L) {
        setStreamId(other.getStreamId());
      }
      if (other.getRangeId() != 0L) {
        setRangeId(other.getRangeId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.bookkeeper.stream.proto.RangeId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.bookkeeper.stream.proto.RangeId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long scId_ ;
    /**
     * <code>int64 sc_id = 1;</code>
     * @return The scId.
     */
    @java.lang.Override
    public long getScId() {
      return scId_;
    }
    /**
     * <code>int64 sc_id = 1;</code>
     * @param value The scId to set.
     * @return This builder for chaining.
     */
    public Builder setScId(long value) {
      
      scId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 sc_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScId() {
      
      scId_ = 0L;
      onChanged();
      return this;
    }

    private long streamId_ ;
    /**
     * <code>int64 stream_id = 2;</code>
     * @return The streamId.
     */
    @java.lang.Override
    public long getStreamId() {
      return streamId_;
    }
    /**
     * <code>int64 stream_id = 2;</code>
     * @param value The streamId to set.
     * @return This builder for chaining.
     */
    public Builder setStreamId(long value) {
      
      streamId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 stream_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreamId() {
      
      streamId_ = 0L;
      onChanged();
      return this;
    }

    private long rangeId_ ;
    /**
     * <code>int64 range_id = 3;</code>
     * @return The rangeId.
     */
    @java.lang.Override
    public long getRangeId() {
      return rangeId_;
    }
    /**
     * <code>int64 range_id = 3;</code>
     * @param value The rangeId to set.
     * @return This builder for chaining.
     */
    public Builder setRangeId(long value) {
      
      rangeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 range_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRangeId() {
      
      rangeId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.stream.RangeId)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.stream.RangeId)
  private static final org.apache.bookkeeper.stream.proto.RangeId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.RangeId();
  }

  public static org.apache.bookkeeper.stream.proto.RangeId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RangeId>
      PARSER = new com.google.protobuf.AbstractParser<RangeId>() {
    @java.lang.Override
    public RangeId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RangeId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RangeId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RangeId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.RangeId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

