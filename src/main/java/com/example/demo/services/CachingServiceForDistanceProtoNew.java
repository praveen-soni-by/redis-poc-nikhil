package com.example.demo.services;

import com.example.demo.model.Distance;
import com.example.demo.repository.DistanceProtoRepository;
import com.example.demo.repository.DistanceProtoRepositoryNew;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@Log4j2
public class CachingServiceForDistanceProtoNew {

    private final DistanceProtoRepositoryNew distanceProtoRepository;

    public CachingServiceForDistanceProtoNew(DistanceProtoRepositoryNew distanceProtoRepository) {
        this.distanceProtoRepository = distanceProtoRepository;
    }


    public Mono<Distance> saveDistance(Distance distance) {
        return distanceProtoRepository.save(distance);
    }

    public Mono<Optional<Distance>> getDistanceByKey(String key) {
        return distanceProtoRepository.findByKey(key);
    }

    public Mono<Long> deleteDistance(String key) {

        return distanceProtoRepository.deleteByKey(key);
    }

    public Mono<Optional<Distance>> updateDistance(String key, Distance distance) {
        return distanceProtoRepository.findByKey(key)
                .switchIfEmpty(Mono.defer(Mono::empty))
                .map(result -> createUpadatedDistance(result, distance))
                .flatMap(distanceProtoRepository::update);

    }

    private Distance createUpadatedDistance(
            Optional<Distance> originalDistance,
            Distance updatedDistance) {
        return null;
    }
}
