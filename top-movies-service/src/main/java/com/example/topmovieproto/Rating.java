// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TopMoviesService.proto

package com.example.topmovieproto;

/**
 * Protobuf type {@code com.example.topmovieproto.Rating}
 */
public  final class Rating extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.topmovieproto.Rating)
    RatingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Rating.newBuilder() to construct.
  private Rating(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rating() {
    movieId_ = "";
    ratingVal_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Rating(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            String s = input.readStringRequireUtf8();

            movieId_ = s;
            break;
          }
          case 16: {

            ratingVal_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return TopMoviesServiceOuterClass.internal_static_com_example_topmovieproto_Rating_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return TopMoviesServiceOuterClass.internal_static_com_example_topmovieproto_Rating_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Rating.class, Builder.class);
  }

  public static final int MOVIEID_FIELD_NUMBER = 1;
  private volatile Object movieId_;
  /**
   * <code>string movieId = 1;</code>
   */
  public String getMovieId() {
    Object ref = movieId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      movieId_ = s;
      return s;
    }
  }
  /**
   * <code>string movieId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMovieIdBytes() {
    Object ref = movieId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      movieId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RATINGVAL_FIELD_NUMBER = 2;
  private int ratingVal_;
  /**
   * <code>int32 ratingVal = 2;</code>
   */
  public int getRatingVal() {
    return ratingVal_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMovieIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, movieId_);
    }
    if (ratingVal_ != 0) {
      output.writeInt32(2, ratingVal_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMovieIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, movieId_);
    }
    if (ratingVal_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, ratingVal_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Rating)) {
      return super.equals(obj);
    }
    Rating other = (Rating) obj;

    boolean result = true;
    result = result && getMovieId()
        .equals(other.getMovieId());
    result = result && (getRatingVal()
        == other.getRatingVal());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MOVIEID_FIELD_NUMBER;
    hash = (53 * hash) + getMovieId().hashCode();
    hash = (37 * hash) + RATINGVAL_FIELD_NUMBER;
    hash = (53 * hash) + getRatingVal();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Rating parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Rating parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Rating parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Rating parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Rating parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Rating parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Rating parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Rating parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Rating parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Rating parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Rating parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Rating parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Rating prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.topmovieproto.Rating}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.topmovieproto.Rating)
      RatingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TopMoviesServiceOuterClass.internal_static_com_example_topmovieproto_Rating_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TopMoviesServiceOuterClass.internal_static_com_example_topmovieproto_Rating_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Rating.class, Builder.class);
    }

    // Construct using com.example.topmovieproto.Rating.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      movieId_ = "";

      ratingVal_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return TopMoviesServiceOuterClass.internal_static_com_example_topmovieproto_Rating_descriptor;
    }

    @Override
    public Rating getDefaultInstanceForType() {
      return Rating.getDefaultInstance();
    }

    @Override
    public Rating build() {
      Rating result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Rating buildPartial() {
      Rating result = new Rating(this);
      result.movieId_ = movieId_;
      result.ratingVal_ = ratingVal_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Rating) {
        return mergeFrom((Rating)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Rating other) {
      if (other == Rating.getDefaultInstance()) return this;
      if (!other.getMovieId().isEmpty()) {
        movieId_ = other.movieId_;
        onChanged();
      }
      if (other.getRatingVal() != 0) {
        setRatingVal(other.getRatingVal());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Rating parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Rating) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object movieId_ = "";
    /**
     * <code>string movieId = 1;</code>
     */
    public String getMovieId() {
      Object ref = movieId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        movieId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string movieId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMovieIdBytes() {
      Object ref = movieId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        movieId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string movieId = 1;</code>
     */
    public Builder setMovieId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      movieId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string movieId = 1;</code>
     */
    public Builder clearMovieId() {
      
      movieId_ = getDefaultInstance().getMovieId();
      onChanged();
      return this;
    }
    /**
     * <code>string movieId = 1;</code>
     */
    public Builder setMovieIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      movieId_ = value;
      onChanged();
      return this;
    }

    private int ratingVal_ ;
    /**
     * <code>int32 ratingVal = 2;</code>
     */
    public int getRatingVal() {
      return ratingVal_;
    }
    /**
     * <code>int32 ratingVal = 2;</code>
     */
    public Builder setRatingVal(int value) {
      
      ratingVal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ratingVal = 2;</code>
     */
    public Builder clearRatingVal() {
      
      ratingVal_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.topmovieproto.Rating)
  }

  // @@protoc_insertion_point(class_scope:com.example.topmovieproto.Rating)
  private static final Rating DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Rating();
  }

  public static Rating getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rating>
      PARSER = new com.google.protobuf.AbstractParser<Rating>() {
    @Override
    public Rating parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Rating(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Rating> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Rating> getParserForType() {
    return PARSER;
  }

  @Override
  public Rating getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

