package com.example.labo2022.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr", discriminatorType =
        DiscriminatorType.STRING,length = 3)
@Getter
@Setter
public abstract class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cin;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date date;
    //@Lob
    private byte photo;
    private String cv;
    private String email;
    private String password;

    public Member(String cin, String nom, String prenom, Date date, byte photo, String cv, String email, String password) {
        super();
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.photo = photo;
        this.cv = cv;
        this.email = email;
        this.password = password;
    }

    public Member() {

    }
}





