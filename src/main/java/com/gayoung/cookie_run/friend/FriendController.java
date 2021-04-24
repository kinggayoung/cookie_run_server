package com.gayoung.cookie_run.friend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("friends")
public class FriendController {
    @Autowired
    private FriendRepository friendRepository;

    public ResponseEntity<List<Friend>> getFriendList(){
        return new ResponseEntity<List<Friend>>(friendRepository.findAll(), HttpStatus.OK);
    }
}
