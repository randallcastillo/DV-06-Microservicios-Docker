package com.calculadoraservice.calculadoraservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String url = "http://localhost:";
    private String path = "/5/2";

    @Test
    public void sumaShouldReturn7() throws Exception {
        assertThat(this.restTemplate.getForObject(url + port + "/suma" + path, String.class))
                .contains("7");
    }

    @Test
    public void restaShouldReturn3() throws Exception {
        assertThat(this.restTemplate.getForObject(url + port + "/resta" + path, String.class))
                .contains("3");
    }
}