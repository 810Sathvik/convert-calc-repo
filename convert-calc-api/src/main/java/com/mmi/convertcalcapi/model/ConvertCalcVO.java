package com.mmi.convertcalcapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by c817105 on 19/03/2020.
 */

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class ConvertCalcVO implements Serializable{

    private String inputType;

    private Double inputValue;

    private String outputType;

    //Getter and Setter code generate by Lombok framework

}
