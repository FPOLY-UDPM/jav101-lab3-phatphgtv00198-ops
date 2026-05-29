package entity;

public class SinhVien {
    private int id;
    private String maSV;
    private String ho;
    private String tenLot;
    private String ten;
    private String email;
    private String soDT;
    private int gioiTinh;
    private String diaChi;

    public SinhVien() {
    }


    public SinhVien(int id, String maSV, String ho, String tenLot, String ten, String email, String soDT, int gioiTinh, String diaChi) {
        this.id = id;
        this.maSV = maSV;
        this.ho = ho;
        this.tenLot = tenLot;
        this.ten = ten;
        this.email = email;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMaSV() { return maSV; }
    public void setMaSV(String maSV) { this.maSV = maSV; }

    public String getHo() { return ho; }
    public void setHo(String ho) { this.ho = ho; }

    public String getTenLot() { return tenLot; }
    public void setTenLot(String tenLot) { this.tenLot = tenLot; }

    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSoDT() { return soDT; }
    public void setSoDT(String soDT) { this.soDT = soDT; }

    public int getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(int gioiTinh) { this.gioiTinh = gioiTinh; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }


}