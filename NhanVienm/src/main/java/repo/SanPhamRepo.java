package repo;

import entity.SanPham;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class SanPhamRepo {
    private Session hSession= HibernateUtil.getFACTORY().openSession();
    public List<SanPham> findAll(){
        String hql="select entity from SanPham entity";
        Query a=hSession.createQuery(hql,SanPham.class);
        return a.getResultList();
    }
    public void create(SanPham sp){
        Transaction t=hSession.getTransaction();
        try {
          t.begin();
          this.hSession.persist(sp);
          t.commit();
        }catch ( Exception e){
            t.rollback();
        }
    }
}
