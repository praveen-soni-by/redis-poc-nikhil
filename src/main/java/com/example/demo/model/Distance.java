package com.example.demo.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Distance {
     String id;
     AddressDetails originAddress;
     AddressDetails destinationAddress;
     Integer distanceInKm;
     Integer transitTimeHours;
     Dummy1 dummy1;
     Dummy2 dummy2;
}
