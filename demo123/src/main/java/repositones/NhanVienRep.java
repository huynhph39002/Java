package repositones;

import entitys.NhanVien;
import jakarta.persistence.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

public class NhanVienRep {
    private Session hSession= HibernateUtil.getFACTORY().openSession();
    public List<NhanVien> findAll(){
    String hql="select nv FROM NhanVien nv";
        Query q=hSession.createQuery(hql,NhanVien.class);
        return q.getResultList();
    }
}







