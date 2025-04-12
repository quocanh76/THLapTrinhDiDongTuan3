# Ứng Dụng Đăng Nhập và Quản Lý Tài Khoản

## 📌 Giới Thiệu  
Ứng dụng hỗ trợ đăng nhập, đăng ký tài khoản mới, khôi phục mật khẩu và quản lý phiên làm việc. Các chức năng chính được triển khai qua các màn hình:  
- **LoginActivity**: Đăng nhập với email và mật khẩu.  
- **RegisterActivity**: Đăng ký tài khoản mới.  
- **ForgotActivity**: Khôi phục mật khẩu qua email.  
- **HomeActivity**: Màn hình chào mừng sau đăng nhập.  

## 🚀 Tính Năng  
✅ Đăng nhập với email và mật khẩu (xác thực cơ bản).  
✅ Đăng ký tài khoản mới (yêu cầu nhập tên, số điện thoại, email).  
✅ Gửi mã khôi phục mật khẩu qua email (mô phỏng).  
✅ Đăng xuất và quay lại màn hình đăng nhập.  
✅ Validate dữ liệu đầu vào (trường không được trống).  

## 📂 Cấu Trúc Dự Án  
- **Java Classes**:  
  - `LoginActivity.java`: Xử lý đăng nhập và chuyển hướng.  
  - `RegisterActivity.java`: Xử lý đăng ký tài khoản.  
  - `ForgotActivity.java`: Xử lý khôi phục mật khẩu.  
  - `HomeActivity.java`: Màn hình chính sau đăng nhập và đăng xuất.  
- **Layout XML**:  
  - `activity_login.xml`: Giao diện đăng nhập.  
  - `layout_login.xml`: Thành phần cardview cho đăng nhập.  
  - `layout_register.xml`: Giao diện đăng ký.  
  - `layout_forgot.xml`: Giao diện khôi phục mật khẩu.  
  - `activity_home.xml`: Giao diện màn hình chào mừng.  

## 📌 Hướng Dẫn Sử Dụng  
1. **Đăng nhập**:  
   - Nhập email: `admin@gmail.com` và mật khẩu: `password123` (tài khoản mặc định).  
   - Nếu chưa có tài khoản, nhấn **"Đăng ký"** để chuyển sang màn hình đăng ký.  
   - Quên mật khẩu? Nhấn **"Forgot Password?"** để yêu cầu gửi mã qua email.  

2. **Đăng ký tài khoản**:  
   - Nhập đầy đủ thông tin: Tên, số điện thoại, email.  
   - Nhấn **"Register"** để hoàn tất. Ứng dụng sẽ tự động quay lại màn hình đăng nhập.  

3. **Khôi phục mật khẩu**:  
   - Nhập tên, số điện thoại và email đã đăng ký.  
   - Nhấn **"Send Code"** để nhận mã khôi phục (mô phỏng).  

4. **Màn hình chính (HomeActivity)**:  
   - Hiển thị thông báo chào mừng sau đăng nhập thành công.  
   - Nhấn **"Sign Out"** để đăng xuất và quay lại màn hình đăng nhập.  

## 📝 Ghi Chú  
- Dữ liệu đăng nhập mặc định:  
  - Email: `admin@gmail.com`  
  - Mật khẩu: `password123`  
- Chức năng gửi mã khôi phục chỉ hiển thị thông báo, chưa tích hợp API thực tế.  
- Dữ liệu đăng ký không được lưu trữ, chỉ kiểm tra tính hợp lệ tạm thời.  

## 📷 Hình Ảnh Minh Họa  
<img src = "https://github.com/user-attachments/assets/ace0bf2a-d178-4c19-aee5-80a495ce1e06" width ="200"/>
<img src = "https://github.com/user-attachments/assets/7970916e-d545-4fb3-bd32-309ee1cd483a" width ="200"/>
<img src = "https://github.com/user-attachments/assets/fdf76dad-b6c1-4c68-9f6b-264ff49096e0" width ="200"/>
<img src = "https://github.com/user-attachments/assets/96e3026c-22ef-4c49-9aff-5970a032722b" width ="200"/>

## 📧 Tác Giả  
Ứng dụng được phát triển bởi:  
**21200027 - Hà Quốc Anh**  
