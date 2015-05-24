/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.dao.impl;

import java.io.Serializable;
import java.util.List;
import mum.maharishi.maharishiinn.dao.GenericDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sajana
 */

@Repository
@Transactional
public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

    @Autowired
    protected SessionFactory sessionFactory;

    @Override
    public List<T> findAll(Class<T> entityClass) {
        return sessionFactory.getCurrentSession().createQuery("from " + entityClass.getName()).list();
    }

    @Override
    public T findById(PK id, Class<T> entityClass) {
        return (T) sessionFactory.getCurrentSession().get(entityClass, id);
    }

    @Override
    public T create(T t) {
        sessionFactory.getCurrentSession().persist(t);
        return t;
    }

    @Override
    public T update(T t) {
        t = (T) sessionFactory.getCurrentSession().merge(t);
        sessionFactory.getCurrentSession().update(t);
        return t;
    }

    @Override
    public void delete(T t) {
        t = (T) sessionFactory.getCurrentSession().merge(t);
        sessionFactory.getCurrentSession().delete(t);
    }

    @Override
    public T load(PK id, Class<T> entityClass) {
        return (T) sessionFactory.getCurrentSession().load(entityClass, id);
    }
}

