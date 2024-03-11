package com.example.topmovieproto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: TopMoviesService.proto")
public final class TopMoviesServiceGrpc {

  private TopMoviesServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.topmovieproto.TopMoviesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.topmovieproto.TopMoviesRequest,
      com.example.topmovieproto.TopMoviesResponse> getTopMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopMovies",
      requestType = com.example.topmovieproto.TopMoviesRequest.class,
      responseType = com.example.topmovieproto.TopMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.topmovieproto.TopMoviesRequest,
      com.example.topmovieproto.TopMoviesResponse> getTopMoviesMethod() {
    io.grpc.MethodDescriptor<com.example.topmovieproto.TopMoviesRequest, com.example.topmovieproto.TopMoviesResponse> getTopMoviesMethod;
    if ((getTopMoviesMethod = TopMoviesServiceGrpc.getTopMoviesMethod) == null) {
      synchronized (TopMoviesServiceGrpc.class) {
        if ((getTopMoviesMethod = TopMoviesServiceGrpc.getTopMoviesMethod) == null) {
          TopMoviesServiceGrpc.getTopMoviesMethod = getTopMoviesMethod =
              io.grpc.MethodDescriptor.<com.example.topmovieproto.TopMoviesRequest, com.example.topmovieproto.TopMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TopMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.topmovieproto.TopMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.topmovieproto.TopMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TopMoviesServiceMethodDescriptorSupplier("TopMovies"))
              .build();
        }
      }
    }
    return getTopMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TopMoviesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopMoviesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopMoviesServiceStub>() {
        @Override
        public TopMoviesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopMoviesServiceStub(channel, callOptions);
        }
      };
    return TopMoviesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TopMoviesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopMoviesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopMoviesServiceBlockingStub>() {
        @Override
        public TopMoviesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopMoviesServiceBlockingStub(channel, callOptions);
        }
      };
    return TopMoviesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TopMoviesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TopMoviesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TopMoviesServiceFutureStub>() {
        @Override
        public TopMoviesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TopMoviesServiceFutureStub(channel, callOptions);
        }
      };
    return TopMoviesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TopMoviesServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void topMovies(com.example.topmovieproto.TopMoviesRequest request,
        io.grpc.stub.StreamObserver<com.example.topmovieproto.TopMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTopMoviesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTopMoviesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.topmovieproto.TopMoviesRequest,
                com.example.topmovieproto.TopMoviesResponse>(
                  this, METHODID_TOP_MOVIES)))
          .build();
    }
  }

  /**
   */
  public static final class TopMoviesServiceStub extends io.grpc.stub.AbstractAsyncStub<TopMoviesServiceStub> {
    private TopMoviesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TopMoviesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopMoviesServiceStub(channel, callOptions);
    }

    /**
     */
    public void topMovies(com.example.topmovieproto.TopMoviesRequest request,
        io.grpc.stub.StreamObserver<com.example.topmovieproto.TopMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTopMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TopMoviesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TopMoviesServiceBlockingStub> {
    private TopMoviesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TopMoviesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopMoviesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.topmovieproto.TopMoviesResponse topMovies(com.example.topmovieproto.TopMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTopMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TopMoviesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TopMoviesServiceFutureStub> {
    private TopMoviesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TopMoviesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TopMoviesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.topmovieproto.TopMoviesResponse> topMovies(
        com.example.topmovieproto.TopMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTopMoviesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOP_MOVIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TopMoviesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TopMoviesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOP_MOVIES:
          serviceImpl.topMovies((com.example.topmovieproto.TopMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.example.topmovieproto.TopMoviesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TopMoviesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TopMoviesServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.topmovieproto.TopMoviesServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TopMoviesService");
    }
  }

  private static final class TopMoviesServiceFileDescriptorSupplier
      extends TopMoviesServiceBaseDescriptorSupplier {
    TopMoviesServiceFileDescriptorSupplier() {}
  }

  private static final class TopMoviesServiceMethodDescriptorSupplier
      extends TopMoviesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TopMoviesServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TopMoviesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TopMoviesServiceFileDescriptorSupplier())
              .addMethod(getTopMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
