package entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "TenDangNhap")
    private String tenDangNhap;
    @Column(name = "MatKhau")
    private String matKhau;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public NhanVien() {

    }

    public NhanVien(Integer id, String ten, String ma, String tenDangNhap, String matKhau, Integer trangThai) {
        this.id = id;
        this.ten = ten;
        this.ma = ma;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
