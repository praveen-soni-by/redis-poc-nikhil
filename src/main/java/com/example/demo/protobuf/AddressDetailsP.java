// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/distance.proto

package com.example.demo.protobuf;

/**
 * Protobuf type {@code proto.AddressDetailsP}
 */
public final class AddressDetailsP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.AddressDetailsP)
    AddressDetailsPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressDetailsP.newBuilder() to construct.
  private AddressDetailsP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressDetailsP() {
    address_ = "";
    city_ = "";
    state_ = "";
    country_ = "";
    latitude_ = "";
    longitude_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddressDetailsP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressDetailsP(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            address_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            city_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            state_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            country_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            latitude_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            longitude_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.example.demo.protobuf.DistanceProto.internal_static_proto_AddressDetailsP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.demo.protobuf.DistanceProto.internal_static_proto_AddressDetailsP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.demo.protobuf.AddressDetailsP.class, com.example.demo.protobuf.AddressDetailsP.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object address_;
  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_FIELD_NUMBER = 2;
  private volatile java.lang.Object city_;
  /**
   * <code>string city = 2;</code>
   * @return The city.
   */
  @java.lang.Override
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 2;</code>
   * @return The bytes for city.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object state_;
  /**
   * <code>string state = 3;</code>
   * @return The state.
   */
  @java.lang.Override
  public java.lang.String getState() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      state_ = s;
      return s;
    }
  }
  /**
   * <code>string state = 3;</code>
   * @return The bytes for state.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStateBytes() {
    java.lang.Object ref = state_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      state_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNTRY_FIELD_NUMBER = 4;
  private volatile java.lang.Object country_;
  /**
   * <code>string country = 4;</code>
   * @return The country.
   */
  @java.lang.Override
  public java.lang.String getCountry() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      country_ = s;
      return s;
    }
  }
  /**
   * <code>string country = 4;</code>
   * @return The bytes for country.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCountryBytes() {
    java.lang.Object ref = country_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      country_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LATITUDE_FIELD_NUMBER = 5;
  private volatile java.lang.Object latitude_;
  /**
   * <code>string latitude = 5;</code>
   * @return The latitude.
   */
  @java.lang.Override
  public java.lang.String getLatitude() {
    java.lang.Object ref = latitude_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      latitude_ = s;
      return s;
    }
  }
  /**
   * <code>string latitude = 5;</code>
   * @return The bytes for latitude.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLatitudeBytes() {
    java.lang.Object ref = latitude_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      latitude_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LONGITUDE_FIELD_NUMBER = 6;
  private volatile java.lang.Object longitude_;
  /**
   * <code>string longitude = 6;</code>
   * @return The longitude.
   */
  @java.lang.Override
  public java.lang.String getLongitude() {
    java.lang.Object ref = longitude_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      longitude_ = s;
      return s;
    }
  }
  /**
   * <code>string longitude = 6;</code>
   * @return The bytes for longitude.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLongitudeBytes() {
    java.lang.Object ref = longitude_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      longitude_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    if (!getCityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, city_);
    }
    if (!getStateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, state_);
    }
    if (!getCountryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, country_);
    }
    if (!getLatitudeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, latitude_);
    }
    if (!getLongitudeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, longitude_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    if (!getCityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, city_);
    }
    if (!getStateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, state_);
    }
    if (!getCountryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, country_);
    }
    if (!getLatitudeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, latitude_);
    }
    if (!getLongitudeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, longitude_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.demo.protobuf.AddressDetailsP)) {
      return super.equals(obj);
    }
    com.example.demo.protobuf.AddressDetailsP other = (com.example.demo.protobuf.AddressDetailsP) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getCity()
        .equals(other.getCity())) return false;
    if (!getState()
        .equals(other.getState())) return false;
    if (!getCountry()
        .equals(other.getCountry())) return false;
    if (!getLatitude()
        .equals(other.getLatitude())) return false;
    if (!getLongitude()
        .equals(other.getLongitude())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + getState().hashCode();
    hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
    hash = (53 * hash) + getCountry().hashCode();
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + getLatitude().hashCode();
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + getLongitude().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.demo.protobuf.AddressDetailsP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.demo.protobuf.AddressDetailsP parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.demo.protobuf.AddressDetailsP prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code proto.AddressDetailsP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.AddressDetailsP)
      com.example.demo.protobuf.AddressDetailsPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.demo.protobuf.DistanceProto.internal_static_proto_AddressDetailsP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.demo.protobuf.DistanceProto.internal_static_proto_AddressDetailsP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.demo.protobuf.AddressDetailsP.class, com.example.demo.protobuf.AddressDetailsP.Builder.class);
    }

    // Construct using com.example.demo.protobuf.AddressDetailsP.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      address_ = "";

      city_ = "";

      state_ = "";

      country_ = "";

      latitude_ = "";

      longitude_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.demo.protobuf.DistanceProto.internal_static_proto_AddressDetailsP_descriptor;
    }

    @java.lang.Override
    public com.example.demo.protobuf.AddressDetailsP getDefaultInstanceForType() {
      return com.example.demo.protobuf.AddressDetailsP.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.demo.protobuf.AddressDetailsP build() {
      com.example.demo.protobuf.AddressDetailsP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.demo.protobuf.AddressDetailsP buildPartial() {
      com.example.demo.protobuf.AddressDetailsP result = new com.example.demo.protobuf.AddressDetailsP(this);
      result.address_ = address_;
      result.city_ = city_;
      result.state_ = state_;
      result.country_ = country_;
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.demo.protobuf.AddressDetailsP) {
        return mergeFrom((com.example.demo.protobuf.AddressDetailsP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.demo.protobuf.AddressDetailsP other) {
      if (other == com.example.demo.protobuf.AddressDetailsP.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        onChanged();
      }
      if (!other.getState().isEmpty()) {
        state_ = other.state_;
        onChanged();
      }
      if (!other.getCountry().isEmpty()) {
        country_ = other.country_;
        onChanged();
      }
      if (!other.getLatitude().isEmpty()) {
        latitude_ = other.latitude_;
        onChanged();
      }
      if (!other.getLongitude().isEmpty()) {
        longitude_ = other.longitude_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.demo.protobuf.AddressDetailsP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.demo.protobuf.AddressDetailsP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1;</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      address_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 2;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 2;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 2;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <code>string city = 2;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object state_ = "";
    /**
     * <code>string state = 3;</code>
     * @return The state.
     */
    public java.lang.String getState() {
      java.lang.Object ref = state_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        state_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string state = 3;</code>
     * @return The bytes for state.
     */
    public com.google.protobuf.ByteString
        getStateBytes() {
      java.lang.Object ref = state_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        state_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string state = 3;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = getDefaultInstance().getState();
      onChanged();
      return this;
    }
    /**
     * <code>string state = 3;</code>
     * @param value The bytes for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      state_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object country_ = "";
    /**
     * <code>string country = 4;</code>
     * @return The country.
     */
    public java.lang.String getCountry() {
      java.lang.Object ref = country_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        country_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string country = 4;</code>
     * @return The bytes for country.
     */
    public com.google.protobuf.ByteString
        getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string country = 4;</code>
     * @param value The country to set.
     * @return This builder for chaining.
     */
    public Builder setCountry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      country_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string country = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCountry() {
      
      country_ = getDefaultInstance().getCountry();
      onChanged();
      return this;
    }
    /**
     * <code>string country = 4;</code>
     * @param value The bytes for country to set.
     * @return This builder for chaining.
     */
    public Builder setCountryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      country_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object latitude_ = "";
    /**
     * <code>string latitude = 5;</code>
     * @return The latitude.
     */
    public java.lang.String getLatitude() {
      java.lang.Object ref = latitude_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        latitude_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string latitude = 5;</code>
     * @return The bytes for latitude.
     */
    public com.google.protobuf.ByteString
        getLatitudeBytes() {
      java.lang.Object ref = latitude_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        latitude_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string latitude = 5;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string latitude = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = getDefaultInstance().getLatitude();
      onChanged();
      return this;
    }
    /**
     * <code>string latitude = 5;</code>
     * @param value The bytes for latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitudeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      latitude_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object longitude_ = "";
    /**
     * <code>string longitude = 6;</code>
     * @return The longitude.
     */
    public java.lang.String getLongitude() {
      java.lang.Object ref = longitude_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        longitude_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string longitude = 6;</code>
     * @return The bytes for longitude.
     */
    public com.google.protobuf.ByteString
        getLongitudeBytes() {
      java.lang.Object ref = longitude_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        longitude_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string longitude = 6;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string longitude = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = getDefaultInstance().getLongitude();
      onChanged();
      return this;
    }
    /**
     * <code>string longitude = 6;</code>
     * @param value The bytes for longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitudeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      longitude_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.AddressDetailsP)
  }

  // @@protoc_insertion_point(class_scope:proto.AddressDetailsP)
  private static final com.example.demo.protobuf.AddressDetailsP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.demo.protobuf.AddressDetailsP();
  }

  public static com.example.demo.protobuf.AddressDetailsP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressDetailsP>
      PARSER = new com.google.protobuf.AbstractParser<AddressDetailsP>() {
    @java.lang.Override
    public AddressDetailsP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressDetailsP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressDetailsP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressDetailsP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.demo.protobuf.AddressDetailsP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
