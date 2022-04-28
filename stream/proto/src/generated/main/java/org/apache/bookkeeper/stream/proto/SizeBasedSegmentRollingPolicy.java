// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stream.proto

package org.apache.bookkeeper.stream.proto;

/**
 * Protobuf type {@code bookkeeper.proto.stream.SizeBasedSegmentRollingPolicy}
 */
public final class SizeBasedSegmentRollingPolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.stream.SizeBasedSegmentRollingPolicy)
    SizeBasedSegmentRollingPolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SizeBasedSegmentRollingPolicy.newBuilder() to construct.
  private SizeBasedSegmentRollingPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SizeBasedSegmentRollingPolicy() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SizeBasedSegmentRollingPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SizeBasedSegmentRollingPolicy(
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

            maxSegmentSize_ = input.readInt64();
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
    return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_SizeBasedSegmentRollingPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_SizeBasedSegmentRollingPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy.class, org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy.Builder.class);
  }

  public static final int MAX_SEGMENT_SIZE_FIELD_NUMBER = 1;
  private long maxSegmentSize_;
  /**
   * <code>int64 max_segment_size = 1;</code>
   * @return The maxSegmentSize.
   */
  @java.lang.Override
  public long getMaxSegmentSize() {
    return maxSegmentSize_;
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
    if (maxSegmentSize_ != 0L) {
      output.writeInt64(1, maxSegmentSize_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxSegmentSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, maxSegmentSize_);
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
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy other = (org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy) obj;

    if (getMaxSegmentSize()
        != other.getMaxSegmentSize()) return false;
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
    hash = (37 * hash) + MAX_SEGMENT_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxSegmentSize());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy prototype) {
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
   * Protobuf type {@code bookkeeper.proto.stream.SizeBasedSegmentRollingPolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.stream.SizeBasedSegmentRollingPolicy)
      org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_SizeBasedSegmentRollingPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_SizeBasedSegmentRollingPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy.class, org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy.newBuilder()
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
      maxSegmentSize_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.Stream.internal_static_bookkeeper_proto_stream_SizeBasedSegmentRollingPolicy_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy build() {
      org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy buildPartial() {
      org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy result = new org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy(this);
      result.maxSegmentSize_ = maxSegmentSize_;
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
      if (other instanceof org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy other) {
      if (other == org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy.getDefaultInstance()) return this;
      if (other.getMaxSegmentSize() != 0L) {
        setMaxSegmentSize(other.getMaxSegmentSize());
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
      org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long maxSegmentSize_ ;
    /**
     * <code>int64 max_segment_size = 1;</code>
     * @return The maxSegmentSize.
     */
    @java.lang.Override
    public long getMaxSegmentSize() {
      return maxSegmentSize_;
    }
    /**
     * <code>int64 max_segment_size = 1;</code>
     * @param value The maxSegmentSize to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSegmentSize(long value) {
      
      maxSegmentSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max_segment_size = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxSegmentSize() {
      
      maxSegmentSize_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.stream.SizeBasedSegmentRollingPolicy)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.stream.SizeBasedSegmentRollingPolicy)
  private static final org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy();
  }

  public static org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SizeBasedSegmentRollingPolicy>
      PARSER = new com.google.protobuf.AbstractParser<SizeBasedSegmentRollingPolicy>() {
    @java.lang.Override
    public SizeBasedSegmentRollingPolicy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SizeBasedSegmentRollingPolicy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SizeBasedSegmentRollingPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SizeBasedSegmentRollingPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.SizeBasedSegmentRollingPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

