package org.apache.bookkeeper.stream.proto.kv.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: kv_rpc.proto")
public final class TableServiceGrpc {

  private TableServiceGrpc() {}

  public static final String SERVICE_NAME = "bookkeeper.proto.kv.rpc.TableService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRangeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> METHOD_RANGE = getRangeMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> getRangeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> getRangeMethod() {
    return getRangeMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> getRangeMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest, org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> getRangeMethod;
    if ((getRangeMethod = TableServiceGrpc.getRangeMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getRangeMethod = TableServiceGrpc.getRangeMethod) == null) {
          TableServiceGrpc.getRangeMethod = getRangeMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest, org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.kv.rpc.TableService", "Range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Range"))
                  .build();
          }
        }
     }
     return getRangeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPutMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> METHOD_PUT = getPutMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> getPutMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> getPutMethod() {
    return getPutMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> getPutMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest, org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> getPutMethod;
    if ((getPutMethod = TableServiceGrpc.getPutMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getPutMethod = TableServiceGrpc.getPutMethod) == null) {
          TableServiceGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest, org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.kv.rpc.TableService", "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> METHOD_DELETE = getDeleteMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> getDeleteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> getDeleteMethod() {
    return getDeleteMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> getDeleteMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest, org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> getDeleteMethod;
    if ((getDeleteMethod = TableServiceGrpc.getDeleteMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getDeleteMethod = TableServiceGrpc.getDeleteMethod) == null) {
          TableServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest, org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.kv.rpc.TableService", "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTxnMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> METHOD_TXN = getTxnMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> getTxnMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> getTxnMethod() {
    return getTxnMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> getTxnMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest, org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> getTxnMethod;
    if ((getTxnMethod = TableServiceGrpc.getTxnMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getTxnMethod = TableServiceGrpc.getTxnMethod) == null) {
          TableServiceGrpc.getTxnMethod = getTxnMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest, org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.kv.rpc.TableService", "Txn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Txn"))
                  .build();
          }
        }
     }
     return getTxnMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getIncrementMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> METHOD_INCREMENT = getIncrementMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> getIncrementMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> getIncrementMethod() {
    return getIncrementMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest,
      org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> getIncrementMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest, org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> getIncrementMethod;
    if ((getIncrementMethod = TableServiceGrpc.getIncrementMethod) == null) {
      synchronized (TableServiceGrpc.class) {
        if ((getIncrementMethod = TableServiceGrpc.getIncrementMethod) == null) {
          TableServiceGrpc.getIncrementMethod = getIncrementMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest, org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.kv.rpc.TableService", "Increment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableServiceMethodDescriptorSupplier("Increment"))
                  .build();
          }
        }
     }
     return getIncrementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TableServiceStub newStub(io.grpc.Channel channel) {
    return new TableServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TableServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TableServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TableServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TableServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TableServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * NOT supported yet.
     * </pre>
     */
    public void range(org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRangeMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public void put(org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public void delete(org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public void txn(org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTxnMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Increment increments the amount associated with the keys
     * </pre>
     */
    public void increment(org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIncrementMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRangeMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse>(
                  this, METHODID_RANGE)))
          .addMethod(
            getPutMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getDeleteMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getTxnMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse>(
                  this, METHODID_TXN)))
          .addMethod(
            getIncrementMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest,
                org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse>(
                  this, METHODID_INCREMENT)))
          .build();
    }
  }

  /**
   */
  public static final class TableServiceStub extends io.grpc.stub.AbstractStub<TableServiceStub> {
    private TableServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * NOT supported yet.
     * </pre>
     */
    public void range(org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRangeMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public void put(org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public void delete(org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public void txn(org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTxnMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Increment increments the amount associated with the keys
     * </pre>
     */
    public void increment(org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncrementMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TableServiceBlockingStub extends io.grpc.stub.AbstractStub<TableServiceBlockingStub> {
    private TableServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * NOT supported yet.
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse range(org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getRangeMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse put(org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse delete(org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse txn(org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest request) {
      return blockingUnaryCall(
          getChannel(), getTxnMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Increment increments the amount associated with the keys
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse increment(org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest request) {
      return blockingUnaryCall(
          getChannel(), getIncrementMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TableServiceFutureStub extends io.grpc.stub.AbstractStub<TableServiceFutureStub> {
    private TableServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Range gets the keys in the range from the key-value store.
     * NOT supported yet.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse> range(
        org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRangeMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put puts the given key into the key-value store.
     * A put request increments the revision of the key-value store
     * and generates one event in the event history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse> put(
        org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteRange deletes the given range from the key-value store.
     * A delete request increments the revision of the key-value store
     * and generates a delete event in the event history for every deleted key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse> delete(
        org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Txn processes multiple requests in a single transaction.
     * A txn request increments the revision of the key-value store
     * and generates events with the same revision for every completed request.
     * It is not allowed to modify the same key several times within one txn.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse> txn(
        org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTxnMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Increment increments the amount associated with the keys
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse> increment(
        org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIncrementMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RANGE = 0;
  private static final int METHODID_PUT = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_TXN = 3;
  private static final int METHODID_INCREMENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TableServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TableServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RANGE:
          serviceImpl.range((org.apache.bookkeeper.stream.proto.kv.rpc.RangeRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.RangeResponse>) responseObserver);
          break;
        case METHODID_PUT:
          serviceImpl.put((org.apache.bookkeeper.stream.proto.kv.rpc.PutRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.PutResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.DeleteRangeResponse>) responseObserver);
          break;
        case METHODID_TXN:
          serviceImpl.txn((org.apache.bookkeeper.stream.proto.kv.rpc.TxnRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.TxnResponse>) responseObserver);
          break;
        case METHODID_INCREMENT:
          serviceImpl.increment((org.apache.bookkeeper.stream.proto.kv.rpc.IncrementRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.kv.rpc.IncrementResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TableServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.bookkeeper.stream.proto.kv.rpc.KvRpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TableService");
    }
  }

  private static final class TableServiceFileDescriptorSupplier
      extends TableServiceBaseDescriptorSupplier {
    TableServiceFileDescriptorSupplier() {}
  }

  private static final class TableServiceMethodDescriptorSupplier
      extends TableServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TableServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TableServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TableServiceFileDescriptorSupplier())
              .addMethod(getRangeMethodHelper())
              .addMethod(getPutMethodHelper())
              .addMethod(getDeleteMethodHelper())
              .addMethod(getTxnMethodHelper())
              .addMethod(getIncrementMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
