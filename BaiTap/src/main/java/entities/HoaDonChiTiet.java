package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private String id;
    @Column(name = "IdHoaDon")
    private Integer idHoaDon;
    @Column(name = "IdSPCT")
    private Integer idSPCT;
    @Column(name = "SoLuong")
    private Integer soLuong;
    @Column(name = "DonGia")
    private double donGia;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String id, Integer idHoaDon, Integer idSPCT, Integer soLuong, double donGia, Integer trangThai) {
        this.id = id;
        this.idHoaDon = idHoaDon;
        this.idSPCT = idSPCT;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Integer getIdSPCT() {
        return idSPCT;
    }

    public void setIdSPCT(Integer idSPCT) {
        this.idSPCT = idSPCT;
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
