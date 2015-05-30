/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.service;

import mum.maharishi.maharishiinn.dao.GenericDao;
import mum.maharishi.maharishiinn.dao.impl.GenericDaoImpl;
import mum.maharishi.maharishiinn.domain.UserInformation;
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
public class UserInformationService {
    @Autowired
    private GenericDao<UserInformation, Long> userInformation;
    
    public void save(UserInformation ui){
        userInformation.create(ui);
    }
}
