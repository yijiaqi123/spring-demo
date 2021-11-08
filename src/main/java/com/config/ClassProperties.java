package com.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "hunan.swjd")
public class ClassProperties {
    private String className;
    private Integer roomNum;
    private User user;
}
