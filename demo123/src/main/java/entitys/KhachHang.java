package entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "SDT")
    private String sdt;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public KhachHang() {

    }

    public KhachHang(Integer id, String ma, String ten, String sdt, Integer trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.trangThai = trangThai;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
