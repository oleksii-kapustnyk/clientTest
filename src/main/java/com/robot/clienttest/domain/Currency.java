package com.robot.clienttest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Currency {

    private int r030;
    private String txt;
    private double rate;
    private String cc;
    private String exchangedate;
}
