package de1;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {

    private List<BaiHat> bh=new ArrayList<>();

    public BaiHatService(){
        BaiHat b=new BaiHat();
        b=new BaiHat("2","chay ngay di","son tung",23,"khong biet");
        bh.add(b);
    }

    public String themBH(BaiHat b){
        try {
            if (b.getDoDai() <= 0) {
                return "do dai phai la so nguyen";
            }
            bh.add(b);
            return "them moi thanh cong";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
    public String xoaBH(String id){
        for (BaiHat b:bh) {
            if(b.getId().equals(id)){
                bh.remove(id);
            }else{
                return "san pham khong co";
            }break;
        }
        return "xoa thanh cong";
    }
}
