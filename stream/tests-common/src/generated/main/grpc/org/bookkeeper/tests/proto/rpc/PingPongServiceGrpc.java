package org.bookkeeper.tests.proto.rpc;

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
    comments = "Source: rpc.proto")
public final class PingPongServiceGrpc {

  private PingPongServiceGrpc() {}

  public static final String SERVICE_NAME = "bookkeeper.tests.proto.rpc.PingPongService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPingPongMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> METHOD_PING_PONG = getPingPongMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getPingPongMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getPingPongMethod() {
    return getPingPongMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getPingPongMethodHelper() {
    io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest, org.bookkeeper.tests.proto.rpc.PongResponse> getPingPongMethod;
    if ((getPingPongMethod = PingPongServiceGrpc.getPingPongMethod) == null) {
      synchronized (PingPongServiceGrpc.class) {
        if ((getPingPongMethod = PingPongServiceGrpc.getPingPongMethod) == null) {
          PingPongServiceGrpc.getPingPongMethod = getPingPongMethod = 
              io.grpc.MethodDescriptor.<org.bookkeeper.tests.proto.rpc.PingRequest, org.bookkeeper.tests.proto.rpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.tests.proto.rpc.PingPongService", "PingPong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bookkeeper.tests.proto.rpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bookkeeper.tests.proto.rpc.PongResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PingPongServiceMethodDescriptorSupplier("PingPong"))
                  .build();
          }
        }
     }
     return getPingPongMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLotsOfPingsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> METHOD_LOTS_OF_PINGS = getLotsOfPingsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getLotsOfPingsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getLotsOfPingsMethod() {
    return getLotsOfPingsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getLotsOfPingsMethodHelper() {
    io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest, org.bookkeeper.tests.proto.rpc.PongResponse> getLotsOfPingsMethod;
    if ((getLotsOfPingsMethod = PingPongServiceGrpc.getLotsOfPingsMethod) == null) {
      synchronized (PingPongServiceGrpc.class) {
        if ((getLotsOfPingsMethod = PingPongServiceGrpc.getLotsOfPingsMethod) == null) {
          PingPongServiceGrpc.getLotsOfPingsMethod = getLotsOfPingsMethod = 
              io.grpc.MethodDescriptor.<org.bookkeeper.tests.proto.rpc.PingRequest, org.bookkeeper.tests.proto.rpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.tests.proto.rpc.PingPongService", "LotsOfPings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bookkeeper.tests.proto.rpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bookkeeper.tests.proto.rpc.PongResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PingPongServiceMethodDescriptorSupplier("LotsOfPings"))
                  .build();
          }
        }
     }
     return getLotsOfPingsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLotsOfPongsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> METHOD_LOTS_OF_PONGS = getLotsOfPongsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getLotsOfPongsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getLotsOfPongsMethod() {
    return getLotsOfPongsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getLotsOfPongsMethodHelper() {
    io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest, org.bookkeeper.tests.proto.rpc.PongResponse> getLotsOfPongsMethod;
    if ((getLotsOfPongsMethod = PingPongServiceGrpc.getLotsOfPongsMethod) == null) {
      synchronized (PingPongServiceGrpc.class) {
        if ((getLotsOfPongsMethod = PingPongServiceGrpc.getLotsOfPongsMethod) == null) {
          PingPongServiceGrpc.getLotsOfPongsMethod = getLotsOfPongsMethod = 
              io.grpc.MethodDescriptor.<org.bookkeeper.tests.proto.rpc.PingRequest, org.bookkeeper.tests.proto.rpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.tests.proto.rpc.PingPongService", "LotsOfPongs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bookkeeper.tests.proto.rpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bookkeeper.tests.proto.rpc.PongResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PingPongServiceMethodDescriptorSupplier("LotsOfPongs"))
                  .build();
          }
        }
     }
     return getLotsOfPongsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBidiPingPongMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> METHOD_BIDI_PING_PONG = getBidiPingPongMethodHelper();

  private static volatile io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getBidiPingPongMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getBidiPingPongMethod() {
    return getBidiPingPongMethodHelper();
  }

  private static io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest,
      org.bookkeeper.tests.proto.rpc.PongResponse> getBidiPingPongMethodHelper() {
    io.grpc.MethodDescriptor<org.bookkeeper.tests.proto.rpc.PingRequest, org.bookkeeper.tests.proto.rpc.PongResponse> getBidiPingPongMethod;
    if ((getBidiPingPongMethod = PingPongServiceGrpc.getBidiPingPongMethod) == null) {
      synchronized (PingPongServiceGrpc.class) {
        if ((getBidiPingPongMethod = PingPongServiceGrpc.getBidiPingPongMethod) == null) {
          PingPongServiceGrpc.getBidiPingPongMethod = getBidiPingPongMethod = 
              io.grpc.MethodDescriptor.<org.bookkeeper.tests.proto.rpc.PingRequest, org.bookkeeper.tests.proto.rpc.PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bookkeeper.tests.proto.rpc.PingPongService", "BidiPingPong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bookkeeper.tests.proto.rpc.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.bookkeeper.tests.proto.rpc.PongResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PingPongServiceMethodDescriptorSupplier("BidiPingPong"))
                  .build();
          }
        }
     }
     return getBidiPingPongMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PingPongServiceStub newStub(io.grpc.Channel channel) {
    return new PingPongServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PingPongServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PingPongServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PingPongServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PingPongServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PingPongServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void pingPong(org.bookkeeper.tests.proto.rpc.PingRequest request,
        io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingPongMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PingRequest> lotsOfPings(
        io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLotsOfPingsMethodHelper(), responseObserver);
    }

    /**
     */
    public void lotsOfPongs(org.bookkeeper.tests.proto.rpc.PingRequest request,
        io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLotsOfPongsMethodHelper(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PingRequest> bidiPingPong(
        io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBidiPingPongMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingPongMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                org.bookkeeper.tests.proto.rpc.PingRequest,
                org.bookkeeper.tests.proto.rpc.PongResponse>(
                  this, METHODID_PING_PONG)))
          .addMethod(
            getLotsOfPingsMethodHelper(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.bookkeeper.tests.proto.rpc.PingRequest,
                org.bookkeeper.tests.proto.rpc.PongResponse>(
                  this, METHODID_LOTS_OF_PINGS)))
          .addMethod(
            getLotsOfPongsMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.bookkeeper.tests.proto.rpc.PingRequest,
                org.bookkeeper.tests.proto.rpc.PongResponse>(
                  this, METHODID_LOTS_OF_PONGS)))
          .addMethod(
            getBidiPingPongMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.bookkeeper.tests.proto.rpc.PingRequest,
                org.bookkeeper.tests.proto.rpc.PongResponse>(
                  this, METHODID_BIDI_PING_PONG)))
          .build();
    }
  }

