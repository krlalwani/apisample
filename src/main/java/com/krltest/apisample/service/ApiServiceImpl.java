package com.krltest.apisample.service;

import com.krltest.apisample.domain.weather.Columns;
import com.krltest.apisample.domain.weather.ColumnsData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@Profile("prod")
public class ApiServiceImpl implements ApiService {
    private RestTemplate restTemplate;
    private final String api_url;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url = api_url;
    }

    @Override
    public void getRestData() {
        // List<ColumnsData>
        System.out.println("in service class...");

/*/        ColumnsData columnsData = restTemplate.getForObject(api_url, ColumnsData.class);
        System.out.println("Got the column object..." + columnsData.toString());
*/
//    =24&contentType=json&unitGroup=metric&locationMode=single&key=1PYNQ6AWUDJE9AFERDCHJHSXK&locations=London,UK

      UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
                .fromUriString(api_url)
              .queryParam("aggregateHours","24")
              .queryParam("contentType","json")
              .queryParam("unitGroup","metric")
              .queryParam("locationMode","single")
              .queryParam("key","1PYNQ6AWUDJE9AFERDCHJHSXK")
              .queryParam("locations","London,UK");
        System.out.println("api built: ..." + uriComponentsBuilder.toUriString());
        HttpHeaders httpHeaders= restTemplate.headForHeaders(uriComponentsBuilder.toUriString());
        System.out.println("getting http headers ....+ "+ httpHeaders.toString());


        ColumnsData columnsData = restTemplate.getForObject(uriComponentsBuilder.toUriString(), ColumnsData.class);
        System.out.println("Got column object..."+columnsData.getColumns().getAddress());


    }
}
