package com.config;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String  name,age;
    private List<String> girls;
}
