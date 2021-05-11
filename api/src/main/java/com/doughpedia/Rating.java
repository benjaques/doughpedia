package com.doughpedia;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rating extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name="episode_fk")
    public Episode episode;

    @ManyToOne
    @JoinColumn(name="chain_fk")
    public Chain chain;

    @Column
    public double score;

}
