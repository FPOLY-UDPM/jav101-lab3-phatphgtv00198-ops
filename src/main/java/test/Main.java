package test;

import dao.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Đang kiểm tra kết nối đến SQL Server...");

        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                System.out.println("🎉 Kết nối thành công đến cơ sở dữ liệu!");

                String sql = "SELECT MASV, Ho, Ten FROM SINHVIEN";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                System.out.println("\n--- Danh sách sinh viên ---");
                while (rs.next()) {
                    String maSV = rs.getString("MASV");
                    String ho = rs.getString("Ho");
                    String ten = rs.getString("Ten");

                    System.out.println(maSV + " - " + ho + " " + ten);
                }
            }
        } catch (Exception e) {
            System.err.println("❌ Kết nối thất bại! Hãy kiểm tra lại cấu hình.");
            e.printStackTrace();
        }
    }
}