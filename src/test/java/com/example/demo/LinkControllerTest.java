package com.example.demo;

import com.example.demo.controller.LinkController;
import com.example.demo.model.Link;
import com.example.demo.services.LinkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebFluxTest(controllers = LinkController.class)
public class LinkControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private LinkService linkService;

    @Test
    public void shortensLink() {
        when(linkService.shortenLink("https://spring.io")).thenReturn(Mono.just("http://localhost:8080/s123"));
        webTestClient.post()
                .uri("/api/v1/link")
                .contentType(MediaType.APPLICATION_JSON)
                .syncBody("{\"link\":\"https://spring.io\"}")
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBody()
                .jsonPath("$.shortenedLink")
                .value(val -> assertThat(val).isEqualTo("http://localhost:8080/s123"));

    }

    @Test
    public void redirectsToSameOriginalLink() {
        when(linkService.getOriginalLink("s123"))
                .thenReturn(Mono.just(new Link("https://spring.io", "s123")));
        webTestClient.get()
                .uri("/api/v1/link/s123")
                .exchange()
                .expectStatus()
                .isPermanentRedirect()
                .expectHeader()
                .location("https://spring.io");
    }
}
