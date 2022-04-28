// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_rpc.proto

package org.apache.bookkeeper.stream.proto.kv.rpc;

/**
 * Protobuf type {@code bookkeeper.proto.kv.rpc.IncrementRequest}
 */
public final class IncrementRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bookkeeper.proto.kv.rpc.IncrementRequest)
    IncrementRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IncrementRequest.newBuilder() to construct.
  private IncrementRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IncrementRequest() {
    key_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IncrementRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IncrementRequest(
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
          case 10: {

            key_ = input.readBytes();
            break;
          }
          case 16: {

            amount_ = input.readInt64();
            break;
          }
          case 24: {

            getTotal_ = input.readBool();
            break;
          }
          case 794: {
            org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

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
    return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.class, org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * key is the key, in bytes, to increment the value
   * </pre>
   *
   * <code>bytes key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private long amount_;
  /**
   * <pre>
   * amount is a long number to increment
   * </pre>
   *
   * <code>int64 amount = 2;</code>
   * @return The amount.
   */
  @java.lang.Override
  public long getAmount() {
    return amount_;
  }

  public static final int GET_TOTAL_FIELD_NUMBER = 3;
  private boolean getTotal_;
  /**
   * <pre>
   * return the total amount after increment
   * </pre>
   *
   * <code>bool get_total = 3;</code>
   * @return The getTotal.
   */
  @java.lang.Override
  public boolean getGetTotal() {
    return getTotal_;
  }

  public static final int HEADER_FIELD_NUMBER = 99;
  private org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader header_;
  /**
   * <pre>
   * header
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * header
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
   * @return The header.
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader getHeader() {
    return header_ == null ? org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * header
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
   */
  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
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
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (amount_ != 0L) {
      output.writeInt64(2, amount_);
    }
    if (getTotal_ != false) {
      output.writeBool(3, getTotal_);
    }
    if (header_ != null) {
      output.writeMessage(99, getHeader());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (amount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, amount_);
    }
    if (getTotal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, getTotal_);
    }
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(99, getHeader());
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
    if (!(obj instanceof org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest)) {
      return super.equals(obj);
    }
    org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest other = (org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (getAmount()
        != other.getAmount()) return false;
    if (getGetTotal()
        != other.getGetTotal()) return false;
    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmount());
    hash = (37 * hash) + GET_TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGetTotal());
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parseFrom(
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
  public static Builder newBuilder(org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest prototype) {
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
   * Protobuf type {@code bookkeeper.proto.kv.rpc.IncrementRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bookkeeper.proto.kv.rpc.IncrementRequest)
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.class, org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.Builder.class);
    }

    // Construct using org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.newBuilder()
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
      key_ = com.google.protobuf.ByteString.EMPTY;

      amount_ = 0L;

      getTotal_ = false;

      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.internal_static_bookkeeper_proto_kv_rpc_IncrementRequest_descriptor;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest getDefaultInstanceForType() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest build() {
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest buildPartial() {
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest result = new org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest(this);
      result.key_ = key_;
      result.amount_ = amount_;
      result.getTotal_ = getTotal_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
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
      if (other instanceof org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest) {
        return mergeFrom((org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest other) {
      if (other == org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getAmount() != 0L) {
        setAmount(other.getAmount());
      }
      if (other.getGetTotal() != false) {
        setGetTotal(other.getGetTotal());
      }
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
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
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * key is the key, in bytes, to increment the value
     * </pre>
     *
     * <code>bytes key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * key is the key, in bytes, to increment the value
     * </pre>
     *
     * <code>bytes key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * key is the key, in bytes, to increment the value
     * </pre>
     *
     * <code>bytes key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private long amount_ ;
    /**
     * <pre>
     * amount is a long number to increment
     * </pre>
     *
     * <code>int64 amount = 2;</code>
     * @return The amount.
     */
    @java.lang.Override
    public long getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * amount is a long number to increment
     * </pre>
     *
     * <code>int64 amount = 2;</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(long value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * amount is a long number to increment
     * </pre>
     *
     * <code>int64 amount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      
      amount_ = 0L;
      onChanged();
      return this;
    }

    private boolean getTotal_ ;
    /**
     * <pre>
     * return the total amount after increment
     * </pre>
     *
     * <code>bool get_total = 3;</code>
     * @return The getTotal.
     */
    @java.lang.Override
    public boolean getGetTotal() {
      return getTotal_;
    }
    /**
     * <pre>
     * return the total amount after increment
     * </pre>
     *
     * <code>bool get_total = 3;</code>
     * @param value The getTotal to set.
     * @return This builder for chaining.
     */
    public Builder setGetTotal(boolean value) {
      
      getTotal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * return the total amount after increment
     * </pre>
     *
     * <code>bool get_total = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGetTotal() {
      
      getTotal_ = false;
      onChanged();
      return this;
    }

    private org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader, org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     * @return The header.
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     */
    public Builder setHeader(org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     */
    public Builder setHeader(
        org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     */
    public Builder mergeHeader(org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * header
     * </pre>
     *
     * <code>.bookkeeper.proto.kv.rpc.RoutingHeader header = 99;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader, org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader, org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeader.Builder, org.apache.bookkeeper.stream.proto.kv.rpc.RoutingHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bookkeeper.proto.kv.rpc.IncrementRequest)
  }

  // @@protoc_insertion_point(class_scope:bookkeeper.proto.kv.rpc.IncrementRequest)
  private static final org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest();
  }

  public static org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IncrementRequest>
      PARSER = new com.google.protobuf.AbstractParser<IncrementRequest>() {
    @java.lang.Override
    public IncrementRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IncrementRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IncrementRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IncrementRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

