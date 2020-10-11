package com.enterprises.mengal.biltysystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Code extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long codeid;

    private String type;

    private String description;

    public Long getId() {
        return codeid;
    }

    public void setId(Long id) {
        this.codeid = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
