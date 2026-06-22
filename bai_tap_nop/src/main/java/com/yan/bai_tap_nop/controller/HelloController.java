package com.yan.bai_tap_nop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Cung cấp endpoint đơn giản để minh họa cách Logback định tuyến các mức log
 * TRACE, DEBUG, INFO, WARN và ERROR.
 */
@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    /**
     * Ghi một thông điệp mẫu ở từng mức log rồi trả về nội dung chào hỏi.
     * Các thông điệp đều là hằng số để tránh đưa dữ liệu không tin cậy của người
     * dùng vào log.
     *
     * @return nội dung phản hồi dạng văn bản thuần
     */
    @GetMapping(value = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        LOGGER.trace("Thông điệp minh họa mức TRACE");
        LOGGER.debug("Thông điệp minh họa mức DEBUG");
        LOGGER.info("Thông điệp minh họa mức INFO");
        LOGGER.warn("Thông điệp minh họa mức WARN");
        LOGGER.error("Thông điệp minh họa mức ERROR");
        return "Hello World";
    }
}
