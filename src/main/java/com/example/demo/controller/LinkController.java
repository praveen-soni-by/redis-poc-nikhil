package com.example.demo.controller;

import com.example.demo.services.LinkService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
@Log4j2
public class LinkController {

    private final LinkService linkService;

    @PostMapping("/link")
    Mono<CreateLinkResponse> create(@RequestBody CreateLinkRequest request) {

        log.info("received post request");
        return linkService.shortenLink(request.getLink())
                .map(CreateLinkResponse::new);
    }

    @GetMapping("/link/{key}")
    Mono<ResponseEntity<Object>> getLink(@PathVariable String key) {
        return linkService.getOriginalLink(key)
                .map(link -> ResponseEntity.status(HttpStatus.PERMANENT_REDIRECT)
                                .header("Location", link.getOriginalLink())
                                .build()
                ).defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND)
                                .build());
    }

    @Value
    public static class CreateLinkRequest {
        private String link;
    }

    @Value
    public static class CreateLinkResponse {
        private String shortenedLink;
    }
}
