package com.cash.users.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer userId;

    private String email;

    private String firstName;

    private String lastName;

    private Integer[] loansIDs;
}
