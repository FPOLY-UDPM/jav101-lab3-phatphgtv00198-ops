package dao;
import entity.SinhVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentDAO {
    public List<SinhVien> findAll() {
        List<SinhVien> list = new ArrayList<>();
        String sql = "SELECT id, masv, hoten FROM SINHVIEN";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new SinhVien(
                        rs.getInt("ID"),
                        rs.getString("MASV"),
                        rs.getString("Ho"),
                        rs.getString("TenLot"),
                        rs.getString("Ten"),
                        rs.getString("Email"),
                        rs.getString("SoDT"),
                        rs.getInt("GioiTinh"),
                        rs.getString("DiaChi")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}