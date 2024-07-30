package repositones;


import entitys.KhachHang;
import jakarta.persistence.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

public class KhachHangRep {
    private Session hSession= HibernateUtil.getFACTORY().openSession();
    public List<KhachHang> findAll(){
        String hql="select entity from KhachHang entity";
        Query q=hSession.createQuery(hql,KhachHang.class);
        return q.getResultList();
    }
}
