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
 * public service for other operations in range server
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: storage.proto")
public final class MetaRangeServiceGrpc {

  private MetaRangeServiceGrpc() {}

  public static final String SERVICE_NAME = "bookkeeper.proto.storage.MetaRangeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetActiveRangesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest,
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse> METHOD_GET_ACTIVE_RANGES = getGetActiveRangesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest,
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse> getGetActiveRangesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest,
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse> getGetActiveRangesMethod() {
    return getGetActiveRangesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest,
      org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse> getGetActiveRangesMethodHelper() {
    io.grpc.MethodDescriptor<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest, org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse> getGetActiveRangesMethod;
    if ((getGetActiveRangesMethod = MetaRangeServiceGrpc.getGetActiveRangesMethod) == null) {
      synchronized (MetaRangeServiceGrpc.class) {
        if ((getGetActiveRangesMethod = MetaRangeServiceGrpc.getGetActiveRangesMethod) == null) {
          MetaRangeServiceGrpc.getGetActiveRangesMethod = getGetActiveRangesMethod = 
              io.grpc.MethodDescriptor.<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest, org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.proto.storage.MetaRangeService", "GetActiveRanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MetaRangeServiceMethodDescriptorSupplier("GetActiveRanges"))
                  .build();
          }
        }
     }
     return getGetActiveRangesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetaRangeServiceStub newStub(io.grpc.Channel channel) {
    return new MetaRangeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetaRangeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetaRangeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetaRangeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetaRangeServiceFutureStub(channel);
  }

  /**
   * <pre>
   * public service for other operations in range server
   * </pre>
   */
  public static abstract class MetaRangeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getActiveRanges(org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetActiveRangesMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetActiveRangesMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest,
                org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse>(
                  this, METHODID_GET_ACTIVE_RANGES)))
          .build();
    }
  }

  /**
   * <pre>
   * public service for other operations in range server
   * </pre>
   */
  public static final class MetaRangeServiceStub extends io.grpc.stub.AbstractStub<MetaRangeServiceStub> {
    private MetaRangeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetaRangeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaRangeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetaRangeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getActiveRanges(org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest request,
        io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetActiveRangesMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * public service for other operations in range server
   * </pre>
   */
  public static final class MetaRangeServiceBlockingStub extends io.grpc.stub.AbstractStub<MetaRangeServiceBlockingStub> {
    private MetaRangeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetaRangeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaRangeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetaRangeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse getActiveRanges(org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetActiveRangesMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * public service for other operations in range server
   * </pre>
   */
  public static final class MetaRangeServiceFutureStub extends io.grpc.stub.AbstractStub<MetaRangeServiceFutureStub> {
    private MetaRangeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetaRangeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaRangeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetaRangeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse> getActiveRanges(
        org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetActiveRangesMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ACTIVE_RANGES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetaRangeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetaRangeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ACTIVE_RANGES:
          serviceImpl.getActiveRanges((org.apache.bookkeeper.stream.proto.storage.GetActiveRangesRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.bookkeeper.stream.proto.storage.GetActiveRangesResponse>) responseObserver);
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

  private static abstract class MetaRangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetaRangeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.bookkeeper.stream.proto.storage.Storage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetaRangeService");
    }
  }

  private static final class MetaRangeServiceFileDescriptorSupplier
      extends MetaRangeServiceBaseDescriptorSupplier {
    MetaRangeServiceFileDescriptorSupplier() {}
  }

  private static final class MetaRangeServiceMethodDescriptorSupplier
      extends MetaRangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetaRangeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MetaRangeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetaRangeServiceFileDescriptorSupplier())
              .addMethod(getGetActiveRangesMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
