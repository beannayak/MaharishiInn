/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.others;

import mum.maharishi.maharishiinn.controller.ExceptionHandlingClass;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author binayak
 */
@ControllerAdvice
public class MyControllersAdvice {
    @ExceptionHandler (ExceptionHandlingClass.class)
    public String exceptionHandlerFunction (){
        return "403";
    }
}
