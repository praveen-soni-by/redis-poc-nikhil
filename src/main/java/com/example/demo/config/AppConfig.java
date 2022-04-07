package com.example.demo.config;

import com.example.demo.model.Distance;
import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.StatefulRedisConnectionImpl;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.codec.RedisCodec;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;


@Configuration
public class AppConfig {

    @Value("${redisPassword}")
    private String password;

    @Value("${redisHost}")
    private String host;

    @Value("${redisPort}")
    private Integer port;

    @Bean
    ReactiveRedisTemplate<String, String> reactiveRedisTemplate(
            ReactiveRedisConnectionFactory reactiveRedisConnectionFactory
    ) {

        return new ReactiveRedisTemplate<>(reactiveRedisConnectionFactory,
                RedisSerializationContext.string());
    }

    @Bean
    ReactiveRedisConnectionFactory reactiveRedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration =
                new RedisStandaloneConfiguration(host, port);
        redisStandaloneConfiguration.setPassword(password);
        redisStandaloneConfiguration.setDatabase(0);
        return new LettuceConnectionFactory(redisStandaloneConfiguration);
    }

    @Bean(destroyMethod = "close")
    StatefulRedisConnection<String, byte[]> redisConnection() {
        RedisURI uri = RedisURI.builder()
                .withHost(host)
                .withPort(port)
                .withPassword(password.toCharArray())
                .build();
        RedisClient client = RedisClient.create(uri);
        RedisCodec<String, byte[]> redisCodec = new CustomCodec();
        StatefulRedisConnection<String, byte[]> connection =
                client.connect(redisCodec);

        return connection;
    }

    @Bean
    ReactiveRedisTemplate<String, Distance> reactiveRedisTemplateForDistance(
            ReactiveRedisConnectionFactory reactiveRedisConnectionFactory
    ) {

        StringRedisSerializer keySerializer = new StringRedisSerializer();

        Jackson2JsonRedisSerializer<Distance> valueSerializer =
                new Jackson2JsonRedisSerializer<>(Distance.class);


        RedisSerializationContext<String, Distance> serializationContext =
                RedisSerializationContext.<String, Distance>newSerializationContext(keySerializer)
                        .hashKey(keySerializer)
                        .hashValue(valueSerializer)
                        .build();


        return new ReactiveRedisTemplate<>(
                reactiveRedisConnectionFactory, serializationContext);
    }

    @Bean
    ReactiveRedisTemplate<String, byte[]> reactiveRedisTemplateForByteArray(
            ReactiveRedisConnectionFactory reactiveRedisConnectionFactory
    ) {

        StringRedisSerializer keySerializer = new StringRedisSerializer();

        Jackson2JsonRedisSerializer<byte[]> valueSerializer =
                new Jackson2JsonRedisSerializer<>(byte[].class);

        RedisSerializationContext<String, byte[]> serializationContext =
                RedisSerializationContext.<String, byte[]>newSerializationContext(keySerializer)
                        .hashKey(keySerializer)
                        .hashValue(valueSerializer)
                        .build();

        return new ReactiveRedisTemplate<>(reactiveRedisConnectionFactory,
                serializationContext);

    }

}
