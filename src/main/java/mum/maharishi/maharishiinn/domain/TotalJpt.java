/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author binayak
 */
@Entity
public class TotalJpt implements Serializable{
    
    @Id
    @GeneratedValue
    private long totalId;
    
    @Temporal (TemporalType.DATE)
    Date newDate = null;
    
    @OneToMany (cascade = CascadeType.PERSIST)
    List<AnotherJptDomain> a = null;
    
    @OneToMany (cascade = CascadeType.PERSIST)
    List<AnotherJptDomain> b = null;

    public TotalJpt() {
        a = new ArrayList<>();
        b = new ArrayList<>();
        newDate = new Date();
    }

    public List<AnotherJptDomain> getB() {
        return b;
    }

    public void setB(ArrayList<AnotherJptDomain> b) {
        this.b = b;
    }

    public Date getNewDate() {
        return newDate;
    }

    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    public void setTotalId(long totalId) {
        this.totalId = totalId;
    }

    public long getTotalId() {
        return totalId;
    }

    public void setA(ArrayList<AnotherJptDomain> a) {
        this.a = a;
    }

    public List<AnotherJptDomain> getA() {
        return a;
    }
    
    public void addJptDomainA(AnotherJptDomain j){
        a.add(j);
    }
    
    public void addJptDomainB(AnotherJptDomain j){
        b.add(j);
    }
}
