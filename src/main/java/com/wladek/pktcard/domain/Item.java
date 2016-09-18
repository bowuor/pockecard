package com.wladek.pktcard.domain;

import com.wladek.pktcard.pojo.ItemDto;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Set;

/**
 * Created by wladek on 1/1/10.
 */
@Entity
public class Item extends AbstractModel{
    @NotEmpty(message = "Provide item name")
    private String name;
    @NotNull(message = "Provide unit price in KSh")
    private BigDecimal unitPrice;
    @NotEmpty(message = "Briefly describe item")
    private String description;
    private String itemCode;

    @OneToMany(mappedBy = "item")
    private Set<Buying> buyingSet;

    @ManyToOne(fetch = FetchType.LAZY)
    private School school;

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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @PrePersist
    public void generateCode(){
        Random rnd = new Random();
        int n = 10000000 + rnd.nextInt(900000000);
        itemCode = n+"";
    }

    public ItemDto toDto(){

        ItemDto dto = new ItemDto();
        dto.setName(name);
        dto.setUnitPrice(unitPrice);
        dto.setDescription(description);
        dto.setItemCode(itemCode);

        return dto;
    }
}
