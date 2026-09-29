Họ và tên: Trương Văn Quốc Phong
MSSV: (1150080153)
Tên bài Lab: Lab 4 - KHẢO SÁT VÀ ĐÁNH GIÁ BỀ MẶT MẠNG BẰNG NMAP.
## 1. Phiên bản môi trường
* **Phần mềm ảo hóa:** VMware Workstation Pro [4]
* **Máy quét (Attacker):** Kali Linux 2026.2 (Bản ổn định) [3]
* **Máy đích (Victim):** Windows Server 2025 (IP: 192.168.215.128) [2.2, 4.2]
* **Công cụ sử dụng:** Nmap v7.99 [3]

## 2. Cách dựng môi trường
* **Mô hình kết nối:** Mạng nội bộ biệt lập **Host-Only** (Dải IP: 192.168.215.0/24) [2.2, 4]
* **Cấu hình máy đích:** Sử dụng Windows Server 2025 thay thế cho Metasploitable 2 để phù hợp thời gian thực hành thực tế [4.2].
* **Cấu hình an toàn:** Tắt tạm thời Windows Firewall trên máy đích để phục vụ việc rà soát cổng mở kịch bản.

## 3. Các tình huống đã thực hiện
* **Tình huống 1:** Host Discovery (`-sn`) phát hiện các thiết bị đang hoạt động trong mạng [5.1].
* **Tình huống 2:** So sánh kỹ thuật quét cổng TCP Connect (`-sT`) và SYN Scan (`-sS`) [6.1, 6.2].
* **Tình huống 3:** Nhận diện chi tiết phiên bản dịch vụ (`-sV`) trên các cổng mở [8.1].
* **Tình huống 4:** Quét tổng lực (`-A`) và chạy script cấu hình bảo mật hệ thống [8.3].
* **Tình huống 5:** Xuất tập tin hồ sơ bằng chứng đồng thời 3 định dạng (`-oA`) [10.3, 14.1].

## 4. Kết quả thực hiện
* **Tổng số ảnh minh chứng:** 8/8 Ảnh bắt buộc \(\rightarrow\) **PASS** [12.1]
* **Bảng số liệu & Câu hỏi phân tích:** Hoàn thành đầy đủ \(\rightarrow\) **PASS** [12.2]
* **Kết quả xuất file báo cáo kịch bản:** Thành công tạo đủ các định dạng `.nmap`, `.xml`, `.gnmap` \(\rightarrow\) **PASS** [14.1]

## 5. Lỗi gặp phải và cách khắc phục
* **Lỗi 1: Máy ảo nhận sai dải IP tự phát (Đầu số 169.254.x.x)**
  * *Khắc phục:* Chạy lệnh PowerShell `Disable-NetAdapter` và `Enable-NetAdapter` để ép card mạng nhận lại đúng dải DHCP của VMware Host-Only [2.2].
* **Lỗi 2: Lệnh quét tổng lực (`-A`) tốn nhiều thời gian và gây treo nghẽn mạng ảo**
  * *Khắc phục:* Nhấn `Ctrl + C` để hủy tác vụ nặng, thay thế bằng tham số quét cổng phổ biến siêu tốc `-F` kết hợp `-oA` để xuất file báo cáo ngay lập tức trong 2 giây [8.3, 10.3].
