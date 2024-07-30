package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "Sdt")
    private Integer sdt;
    @Column(name = "Ma")
    private String maKH;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public KhachHang() {
    }

    public KhachHang(Integer id, String ten, Integer sdt, String maKH, Integer trangThai) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.maKH = maKH;
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

    public Integer getSdt() {
        return sdt;
    }

    public void setSdt(Integer sdt) {
        this.sdt = sdt;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
