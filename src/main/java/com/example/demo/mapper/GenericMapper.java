package com.example.demo.mapper;

import com.example.demo.model.AddressDetails;
import com.example.demo.model.Distance;
import com.example.demo.model.Dummy1;
import com.example.demo.model.Dummy2;
import com.example.demo.protobuf.AddressDetailsP;
import com.example.demo.protobuf.DistanceP;
import com.example.demo.protobuf.Dummy1P;
import com.example.demo.protobuf.Dummy2P;
import com.google.protobuf.InvalidProtocolBufferException;

public class GenericMapper {

    public static DistanceP buildDistanceProtoObject(Distance distance) {

        return DistanceP.newBuilder()
                .setId(distance.getId())
                .setOriginAddress(
                        AddressDetailsP.newBuilder()
                        .setAddress(distance.getOriginAddress().getAddress())
                        .setCity(distance.getOriginAddress().getCity())
                        .setCountry(distance.getOriginAddress().getCountry())
                        .setLatitude(distance.getOriginAddress().getLatitude())
                        .setLongitude(distance.getOriginAddress().getLongitude())
                        .build()
                )
                .setDestinationAddress(
                        AddressDetailsP.newBuilder()
                        .setAddress(distance.getDestinationAddress().getAddress())
                        .setCity(distance.getDestinationAddress().getCity())
                        .setCountry(distance.getDestinationAddress().getCountry())
                        .setLatitude(distance.getDestinationAddress().getLatitude())
                        .setLongitude(distance.getDestinationAddress().getLongitude())
                        .build()
                )
                .setDistanceInKm(distance.getDistanceInKm())
                .setTransitTimeHours(distance.getTransitTimeHours())
                .setDummy1(
                        Dummy1P.newBuilder()
                        .setId(distance.getDummy1().getId())
                        .setName(distance.getDummy1().getName())
                        .build()
                )
                .setDummy2(
                        Dummy2P.newBuilder()
                        .setId(distance.getDummy2().getId())
                        .setName(distance.getDummy2().getName())
                        .build()
                )
                .build();
    }

    public static Distance buildDistanceObject(byte[] distanceProtoByteArray) throws InvalidProtocolBufferException {

        DistanceP distanceProtoObject =
                DistanceP.parseFrom(distanceProtoByteArray);
//                DistanceProto.Distance.parseFrom(distanceProtoByteArray);

        return Distance.builder()
                .id(distanceProtoObject.getId())
                .originAddress(
                        AddressDetails.builder()
                        .address(distanceProtoObject.getOriginAddress().getAddress())
                        .city(distanceProtoObject.getOriginAddress().getCity())
                        .state(distanceProtoObject.getOriginAddress().getState())
                        .country(distanceProtoObject.getOriginAddress().getCountry())
                        .latitude(distanceProtoObject.getOriginAddress().getLatitude())
                        .longitude(distanceProtoObject.getOriginAddress().getLongitude())
                        .build()
                )
                .destinationAddress(
                        AddressDetails.builder()
                                .address(distanceProtoObject.getDestinationAddress().getAddress())
                                .city(distanceProtoObject.getDestinationAddress().getCity())
                                .state(distanceProtoObject.getDestinationAddress().getState())
                                .country(distanceProtoObject.getDestinationAddress().getCountry())
                                .latitude(distanceProtoObject.getDestinationAddress().getLatitude())
                                .longitude(distanceProtoObject.getDestinationAddress().getLongitude())
                                .build()
                )
                .distanceInKm(distanceProtoObject.getDistanceInKm())
                .transitTimeHours(distanceProtoObject.getTransitTimeHours())
                .dummy1(
                        Dummy1.builder()
                        .id(distanceProtoObject.getDummy1().getId())
                        .name(distanceProtoObject.getDummy1().getName())
                        .build()
                )
                .dummy2(
                        Dummy2.builder()
                        .id(distanceProtoObject.getDummy2().getId())
                        .name(distanceProtoObject.getDummy2().getName())
                        .build()
                )
                .build();
    }
}
