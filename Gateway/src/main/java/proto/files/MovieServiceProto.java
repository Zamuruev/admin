// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: movie.proto
// Protobuf Java Version: 4.29.1

package proto.files;

public final class MovieServiceProto {
  private MovieServiceProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      MovieServiceProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_movie_Movie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_movie_Movie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_movie_GetMovieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_movie_GetMovieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_movie_GetMovieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_movie_GetMovieResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_movie_CreateMovieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_movie_CreateMovieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_movie_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_movie_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013movie.proto\022\005movie\"Q\n\005Movie\022\n\n\002id\030\001 \001(" +
      "\003\022\r\n\005title\030\002 \001(\t\022\020\n\010director\030\003 \001(\t\022\r\n\005ge" +
      "nre\030\004 \001(\t\022\014\n\004year\030\005 \001(\005\"\035\n\017GetMovieReque" +
      "st\022\n\n\002id\030\001 \001(\003\"/\n\020GetMovieResponse\022\033\n\005mo" +
      "vie\030\001 \001(\0132\014.movie.Movie\"R\n\022CreateMovieRe" +
      "quest\022\r\n\005title\030\001 \001(\t\022\020\n\010director\030\002 \001(\t\022\r" +
      "\n\005genre\030\003 \001(\t\022\014\n\004year\030\004 \001(\005\"\007\n\005Empty2\343\001\n" +
      "\014MovieService\022;\n\010GetMovie\022\026.movie.GetMov" +
      "ieRequest\032\027.movie.GetMovieResponse\0226\n\013Cr" +
      "eateMovie\022\031.movie.CreateMovieRequest\032\014.m" +
      "ovie.Empty\022)\n\013UpdateMovie\022\014.movie.Movie\032" +
      "\014.movie.Empty\0223\n\013DeleteMovie\022\026.movie.Get" +
      "MovieRequest\032\014.movie.EmptyB\"\n\013proto.file" +
      "sB\021MovieServiceProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_movie_Movie_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_movie_Movie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_movie_Movie_descriptor,
        new java.lang.String[] { "Id", "Title", "Director", "Genre", "Year", });
    internal_static_movie_GetMovieRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_movie_GetMovieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_movie_GetMovieRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_movie_GetMovieResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_movie_GetMovieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_movie_GetMovieResponse_descriptor,
        new java.lang.String[] { "Movie", });
    internal_static_movie_CreateMovieRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_movie_CreateMovieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_movie_CreateMovieRequest_descriptor,
        new java.lang.String[] { "Title", "Director", "Genre", "Year", });
    internal_static_movie_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_movie_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_movie_Empty_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
