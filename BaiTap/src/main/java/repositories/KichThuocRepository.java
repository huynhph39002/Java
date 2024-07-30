package repositories;

import entities.KichThuoc;

import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class KichThuocRepository {

    private Session hSession = HibernateUtil.getFACTORY().openSession();

    public List<KichThuoc> findAll() {
        String hql = "Select entity from KichThuoc entity";

        Query q = hSession.createQuery(hql, KichThuoc.class);
        return q.getResultList();

    }
}
