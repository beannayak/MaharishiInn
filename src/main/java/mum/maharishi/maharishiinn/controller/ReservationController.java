/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sajana
 */
@Controller
@RequestMapping("/admin/reservation")
public class ReservationController {
    
    @RequestMapping("/listAll")
    public String listAll(){
        return "admin/reservations";
    }
    
}
