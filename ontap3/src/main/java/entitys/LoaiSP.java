package entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "LoaiSP")
public class LoaiSP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "ma")
    private String ma;
    @Column(name = "ten")
    private String ten;

    public LoaiSP() {

    }

    public LoaiSP(Integer id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
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
}
