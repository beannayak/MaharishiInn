/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.controller;

import java.math.MathContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author binayak
 */
@Controller
public class rootController {
    @RequestMapping ("/")
    public String welcomeDisplayer(){
        return "index";
    }
}
