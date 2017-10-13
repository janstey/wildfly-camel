// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pingpong.proto

package org.wildfly.camel.test.grpc.subA;

/**
 * <pre>
 * The pong response message
 * </pre>
 *
 * Protobuf type {@code org.wildfly.camel.test.grpc.subA.test.PongResponse}
 */
public  final class PongResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.wildfly.camel.test.grpc.subA.test.PongResponse)
    PongResponseOrBuilder {
  // Use PongResponse.newBuilder() to construct.
  private PongResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PongResponse() {
    pongName_ = "";
    pongId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PongResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            pongName_ = s;
            break;
          }
          case 16: {

            pongId_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.wildfly.camel.test.grpc.subA.PingPongProto.internal_static_org_apache_camel_component_grpc_test_PongResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wildfly.camel.test.grpc.subA.PingPongProto.internal_static_org_apache_camel_component_grpc_test_PongResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wildfly.camel.test.grpc.subA.PongResponse.class, org.wildfly.camel.test.grpc.subA.PongResponse.Builder.class);
  }

  public static final int PONG_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object pongName_;
  /**
   * <code>string pong_name = 1;</code>
   */
  public java.lang.String getPongName() {
    java.lang.Object ref = pongName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pongName_ = s;
      return s;
    }
  }
  /**
   * <code>string pong_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPongNameBytes() {
    java.lang.Object ref = pongName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pongName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PONG_ID_FIELD_NUMBER = 2;
  private int pongId_;
  /**
   * <code>int32 pong_id = 2;</code>
   */
  public int getPongId() {
    return pongId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPongNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pongName_);
    }
    if (pongId_ != 0) {
      output.writeInt32(2, pongId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPongNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pongName_);
    }
    if (pongId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pongId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.wildfly.camel.test.grpc.subA.PongResponse)) {
      return super.equals(obj);
    }
    org.wildfly.camel.test.grpc.subA.PongResponse other = (org.wildfly.camel.test.grpc.subA.PongResponse) obj;

    boolean result = true;
    result = result && getPongName()
        .equals(other.getPongName());
    result = result && (getPongId()
        == other.getPongId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PONG_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPongName().hashCode();
    hash = (37 * hash) + PONG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPongId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wildfly.camel.test.grpc.subA.PongResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.wildfly.camel.test.grpc.subA.PongResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The pong response message
   * </pre>
   *
   * Protobuf type {@code org.wildfly.camel.test.grpc.subA.test.PongResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.wildfly.camel.test.grpc.subA.test.PongResponse)
      org.wildfly.camel.test.grpc.subA.PongResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wildfly.camel.test.grpc.subA.PingPongProto.internal_static_org_apache_camel_component_grpc_test_PongResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wildfly.camel.test.grpc.subA.PingPongProto.internal_static_org_apache_camel_component_grpc_test_PongResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wildfly.camel.test.grpc.subA.PongResponse.class, org.wildfly.camel.test.grpc.subA.PongResponse.Builder.class);
    }

    // Construct using org.wildfly.camel.test.grpc.subA.PongResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      pongName_ = "";

      pongId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wildfly.camel.test.grpc.subA.PingPongProto.internal_static_org_apache_camel_component_grpc_test_PongResponse_descriptor;
    }

    public org.wildfly.camel.test.grpc.subA.PongResponse getDefaultInstanceForType() {
      return org.wildfly.camel.test.grpc.subA.PongResponse.getDefaultInstance();
    }

    public org.wildfly.camel.test.grpc.subA.PongResponse build() {
      org.wildfly.camel.test.grpc.subA.PongResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.wildfly.camel.test.grpc.subA.PongResponse buildPartial() {
      org.wildfly.camel.test.grpc.subA.PongResponse result = new org.wildfly.camel.test.grpc.subA.PongResponse(this);
      result.pongName_ = pongName_;
      result.pongId_ = pongId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.wildfly.camel.test.grpc.subA.PongResponse) {
        return mergeFrom((org.wildfly.camel.test.grpc.subA.PongResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wildfly.camel.test.grpc.subA.PongResponse other) {
      if (other == org.wildfly.camel.test.grpc.subA.PongResponse.getDefaultInstance()) return this;
      if (!other.getPongName().isEmpty()) {
        pongName_ = other.pongName_;
        onChanged();
      }
      if (other.getPongId() != 0) {
        setPongId(other.getPongId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.wildfly.camel.test.grpc.subA.PongResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wildfly.camel.test.grpc.subA.PongResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pongName_ = "";
    /**
     * <code>string pong_name = 1;</code>
     */
    public java.lang.String getPongName() {
      java.lang.Object ref = pongName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pongName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pong_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPongNameBytes() {
      java.lang.Object ref = pongName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pongName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pong_name = 1;</code>
     */
    public Builder setPongName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pongName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string pong_name = 1;</code>
     */
    public Builder clearPongName() {
      
      pongName_ = getDefaultInstance().getPongName();
      onChanged();
      return this;
    }
    /**
     * <code>string pong_name = 1;</code>
     */
    public Builder setPongNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pongName_ = value;
      onChanged();
      return this;
    }

    private int pongId_ ;
    /**
     * <code>int32 pong_id = 2;</code>
     */
    public int getPongId() {
      return pongId_;
    }
    /**
     * <code>int32 pong_id = 2;</code>
     */
    public Builder setPongId(int value) {
      
      pongId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pong_id = 2;</code>
     */
    public Builder clearPongId() {
      
      pongId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:org.wildfly.camel.test.grpc.subA.test.PongResponse)
  }

  // @@protoc_insertion_point(class_scope:org.wildfly.camel.test.grpc.subA.test.PongResponse)
  private static final org.wildfly.camel.test.grpc.subA.PongResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wildfly.camel.test.grpc.subA.PongResponse();
  }

  public static org.wildfly.camel.test.grpc.subA.PongResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PongResponse>
      PARSER = new com.google.protobuf.AbstractParser<PongResponse>() {
    public PongResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PongResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PongResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PongResponse> getParserForType() {
    return PARSER;
  }

  public org.wildfly.camel.test.grpc.subA.PongResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

