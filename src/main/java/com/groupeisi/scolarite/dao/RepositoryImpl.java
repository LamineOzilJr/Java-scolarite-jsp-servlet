package com.groupeisi.scolarite.dao;

import com.groupeisi.scolarite.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class RepositoryImpl<T> implements IRepository<T>{
    protected Session session;
    protected Transaction transaction;

    public RepositoryImpl () {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public int add(Object t) {
        int result=1;
        transaction = session.beginTransaction();
        session.save(t);
        transaction.commit();

        return result;
    }

    @Override
    public int delete(int id, Object t) {
        int result=1;

        transaction = session.beginTransaction();
        session.delete(session.get(t.getClass(), id));
        transaction.commit();
        return result;
    }

    @Override
    public int update(Object t) {
        int result=1;
        transaction = session.beginTransaction();
        session.merge(t);
        transaction.commit();
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> list(Object t) {

        return (List<T>) session.createCriteria(t.getClass()).list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get (int id, Object t) {
        return (T) session.get(t.getClass(), id);
    }
}
