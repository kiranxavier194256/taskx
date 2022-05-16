package io.test.springcloudconfigclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageResource {

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
}
