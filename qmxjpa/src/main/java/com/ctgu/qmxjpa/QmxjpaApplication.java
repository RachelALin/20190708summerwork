package com.ctgu.qmxjpa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ctgu.qmxjpa.dao")
@SpringBootApplication

public class QmxjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QmxjpaApplication.class, args);
    }

}
