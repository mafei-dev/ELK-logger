package com.example.elklogger;

import com.abc.service.TestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/test")
@Slf4j
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    public String create() {
        log.debug("debug:LocalDate.now() {}", LocalDate.now());
        log.info("info:LocalDate.now() {}", LocalDate.now());
        log.error("error:LocalDate.now() {}", LocalDate.now());
        testService.test();
        return LocalDate.now().toString();
    }
}
