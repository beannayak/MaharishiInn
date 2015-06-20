/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author binayak
 */
@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (propOrder = {"StockName"})
@XmlRootElement (name = "GetStockPrice")
public class GetStockPrice {
    @XmlElement
    private String StockName;

    public GetStockPrice() {
    }

    public GetStockPrice(String StockName) {
        this.StockName = StockName;
    }

    public String getStockName() {
        return StockName;
    }

    public void setStockName(String StockName) {
        this.StockName = StockName;
    }
}
