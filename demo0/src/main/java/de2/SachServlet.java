package de2;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.List;

public class SachServlet {
    private List<Sach> ds=new ArrayList<>();

    public SachServlet(){
     Sach s=new Sach();
     s=new Sach("2","chay ngay di",13,"ai biet",2);
     ds.add(s);
    }
    public String themS(Sach s){
        if (s.getTen().matches("^[a-zA-Z0-9 ]*$")) {
            ds.add(s);
            return "them thanh cong";
        } else {
            return "ten sach khong duoc dung ki tu dac biet";
        }
    }

    public List<Sach> timSachTheoTacGia(String tenTacGia) {
        List<Sach> result = new ArrayList<>();
        for (Sach sach : ds) {
            if (sach.getTenTacGia().equals(tenTacGia)) {
                result.add(sach);
            }
        }
        return result;
    }

}
