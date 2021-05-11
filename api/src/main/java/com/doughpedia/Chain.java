package com.doughpedia;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Chain extends PanacheEntityBase {

    @Id
    public String name;

    @Column
    public int score;

}
