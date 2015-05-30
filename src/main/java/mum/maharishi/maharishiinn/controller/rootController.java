/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.controller;

import mum.maharishi.maharishiinn.domain.User;
import mum.maharishi.maharishiinn.domain.UserInformation;
import mum.maharishi.maharishiinn.service.UserInformationService;
import mum.maharishi.maharishiinn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author binayak
 */
@Controller
public class rootController {
    @Autowired
    UserInformationService uis;
    
    @Autowired
    UserService us;
    
    @RequestMapping ("/")
    public String welcomeDisplayer(){
        return "index";
    }
    
    @RequestMapping ("/checkUserInfo")
    public String checkUserInfo(){
        
        System.out.println("System reached checkUserInfo");
        
        UserInformation ui = new UserInformation();
        ui.setCity("fairfiel");
        ui.setContactNo("123-456-7890");
        ui.setEmailId("bla@bla.bla");
        ui.setFirstName("bla");
        ui.setLastName("lbla");
        ui.setState("iowa");
        
        uis.save(ui);
        
        User user = new User();
        user.setAuthorities("ROLE_ADMIN,ROLE_USER");
        user.setEnable(true);
        user.setPassword("password");
        user.setUserInfo(ui);
        user.setUserName("username");
        us.saveUser(user);
        
        return "index";
    }
}
