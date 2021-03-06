package com.doughpedia;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Episode extends PanacheEntity {

    @Column
    public String name;

    @ManyToOne
    public Chain chain;

    @OneToMany(mappedBy="episode")
    public List<Rating> ratings;








}
