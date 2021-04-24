package com.gayoung.cookie_run.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountsRepository;

    @GetMapping
    public ResponseEntity<List<Account>> getAccountsList(){
        return new ResponseEntity<>(accountsRepository.findAll(), HttpStatus.OK);
    }
}
