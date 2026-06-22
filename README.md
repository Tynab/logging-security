# Logging Security với Spring Boot

Ứng dụng nhỏ minh họa cách cấu hình Logback trong Spring Boot để ghi log ra
console, tách log của controller vào `debug.log` và gom lỗi toàn hệ thống vào
`error.log`.

## Tóm tắt mã nguồn

- `BaiTapNopApplication`: khởi tạo Spring Boot và máy chủ web nhúng.
- `HelloController`: cung cấp `GET /hello` và phát sinh thông điệp mẫu ở năm
  mức TRACE, DEBUG, INFO, WARN và ERROR.
- `application.properties`: khai báo đường dẫn, mức log và chính sách ẩn chi
  tiết lỗi khỏi phản hồi HTTP.
- `logback-spring.xml`: định tuyến log, xoay file theo ngày/kích thước và giới
  hạn dung lượng lưu trữ.
- `BaiTapNopApplicationTests`: kiểm tra application context, phản hồi GET và
  việc từ chối POST.

## Cách chạy

Yêu cầu JDK 17 trở lên. Từ thư mục `bai_tap_nop`, chạy:

```powershell
.\mvnw.cmd spring-boot:run
```

Sau đó truy cập `http://localhost:8080/hello`. Log được tạo trong thư mục
`bai_tap_nop/log/`; thư mục này không được commit vì có thể chứa dữ liệu vận
hành nhạy cảm.

Chạy kiểm thử bằng:

```powershell
.\mvnw.cmd test
```

## Hình ảnh demo

<p align='center'>
  <img src='pic/0.jpg' alt='Kết quả minh họa logging trong Spring Boot'>
</p>
