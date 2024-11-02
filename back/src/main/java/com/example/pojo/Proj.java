package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Proj {
    private String diaId;
    private String diaName;
    private Short diaExpType;
    private Short diaExpLevel;
    private Double diaMaxPrize;
    private String diaStarttime;
    private String diaEndtime;
    private Short diaValid;
    private Short diaHosLevel;
    private Short diaApprovalmark;

}
