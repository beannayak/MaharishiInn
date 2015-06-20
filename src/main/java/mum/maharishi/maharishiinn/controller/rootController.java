/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.controller;

import mum.maharishi.maharishiinn.domain.AnotherJptDomain;
import mum.maharishi.maharishiinn.domain.User;
import mum.maharishi.maharishiinn.domain.UserInformation;
import mum.maharishi.maharishiinn.domain.jptDomain;
import mum.maharishi.maharishiinn.service.UserInformationService;
import mum.maharishi.maharishiinn.service.UserService;
import mum.maharishi.maharishiinn.service.jptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
    
    @Autowired
    jptService js;
    
    @RequestMapping ("/")
    public String welcomeDisplayer(){
        Integer i = uis.nothing(4);
        System.out.println("value of i is: " + i);
        jptDomain a = null;
        
        a = uis.something("John Snow");
        System.out.println(a.getName());
        
        return "index";
    }
    
    @RequestMapping ("/checkUserInfo")
    public String checkUserInfo(){
        
        System.out.println("System reached checkUserInfo");
        
        UserInformation ui = new UserInformation();
        ui.setCity("fairfield");
        ui.setContactNo("123-456-7890");
        ui.setEmailId("bla@bla.bla");
        ui.setFirstName("bla");
        ui.setLastName("lbla");
        ui.setState("iowa");
        
        uis.save(ui); //log
        
        User user = new User();
        user.setAuthorities("ROLE_ADMIN,ROLE_USER");
        user.setEnable(true);
        user.setPassword("password");
        user.setUserInfo(ui);
        user.setUserName("username");
        us.saveUser(user);
        
        return "index";
    }
    
    @RequestMapping("/403")
    public String erroneous(){
        return "403";
    }
    
    @RequestMapping (value = "/gimmeSomething", method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("marshalview");
        jptDomain a = new jptDomain(0, "nothing");
        mav.addObject("jpt", a);
        return mav;
    }
    
    
    @RequestMapping (value="/setSomething", method = RequestMethod.POST)
    public @ResponseBody boolean addSomething(@RequestBody jptDomain jptObject){
        js.save(jptObject);
        return true;
    } 
    
    @RequestMapping (value="/delete/jptDomain/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable long id){
        js.deleteByID(id);
        //return "redirect:/gimmeSomething";
    }
    
    @RequestMapping (value ="/getAnObject", method = RequestMethod.GET)
    public @ResponseBody AnotherJptDomain getDomain(){
        AnotherJptDomain a = new AnotherJptDomain(0, "nothing");
        return a;
    }
}
