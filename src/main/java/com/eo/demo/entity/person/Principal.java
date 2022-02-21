package com.eo.demo.entity.person;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("P")
public class Principal extends Teacher {

    @Transient
    private int wage = 2000;

    @Override
    public int getWage() {
        return wage;
    }

    public void increaseWage() {
        wage = wage + 100;
    }

}
