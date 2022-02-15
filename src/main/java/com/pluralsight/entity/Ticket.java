package com.pluralsight.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * TODO: Describe this class (The first line - until the first dot - will interpret as the brief description).
 */
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column( name = "application_id")
    private Integer id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn
    private Application application;
}
