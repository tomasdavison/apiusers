package com.cash.users.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private BigDecimal total;

    private Integer userId;
}
