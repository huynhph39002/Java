package repositories;

import entities.SanPham;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class SanPhamRepository {
    private Session hSession = HibernateUtil.getFACTORY().openSession();

    public List<SanPham> findAll() {
        String hql = "Select entity from SanPham entity";

        Query q = hSession.createQuery(hql, SanPham.class);
        return q.getResultList();


    }
}
