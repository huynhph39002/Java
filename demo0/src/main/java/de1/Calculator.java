package de1;

public class Calculator {
    public int chia(int a,int b){
       if (b==0){
           throw new ArithmeticException("khong the chia cho 0");
       }else{
           int chia=a/b;
           return chia;
       }

    }
    public int nhan(int a,int b){
        int nhan=a*b;
        return nhan;
    }
}
