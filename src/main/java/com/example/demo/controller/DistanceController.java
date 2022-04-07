package com.example.demo.controller;

import com.example.demo.model.Distance;
import com.example.demo.services.CachingServiceForDistance;
import com.example.demo.services.CachingServiceForDistanceProto;
import com.example.demo.services.CachingServiceForDistanceProtoNew;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
@Log4j2
public class DistanceController {

    private final CachingServiceForDistance distanceService;
    private final CachingServiceForDistanceProto distanceProtoService;
    private final CachingServiceForDistanceProtoNew distanceProtoServiceNew;

    @PostMapping("/distance")
    Mono<Distance> addDistance(@RequestBody Distance distance) {
        log.info("received /POST request");
        return distanceService.saveDistance(distance);
    }

    @PostMapping("/distanceProto")
    Mono<Distance> addDistanceProto(@RequestBody Distance distance) {
        log.info("received /POST request");
        return distanceProtoService.saveDistance(distance);
    }

    @PostMapping("/distanceProtoNew")
    Mono<Distance> addDistanceProtoNew(@RequestBody Distance distance) {
        log.info("received /POST request");
        return distanceProtoServiceNew.saveDistance(distance);
    }

    @GetMapping("/distance/{key}")
    Mono<Optional<Distance>> getDistanceByKey(@PathVariable String key) {
        log.info("received /GET request for key: --->> " + key);
        return distanceService.getDistanceByKey(key);
    }

    @GetMapping("/distanceProto/{key}")
    Mono<Optional<Distance>> getDistanceProtoByKey(@PathVariable String key) {
        log.info("received /GET request for key: --->> " + key);
        return distanceProtoService.getDistanceByKey(key);
    }

    @GetMapping("/distanceProtoNew/{key}")
    Mono<Optional<Distance>> getDistanceProtoByKeyNew(@PathVariable String key) {
        log.info("received /GET request for key: --->> " + key);
        return distanceProtoServiceNew.getDistanceByKey(key);
    }

    @PutMapping("/distance/{key}")
    Mono<Optional<Distance>> updateDistance(@RequestBody Distance distance, @PathVariable String key) {
        log.info("received /PUT request for key: " + key);
        return distanceService.updateDistance(key, distance);
    }

    @DeleteMapping("/distances/{key}")
    Mono<Long> deleteDistance(@PathVariable String key) {
        log.info("received /DELETE request for key: " + key);
        return distanceService.deleteDistance(key);
    }
}
