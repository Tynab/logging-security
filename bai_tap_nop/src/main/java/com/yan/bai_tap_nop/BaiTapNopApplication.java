package com.yan.bai_tap_nop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Điểm khởi động của ứng dụng minh họa cấu hình logging bằng Spring Boot và
 * Logback.
 */
@SpringBootApplication
public class BaiTapNopApplication {

	/**
	 * Khởi tạo application context và máy chủ web nhúng.
	 *
	 * @param args tham số dòng lệnh truyền cho Spring Boot
	 */
	public static void main(String[] args) {
		SpringApplication.run(BaiTapNopApplication.class, args);
	}

}
