package com.krltest.apisample.service;

import com.krltest.apisample.domain.simple.Quote;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
@Profile("dev")

public class SimpleApiServiceImpl implements ApiService {
    private RestTemplate restTemplate;
    private final String api_url;

    public SimpleApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public void getRestData() {
        System.out.println("in simple service class...");
        System.out.println("Api Built... "+api_url);
        //Quote quote= restTemplate.getForObject(api_url, Quote.class);

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
                .fromUriString(api_url);

        Quote quote= restTemplate.getForObject(uriComponentsBuilder.toUriString(), Quote.class);
        HttpHeaders httpHeaders= restTemplate.headForHeaders(uriComponentsBuilder.toUriString());
        System.out.println("getting http headers ....+ "+ httpHeaders.toString());

        System.out.println("Quote Json: "+quote.getValue().getQuote());
    }
}
