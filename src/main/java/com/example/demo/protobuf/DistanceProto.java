// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/distance.proto

package com.example.demo.protobuf;

public final class DistanceProto {
  private DistanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_DistanceP_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_DistanceP_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_AddressDetailsP_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_AddressDetailsP_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Dummy1P_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Dummy1P_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Dummy2P_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Dummy2P_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030resources/distance.proto\022\005proto\"\360\001\n\tDi" +
      "stanceP\022\n\n\002id\030\001 \001(\t\022.\n\016origin_address\030\002 " +
      "\001(\0132\026.proto.AddressDetailsP\0223\n\023destinati" +
      "on_address\030\003 \001(\0132\026.proto.AddressDetailsP" +
      "\022\026\n\016distance_in_km\030\004 \001(\005\022\032\n\022transit_time" +
      "_hours\030\005 \001(\005\022\036\n\006dummy1\030\006 \001(\0132\016.proto.Dum" +
      "my1P\022\036\n\006dummy2\030\007 \001(\0132\016.proto.Dummy2P\"u\n\017" +
      "AddressDetailsP\022\017\n\007address\030\001 \001(\t\022\014\n\004city" +
      "\030\002 \001(\t\022\r\n\005state\030\003 \001(\t\022\017\n\007country\030\004 \001(\t\022\020" +
      "\n\010latitude\030\005 \001(\t\022\021\n\tlongitude\030\006 \001(\t\"#\n\007D" +
      "ummy1P\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\"#\n\007Dumm" +
      "y2P\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\tB,\n\031com.exa" +
      "mple.demo.protobufB\rDistanceProtoP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_DistanceP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_DistanceP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_DistanceP_descriptor,
        new java.lang.String[] { "Id", "OriginAddress", "DestinationAddress", "DistanceInKm", "TransitTimeHours", "Dummy1", "Dummy2", });
    internal_static_proto_AddressDetailsP_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_AddressDetailsP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_AddressDetailsP_descriptor,
        new java.lang.String[] { "Address", "City", "State", "Country", "Latitude", "Longitude", });
    internal_static_proto_Dummy1P_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_Dummy1P_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Dummy1P_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_proto_Dummy2P_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_Dummy2P_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Dummy2P_descriptor,
        new java.lang.String[] { "Id", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
