package Lab5;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> sp=new ArrayList<>();

    public SanPhamService(){
       SanPham s=new SanPham();
       s=new SanPham("2","sp2","ao",11,"xanh","13",22);
       sp.add(s);

    }

public String themSP(SanPham s){
      for (SanPham ss:sp){
          if (s.getMaSanPham().equals(ss.getMaSanPham())){
            return "ma ko dc trung";
          }
          break;
      }
    if(s.getSoLuong()>0&& s.getSoLuong()<100){
        sp.add(s);

    }  else {
        return  "so luong phai lon hon 0 va nho hon 100";
    } if(!s.getMaSanPham().contains("sp")){
        return "san pham phai co sp";
    }
    return "them moi thanh cong";
}
public String suaSP(String maSanPham, SanPham sanPhamMoi){
    for (SanPham s:sp) {
        if (s.getMaSanPham().equals(maSanPham)){
            s.setTenSanPham(sanPhamMoi.getTenSanPham());
            s.setGia(sanPhamMoi.getGia());
            s.setMauSac(sanPhamMoi.getMauSac());
            s.setKichThuoc(sanPhamMoi.getKichThuoc());
            s.setSoLuong(sanPhamMoi.getSoLuong());
           break;
        }
    }return "sua thanh cong";
}
public String xoaSP(String maSanPham){
    for ( SanPham s: sp) {
        if(s.getMaSanPham().equals(maSanPham)){
            sp.remove(s);
        }else{
            return "khong co san pham";
        }
        break;
    }
    return"xoa thanh cong";
}
}
