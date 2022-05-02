package com.example.jdbctemplateexample.service;

import com.example.jdbctemplateexample.model.Example;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class ExampleServiceTest {

    @Autowired
    ExampleService exampleService;

    @Test
    void usage() {
        for (int i = 0; i < 10; i++) {
            exampleService.save(new Example().setName("abc" + i).setDescription("alphabetical" + i).setDescription("..."));
        }

        // Example byId1 = exampleService.findById(1);
        // log.info("byId1: {}", byId1);
        Integer idByName2 = exampleService.findIdByName("abc2");
        log.info("idByName2: {}", idByName2);
    }

}
