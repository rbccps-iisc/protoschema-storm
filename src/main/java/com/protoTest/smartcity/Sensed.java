// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/sensed.proto

package com.protoTest.smartcity;

public final class Sensed {
  private Sensed() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface sensor_valuesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sensor_values)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 dataSamplingInstant = 1;</code>
     */
    boolean hasDataSamplingInstant();
    /**
     * <code>required int32 dataSamplingInstant = 1;</code>
     */
    int getDataSamplingInstant();

    /**
     * <code>optional int32 caseTemperature = 2;</code>
     */
    boolean hasCaseTemperature();
    /**
     * <code>optional int32 caseTemperature = 2;</code>
     */
    int getCaseTemperature();

    /**
     * <code>optional int32 powerConsumption = 3;</code>
     */
    boolean hasPowerConsumption();
    /**
     * <code>optional int32 powerConsumption = 3;</code>
     */
    int getPowerConsumption();

    /**
     * <code>optional int32 luxOutput = 4;</code>
     */
    boolean hasLuxOutput();
    /**
     * <code>optional int32 luxOutput = 4;</code>
     */
    int getLuxOutput();

    /**
     * <code>optional int32 ambientLux = 5;</code>
     */
    boolean hasAmbientLux();
    /**
     * <code>optional int32 ambientLux = 5;</code>
     */
    int getAmbientLux();

    /**
     * <code>optional int32 batteryLevel = 6;</code>
     */
    boolean hasBatteryLevel();
    /**
     * <code>optional int32 batteryLevel = 6;</code>
     */
    int getBatteryLevel();

    /**
     * <code>optional bool slaveAlive = 7;</code>
     */
    boolean hasSlaveAlive();
    /**
     * <code>optional bool slaveAlive = 7;</code>
     */
    boolean getSlaveAlive();
  }
  /**
   * Protobuf type {@code sensor_values}
   */
  public  static final class sensor_values extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:sensor_values)
      sensor_valuesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use sensor_values.newBuilder() to construct.
    private sensor_values(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private sensor_values() {
      dataSamplingInstant_ = 0;
      caseTemperature_ = 0;
      powerConsumption_ = 0;
      luxOutput_ = 0;
      ambientLux_ = 0;
      batteryLevel_ = 0;
      slaveAlive_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private sensor_values(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              dataSamplingInstant_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              caseTemperature_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              powerConsumption_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              luxOutput_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              ambientLux_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              batteryLevel_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              slaveAlive_ = input.readBool();
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
      return com.protoTest.smartcity.Sensed.internal_static_sensor_values_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.protoTest.smartcity.Sensed.internal_static_sensor_values_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.protoTest.smartcity.Sensed.sensor_values.class, com.protoTest.smartcity.Sensed.sensor_values.Builder.class);
    }

    private int bitField0_;
    public static final int DATASAMPLINGINSTANT_FIELD_NUMBER = 1;
    private int dataSamplingInstant_;
    /**
     * <code>required int32 dataSamplingInstant = 1;</code>
     */
    public boolean hasDataSamplingInstant() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 dataSamplingInstant = 1;</code>
     */
    public int getDataSamplingInstant() {
      return dataSamplingInstant_;
    }

    public static final int CASETEMPERATURE_FIELD_NUMBER = 2;
    private int caseTemperature_;
    /**
     * <code>optional int32 caseTemperature = 2;</code>
     */
    public boolean hasCaseTemperature() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 caseTemperature = 2;</code>
     */
    public int getCaseTemperature() {
      return caseTemperature_;
    }

    public static final int POWERCONSUMPTION_FIELD_NUMBER = 3;
    private int powerConsumption_;
    /**
     * <code>optional int32 powerConsumption = 3;</code>
     */
    public boolean hasPowerConsumption() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 powerConsumption = 3;</code>
     */
    public int getPowerConsumption() {
      return powerConsumption_;
    }

    public static final int LUXOUTPUT_FIELD_NUMBER = 4;
    private int luxOutput_;
    /**
     * <code>optional int32 luxOutput = 4;</code>
     */
    public boolean hasLuxOutput() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 luxOutput = 4;</code>
     */
    public int getLuxOutput() {
      return luxOutput_;
    }

    public static final int AMBIENTLUX_FIELD_NUMBER = 5;
    private int ambientLux_;
    /**
     * <code>optional int32 ambientLux = 5;</code>
     */
    public boolean hasAmbientLux() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 ambientLux = 5;</code>
     */
    public int getAmbientLux() {
      return ambientLux_;
    }

    public static final int BATTERYLEVEL_FIELD_NUMBER = 6;
    private int batteryLevel_;
    /**
     * <code>optional int32 batteryLevel = 6;</code>
     */
    public boolean hasBatteryLevel() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 batteryLevel = 6;</code>
     */
    public int getBatteryLevel() {
      return batteryLevel_;
    }

    public static final int SLAVEALIVE_FIELD_NUMBER = 7;
    private boolean slaveAlive_;
    /**
     * <code>optional bool slaveAlive = 7;</code>
     */
    public boolean hasSlaveAlive() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool slaveAlive = 7;</code>
     */
    public boolean getSlaveAlive() {
      return slaveAlive_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasDataSamplingInstant()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, dataSamplingInstant_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, caseTemperature_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, powerConsumption_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, luxOutput_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, ambientLux_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, batteryLevel_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, slaveAlive_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, dataSamplingInstant_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, caseTemperature_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, powerConsumption_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, luxOutput_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, ambientLux_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, batteryLevel_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, slaveAlive_);
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
      if (!(obj instanceof com.protoTest.smartcity.Sensed.sensor_values)) {
        return super.equals(obj);
      }
      com.protoTest.smartcity.Sensed.sensor_values other = (com.protoTest.smartcity.Sensed.sensor_values) obj;

      boolean result = true;
      result = result && (hasDataSamplingInstant() == other.hasDataSamplingInstant());
      if (hasDataSamplingInstant()) {
        result = result && (getDataSamplingInstant()
            == other.getDataSamplingInstant());
      }
      result = result && (hasCaseTemperature() == other.hasCaseTemperature());
      if (hasCaseTemperature()) {
        result = result && (getCaseTemperature()
            == other.getCaseTemperature());
      }
      result = result && (hasPowerConsumption() == other.hasPowerConsumption());
      if (hasPowerConsumption()) {
        result = result && (getPowerConsumption()
            == other.getPowerConsumption());
      }
      result = result && (hasLuxOutput() == other.hasLuxOutput());
      if (hasLuxOutput()) {
        result = result && (getLuxOutput()
            == other.getLuxOutput());
      }
      result = result && (hasAmbientLux() == other.hasAmbientLux());
      if (hasAmbientLux()) {
        result = result && (getAmbientLux()
            == other.getAmbientLux());
      }
      result = result && (hasBatteryLevel() == other.hasBatteryLevel());
      if (hasBatteryLevel()) {
        result = result && (getBatteryLevel()
            == other.getBatteryLevel());
      }
      result = result && (hasSlaveAlive() == other.hasSlaveAlive());
      if (hasSlaveAlive()) {
        result = result && (getSlaveAlive()
            == other.getSlaveAlive());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDataSamplingInstant()) {
        hash = (37 * hash) + DATASAMPLINGINSTANT_FIELD_NUMBER;
        hash = (53 * hash) + getDataSamplingInstant();
      }
      if (hasCaseTemperature()) {
        hash = (37 * hash) + CASETEMPERATURE_FIELD_NUMBER;
        hash = (53 * hash) + getCaseTemperature();
      }
      if (hasPowerConsumption()) {
        hash = (37 * hash) + POWERCONSUMPTION_FIELD_NUMBER;
        hash = (53 * hash) + getPowerConsumption();
      }
      if (hasLuxOutput()) {
        hash = (37 * hash) + LUXOUTPUT_FIELD_NUMBER;
        hash = (53 * hash) + getLuxOutput();
      }
      if (hasAmbientLux()) {
        hash = (37 * hash) + AMBIENTLUX_FIELD_NUMBER;
        hash = (53 * hash) + getAmbientLux();
      }
      if (hasBatteryLevel()) {
        hash = (37 * hash) + BATTERYLEVEL_FIELD_NUMBER;
        hash = (53 * hash) + getBatteryLevel();
      }
      if (hasSlaveAlive()) {
        hash = (37 * hash) + SLAVEALIVE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getSlaveAlive());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.protoTest.smartcity.Sensed.sensor_values parseFrom(
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
    public static Builder newBuilder(com.protoTest.smartcity.Sensed.sensor_values prototype) {
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
     * Protobuf type {@code sensor_values}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sensor_values)
        com.protoTest.smartcity.Sensed.sensor_valuesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.protoTest.smartcity.Sensed.internal_static_sensor_values_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.protoTest.smartcity.Sensed.internal_static_sensor_values_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.protoTest.smartcity.Sensed.sensor_values.class, com.protoTest.smartcity.Sensed.sensor_values.Builder.class);
      }

      // Construct using com.protoTest.smartcity.Sensed.sensor_values.newBuilder()
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
        dataSamplingInstant_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        caseTemperature_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        powerConsumption_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        luxOutput_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        ambientLux_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        batteryLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        slaveAlive_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.protoTest.smartcity.Sensed.internal_static_sensor_values_descriptor;
      }

      public com.protoTest.smartcity.Sensed.sensor_values getDefaultInstanceForType() {
        return com.protoTest.smartcity.Sensed.sensor_values.getDefaultInstance();
      }

      public com.protoTest.smartcity.Sensed.sensor_values build() {
        com.protoTest.smartcity.Sensed.sensor_values result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.protoTest.smartcity.Sensed.sensor_values buildPartial() {
        com.protoTest.smartcity.Sensed.sensor_values result = new com.protoTest.smartcity.Sensed.sensor_values(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dataSamplingInstant_ = dataSamplingInstant_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.caseTemperature_ = caseTemperature_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.powerConsumption_ = powerConsumption_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.luxOutput_ = luxOutput_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.ambientLux_ = ambientLux_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.batteryLevel_ = batteryLevel_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.slaveAlive_ = slaveAlive_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.protoTest.smartcity.Sensed.sensor_values) {
          return mergeFrom((com.protoTest.smartcity.Sensed.sensor_values)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.protoTest.smartcity.Sensed.sensor_values other) {
        if (other == com.protoTest.smartcity.Sensed.sensor_values.getDefaultInstance()) return this;
        if (other.hasDataSamplingInstant()) {
          setDataSamplingInstant(other.getDataSamplingInstant());
        }
        if (other.hasCaseTemperature()) {
          setCaseTemperature(other.getCaseTemperature());
        }
        if (other.hasPowerConsumption()) {
          setPowerConsumption(other.getPowerConsumption());
        }
        if (other.hasLuxOutput()) {
          setLuxOutput(other.getLuxOutput());
        }
        if (other.hasAmbientLux()) {
          setAmbientLux(other.getAmbientLux());
        }
        if (other.hasBatteryLevel()) {
          setBatteryLevel(other.getBatteryLevel());
        }
        if (other.hasSlaveAlive()) {
          setSlaveAlive(other.getSlaveAlive());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDataSamplingInstant()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.protoTest.smartcity.Sensed.sensor_values parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.protoTest.smartcity.Sensed.sensor_values) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int dataSamplingInstant_ ;
      /**
       * <code>required int32 dataSamplingInstant = 1;</code>
       */
      public boolean hasDataSamplingInstant() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 dataSamplingInstant = 1;</code>
       */
      public int getDataSamplingInstant() {
        return dataSamplingInstant_;
      }
      /**
       * <code>required int32 dataSamplingInstant = 1;</code>
       */
      public Builder setDataSamplingInstant(int value) {
        bitField0_ |= 0x00000001;
        dataSamplingInstant_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 dataSamplingInstant = 1;</code>
       */
      public Builder clearDataSamplingInstant() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dataSamplingInstant_ = 0;
        onChanged();
        return this;
      }

      private int caseTemperature_ ;
      /**
       * <code>optional int32 caseTemperature = 2;</code>
       */
      public boolean hasCaseTemperature() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 caseTemperature = 2;</code>
       */
      public int getCaseTemperature() {
        return caseTemperature_;
      }
      /**
       * <code>optional int32 caseTemperature = 2;</code>
       */
      public Builder setCaseTemperature(int value) {
        bitField0_ |= 0x00000002;
        caseTemperature_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 caseTemperature = 2;</code>
       */
      public Builder clearCaseTemperature() {
        bitField0_ = (bitField0_ & ~0x00000002);
        caseTemperature_ = 0;
        onChanged();
        return this;
      }

      private int powerConsumption_ ;
      /**
       * <code>optional int32 powerConsumption = 3;</code>
       */
      public boolean hasPowerConsumption() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 powerConsumption = 3;</code>
       */
      public int getPowerConsumption() {
        return powerConsumption_;
      }
      /**
       * <code>optional int32 powerConsumption = 3;</code>
       */
      public Builder setPowerConsumption(int value) {
        bitField0_ |= 0x00000004;
        powerConsumption_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 powerConsumption = 3;</code>
       */
      public Builder clearPowerConsumption() {
        bitField0_ = (bitField0_ & ~0x00000004);
        powerConsumption_ = 0;
        onChanged();
        return this;
      }

      private int luxOutput_ ;
      /**
       * <code>optional int32 luxOutput = 4;</code>
       */
      public boolean hasLuxOutput() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 luxOutput = 4;</code>
       */
      public int getLuxOutput() {
        return luxOutput_;
      }
      /**
       * <code>optional int32 luxOutput = 4;</code>
       */
      public Builder setLuxOutput(int value) {
        bitField0_ |= 0x00000008;
        luxOutput_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 luxOutput = 4;</code>
       */
      public Builder clearLuxOutput() {
        bitField0_ = (bitField0_ & ~0x00000008);
        luxOutput_ = 0;
        onChanged();
        return this;
      }

      private int ambientLux_ ;
      /**
       * <code>optional int32 ambientLux = 5;</code>
       */
      public boolean hasAmbientLux() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 ambientLux = 5;</code>
       */
      public int getAmbientLux() {
        return ambientLux_;
      }
      /**
       * <code>optional int32 ambientLux = 5;</code>
       */
      public Builder setAmbientLux(int value) {
        bitField0_ |= 0x00000010;
        ambientLux_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 ambientLux = 5;</code>
       */
      public Builder clearAmbientLux() {
        bitField0_ = (bitField0_ & ~0x00000010);
        ambientLux_ = 0;
        onChanged();
        return this;
      }

      private int batteryLevel_ ;
      /**
       * <code>optional int32 batteryLevel = 6;</code>
       */
      public boolean hasBatteryLevel() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 batteryLevel = 6;</code>
       */
      public int getBatteryLevel() {
        return batteryLevel_;
      }
      /**
       * <code>optional int32 batteryLevel = 6;</code>
       */
      public Builder setBatteryLevel(int value) {
        bitField0_ |= 0x00000020;
        batteryLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 batteryLevel = 6;</code>
       */
      public Builder clearBatteryLevel() {
        bitField0_ = (bitField0_ & ~0x00000020);
        batteryLevel_ = 0;
        onChanged();
        return this;
      }

      private boolean slaveAlive_ ;
      /**
       * <code>optional bool slaveAlive = 7;</code>
       */
      public boolean hasSlaveAlive() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bool slaveAlive = 7;</code>
       */
      public boolean getSlaveAlive() {
        return slaveAlive_;
      }
      /**
       * <code>optional bool slaveAlive = 7;</code>
       */
      public Builder setSlaveAlive(boolean value) {
        bitField0_ |= 0x00000040;
        slaveAlive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool slaveAlive = 7;</code>
       */
      public Builder clearSlaveAlive() {
        bitField0_ = (bitField0_ & ~0x00000040);
        slaveAlive_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:sensor_values)
    }

    // @@protoc_insertion_point(class_scope:sensor_values)
    private static final com.protoTest.smartcity.Sensed.sensor_values DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.protoTest.smartcity.Sensed.sensor_values();
    }

    public static com.protoTest.smartcity.Sensed.sensor_values getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<sensor_values>
        PARSER = new com.google.protobuf.AbstractParser<sensor_values>() {
      public sensor_values parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new sensor_values(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<sensor_values> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<sensor_values> getParserForType() {
      return PARSER;
    }

    public com.protoTest.smartcity.Sensed.sensor_values getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_values_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_values_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023protos/sensed.proto\"\260\001\n\rsensor_values\022" +
      "\033\n\023dataSamplingInstant\030\001 \002(\005\022\027\n\017caseTemp" +
      "erature\030\002 \001(\005\022\030\n\020powerConsumption\030\003 \001(\005\022" +
      "\021\n\tluxOutput\030\004 \001(\005\022\022\n\nambientLux\030\005 \001(\005\022\024" +
      "\n\014batteryLevel\030\006 \001(\005\022\022\n\nslaveAlive\030\007 \001(\010" +
      "B\031\n\027com.protoTest.smartcity"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_sensor_values_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensor_values_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_values_descriptor,
        new java.lang.String[] { "DataSamplingInstant", "CaseTemperature", "PowerConsumption", "LuxOutput", "AmbientLux", "BatteryLevel", "SlaveAlive", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
