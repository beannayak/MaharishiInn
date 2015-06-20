/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.service;

import mum.maharishi.maharishiinn.dao.jptDao;
import mum.maharishi.maharishiinn.domain.jptDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author binayak
 */
@Service
@Transactional (propagation = Propagation.REQUIRES_NEW)
public class jptService {
    @Autowired
    jptDao jd;
    
    public void save(jptDomain jpt){
        jd.save(jpt);
    }
    
    public jptDomain getById(long id){
        return jd.get(id);
    }
    
    public void deleteByID(long id){
        jd.delete(id);
    }
}
