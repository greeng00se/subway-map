package com.brainbackdoor.subwaymap.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Value("${account.name}")
    private String account;

    @GetMapping("/health")
    public String hello() {
        return "hello " + account;
    }
}
