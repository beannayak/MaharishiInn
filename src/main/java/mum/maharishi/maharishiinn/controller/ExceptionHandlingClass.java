/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author binayak
 */
@ResponseStatus (value = HttpStatus.NOT_FOUND, reason = "The page you are looking is not found")
public class ExceptionHandlingClass extends RuntimeException{
    
}
