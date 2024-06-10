package com.lemoncode21.springlogelk;


import com.lemoncode21.springlogelk.entity.DetailsEntry;
import com.lemoncode21.springlogelk.service.DetailsEntryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
public class HomeController {

    @Autowired
    private DetailsEntryService detailsEntryService;
    @GetMapping("/")
    public String HomePage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Welcome home Page " + localDateTime);
        return "Welcome to Home page";
    }
//fetch data from mongo
    @GetMapping("/user")
    public List<DetailsEntry> getall(){

        LocalDateTime localDateTime = LocalDateTime.now();

        log.info(String.valueOf(detailsEntryService.getAll()));
        return detailsEntryService.getAll();
    }

    @GetMapping("/logs")
    public String LogsPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        //This method is used to forward logs t
        log.info("This Logs page " + localDateTime);
        return "Welcome to logs page";
    }

    @GetMapping("/warn")
    public String WarnPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("This warn page " + localDateTime);
        return "Welcome to warn page";
    }


    @GetMapping("/er")
    public String ErrorPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("This error page " + localDateTime);
        return "Welcome to error page";
    }


}
