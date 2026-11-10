/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1_mahoacodien;

/**
 *
 * @author Admin
 */
public class LAB1_MaHoaCoDien {

    public static void main(String[] args) {
       try {
    // 1. Nạp Driver
    Class.forName("org.postgresql.Driver");
    
    // 2. Điền chuỗi kết nối từ Neon (Thay mật khẩu thật của bạn vào chỗ MAT_KHAU)
    String url = "jdbc:postgresql://ep-autumn-dawn-bdrczwur-pooler.c-8.us-east-2.aws.neon.tech/neondb?sslmode=require";
    String user = "neondb_owner";
    String password = "npg_zl6RAdcDiV2U"; 
    
    // 3. Thực hiện kết nối
    java.sql.Connection conn = java.sql.DriverManager.getConnection(url, user, password);
    System.out.println("KẾT NỐI DATABASE ONLINE THÀNH CÔNG RỒI!");
    
    // Bạn có thể viết tiếp code xử lý giao diện JFrame hoặc gọi các hàm mã hóa ở dưới này...

} catch (Exception e) {
    System.out.println("Lỗi kết nối: " + e.getMessage());
}

    }
}
