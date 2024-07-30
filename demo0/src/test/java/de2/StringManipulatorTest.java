package de2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulatorTest {
    StringManipulator s=new StringManipulator();
    @Test
    public void test1(){
        String mongMuon="helloWord";
        String thucTe=s.concatenate("hello","Word");
        assertEquals(mongMuon,thucTe);
    }
    @Test
    public void test2(){
        String mongMuon="helloWord";
        String thucTe=s.concatenate( "hello","Word");
        assertEquals(mongMuon,thucTe);
    } @Test
    public void test3(){
        String mongMuon="helloWord";
        String thucTe=s.concatenate("hello","Word");
        assertEquals(mongMuon,thucTe);
    } @Test
    public void test4(){
        String mongMuon="helloWord";
        String thucTe=s.concatenate("hello","Word");
        assertEquals(mongMuon,thucTe);
    } @Test
    public void test5(){
        String mongMuon="helloWord";
        String thucTe=s.concatenate("hello","Word");
        assertEquals(mongMuon,thucTe);
    }



}