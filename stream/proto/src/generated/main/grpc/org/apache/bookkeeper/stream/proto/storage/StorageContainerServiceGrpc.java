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
 * A general range server service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: storage.proto")
public final class StorageContainerServiceGrpc {

  private StorageContainerServiceGrpc() {}

  public static final String SERVICE_NAME = "bookkeeper.proto.storage.StorageContainerService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetStorageContainerEndpointMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> METHOD_GET_STORAGE_CONTAINER_ENDPOINT = getGetStorageContainerEndpointMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getGetStorageContainerEndpointMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getGetStorageContainerEndpointMethod() {
    return getGetStorageContainerEndpointMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest,
      org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getGetStorageContainerEndpointMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest, org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getGetStorageContainerEndpointMethod;
    if ((getGetStorageContainerEndpointMethod = StorageContainerServiceGrpc.getGetStorageContainerEndpointMethod) == null) {
      synchronized (StorageContainerServiceGrpc.class) {
        if ((getGetStorageContainerEndpointMethod = StorageContainerServiceGrpc.getGetStorageContainerEndpointMethod) == null) {
          StorageContainerServiceGrpc.getGetStorageContainerEndpointMethod = getGetStorageContainerEndpointMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest, org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.storage.StorageContainerService", "GetStorageContainerEndpoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StorageContainerServiceMethodDescriptorSupplier("GetStorageContainerEndpoint"))
                  .build();
          }
        }
     }
     return getGetStorageContainerEndpointMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorageContainerServiceStub newStub(io.grpc.Channel channel) {
    return new StorageContainerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorageContainerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StorageContainerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorageContainerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StorageContainerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * A general range server service
   * </pre>
   */
  public static abstract class StorageContainerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the storage container endpoints
     * </pre>
     */
    public void getStorageContainerEndpoint(org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStorageContainerEndpointMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStorageContainerEndpointMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest,
                org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse>(
                  this, METHODID_GET_STORAGE_CONTAINER_ENDPOINT)))
          .build();
    }
  }

  /**
   * <pre>
   * A general range server service
   * </pre>
   */
  public static final class StorageContainerServiceStub extends io.grpc.stub.AbstractStub<StorageContainerServiceStub> {
    private StorageContainerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageContainerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageContainerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageContainerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the storage container endpoints
     * </pre>
     */
    public void getStorageContainerEndpoint(org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStorageContainerEndpointMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A general range server service
   * </pre>
   */
  public static final class StorageContainerServiceBlockingStub extends io.grpc.stub.AbstractStub<StorageContainerServiceBlockingStub> {
    private StorageContainerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageContainerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageContainerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageContainerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the storage container endpoints
     * </pre>
     */
    public org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse getStorageContainerEndpoint(org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStorageContainerEndpointMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A general range server service
   * </pre>
   */
  public static final class StorageContainerServiceFutureStub extends io.grpc.stub.AbstractStub<StorageContainerServiceFutureStub> {
    private StorageContainerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StorageContainerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorageContainerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StorageContainerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the storage container endpoints
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse> getStorageContainerEndpoint(
        org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStorageContainerEndpointMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STORAGE_CONTAINER_ENDPOINT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StorageContainerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StorageContainerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STORAGE_CONTAINER_ENDPOINT:
          serviceImpl.getStorageContainerEndpoint((org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetStorageContainerEndpointResponse>) responseObserver);
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

  private static abstract class StorageContainerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorageContainerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorageContainerService");
    }
  }

  private static final class StorageContainerServiceFileDescriptorSupplier
      extends StorageContainerServiceBaseDescriptorSupplier {
    StorageContainerServiceFileDescriptorSupplier() {}
  }

  private static final class StorageContainerServiceMethodDescriptorSupplier
      extends StorageContainerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StorageContainerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StorageContainerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorageContainerServiceFileDescriptorSupplier())
              .addMethod(getGetStorageContainerEndpointMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
