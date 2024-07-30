package de2;

import org.junit.Test;

import static org.junit.Assert.*;

public class tongTu_1_nAndTBCTest {
    tongTu_1_nAnd_TBC t=new tongTu_1_nAnd_TBC();

    @Test
    public void T1(){
        int mongMuon=105;
        int thucTe=t.tong1n(15);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void T2(){
        int mongMuon=105;
        int thucTe=t.tong1n(10);
        assertNotEquals(mongMuon,thucTe);
    }
    @Test
    public void T3(){
        int mongMuon=105;
        int thucTe=t.tong1n(15);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void T4(){
        int mongMuon=105;
        int thucTe=t.tong1n(15);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void T5(){
        int mongMuon=105;
        int thucTe=t.tong1n(15);
        assertEquals(mongMuon,thucTe);
    }

    @Test
    public void tbc1(){
        int mongMuon=2;
        int thucTe=t.TBC(2,2,2);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void tbc2(){
        int mongMuon=2;
        int thucTe=t.TBC(2,2,2);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void tbc3(){
        int mongMuon=2;
        int thucTe=t.TBC(2,2,2);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void tbc4(){
        int mongMuon=2;
        int thucTe=t.TBC(2,2,2);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void tbc5(){
        int mongMuon=2;
        int thucTe=t.TBC(2,2,2);
        assertEquals(mongMuon,thucTe);
    }

}