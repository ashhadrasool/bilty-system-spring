package com.enterprises.mengal.biltysystem.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

public class BaseEntity{

    protected boolean activeIndicator = true;

    @Column(name = "ACTIVE_INDICATOR")
    public void setActiveIndicator(Boolean activeIndicator) {
        this.activeIndicator = activeIndicator;
    }

    public boolean getActiveIndicator() {
        return this.activeIndicator;
    }

}
