package repo;

import entitys.LoaiSP;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class LoaiSPRepo {

    private Session hSession= HibernateUtil.getFACTORY().openSession();

    public List<LoaiSP> findAll(){
        String hql="select entity from LoaiSP entity";
        Query q=hSession.createQuery(hql,LoaiSP.class);
        return q.getResultList();
    }
    public void create(LoaiSP l){
        Transaction t=hSession.getTransaction();
        try {
            t.begin();
            this.hSession.persist(l);
            t.commit();
        }catch (Exception e){
            t.rollback();
            e.printStackTrace();
        }
    }
    public void delete(LoaiSP l){
        Transaction t=hSession.getTransaction();
        try {
            t.begin();
            this.hSession.remove(l);
            t.commit();
        }catch (Exception e){
            t.rollback();
            e.printStackTrace();
        }
    }
    public LoaiSP findById(int id){
        return this.hSession.find(LoaiSP.class,id);
    }
}
