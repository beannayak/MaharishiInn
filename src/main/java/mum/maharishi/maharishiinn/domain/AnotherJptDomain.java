package mum.maharishi.maharishiinn.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AnotherJptDomain implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    
    private String name;

    public AnotherJptDomain() {
    }

    public AnotherJptDomain(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}