/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.service;

import mum.maharishi.maharishiinn.dao.UserDao;
import mum.maharishi.maharishiinn.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sajana
 */
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserService {
    
    @Autowired UserDao userDao;

    public User getByUserName(String userName) {
        return userDao.getByUserName(userName);
    
    }
    
}
