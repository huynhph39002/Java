package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "SPChiTiet")
public class SPChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MaSPCT")
    private String maSPCT;
    @Column(name = "IdKichThuoc")
    private Integer idKichThuoc;
    @Column(name = "IdMauSac")
    private Integer idMauSac;
    @Column(name = "IdSanPham")
    private Integer idSanPham;
    @Column(name = "SoLuong")
    private Integer soLuong;
    @Column(name = "DonGia")
    private double donGia;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public SPChiTiet() {
    }

    public SPChiTiet(Integer id, String maSPCT, Integer idKichThuoc, Integer idMauSac, Integer idSanPham, Integer soLuong, double donGia, Integer trangThai) {
        this.id = id;
        this.maSPCT = maSPCT;
        this.idKichThuoc = idKichThuoc;
        this.idMauSac = idMauSac;
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(String maSPCT) {
        this.maSPCT = maSPCT;
    }

    public Integer getIdKichThuoc() {
        return idKichThuoc;
    }

    public void setIdKichThuoc(Integer idKichThuoc) {
        this.idKichThuoc = idKichThuoc;
    }

    public Integer getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(Integer idMauSac) {
        this.idMauSac = idMauSac;
    }

    public Integer getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
