package entitys;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Ban")

public class Ban {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @Column(name = "SoThich")
    private String soThich;
    @Column(name = "GioiTinh")
    private int gioiTinh;
    @Column(name = "IdMQH")
    private int idMQH;
    @Column(name = "TrangThai")
    private Integer trangThai;

    public Ban() {
    }

    public Ban(Integer id, String ma, String ten, Date ngaySinh, String soThich, int gioiTinh, int idMQH, Integer trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soThich = soThich;
        this.gioiTinh = gioiTinh;
        this.idMQH = idMQH;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getIdMQH() {
        return idMQH;
    }

    public void setIdMQH(int idMQH) {
        this.idMQH = idMQH;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }
}
