package repo;

import entitys.Ban;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class BanRepo {

private Session hSession= HibernateUtil.getFACTORY().openSession();
public List<Ban> findAll(){
    String hql="select entity from Ban entity";
    Query a=hSession.createQuery(hql,Ban.class);
    return a.getResultList();
}

public void add(Ban b){
    Transaction t=hSession.getTransaction();
    try {
        t.begin();
        this.hSession.persist(b);
        t.commit();
    }catch (Exception e){
        t.rollback();
        e.printStackTrace();
    }
}

    public void delete(Ban b){
        Transaction t=hSession.getTransaction();
        try {
            t.begin();
            this.hSession.remove(b);
            t.commit();
        }catch (Exception e){
            t.rollback();
            e.printStackTrace();
        }
    }

    public void detail(Ban b){
    Transaction t=hSession.getTransaction();
    try {
        t.begin();
        this.hSession.merge(b);
        t.commit();
    }catch (Exception e){
        t.rollback();
        e.printStackTrace();
    }
    }
    public Ban findByid(int id){
    return this.hSession.find(Ban.class,id);
    }
}
