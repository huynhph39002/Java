package repositories;

import entities.KhachHang;

import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class KhachHangRepository {
    private Session hSession = HibernateUtil.getFACTORY().openSession();

    public List<KhachHang> findAll() {
        String hql = "Select entity from KhachHang entity";

        Query q = hSession.createQuery(hql, KhachHang.class);
        return q.getResultList();

    }
}
