package com.sparta.deep01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // @WebServlet 어노테이션이 동작하도록
@SpringBootApplication
public class Deep01Application {

    public static void main(String[] args) {
        SpringApplication.run(Deep01Application.class, args);
    }

}

