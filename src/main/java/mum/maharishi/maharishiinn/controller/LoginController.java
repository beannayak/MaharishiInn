/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.controller;

import mum.maharishi.maharishiinn.domain.User;
import mum.maharishi.maharishiinn.domain.UserInformation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sajana
 */
@Controller
//@RequestMapping(value = {""})
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String signIn( @ModelAttribute User user) {

        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(@ModelAttribute UserInformation userInfo) {

        return "signup";
    }

}
