package com.mmi.convertcalcapi.business.impl;

import com.mmi.convertcalcapi.business.ConvertCalcImprlToMetBusinessByMass;
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
public class ConvertCalcImprlToMetBusinessByMassImpl implements ConvertCalcImprlToMetBusinessByMass {

    @Override
    public ConvertCalcDto convertImperialToMetricByOz(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricByOz() of ConvertCalcImprlToMetBusinessByMassImpl ------------------");

        if(Constants.MILLIGRAM.url().equals(calcVO.getOutputType())){
            Double ozToMgValue = calcVO.getInputValue()*28349.5; //ConversionConstants.OZ_MG;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(ozToMgValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.KILOGRAM.url().equals(calcVO.getOutputType())){
            Double ozToKgValue = calcVO.getInputValue()*0.02835; //ConversionConstants.OZ_KG;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(ozToKgValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.GRAM.url().equals(calcVO.getOutputType())){
            Double ozToGValue = calcVO.getInputValue()*28.3495; //ConversionConstants.OZ_G;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(ozToGValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricByLb(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricByLb() of ConvertCalcImprlToMetBusinessByMassImpl ------------------");

        if(Constants.MILLIGRAM.url().equals(calcVO.getOutputType())){
            Double lbToMgValue = calcVO.getInputValue()*453592; //ConversionConstants.LB_MG;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(lbToMgValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.KILOGRAM.url().equals(calcVO.getOutputType())){
            Double lbToKgValue = calcVO.getInputValue()*0.45; //ConversionConstants.LB_KG;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(lbToKgValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.GRAM.url().equals(calcVO.getOutputType())){
            Double lbToGValue = calcVO.getInputValue()*453.59; //ConversionConstants.LB_G;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(lbToGValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricByS(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricByS() of ConvertCalcImprlToMetBusinessByMassImpl ------------------");

        if(Constants.MILLIGRAM.url().equals(calcVO.getOutputType())){
            Double sToMgValue = calcVO.getInputValue()* ConversionConstants.S_MG;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(sToMgValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.KILOGRAM.url().equals(calcVO.getOutputType())){
            Double sToKgValue = calcVO.getInputValue()* ConversionConstants.S_KG;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(sToKgValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.GRAM.url().equals(calcVO.getOutputType())){
            Double sToGValue = calcVO.getInputValue()* ConversionConstants.S_G;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(sToGValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

}
