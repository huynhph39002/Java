package de2;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SachServletTest {
    SachServlet s = new SachServlet();

    @Test
    public void them1(){
        Sach sach=new Sach();
        sach=new Sach("2","chay ngay di @",13,"ai biet",2);
        String r=s.themS(sach);
        assertEquals(r, "ten sach khong duoc dung ki tu dac biet");
    }
    @Test
    public void them2(){
        Sach sach=new Sach();
        sach=new Sach("2","chay ngay di",13,"ai biet",2);
        String r=s.themS(sach);
        assertEquals(r, "them thanh cong");
    }
    @Test
    public void them3(){
        Sach sach=new Sach();
        sach=new Sach("2","chay ngay di",13,"ai biet",2);
        String r=s.themS(sach);
        assertEquals(r, "them thanh cong");
    }
    @Test
    public void them4(){
        Sach sach=new Sach();
        sach=new Sach("2","chay ngay di",13,"ai biet",2);
        String r=s.themS(sach);
        assertEquals(r, "them thanh cong");
    }
    @Test
    public void them5(){
        Sach sach=new Sach();
        sach=new Sach("2","chay ngay di",13,"ai biet",2);
        String r=s.themS(sach);
        assertEquals(r, "them thanh cong");
    }


    @Test
    public void tim1(){
        List<Sach> sachCuaTacGia =s .timSachTheoTacGia("ai biet");
        for (Sach sach : sachCuaTacGia) {
            System.out.println(sach);
        }
    }
    @Test
    public void tim2(){
        List<Sach> sachCuaTacGia =s .timSachTheoTacGia("ai biet");
        for (Sach sach : sachCuaTacGia) {
            System.out.println(sach);
        }
    }
    @Test
    public void tim3(){
        List<Sach> sachCuaTacGia =s .timSachTheoTacGia("ai biet");
        for (Sach sach : sachCuaTacGia) {
            System.out.println(sach);
        }
    }
    @Test
    public void tim4(){
        List<Sach> sachCuaTacGia =s .timSachTheoTacGia("ai biet");
        for (Sach sach : sachCuaTacGia) {
            System.out.println(sach);
        }
    }
    @Test
    public void tim5(){
        List<Sach> sachCuaTacGia =s .timSachTheoTacGia("ai biet");
        for (Sach sach : sachCuaTacGia) {
            System.out.println(sach);
        }
    }

}