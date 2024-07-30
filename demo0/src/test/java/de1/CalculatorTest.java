package de1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c=new Calculator();
@Test
    public void chia1(){
    int mongMuon=2;
    int thucTe=c.chia(4,2);
    assertEquals(mongMuon,thucTe);
}
    @Test
    public void chia2(){
        int mongMuon=2;
        int thucTe=c.chia(10,5);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void chia3(){
        int mongMuon=2;
        int thucTe=c.chia(1,5);
        assertNotEquals(mongMuon,thucTe);
    }
    @Test
    public void chia4(){
        int mongMuon=2;
        int thucTe=c.chia(10,5);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void chia5(){
        int mongMuon=2;
        int thucTe=c.chia(10,5);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void nhan1(){
        int mongMuon=2;
        int thucTe=c.nhan(1,2);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void nhan12(){
        int mongMuon=2;
        int thucTe=c.nhan(1,2);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void nhan13(){
        int mongMuon=2;
        int thucTe=c.nhan(1,2);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void nhan14(){
        int mongMuon=2;
        int thucTe=c.nhan(1,2);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void nhan15(){
        int mongMuon=2;
        int thucTe=c.nhan(1,4);
        assertNotEquals(mongMuon,thucTe);
    }
}