package repositories;

import entities.SPChiTiet;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class SanPhamChiTietRepository {
    private Session hSession = HibernateUtil.getFACTORY().openSession();
    public List<SPChiTiet> findAll(){
        String hql = "Select entity from SPChiTiet entity";
        Query q = hSession.createQuery(hql, SPChiTiet.class);
        return q.getResultList();
    }
}
