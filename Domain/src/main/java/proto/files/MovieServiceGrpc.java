package proto.files;

import io.grpc.stub.StreamObserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: movie.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovieServiceGrpc {

  private MovieServiceGrpc() {}

  public static final String SERVICE_NAME = "movie.MovieService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.files.GetMovieRequest,
      proto.files.GetMovieResponse> getGetMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMovie",
      requestType = proto.files.GetMovieRequest.class,
      responseType = proto.files.GetMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.files.GetMovieRequest,
      proto.files.GetMovieResponse> getGetMovieMethod() {
    io.grpc.MethodDescriptor<proto.files.GetMovieRequest, proto.files.GetMovieResponse> getGetMovieMethod;
    if ((getGetMovieMethod = MovieServiceGrpc.getGetMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMovieMethod = MovieServiceGrpc.getGetMovieMethod) == null) {
          MovieServiceGrpc.getGetMovieMethod = getGetMovieMethod =
              io.grpc.MethodDescriptor.<proto.files.GetMovieRequest, proto.files.GetMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.files.GetMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.files.GetMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("GetMovie"))
              .build();
        }
      }
    }
    return getGetMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.files.CreateMovieRequest,
      proto.files.Empty> getCreateMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMovie",
      requestType = proto.files.CreateMovieRequest.class,
      responseType = proto.files.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.files.CreateMovieRequest,
      proto.files.Empty> getCreateMovieMethod() {
    io.grpc.MethodDescriptor<proto.files.CreateMovieRequest, proto.files.Empty> getCreateMovieMethod;
    if ((getCreateMovieMethod = MovieServiceGrpc.getCreateMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getCreateMovieMethod = MovieServiceGrpc.getCreateMovieMethod) == null) {
          MovieServiceGrpc.getCreateMovieMethod = getCreateMovieMethod =
              io.grpc.MethodDescriptor.<proto.files.CreateMovieRequest, proto.files.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.files.CreateMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.files.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("CreateMovie"))
              .build();
        }
      }
    }
    return getCreateMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.files.Movie,
      proto.files.Empty> getUpdateMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMovie",
      requestType = proto.files.Movie.class,
      responseType = proto.files.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.files.Movie,
      proto.files.Empty> getUpdateMovieMethod() {
    io.grpc.MethodDescriptor<proto.files.Movie, proto.files.Empty> getUpdateMovieMethod;
    if ((getUpdateMovieMethod = MovieServiceGrpc.getUpdateMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getUpdateMovieMethod = MovieServiceGrpc.getUpdateMovieMethod) == null) {
          MovieServiceGrpc.getUpdateMovieMethod = getUpdateMovieMethod =
              io.grpc.MethodDescriptor.<proto.files.Movie, proto.files.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.files.Movie.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.files.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("UpdateMovie"))
              .build();
        }
      }
    }
    return getUpdateMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.files.GetMovieRequest,
      proto.files.Empty> getDeleteMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMovie",
      requestType = proto.files.GetMovieRequest.class,
      responseType = proto.files.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.files.GetMovieRequest,
      proto.files.Empty> getDeleteMovieMethod() {
    io.grpc.MethodDescriptor<proto.files.GetMovieRequest, proto.files.Empty> getDeleteMovieMethod;
    if ((getDeleteMovieMethod = MovieServiceGrpc.getDeleteMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getDeleteMovieMethod = MovieServiceGrpc.getDeleteMovieMethod) == null) {
          MovieServiceGrpc.getDeleteMovieMethod = getDeleteMovieMethod =
              io.grpc.MethodDescriptor.<proto.files.GetMovieRequest, proto.files.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.files.GetMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.files.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("DeleteMovie"))
              .build();
        }
      }
    }
    return getDeleteMovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub>() {
        @java.lang.Override
        public MovieServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceStub(channel, callOptions);
        }
      };
    return MovieServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub>() {
        @java.lang.Override
        public MovieServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceBlockingStub(channel, callOptions);
        }
      };
    return MovieServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub>() {
        @java.lang.Override
        public MovieServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceFutureStub(channel, callOptions);
        }
      };
    return MovieServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getMovie(proto.files.GetMovieRequest request,
        io.grpc.stub.StreamObserver<proto.files.GetMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMovieMethod(), responseObserver);
    }

    /**
     */
    default void createMovie(proto.files.CreateMovieRequest request,
        io.grpc.stub.StreamObserver<proto.files.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMovieMethod(), responseObserver);
    }

    /**
     */
    default void updateMovie(proto.files.Movie request,
        io.grpc.stub.StreamObserver<proto.files.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMovieMethod(), responseObserver);
    }

    /**
     */
    default void deleteMovie(proto.files.GetMovieRequest request,
        io.grpc.stub.StreamObserver<proto.files.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMovieMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MovieService.
   */
  public static abstract class MovieServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MovieServiceGrpc.bindService(this);
    }

      public abstract void updateMovie(Movie request, StreamObserver<Empty> responseObserver);
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MovieService.
   */
  public static final class MovieServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MovieServiceStub> {
    private MovieServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMovie(proto.files.GetMovieRequest request,
        io.grpc.stub.StreamObserver<proto.files.GetMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMovie(proto.files.CreateMovieRequest request,
        io.grpc.stub.StreamObserver<proto.files.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMovie(proto.files.Movie request,
        io.grpc.stub.StreamObserver<proto.files.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMovie(proto.files.GetMovieRequest request,
        io.grpc.stub.StreamObserver<proto.files.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMovieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MovieService.
   */
  public static final class MovieServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MovieServiceBlockingStub> {
    private MovieServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.files.GetMovieResponse getMovie(proto.files.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.files.Empty createMovie(proto.files.CreateMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.files.Empty updateMovie(proto.files.Movie request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.files.Empty deleteMovie(proto.files.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMovieMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MovieService.
   */
  public static final class MovieServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MovieServiceFutureStub> {
    private MovieServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.files.GetMovieResponse> getMovie(
        proto.files.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.files.Empty> createMovie(
        proto.files.CreateMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.files.Empty> updateMovie(
        proto.files.Movie request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.files.Empty> deleteMovie(
        proto.files.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOVIE = 0;
  private static final int METHODID_CREATE_MOVIE = 1;
  private static final int METHODID_UPDATE_MOVIE = 2;
  private static final int METHODID_DELETE_MOVIE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOVIE:
          serviceImpl.getMovie((proto.files.GetMovieRequest) request,
              (io.grpc.stub.StreamObserver<proto.files.GetMovieResponse>) responseObserver);
          break;
        case METHODID_CREATE_MOVIE:
          serviceImpl.createMovie((proto.files.CreateMovieRequest) request,
              (io.grpc.stub.StreamObserver<proto.files.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_MOVIE:
          serviceImpl.updateMovie((proto.files.Movie) request,
              (io.grpc.stub.StreamObserver<proto.files.Empty>) responseObserver);
          break;
        case METHODID_DELETE_MOVIE:
          serviceImpl.deleteMovie((proto.files.GetMovieRequest) request,
              (io.grpc.stub.StreamObserver<proto.files.Empty>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.files.GetMovieRequest,
              proto.files.GetMovieResponse>(
                service, METHODID_GET_MOVIE)))
        .addMethod(
          getCreateMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.files.CreateMovieRequest,
              proto.files.Empty>(
                service, METHODID_CREATE_MOVIE)))
        .addMethod(
          getUpdateMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.files.Movie,
              proto.files.Empty>(
                service, METHODID_UPDATE_MOVIE)))
        .addMethod(
          getDeleteMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              proto.files.GetMovieRequest,
              proto.files.Empty>(
                service, METHODID_DELETE_MOVIE)))
        .build();
  }

  private static abstract class MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.files.MovieServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieService");
    }
  }

  private static final class MovieServiceFileDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier {
    MovieServiceFileDescriptorSupplier() {}
  }

  private static final class MovieServiceMethodDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MovieServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MovieServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieServiceFileDescriptorSupplier())
              .addMethod(getGetMovieMethod())
              .addMethod(getCreateMovieMethod())
              .addMethod(getUpdateMovieMethod())
              .addMethod(getDeleteMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}
