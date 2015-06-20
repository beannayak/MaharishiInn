/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.maharishi.maharishiinn.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author binayak
 */

@XmlAccessorType (XmlAccessType.FIELD)
@XmlType (name = "", propOrder = {"jptDomainId"})
@XmlRootElement (name = "jptDomain")
@Entity
public class jptDomain implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @XmlAttribute
    private long jptDomainId;
    
    @XmlAttribute
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
