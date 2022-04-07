package com.example.demo.repository;

import com.example.demo.mapper.GenericMapper;
import com.example.demo.model.Distance;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.jca.context.SpringContextResourceAdapter;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Optional;

@Repository
@Log4j2
public class DistanceProtoRepository implements IDistanceProtoRepository {

    private final ReactiveRedisTemplate<String, byte[]> template;

    public DistanceProtoRepository(ReactiveRedisTemplate<String, byte[]> reactiveRedisTemplate) {
        this.template = reactiveRedisTemplate;

    }

    @Override
    public Mono<Distance> save(Distance distance) {
        byte[] data = GenericMapper.buildDistanceProtoObject(distance).toByteArray();
        log.info("byte array data to be saved is: -->> " + Arrays.toString(data));
        return this.template.opsForHash()
                .put("DISTANCES_PROTO",
                        distance.getId(),
                        data)
                .map(__ -> distance);

    }

    @Override
    public Mono<Optional<Distance>> findByKey(String key) {

        return this.template.opsForHash()
                .get("DISTANCES_PROTO", key)
                .map(result -> {
                    try {
                        log.info("DISTANCE PROTO data type: --->>> " + result.getClass().getSimpleName());
                        return Optional.of(GenericMapper.buildDistanceObject((byte[]) result));
                    } catch (InvalidProtocolBufferException e) {
                        log.error("Error occurred while distance proto conversion: -->> " + e);
                        return Optional.<Distance>empty();
                    }
                })
                .defaultIfEmpty(Optional.empty());
    }

    @Override
    public Mono<Optional<Distance>> update(Distance updatedDistance) {
        return null;
    }

    @Override
    public Mono<Long> deleteByKey(String key) {
        return null;
    }
}

