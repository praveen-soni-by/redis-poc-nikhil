// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/distance.proto

package com.example.demo.protobuf;

public interface DistancePOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.DistanceP)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.proto.AddressDetailsP origin_address = 2;</code>
   * @return Whether the originAddress field is set.
   */
  boolean hasOriginAddress();
  /**
   * <code>.proto.AddressDetailsP origin_address = 2;</code>
   * @return The originAddress.
   */
  com.example.demo.protobuf.AddressDetailsP getOriginAddress();
  /**
   * <code>.proto.AddressDetailsP origin_address = 2;</code>
   */
  com.example.demo.protobuf.AddressDetailsPOrBuilder getOriginAddressOrBuilder();

  /**
   * <code>.proto.AddressDetailsP destination_address = 3;</code>
   * @return Whether the destinationAddress field is set.
   */
  boolean hasDestinationAddress();
  /**
   * <code>.proto.AddressDetailsP destination_address = 3;</code>
   * @return The destinationAddress.
   */
  com.example.demo.protobuf.AddressDetailsP getDestinationAddress();
  /**
   * <code>.proto.AddressDetailsP destination_address = 3;</code>
   */
  com.example.demo.protobuf.AddressDetailsPOrBuilder getDestinationAddressOrBuilder();

  /**
   * <code>int32 distance_in_km = 4;</code>
   * @return The distanceInKm.
   */
  int getDistanceInKm();

  /**
   * <code>int32 transit_time_hours = 5;</code>
   * @return The transitTimeHours.
   */
  int getTransitTimeHours();

  /**
   * <code>.proto.Dummy1P dummy1 = 6;</code>
   * @return Whether the dummy1 field is set.
   */
  boolean hasDummy1();
  /**
   * <code>.proto.Dummy1P dummy1 = 6;</code>
   * @return The dummy1.
   */
  com.example.demo.protobuf.Dummy1P getDummy1();
  /**
   * <code>.proto.Dummy1P dummy1 = 6;</code>
   */
  com.example.demo.protobuf.Dummy1POrBuilder getDummy1OrBuilder();

  /**
   * <code>.proto.Dummy2P dummy2 = 7;</code>
   * @return Whether the dummy2 field is set.
   */
  boolean hasDummy2();
  /**
   * <code>.proto.Dummy2P dummy2 = 7;</code>
   * @return The dummy2.
   */
  com.example.demo.protobuf.Dummy2P getDummy2();
  /**
   * <code>.proto.Dummy2P dummy2 = 7;</code>
   */
  com.example.demo.protobuf.Dummy2POrBuilder getDummy2OrBuilder();
}
