package com.tj.universal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class UniversalApplication {


    public static void main(String[] args) {
        SpringApplication.run(UniversalApplication.class, args);
    }

}
