package repositones;

import entitys.SanPham;
import jakarta.persistence.Query;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

public class SanPhamRep {
    private Session hSession = HibernateUtil.getFACTORY().openSession();
    public List<SanPham> findAll(){
        String hql="select entity from SanPham entity";
        Query q = hSession.createQuery(hql,SanPham.class);
        return q.getResultList();
    }
}
