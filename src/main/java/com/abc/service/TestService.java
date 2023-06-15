package com.abc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {
    public void test(){
        System.out.println("test");
        log.info("info:TestService");
        log.debug("debug:TestService");
        log.info("info:TestService");
    }
}
