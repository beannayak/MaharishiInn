/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author binayak
 */
@Entity
public class jptDomain {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long jptDomainId;
    
    String name;

    public jptDomain() {
    }

    public jptDomain(long jptDomainId, String name) {
        this.jptDomainId = jptDomainId;
        this.name = name;
    }

    public long getJptDomainId() {
        return jptDomainId;
    }

    public void setJptDomainId(long jptDomainId) {
        this.jptDomainId = jptDomainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
