package com.example.serviceb;

import io.micrometer.tracing.annotation.NewSpan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @NewSpan
    @GetMapping("/response")
    public String response() {
        return "Response from Service B";
    }
}