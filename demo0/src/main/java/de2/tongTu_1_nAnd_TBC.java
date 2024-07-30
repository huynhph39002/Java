package de2;

public class tongTu_1_nAnd_TBC {

    public int tong1n(int n){
        if(n<0){
           throw new IllegalArgumentException("so khong duoc am") ;
        }
        int sum=0;
        for (int i = 1; i < n; i++) {
            sum +=i;
        }
        return sum;
    }

    public int TBC(int toan, int ly , int hoa){
        int  tbc=(toan+ly+hoa)/3;
        return tbc;
    }
}
