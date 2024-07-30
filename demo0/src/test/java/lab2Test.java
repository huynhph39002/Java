import org.junit.jupiter.api.Test;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class lab2Test {
     lab2 tes = new lab2();

    @Test
    public void checkadd1() {
        int mongMuon = 6;
        int thucTe = tes.checkadd1(2,4);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd2() {
        int mongMuon = 8;
        int thucTe = tes.checkadd2(3,5);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd3() {
        int mongMuon = 9;
        int thucTe = tes.checkadd3(2,7);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd4() {
        int mongMuon = 18;
        int thucTe = tes.checkadd4(-2,20);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd5() {
        int mongMuon = 2;
        int thucTe = tes.checkadd5(-200,202);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd6() {
        int mongMuon = 96;
        int thucTe = tes.checkadd6(100,-4);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd7() {
        int mongMuon = 10;
        int thucTe = tes.checkadd7(3,7);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd8() {
        int mongMuon = 13;
        int thucTe = tes.checkadd8(6,7);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd9() {
        int mongMuon = 140;
        int thucTe = tes.checkadd9(70,70);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkadd10() {
        int mongMuon = 16;
        int thucTe = tes.checkadd10(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu1() {
        int mongMuon = 4;
        int thucTe = tes.hieu1(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu2() {
        int mongMuon = 4;
        int thucTe = tes.hieu2(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu3() {
        int mongMuon = 4;
        int thucTe = tes.hieu3(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu4() {
        int mongMuon = 4;
        int thucTe = tes.hieu4(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu5() {
        int mongMuon = 4;
        int thucTe = tes.hieu5(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu6() {
        int mongMuon = 4;
        int thucTe = tes.hieu6(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu7() {
        int mongMuon = 4;
        int thucTe = tes.hieu7(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu8() {
        int mongMuon = 4;
        int thucTe = tes.hieu8(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu9() {
        int mongMuon = 4;
        int thucTe = tes.hieu9(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void hieu10() {
        int mongMuon = 4;
        int thucTe = tes.hieu10(10,6);
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void checkGT1(){
        int mongMuon = 1;
        int thucTe = tes.giaiThua(0);
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void checkGT2(){
        int mongMuon = 1;
        int thucTe = tes.giaiThua(1);
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void checkGT3(){
        int mongMuon = 2;
        int thucTe = tes.giaiThua(2);
        assertEquals(mongMuon, thucTe);
    }
    @Test
    public void checkGT4(){
        int mongMuon = 6;
        int thucTe = tes.giaiThua(3);
        assertEquals(mongMuon, thucTe);
    }
    @Test
    public void checkGT5(){
        int mongMuon = 24;
        int thucTe = tes.giaiThua(4);
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void checkGT6(){
        int mongMuon = 120;
        int thucTe = tes.giaiThua(5);
        assertEquals(mongMuon, thucTe);
    }
    @Test
    public void checkGT7(){
        int mongMuon = 720;
        int thucTe = tes.giaiThua(6);
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void checkGT8(){
        int mongMuon = 5040;
        int thucTe = tes.giaiThua(7);
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void checkGT9(){
        int mongMuon = 40320;
        int thucTe = tes.giaiThua(8);
        assertEquals(mongMuon, thucTe);
    }
    @Test
    public void checkGT10(){
        int mongMuon = 0;
        int thucTe = tes.giaiThua(9999999);
        assertEquals(mongMuon, thucTe);
    }
}
