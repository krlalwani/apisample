package com.krltest.apisample.controller;

import com.krltest.apisample.service.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private ApiService apiService;

    public IndexController(ApiService apiService) {
        this.apiService = apiService;
    }

    @RequestMapping("/")
    String index(){
        System.out.println("in index class....");
        return "index";
    }

    @RequestMapping("/data")
    String resultIndex(){
        //ApiService apiService=new ApiService();
        apiService.getRestData();
        return "index1";
    }
}



