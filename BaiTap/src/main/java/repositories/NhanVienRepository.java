package repositories;

import entities.NhanVien;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class NhanVienRepository {
    private Session hSession = HibernateUtil.getFACTORY().openSession();

    public List<NhanVien> findAll() {
        String hql = "Select entity from NhanVien entity";
        Query q = hSession.createQuery(hql, NhanVien.class);
        return q.getResultList();
    }
}
