package com.brian.novaback.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ElementCollection
    @Column(nullable = false, unique = true)
    private List<String> emails;

    @Column(nullable = false)
    private String gender; //enum;


    @Column(nullable = false)
    private boolean status;

    @Column(columnDefinition = "LONGTEXT")
    private String img;

}
