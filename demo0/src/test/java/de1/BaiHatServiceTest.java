package de1;

import Lab5.SanPham;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaiHatServiceTest {
BaiHatService b=new BaiHatService();
@Test
    public void thembh(){
    BaiHat s=new BaiHat();
    s=new BaiHat("2","chay ngay di","son tung",23,"khong biet");
    String re=b.themBH(s);
    assertEquals(re, "them moi thanh cong");
}
    @Test
    public void themb1(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",23,"khong biet");
        String re=b.themBH(s);
        assertEquals(re, "them moi thanh cong");
    }
    @Test
    public void themb3(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",23,"khong biet");
        String re=b.themBH(s);
        assertEquals(re, "them moi thanh cong");
    }
    @Test
    public void themb4(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",-19,"khong biet");
        String re=b.themBH(s);
        assertNotEquals(re, "them moi thanh cong");
    }
    @Test
    public void them5(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",-19,"khong biet");
        String re=b.themBH(s);
        assertNotEquals(re, "them moi thanh cong");
    }
    @Test
    public void xoa(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",19,"khong biet");
        String re=b.xoaBH("2");
        assertEquals(re, "xoa thanh cong");
    }
    @Test
    public void xoa2(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",19,"khong biet");
        String re=b.xoaBH("2");
        assertEquals(re, "xoa thanh cong");
    }
    @Test
    public void xoa3(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",19,"khong biet");
        String re=b.xoaBH("2");
        assertEquals(re, "xoa thanh cong");
    }
    @Test
    public void xoa4(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",19,"khong biet");
        String re=b.xoaBH("2");
        assertEquals(re, "xoa thanh cong");
    }
    @Test
    public void xoa5(){
        BaiHat s=new BaiHat();
        s=new BaiHat("2","chay ngay di","son tung",19,"khong biet");
        String re=b.xoaBH("2");
        assertEquals(re, "xoa thanh cong");
    }
}