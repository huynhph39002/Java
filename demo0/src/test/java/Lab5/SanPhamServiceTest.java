package Lab5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SanPhamServiceTest {
    SanPhamService spV=new SanPhamService();

    @Test
    public void add1() {
        SanPham s=new SanPham();
        s=new SanPham("2","sp1","ao",11,"xanh","13",99);
        String re=spV.themSP(s);
        assertEquals(re, "them moi thanh cong");
    }

    @Test
    public void add2() {
        SanPham s=new SanPham();
        s=new SanPham("1","sp1","ao",11,"xanh","13",99);
        String re=spV.themSP(s);
        assertEquals(re, "them moi thanh cong");
    }
    @Test
    public void add3() {
        SanPham s=new SanPham();
        s=new SanPham("1","sp1","ao",11,"xanh","13",99);
        String re=spV.themSP(s);
        assertEquals(re, "them moi thanh cong");
    }
    @Test
    public void add4() {
        SanPham s=new SanPham();
        s=new SanPham("1","sp1","ao",11,"xanh","13",99);
        String re=spV.themSP(s);
        assertEquals(re, "them moi thanh cong");
    }
    @Test
    public void add5() {
        SanPham s=new SanPham();
        s=new SanPham("1","231","ao",11,"xanh","13",99);
        String re=spV.themSP(s);
        assertEquals(re, "san pham phai co sp");
    }
    @Test
    public void sua1(){
        SanPham s=new SanPham();
        s=new SanPham("1","sp1","ao",11,"xanh","13",99);
        String re=spV.suaSP(s.getMaSanPham(),s);
        assertEquals(re, "sua thanh cong");
    }
    @Test
    public void sua2(){
        SanPham s=new SanPham();
        s=new SanPham("1","sp1","ao",11,"xanh","13",99);
        String re=spV.suaSP(s.getMaSanPham(),s);
        assertEquals(re, "sua thanh cong");
    }
    @Test
    public void sua3(){
        SanPham s=new SanPham();
        s=new SanPham("1","sp1","ao",11,"xanh","13",99);
        String re=spV.suaSP(s.getMaSanPham(),s);
        assertEquals(re, "sua thanh cong");
    }
    @Test
    public void xoa1(){
        SanPham s=new SanPham();
        s=new SanPham("1","sp2","ao",11,"xanh","13",99);
        String re=spV.xoaSP(s.getMaSanPham());
        assertEquals(re, "xoa thanh cong");
    }
    @Test
    public void xoa2(){
        SanPham s=new SanPham();
        s=new SanPham("1","sp1","ao",11,"xanh","13",99);
        String re=spV.xoaSP(s.getMaSanPham());
        assertNotEquals(re, "xoa thanh cong");
    }

}