package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "KichThuoc")
public class KichThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public KichThuoc() {
    }

    public KichThuoc(Integer id, String ten, String ma, Integer trangThai) {
        this.id = id;
        this.ten = ten;
        this.ma = ma;
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

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

}
