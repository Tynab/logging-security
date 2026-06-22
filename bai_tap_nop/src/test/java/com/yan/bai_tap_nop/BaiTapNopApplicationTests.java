package com.yan.bai_tap_nop;

import com.yan.bai_tap_nop.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Kiểm tra application context và hợp đồng HTTP của endpoint minh họa.
 */
@SpringBootTest
class BaiTapNopApplicationTests {

	/** Xác nhận cấu hình Spring và Logback có thể khởi tạo thành công. */
	@Test
	void contextLoads() {
	}

	/** Xác nhận GET /hello trả đúng nội dung văn bản. */
	@Test
	void helloReturnsExpectedResponse() throws Exception {
		MockMvc mockMvc = standaloneSetup(new HelloController()).build();

		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith("text/plain"))
				.andExpect(content().string("Hello World"));
	}

	/** Xác nhận endpoint không vô tình chấp nhận phương thức POST. */
	@Test
	void helloRejectsPostRequests() throws Exception {
		MockMvc mockMvc = standaloneSetup(new HelloController()).build();

		mockMvc.perform(post("/hello"))
				.andExpect(status().isMethodNotAllowed());
	}
}
