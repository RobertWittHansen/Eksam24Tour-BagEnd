package com.example.toureksam24t.entityModel;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
//---------------Lombok.
@Getter
@Setter
//---------------Lombok.
@Entity
public class Shirt {
    //---------------Fields / attributter.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shirt_id")
    private int shirtId;

    private String name;


    //---------------Fields / attributter.


    //---------------Database dependencies.
    @ManyToOne
    @JoinColumn(name = "ridr_id")
    private Rider rider;

    //---------------Database dependencies.


    //---------------Constructor.
    //---------------Constructor.

}
