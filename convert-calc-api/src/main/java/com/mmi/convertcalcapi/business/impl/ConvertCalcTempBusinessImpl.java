package com.mmi.convertcalcapi.business.impl;


import com.mmi.convertcalcapi.business.ConvertCalcTempBusiness;
import com.mmi.convertcalcapi.constants.ConversionConstants;
import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;
import com.mmi.convertcalcapi.util.DecimalUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * Created by c817105 on 21/03/2020.
 */
@Slf4j
@Service
public class ConvertCalcTempBusinessImpl implements ConvertCalcTempBusiness {

    @Override
    public ConvertCalcDto convertCelsiusToFarhenheit(ConvertCalcVO calcVO) {
        log.info("inside convertCelsiusToFarhenheit() of ConvertCalcTempBusinessImpl ------------------");

        Double farhenheitValue = (calcVO.getInputValue()*9/5)+32;
        ConvertCalcDto convertCalcDto = new ConvertCalcDto();
        convertCalcDto.setOutputValue(DecimalUtils.round(farhenheitValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
        BeanUtils.copyProperties(calcVO, convertCalcDto);
        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertFarhenheitToCelsius(ConvertCalcVO calcVO) {
        log.info("inside convertFarhenheitToCelsius() of ConvertCalcTempBusinessImpl ------------------");

        Double celsiusValue = (calcVO.getInputValue()-32)*5/9;
        ConvertCalcDto convertCalcDto = new ConvertCalcDto();
        convertCalcDto.setOutputValue(DecimalUtils.round(celsiusValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
        BeanUtils.copyProperties(calcVO, convertCalcDto);
        return convertCalcDto;
    }
}
