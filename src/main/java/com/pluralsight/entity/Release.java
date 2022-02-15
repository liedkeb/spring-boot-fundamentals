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
public class Release {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column( name = "application_id")
    private Integer id;

    private String releaseDate;
    private String description;

    public Release() {
    }

    public Release(String releaseDate, String description) {
        this.releaseDate = releaseDate;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
