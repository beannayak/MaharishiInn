/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.mavenproject3;

import mum.maharishi.maharishiinn.domain.Room;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author binayak
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	IGetRoomPriceService remoteService = context.getBean("roomInvokerProxy", IGetRoomPriceService.class);
        
        
        Room room = remoteService.getPrice();
        System.out.println(room.getPrice());
    }
}
