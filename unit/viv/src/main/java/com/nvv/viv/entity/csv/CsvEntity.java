package com.nvv.viv.entity.csv;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CsvEntity {
    private LocalDate transactionDate;

    private String description;

    private Float amount;

    private String category;

    private String paymentSystem;
}
