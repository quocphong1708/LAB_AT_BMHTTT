# THÔNG TIN BÀI THỰC HÀNH LAB 3
* **Họ và tên:** Trương Văn Quốc Phong
* **MSSV:** (1150080153)
* **Tên bài Lab:** Lab 3 - Nhận diện và ứng phó các mối đe dọa đến an toàn thông tin.
* **Phiên bản môi trường:** Windows Server 2025 R2 x64 (VMware) và Wireshark .
* **Cách dựng môi trường:** Thiết lập card mạng máy ảo sang chế độ NAT/Bridged 
* **Các tình huống đã thực hiện:** TH1 (Phân loại Risk Register), TH2 (Giả lập chuỗi EICAR), TH3 (Cấu hình giám sát tài khoản bằng chứng Event Log), TH5 (Sniffing phân tích lưu lượng mạng HTTP).
* **Kết quả:** PASS (Hệ thống kết xuất đầy đủ các tệp tin baseline, kiểm toán đăng nhập và niêm phong an toàn thông tin).
* **Lỗi gặp phải & Cách khắc phục:** Lỗi không tương thích lệnh `wmic` cũ trên Windows Server bản mới -> Khắc phục bằng cách chuyển đổi sang lệnh PowerShell thuần túy `Set-LocalUser`. Lỗi phân quyền mạng khi khởi chạy HTTP Listener -> Khắc phục bằng cách chạy PowerShell dưới quyền tối cao Administrator.
