package repositories;


import entities.HoaDon;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class HoaDonRepository {
    private Session hSession = HibernateUtil.getFACTORY().openSession();

    public List<HoaDon> findAll() {
        String hql = "Select entity from HoaDon entity";

        Query q = hSession.createQuery(hql, HoaDon.class);
        return q.getResultList();
    }
}
