// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kv_rpc.proto

package org.apache.bookkeeper.stream.proto.kv.rpc;

public interface CompareOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bookkeeper.proto.kv.rpc.Compare)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * result is logical comparison operation for this comparison.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.Compare.CompareResult result = 1;</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <pre>
   * result is logical comparison operation for this comparison.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.Compare.CompareResult result = 1;</code>
   * @return The result.
   */
  org.apache.bookkeeper.stream.proto.kv.rpc.Compare.CompareResult getResult();

  /**
   * <pre>
   * target is the key-value field to inspect for the comparison.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.Compare.CompareTarget target = 2;</code>
   * @return The enum numeric value on the wire for target.
   */
  int getTargetValue();
  /**
   * <pre>
   * target is the key-value field to inspect for the comparison.
   * </pre>
   *
   * <code>.bookkeeper.proto.kv.rpc.Compare.CompareTarget target = 2;</code>
   * @return The target.
   */
  org.apache.bookkeeper.stream.proto.kv.rpc.Compare.CompareTarget getTarget();

  /**
   * <pre>
   * key is the subject key for the comparison operation.
   * </pre>
   *
   * <code>bytes key = 3;</code>
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <pre>
   * version is the version of the given key
   * </pre>
   *
   * <code>int64 version = 4;</code>
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   * <pre>
   * version is the version of the given key
   * </pre>
   *
   * <code>int64 version = 4;</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <pre>
   * create_revision is the creation revision of the given key
   * </pre>
   *
   * <code>int64 create_revision = 5;</code>
   * @return Whether the createRevision field is set.
   */
  boolean hasCreateRevision();
  /**
   * <pre>
   * create_revision is the creation revision of the given key
   * </pre>
   *
   * <code>int64 create_revision = 5;</code>
   * @return The createRevision.
   */
  long getCreateRevision();

  /**
   * <pre>
   * mod_revision is the last modified revision of the given key.
   * </pre>
   *
   * <code>int64 mod_revision = 6;</code>
   * @return Whether the modRevision field is set.
   */
  boolean hasModRevision();
  /**
   * <pre>
   * mod_revision is the last modified revision of the given key.
   * </pre>
   *
   * <code>int64 mod_revision = 6;</code>
   * @return The modRevision.
   */
  long getModRevision();

  /**
   * <pre>
   * value is the value of the given key, in bytes.
   * </pre>
   *
   * <code>bytes value = 7;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * value is the value of the given key, in bytes.
   * </pre>
   *
   * <code>bytes value = 7;</code>
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();

  public org.apache.bookkeeper.stream.proto.kv.rpc.Compare.TargetUnionCase getTargetUnionCase();
}
