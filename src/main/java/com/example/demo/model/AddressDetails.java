package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Value
@Builder
public class AddressDetails {
    String address;
    String city;
    String state;
    String country;
    String latitude;
    String longitude;
}
