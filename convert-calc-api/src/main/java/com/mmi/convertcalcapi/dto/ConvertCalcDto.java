package com.mmi.convertcalcapi.dto;

import lombok.*;

import java.io.Serializable;

/**
 * Created by c817105 on 19/03/2020.
 */
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ConvertCalcDto implements Serializable{

    private String inputType;

    private Double inputValue;

    private String outputType;

    private Double outputValue;
    //Getter and Setter code generate by Lombok framework
}
