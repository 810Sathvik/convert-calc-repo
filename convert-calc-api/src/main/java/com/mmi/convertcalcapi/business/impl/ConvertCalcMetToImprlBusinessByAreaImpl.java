package com.mmi.convertcalcapi.business.impl;

import com.mmi.convertcalcapi.business.ConvertCalcMetToImprlBusinessByArea;
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
public class ConvertCalcMetToImprlBusinessByAreaImpl implements ConvertCalcMetToImprlBusinessByArea {

    @Override
    public ConvertCalcDto convertMetricToImperialBySqMm(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialBySqMm() of ConvertCalcMetToImprlBusinessByAreaImpl ------------------");

        if(Constants.SQUARE_INCHES.url().equals(calcVO.getOutputType())){
            Double mm2ToIn2Value = calcVO.getInputValue()/645.16062; //* ConversionConstants.MM2_IN2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mm2ToIn2Value, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_FEET.url().equals(calcVO.getOutputType())){
            Double mm2ToFtValue = calcVO.getInputValue()/92903.12991; //* ConversionConstants.MM2_FT;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mm2ToFtValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_YARDS.url().equals(calcVO.getOutputType())){
            Double mm2ToYd2Value = calcVO.getInputValue()/836128.16916; //* ConversionConstants.MM2_YD2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mm2ToYd2Value, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertMetricToImperialBySqCm(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialBySqCm() of ConvertCalcMetToImprlBusinessByAreaImpl ------------------");

        if(Constants.SQUARE_INCHES.url().equals(calcVO.getOutputType())){
            Double cm2ToIn2Value = calcVO.getInputValue()/6.45161; //* ConversionConstants.CM2_IN2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(cm2ToIn2Value, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_FEET.url().equals(calcVO.getOutputType())){
            Double cm2ToFtValue = calcVO.getInputValue()/929.0313; //* ConversionConstants.CM2_FT;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(cm2ToFtValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_YARDS.url().equals(calcVO.getOutputType())){
            Double cm2ToYd2Value = calcVO.getInputValue()/8361.28169; //* ConversionConstants.CM2_YD2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(cm2ToYd2Value, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertMetricToImperialBySqM(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialBySqM() of ConvertCalcMetToImprlBusinessByAreaImpl ------------------");

        if(Constants.SQUARE_INCHES.url().equals(calcVO.getOutputType())){
            Double m2ToIn2Value = calcVO.getInputValue()/0.00065; //* ConversionConstants.M2_IN2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(m2ToIn2Value, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_FEET.url().equals(calcVO.getOutputType())){
            Double m2ToFtValue = calcVO.getInputValue()/0.0929; //* ConversionConstants.M2_FT;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(m2ToFtValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_YARDS.url().equals(calcVO.getOutputType())){
            Double m2ToYd2Value = calcVO.getInputValue()/0.83613; //* ConversionConstants.M2_YD2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(m2ToYd2Value, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

}
