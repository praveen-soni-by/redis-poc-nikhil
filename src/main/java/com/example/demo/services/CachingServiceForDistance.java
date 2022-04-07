package com.example.demo.services;

import com.example.demo.model.Distance;
import com.example.demo.repository.DistanceRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@Log4j2
public class CachingServiceForDistance {

    private final DistanceRepository distanceRepository;

    public CachingServiceForDistance(DistanceRepository distanceRepository) {
        this.distanceRepository = distanceRepository;
    }

    public Mono<Distance> saveDistance(Distance distance) {
        return distanceRepository.save(distance);
    }

    public Mono<Optional<Distance>> getDistanceByKey(String key) {
        return distanceRepository.findByKey(key);
    }

    public Mono<Long> deleteDistance(String key) {

        return distanceRepository.deleteByKey(key);
    }

    public Mono<Optional<Distance>> updateDistance(String key, Distance distance) {
        return distanceRepository.findByKey(key)
                .switchIfEmpty(Mono.defer(Mono::empty))
                .map(result -> createUpadatedDistance(result, distance))
                .flatMap(distanceRepository::update);

    }

    private Distance createUpadatedDistance(
            Optional<Distance> originalDistance,
            Distance updatedDistance) {
        return null;
    }
}
