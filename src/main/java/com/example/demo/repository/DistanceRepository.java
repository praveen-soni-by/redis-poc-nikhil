package com.example.demo.repository;

import com.example.demo.mapper.GenericMapper;
import com.example.demo.model.Distance;
import com.example.demo.protobuf.DistanceProto;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Optional;

@Repository
@Log4j2
public class DistanceRepository implements IDistanceRepository {

    private final ReactiveRedisTemplate<String, Distance> template;

    public DistanceRepository(
            ReactiveRedisTemplate<String, Distance> reactiveRedisTemplateForDistance) {
        this.template = reactiveRedisTemplateForDistance;
    }

    @Override
    public Mono<Distance> save(Distance distance) {

        return this.template.opsForHash()
                .put("DISTANCES",
                        distance.getId(),
                        distance)
                .map(__ -> distance);
    }

    @Override
    public Mono<Optional<Distance>> findByKey(String key) {

        return this.template.opsForHash()
                .get("DISTANCES", key)
                .map(result -> Optional.of((Distance) result))
                .defaultIfEmpty(Optional.empty());

    }

    @Override
    public Mono<Optional<Distance>> update(Distance updatedDistance) {
        return null;
    }

    @Override
    public Mono<Long> deleteByKey(String key) {
         return this.template.opsForHash()
                .remove("DISTANCES", key);
    }
}