  /**
   */
  public static final class PingPongServiceStub extends io.grpc.stub.AbstractStub<PingPongServiceStub> {
    private PingPongServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingPongServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingPongServiceStub(channel, callOptions);
    }

    /**
     */
    public void pingPong(org.bookkeeper.tests.proto.rpc.PingRequest request,
        io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingPongMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PingRequest> lotsOfPings(
        io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLotsOfPingsMethodHelper(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void lotsOfPongs(org.bookkeeper.tests.proto.rpc.PingRequest request,
        io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLotsOfPongsMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PingRequest> bidiPingPong(
        io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBidiPingPongMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PingPongServiceBlockingStub extends io.grpc.stub.AbstractStub<PingPongServiceBlockingStub> {
    private PingPongServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingPongServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingPongServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.bookkeeper.tests.proto.rpc.PongResponse pingPong(org.bookkeeper.tests.proto.rpc.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingPongMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.bookkeeper.tests.proto.rpc.PongResponse> lotsOfPongs(
        org.bookkeeper.tests.proto.rpc.PingRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getLotsOfPongsMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PingPongServiceFutureStub extends io.grpc.stub.AbstractStub<PingPongServiceFutureStub> {
    private PingPongServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PingPongServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingPongServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PingPongServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.bookkeeper.tests.proto.rpc.PongResponse> pingPong(
        org.bookkeeper.tests.proto.rpc.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingPongMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING_PONG = 0;
  private static final int METHODID_LOTS_OF_PONGS = 1;
  private static final int METHODID_LOTS_OF_PINGS = 2;
  private static final int METHODID_BIDI_PING_PONG = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PingPongServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PingPongServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING_PONG:
          serviceImpl.pingPong((org.bookkeeper.tests.proto.rpc.PingRequest) request,
              (io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse>) responseObserver);
          break;
        case METHODID_LOTS_OF_PONGS:
          serviceImpl.lotsOfPongs((org.bookkeeper.tests.proto.rpc.PingRequest) request,
              (io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse>) responseObserver);
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
        case METHODID_LOTS_OF_PINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.lotsOfPings(
              (io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse>) responseObserver);
        case METHODID_BIDI_PING_PONG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiPingPong(
              (io.grpc.stub.StreamObserver<org.bookkeeper.tests.proto.rpc.PongResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PingPongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PingPongServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.bookkeeper.tests.proto.rpc.Rpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PingPongService");
    }
  }

  private static final class PingPongServiceFileDescriptorSupplier
      extends PingPongServiceBaseDescriptorSupplier {
    PingPongServiceFileDescriptorSupplier() {}
  }

  private static final class PingPongServiceMethodDescriptorSupplier
      extends PingPongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PingPongServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PingPongServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PingPongServiceFileDescriptorSupplier())
              .addMethod(getPingPongMethodHelper())
              .addMethod(getLotsOfPingsMethodHelper())
              .addMethod(getLotsOfPongsMethodHelper())
              .addMethod(getBidiPingPongMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
