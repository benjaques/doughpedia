package com.doughpedia;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Episode extends PanacheEntity {

    @Column
    public String name;

    @Column
    public int chainID;

}
