package com.doughpedia;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Id;

public class Person extends PanacheEntityBase {

    @Id
    public String name;
}
