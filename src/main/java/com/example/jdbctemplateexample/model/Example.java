package com.example.jdbctemplateexample.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class Example {
    /**
     * Database identifier of the example record (null when new).
     */
    private Integer id;

    /**
     * the name of the example
     */
    private String name;

    /**
     * Short explanation of what it does
     */
    private String description;

    /**
     * the example contents
     */
    private String contents;
}
