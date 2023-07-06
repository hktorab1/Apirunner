package com.hktorab.ApiCaller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class CallRestApi {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Landing page";
    }
    @RequestMapping(value = "/testcall", method = RequestMethod.GET)
    @ResponseBody
    public String callApi() {
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
        return ""+productCreateResponse.getBody();
    }



}
