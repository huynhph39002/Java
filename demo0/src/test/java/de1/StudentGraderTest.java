package de1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGraderTest {
StudentGrader s=new StudentGrader();
@Test
    public void phanLoai(){
    assertEquals("F", s.phanLoai(20));
    assertEquals("A", s.phanLoai(90));
    assertEquals("khong hop le", s.phanLoai(110));
}
@Test
    public void phanLoai2(){
    assertNotEquals("G", s.phanLoai(50));
}

    @Test
    public void phanLoai3(){
        assertEquals("C", s.phanLoai(65));
    }

    @Test
    public void phanLoai4(){
        assertEquals("B", s.phanLoai(75));
    }

    @Test
    public void phanLoai5(){
    assertEquals("khong hop le", s.phanLoai(-10));

    }
}