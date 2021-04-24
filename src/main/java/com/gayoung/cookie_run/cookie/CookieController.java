package com.gayoung.cookie_run.cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cookies")
public class CookieController {

    @Autowired
    private CookieRepository cookiesRepository;

    @GetMapping
    public ResponseEntity<List<Cookie>> getCookiesList(){
        return new ResponseEntity<>(cookiesRepository.findAll(), HttpStatus.OK);
    }
}
