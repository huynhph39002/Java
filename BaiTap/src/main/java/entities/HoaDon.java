package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "HoaDon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private String id;
    @Column(name = "IdNV")
    private Integer idNhanVien;
    @Column(name = "IdKH")
    private Integer idKhachHang;
    @Column(name = "NgayMuaHang")
    private String ngayMuaHang;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public HoaDon() {
    }

    public HoaDon(String id, Integer idNhanVien, Integer idKhachHang, String ngayMuaHang, Integer trangThai) {
        this.id = id;
        this.idNhanVien = idNhanVien;
        this.idKhachHang = idKhachHang;
        this.ngayMuaHang = ngayMuaHang;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Integer getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Integer idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(String ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
