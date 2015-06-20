/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.domain;

import java.io.Serializable;

/**
 *
 * @author binayak
 */
public class Room implements Serializable{
   private int price;

    public Room() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
