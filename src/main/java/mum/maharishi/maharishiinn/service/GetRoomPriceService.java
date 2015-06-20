/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.service;

import mum.maharishi.maharishiinn.domain.Room;

/**
 *
 * @author binayak
 */
public class GetRoomPriceService implements IGetRoomPriceService{

    @Override
    public Room getPrice() {
        Room newRoom = new Room();
        newRoom.setPrice(250);
        return newRoom;
    }
}
