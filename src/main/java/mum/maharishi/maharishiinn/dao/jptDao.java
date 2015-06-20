/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.dao;

import mum.maharishi.maharishiinn.domain.jptDomain;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author binayak
 */
@Repository
@Transactional (propagation = Propagation.MANDATORY)
public class jptDao {
    @Autowired
    SessionFactory sf;
    
    public void save(jptDomain jpt){
        sf.getCurrentSession().persist(jpt);
    }
    
    public jptDomain get(long id){
        jptDomain retValue = (jptDomain)sf.getCurrentSession().load(jptDomain.class, id);
        return retValue;
    }
    
    public void delete(long id){
        jptDomain delVal = get(id);
        sf.getCurrentSession().delete(delVal);
    }
}
