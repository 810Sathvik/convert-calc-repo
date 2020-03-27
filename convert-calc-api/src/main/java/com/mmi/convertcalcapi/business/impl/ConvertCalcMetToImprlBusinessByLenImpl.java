package com.mmi.convertcalcapi.business.impl;

import com.mmi.convertcalcapi.business.ConvertCalcMetToImprlBusinessByLen;
import com.mmi.convertcalcapi.constants.Constants;
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
public class ConvertCalcMetToImprlBusinessByLenImpl implements ConvertCalcMetToImprlBusinessByLen {


    @Override
    public ConvertCalcDto convertMetricToImperialByMM(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialByMM() of ConvertCalcMetToImprlBusinessByLenImpl ------------------");

        if(Constants.INCHES.url().equals(calcVO.getOutputType())){
            Double mmToInValue = calcVO.getInputValue()/25.4; // ConversionConstants.MM_IN;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mmToInValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);

        } else
        if(Constants.FEET.url().equals(calcVO.getOutputType())){
            Double mmToFtValue = calcVO.getInputValue()/304.79999; //* ConversionConstants.MM_FT;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mmToFtValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.YARDS.url().equals(calcVO.getOutputType())){
            Double mmToYdValue = calcVO.getInputValue()/914.39997; //* ConversionConstants.MM_YD;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mmToYdValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertMetricToImperialByCM(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialByCM() of ConvertCalcMetToImprlBusinessByLenImpl ------------------");

        if(Constants.INCHES.url().equals(calcVO.getOutputType())){
            Double cmToInValue = calcVO.getInputValue()/2.54; //* ConversionConstants.CM_IN;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(cmToInValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.FEET.url().equals(calcVO.getOutputType())){
            Double cmToFtValue = calcVO.getInputValue()/30.48; //* ConversionConstants.CM_FT;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(cmToFtValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.YARDS.url().equals(calcVO.getOutputType())){
            Double cmToYdValue = calcVO.getInputValue()/91.44; //* ConversionConstants.CM_YD;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(cmToYdValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertMetricToImperialByKM(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialByKM() of ConvertCalcMetToImprlBusinessByLenImpl ------------------");

        if(Constants.INCHES.url().equals(calcVO.getOutputType())){
            Double kmToInValue = calcVO.getInputValue()/0.00003; // * ConversionConstants.KM_IN;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(kmToInValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.FEET.url().equals(calcVO.getOutputType())){
            Double kmToFtValue = calcVO.getInputValue()/0.0003; //* ConversionConstants.KM_FT;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(kmToFtValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.YARDS.url().equals(calcVO.getOutputType())){
            Double kmToYdValue = calcVO.getInputValue()/0.00091; //* ConversionConstants.KM_YD;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(kmToYdValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }
}
