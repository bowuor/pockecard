package com.wladek.pktcard.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by wladek on 1/1/10.
 */
@Entity
public class Item extends AbstractModel{
    private String name;
    private BigDecimal unitPrice;
    private String description;

    @OneToMany(mappedBy = "item")
    private Set<Buying> buyingSet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Buying> getBuyingSet() {
        return buyingSet;
    }

    public void setBuyingSet(Set<Buying> buyingSet) {
        this.buyingSet = buyingSet;
    }
}
