/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.dao;

import mum.maharishi.maharishiinn.domain.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sajana
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class UserDao {

    @Autowired
    SessionFactory sf;

    public User getByUserName(String userName) {
        Query query = sf.getCurrentSession().createQuery("from User where userName = :uname");
        query.setParameter("uname", userName);

        if (query.list().size() > 1) {
            return (User) query.list().get(0);
        }
        return null;
    }

}
