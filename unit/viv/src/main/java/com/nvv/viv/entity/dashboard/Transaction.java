package com.nvv.viv.entity.dashboard;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Transaction {

    private Long transactionId;

    private LocalDate date;

    private String description;

    private Float amount;

    private String category;

    private String paymentSystem;
    
}