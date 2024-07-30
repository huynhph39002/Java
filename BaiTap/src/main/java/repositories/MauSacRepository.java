package repositories;

import entities.MauSac;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateUtil;

import java.util.List;

public class MauSacRepository {
    private Session hSession = HibernateUtil.getFACTORY().openSession();

    public List<MauSac> findAll() {
        String hql = "Select entity from MauSac entity";

        Query q = hSession.createQuery(hql, MauSac.class);
        return q.getResultList();


    }
    public void create(MauSac ms ){
        Transaction t = hSession.getTransaction();
        try {
            t.begin();
            this.hSession.persist(ms);
            t.commit();
        }catch (Exception e){
            t.rollback();
            e.printStackTrace();
        }
    }
    public void update(MauSac ms ){
        Transaction t = hSession.getTransaction();
        try {
            t.begin();
            this.hSession.merge(ms);
            t.commit();
        }catch (Exception e){
            t.rollback();
            e.printStackTrace();
        }
    }
    public void delete(MauSac ms ){
        Transaction t = hSession.getTransaction();
        try {
            t.begin();
            this.hSession.remove(ms);
            t.commit();
        }catch (Exception e){
            t.rollback();
            e.printStackTrace();
        }
    }
    public MauSac findById(int id){
        return
        this.hSession.find(MauSac.class, id);

    }
}
