package com.sparta.week01.controller;

import com.sparta.week01.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getMyInfo() {

        return new Person("남병관", 20, "서울특별시 강남구", "튜터", "010-1234-5678");
    }

}
