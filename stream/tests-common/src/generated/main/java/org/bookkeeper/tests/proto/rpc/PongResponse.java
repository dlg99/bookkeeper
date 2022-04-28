// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package org.bookkeeper.tests.proto.rpc;

/**
 * Protobuf type {@code bookkeeper.tests.proto.rpc.PongResponse}
 */
public final class PongResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.tests.proto.rpc.PongResponse)
    PongResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PongResponse.newBuilder() to construct.
  private PongResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PongResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PongResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PongResponse(
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

            lastSequence_ = input.readInt64();
            break;
          }
          case 16: {

            numPingReceived_ = input.readInt32();
            break;
          }
          case 24: {

            slotId_ = input.readInt32();
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
    return org.bookkeeper.tests.proto.rpc.Rpc.internal_static_bookkeeper_tests_proto_rpc_PongResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.bookkeeper.tests.proto.rpc.Rpc.internal_static_bookkeeper_tests_proto_rpc_PongResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.bookkeeper.tests.proto.rpc.PongResponse.class, org.bookkeeper.tests.proto.rpc.PongResponse.Builder.class);
  }

  public static final int LAST_SEQUENCE_FIELD_NUMBER = 1;
  private long lastSequence_;
  /**
   * <code>int64 last_sequence = 1;</code>
   * @return The lastSequence.
   */
  @java.lang.Override
  public long getLastSequence() {
    return lastSequence_;
  }

  public static final int NUM_PING_RECEIVED_FIELD_NUMBER = 2;
  private int numPingReceived_;
  /**
   * <code>int32 num_ping_received = 2;</code>
   * @return The numPingReceived.
   */
  @java.lang.Override
  public int getNumPingReceived() {
    return numPingReceived_;
  }

  public static final int SLOT_ID_FIELD_NUMBER = 3;
  private int slotId_;
  /**
   * <pre>
   * the slot id in this stream of pong responses.
   * </pre>
   *
   * <code>int32 slot_id = 3;</code>
   * @return The slotId.
   */
  @java.lang.Override
  public int getSlotId() {
    return slotId_;
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
    if (lastSequence_ != 0L) {
      output.writeInt64(1, lastSequence_);
    }
    if (numPingReceived_ != 0) {
      output.writeInt32(2, numPingReceived_);
    }
    if (slotId_ != 0) {
      output.writeInt32(3, slotId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lastSequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, lastSequence_);
    }
    if (numPingReceived_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numPingReceived_);
    }
    if (slotId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, slotId_);
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
    if (!(obj instanceof org.bookkeeper.tests.proto.rpc.PongResponse)) {
      return super.equals(obj);
    }
    org.bookkeeper.tests.proto.rpc.PongResponse other = (org.bookkeeper.tests.proto.rpc.PongResponse) obj;

    if (getLastSequence()
        != other.getLastSequence()) return false;
    if (getNumPingReceived()
        != other.getNumPingReceived()) return false;
    if (getSlotId()
        != other.getSlotId()) return false;
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
    hash = (37 * hash) + LAST_SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastSequence());
    hash = (37 * hash) + NUM_PING_RECEIVED_FIELD_NUMBER;
    hash = (53 * hash) + getNumPingReceived();
    hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSlotId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bookkeeper.tests.proto.rpc.PongResponse parseFrom(
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
  public static Builder newBuilder(org.bookkeeper.tests.proto.rpc.PongResponse prototype) {
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
   * Protobuf type {@code bookkeeper.tests.proto.rpc.PongResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.tests.proto.rpc.PongResponse)
      org.bookkeeper.tests.proto.rpc.PongResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bookkeeper.tests.proto.rpc.Rpc.internal_static_bookkeeper_tests_proto_rpc_PongResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bookkeeper.tests.proto.rpc.Rpc.internal_static_bookkeeper_tests_proto_rpc_PongResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.bookkeeper.tests.proto.rpc.PongResponse.class, org.bookkeeper.tests.proto.rpc.PongResponse.Builder.class);
    }

    // Construct using org.bookkeeper.tests.proto.rpc.PongResponse.newBuilder()
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
      lastSequence_ = 0L;

      numPingReceived_ = 0;

      slotId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.bookkeeper.tests.proto.rpc.Rpc.internal_static_bookkeeper_tests_proto_rpc_PongResponse_descriptor;
    }

    @java.lang.Override
    public org.bookkeeper.tests.proto.rpc.PongResponse getDefaultInstanceForType() {
      return org.bookkeeper.tests.proto.rpc.PongResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.bookkeeper.tests.proto.rpc.PongResponse build() {
      org.bookkeeper.tests.proto.rpc.PongResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.bookkeeper.tests.proto.rpc.PongResponse buildPartial() {
      org.bookkeeper.tests.proto.rpc.PongResponse result = new org.bookkeeper.tests.proto.rpc.PongResponse(this);
      result.lastSequence_ = lastSequence_;
      result.numPingReceived_ = numPingReceived_;
      result.slotId_ = slotId_;
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
      if (other instanceof org.bookkeeper.tests.proto.rpc.PongResponse) {
        return mergeFrom((org.bookkeeper.tests.proto.rpc.PongResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.bookkeeper.tests.proto.rpc.PongResponse other) {
      if (other == org.bookkeeper.tests.proto.rpc.PongResponse.getDefaultInstance()) return this;
      if (other.getLastSequence() != 0L) {
        setLastSequence(other.getLastSequence());
      }
      if (other.getNumPingReceived() != 0) {
        setNumPingReceived(other.getNumPingReceived());
      }
      if (other.getSlotId() != 0) {
        setSlotId(other.getSlotId());
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
      org.bookkeeper.tests.proto.rpc.PongResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.bookkeeper.tests.proto.rpc.PongResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long lastSequence_ ;
    /**
     * <code>int64 last_sequence = 1;</code>
     * @return The lastSequence.
     */
    @java.lang.Override
    public long getLastSequence() {
      return lastSequence_;
    }
    /**
     * <code>int64 last_sequence = 1;</code>
     * @param value The lastSequence to set.
     * @return This builder for chaining.
     */
    public Builder setLastSequence(long value) {
      
      lastSequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 last_sequence = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastSequence() {
      
      lastSequence_ = 0L;
      onChanged();
      return this;
    }

    private int numPingReceived_ ;
    /**
     * <code>int32 num_ping_received = 2;</code>
     * @return The numPingReceived.
     */
    @java.lang.Override
    public int getNumPingReceived() {
      return numPingReceived_;
    }
    /**
     * <code>int32 num_ping_received = 2;</code>
     * @param value The numPingReceived to set.
     * @return This builder for chaining.
     */
    public Builder setNumPingReceived(int value) {
      
      numPingReceived_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_ping_received = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumPingReceived() {
      
      numPingReceived_ = 0;
      onChanged();
      return this;
    }

    private int slotId_ ;
    /**
     * <pre>
     * the slot id in this stream of pong responses.
     * </pre>
     *
     * <code>int32 slot_id = 3;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
    }
    /**
     * <pre>
     * the slot id in this stream of pong responses.
     * </pre>
     *
     * <code>int32 slot_id = 3;</code>
     * @param value The slotId to set.
     * @return This builder for chaining.
     */
    public Builder setSlotId(int value) {
      
      slotId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the slot id in this stream of pong responses.
     * </pre>
     *
     * <code>int32 slot_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSlotId() {
      
      slotId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.tests.proto.rpc.PongResponse)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.tests.proto.rpc.PongResponse)
  private static final org.bookkeeper.tests.proto.rpc.PongResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.bookkeeper.tests.proto.rpc.PongResponse();
  }

  public static org.bookkeeper.tests.proto.rpc.PongResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PongResponse>
      PARSER = new com.google.protobuf.AbstractParser<PongResponse>() {
    @java.lang.Override
    public PongResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PongResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PongResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PongResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.bookkeeper.tests.proto.rpc.PongResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

