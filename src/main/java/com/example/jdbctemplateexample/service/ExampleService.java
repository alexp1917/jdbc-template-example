package com.example.jdbctemplateexample.service;

import com.example.jdbctemplateexample.model.Example;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExampleService {

    private final JdbcTemplate jdbcTemplate;

    public ExampleService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Example e) {
        return jdbcTemplate.update("insert into example(name, description, contents) values(?, ?, ?)", e.getName(), e.getDescription(), e.getContents());
    }

    public Example findById(int id) {
        throw new UnsupportedOperationException("todo implement me");
    }

    public Integer findIdByName(String name) {
        return jdbcTemplate.queryForObject("select id from example where name = ? limit 1", Integer.class, name);
    }

}
