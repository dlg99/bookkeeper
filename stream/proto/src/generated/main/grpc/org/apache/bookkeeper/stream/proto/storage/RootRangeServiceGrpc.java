package org.apache.bookkeeper.stream.proto.storage;

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
 * <pre>
 * public service for metadata services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: storage.proto")
public final class RootRangeServiceGrpc {

  private RootRangeServiceGrpc() {}

  public static final String SERVICE_NAME = "bookkeeper.proto.storage.RootRangeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateNamespaceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> METHOD_CREATE_NAMESPACE = getCreateNamespaceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> getCreateNamespaceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> getCreateNamespaceMethod() {
    return getCreateNamespaceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> getCreateNamespaceMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> getCreateNamespaceMethod;
    if ((getCreateNamespaceMethod = RootRangeServiceGrpc.getCreateNamespaceMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getCreateNamespaceMethod = RootRangeServiceGrpc.getCreateNamespaceMethod) == null) {
          RootRangeServiceGrpc.getCreateNamespaceMethod = getCreateNamespaceMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.storage.RootRangeService", "CreateNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("CreateNamespace"))
                  .build();
          }
        }
     }
     return getCreateNamespaceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteNamespaceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> METHOD_DELETE_NAMESPACE = getDeleteNamespaceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> getDeleteNamespaceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> getDeleteNamespaceMethod() {
    return getDeleteNamespaceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> getDeleteNamespaceMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> getDeleteNamespaceMethod;
    if ((getDeleteNamespaceMethod = RootRangeServiceGrpc.getDeleteNamespaceMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getDeleteNamespaceMethod = RootRangeServiceGrpc.getDeleteNamespaceMethod) == null) {
          RootRangeServiceGrpc.getDeleteNamespaceMethod = getDeleteNamespaceMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.storage.RootRangeService", "DeleteNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("DeleteNamespace"))
                  .build();
          }
        }
     }
     return getDeleteNamespaceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetNamespaceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> METHOD_GET_NAMESPACE = getGetNamespaceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getGetNamespaceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getGetNamespaceMethod() {
    return getGetNamespaceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest,
      org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getGetNamespaceMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getGetNamespaceMethod;
    if ((getGetNamespaceMethod = RootRangeServiceGrpc.getGetNamespaceMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getGetNamespaceMethod = RootRangeServiceGrpc.getGetNamespaceMethod) == null) {
          RootRangeServiceGrpc.getGetNamespaceMethod = getGetNamespaceMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest, org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.storage.RootRangeService", "GetNamespace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("GetNamespace"))
                  .build();
          }
        }
     }
     return getGetNamespaceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateStreamMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> METHOD_CREATE_STREAM = getCreateStreamMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> getCreateStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> getCreateStreamMethod() {
    return getCreateStreamMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> getCreateStreamMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest, org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> getCreateStreamMethod;
    if ((getCreateStreamMethod = RootRangeServiceGrpc.getCreateStreamMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getCreateStreamMethod = RootRangeServiceGrpc.getCreateStreamMethod) == null) {
          RootRangeServiceGrpc.getCreateStreamMethod = getCreateStreamMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest, org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.storage.RootRangeService", "CreateStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("CreateStream"))
                  .build();
          }
        }
     }
     return getCreateStreamMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteStreamMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> METHOD_DELETE_STREAM = getDeleteStreamMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> getDeleteStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> getDeleteStreamMethod() {
    return getDeleteStreamMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> getDeleteStreamMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest, org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> getDeleteStreamMethod;
    if ((getDeleteStreamMethod = RootRangeServiceGrpc.getDeleteStreamMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getDeleteStreamMethod = RootRangeServiceGrpc.getDeleteStreamMethod) == null) {
          RootRangeServiceGrpc.getDeleteStreamMethod = getDeleteStreamMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest, org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.storage.RootRangeService", "DeleteStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("DeleteStream"))
                  .build();
          }
        }
     }
     return getDeleteStreamMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetStreamMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> METHOD_GET_STREAM = getGetStreamMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getGetStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getGetStreamMethod() {
    return getGetStreamMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getGetStreamMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest, org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getGetStreamMethod;
    if ((getGetStreamMethod = RootRangeServiceGrpc.getGetStreamMethod) == null) {
      synchronized (RootRangeServiceGrpc.class) {
        if ((getGetStreamMethod = RootRangeServiceGrpc.getGetStreamMethod) == null) {
          RootRangeServiceGrpc.getGetStreamMethod = getGetStreamMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.GetStreamRequest, org.apache.bookkeeper.stream.proto.storage.GetStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.storage.RootRangeService", "GetStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RootRangeServiceMethodDescriptorSupplier("GetStream"))
                  .build();
          }
        }
     }
     return getGetStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RootRangeServiceStub newStub(io.grpc.Channel channel) {
    return new RootRangeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RootRangeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RootRangeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RootRangeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RootRangeServiceFutureStub(channel);
  }

  /**
   * <pre>
   * public service for metadata services
   * </pre>
   */
  public static abstract class RootRangeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Namespace Methods
     * </pre>
     */
    public void createNamespace(org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNamespaceMethodHelper(), responseObserver);
    }

    /**
     */
    public void deleteNamespace(org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteNamespaceMethodHelper(), responseObserver);
    }

    /**
     */
    public void getNamespace(org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNamespaceMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Stream Methods
     * </pre>
     */
    public void createStream(org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStreamMethodHelper(), responseObserver);
    }

    /**
     */
    public void deleteStream(org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteStreamMethodHelper(), responseObserver);
    }

    /**
     */
    public void getStream(org.apache.bookkeeper.stream.proto.storage.GetStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNamespaceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest,
                org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse>(
                  this, METHODID_CREATE_NAMESPACE)))
          .addMethod(
            getDeleteNamespaceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest,
                org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse>(
                  this, METHODID_DELETE_NAMESPACE)))
          .addMethod(
            getGetNamespaceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest,
                org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse>(
                  this, METHODID_GET_NAMESPACE)))
          .addMethod(
            getCreateStreamMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest,
                org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse>(
                  this, METHODID_CREATE_STREAM)))
          .addMethod(
            getDeleteStreamMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest,
                org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse>(
                  this, METHODID_DELETE_STREAM)))
          .addMethod(
            getGetStreamMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.GetStreamRequest,
                org.apache.bookkeeper.stream.proto.storage.GetStreamResponse>(
                  this, METHODID_GET_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * public service for metadata services
   * </pre>
   */
  public static final class RootRangeServiceStub extends io.grpc.stub.AbstractStub<RootRangeServiceStub> {
    private RootRangeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RootRangeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RootRangeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RootRangeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Namespace Methods
     * </pre>
     */
    public void createNamespace(org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNamespaceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNamespace(org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteNamespaceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNamespace(org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNamespaceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream Methods
     * </pre>
     */
    public void createStream(org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStreamMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStream(org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteStreamMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStream(org.apache.bookkeeper.stream.proto.storage.GetStreamRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStreamMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * public service for metadata services
   * </pre>
   */
  public static final class RootRangeServiceBlockingStub extends io.grpc.stub.AbstractStub<RootRangeServiceBlockingStub> {
    private RootRangeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RootRangeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RootRangeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RootRangeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Namespace Methods
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse createNamespace(org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateNamespaceMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse deleteNamespace(org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteNamespaceMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse getNamespace(org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNamespaceMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream Methods
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse createStream(org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStreamMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse deleteStream(org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteStreamMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.GetStreamResponse getStream(org.apache.bookkeeper.stream.proto.storage.GetStreamRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStreamMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * public service for metadata services
   * </pre>
   */
  public static final class RootRangeServiceFutureStub extends io.grpc.stub.AbstractStub<RootRangeServiceFutureStub> {
    private RootRangeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RootRangeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RootRangeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RootRangeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Namespace Methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse> createNamespace(
        org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNamespaceMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse> deleteNamespace(
        org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteNamespaceMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse> getNamespace(
        org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNamespaceMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stream Methods
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse> createStream(
        org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStreamMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse> deleteStream(
        org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteStreamMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.GetStreamResponse> getStream(
        org.apache.bookkeeper.stream.proto.storage.GetStreamRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStreamMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NAMESPACE = 0;
  private static final int METHODID_DELETE_NAMESPACE = 1;
  private static final int METHODID_GET_NAMESPACE = 2;
  private static final int METHODID_CREATE_STREAM = 3;
  private static final int METHODID_DELETE_STREAM = 4;
  private static final int METHODID_GET_STREAM = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RootRangeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RootRangeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NAMESPACE:
          serviceImpl.createNamespace((org.apache.bookkeeper.stream.proto.storage.CreateNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateNamespaceResponse>) responseObserver);
          break;
        case METHODID_DELETE_NAMESPACE:
          serviceImpl.deleteNamespace((org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteNamespaceResponse>) responseObserver);
          break;
        case METHODID_GET_NAMESPACE:
          serviceImpl.getNamespace((org.apache.bookkeeper.stream.proto.storage.GetNamespaceRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetNamespaceResponse>) responseObserver);
          break;
        case METHODID_CREATE_STREAM:
          serviceImpl.createStream((org.apache.bookkeeper.stream.proto.storage.CreateStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.CreateStreamResponse>) responseObserver);
          break;
        case METHODID_DELETE_STREAM:
          serviceImpl.deleteStream((org.apache.bookkeeper.stream.proto.storage.DeleteStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.DeleteStreamResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM:
          serviceImpl.getStream((org.apache.bookkeeper.stream.proto.storage.GetStreamRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStreamResponse>) responseObserver);
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

  private static abstract class RootRangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RootRangeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RootRangeService");
    }
  }

  private static final class RootRangeServiceFileDescriptorSupplier
      extends RootRangeServiceBaseDescriptorSupplier {
    RootRangeServiceFileDescriptorSupplier() {}
  }

  private static final class RootRangeServiceMethodDescriptorSupplier
      extends RootRangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RootRangeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RootRangeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RootRangeServiceFileDescriptorSupplier())
              .addMethod(getCreateNamespaceMethodHelper())
              .addMethod(getDeleteNamespaceMethodHelper())
              .addMethod(getGetNamespaceMethodHelper())
              .addMethod(getCreateStreamMethodHelper())
              .addMethod(getDeleteStreamMethodHelper())
              .addMethod(getGetStreamMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
