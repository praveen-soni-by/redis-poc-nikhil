package com.example.demo.repository;

import com.example.demo.mapper.GenericMapper;
import com.example.demo.model.Distance;
import com.google.protobuf.InvalidProtocolBufferException;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.reactive.RedisReactiveCommands;
import io.lettuce.core.protocol.RedisCommand;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Optional;

@Repository
@Log4j2
public class DistanceProtoRepositoryNew implements IDistanceProtoRepositoryNew {

    private final RedisReactiveCommands<String, byte[]> redisCommand;

    public DistanceProtoRepositoryNew(StatefulRedisConnection<String, byte[]> connection) {
        redisCommand = connection.reactive();
    }


    @Override
    public Mono<Distance> save(Distance distance) {

        byte[] data = GenericMapper.buildDistanceProtoObject(distance).toByteArray();
        log.info("byte array data to be saved is: -->> " + Arrays.toString(data));
            return this.redisCommand.hset(
                    "DISTANCES_PROTO_NEW",
                    distance.getId(),
                    data)
                    .map(__ -> distance);
    }

    @Override
    public Mono<Optional<Distance>> findByKey(String key) {

        return this.redisCommand.hget("DISTANCES_PROTO_NEW", key)
                .map(result -> {
                    try {
                        log.info("DISTANCE PROTO data type: --->>> " + result.getClass().getSimpleName());
                        return Optional.of(GenericMapper.buildDistanceObject(result));
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

