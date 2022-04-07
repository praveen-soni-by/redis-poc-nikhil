package com.example.demo.repository;


import com.example.demo.model.Distance;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface IDistanceRepository {

    Mono<Distance> save(Distance distance);

    Mono<Optional<Distance>> findByKey(String key);

    Mono<Optional<Distance>> update(Distance updatedDistance);

    Mono<Long> deleteByKey(String key);
}
