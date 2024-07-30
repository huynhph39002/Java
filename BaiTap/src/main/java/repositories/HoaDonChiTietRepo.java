package repositories;

import entities.HoaDonChiTiet;

import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class HoaDonChiTietRepo {
    private Session hSession = HibernateUtil.getFACTORY().openSession();

    public List<HoaDonChiTiet> findAll() {
        String hql = "Select entity from HoaDonChiTiet entity";

        Query q = hSession.createQuery(hql, HoaDonChiTiet.class);
        return q.getResultList();
    }
}
