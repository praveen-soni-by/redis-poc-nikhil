package com.example.demo.repository;

import com.example.demo.model.Link;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.Instant;

@Repository
@Log4j2
public class RedisLinkRepository implements LinkRepository {

    private final ReactiveRedisTemplate<String, String> template;

    public RedisLinkRepository( ReactiveRedisTemplate<String, String> reactiveRedisTemplate) {
        this.template = reactiveRedisTemplate;
    }

    @Override
    public Mono<Link> save(Link link) {
        long startTime = Instant.now().toEpochMilli();
        return template.opsForValue()
                .set(link.getKey(), link.getOriginalLink())
                .map(__ -> {
                    long endtime = Instant.now().toEpochMilli();
                    log.info("Total time taken for save ->> " + (endtime - startTime) + " ms");
                    return link;
                });
    }

    @Override
    public Mono<Link> findByKey(String key) {
        return template.opsForValue()
                .get(key)
                .map(result -> new Link(result, key));
    }
}
