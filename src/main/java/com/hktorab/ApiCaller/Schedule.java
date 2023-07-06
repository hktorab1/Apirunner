package com.hktorab.ApiCaller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class Schedule {
    @Scheduled(cron = "0 */10 * * * *")
    public void callHktorabApi() {
        RestTemplate restTemplate = new RestTemplate();

        String resourceUrl
                = "https://hktorab.com/testifalive/checkwheth&$!eritis&liveornot";
        HttpEntity<String> request = new HttpEntity<String>(new String());

        ResponseEntity<String> productCreateResponse =
                restTemplate
                        .exchange(resourceUrl,
                                HttpMethod.POST,
                                request,
                                String.class);
        System.out.println(productCreateResponse.getBody());

    }
}
