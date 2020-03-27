package com.mmi.convertcalcapi.business.impl;

import com.mmi.convertcalcapi.business.ConvertCalcImprlToMetBusinessByArea;
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
public class ConvertCalcImprlToMetBusinessByAreaImpl implements ConvertCalcImprlToMetBusinessByArea {


    @Override
    public ConvertCalcDto convertImperialToMetricBySqIn(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricBySqIn() of ConvertCalcImprlToMetBusinessByAreaImpl ------------------");

        if(Constants.SQUARE_MILLIMETRES.url().equals(calcVO.getOutputType())){
            Double in2ToMm2Value = calcVO.getInputValue()*645.16062; // ConversionConstants.IN2_MM2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(in2ToMm2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_CENTIMETRES.url().equals(calcVO.getOutputType())){
            Double in2ToCm2Value = calcVO.getInputValue()*6.45161; //ConversionConstants.IN2_CM2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(in2ToCm2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_METRES.url().equals(calcVO.getOutputType())){
            Double in2ToM2Value = calcVO.getInputValue()*0.00065; // ConversionConstants.IN2_M2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(in2ToM2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricBySqFt(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricBySqFt() of ConvertCalcImprlToMetBusinessByAreaImpl ------------------");

        if(Constants.SQUARE_MILLIMETRES.url().equals(calcVO.getOutputType())){
            Double ftToMm2Value = calcVO.getInputValue()*92903.12991; // ConversionConstants.FT_MM2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ftToMm2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
            return convertCalcDto;
        } else
        if(Constants.SQUARE_CENTIMETRES.url().equals(calcVO.getOutputType())){
            Double ftToCm2Value = calcVO.getInputValue()*929.0313; // ConversionConstants.FT_CM2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ftToCm2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_METRES.url().equals(calcVO.getOutputType())){
            Double ftToM2Value = calcVO.getInputValue()*0.0929; // ConversionConstants.FT_M2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ftToM2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricBySqYd(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricBySqYd() of ConvertCalcImprlToMetBusinessByAreaImpl ------------------");

        if(Constants.SQUARE_MILLIMETRES.url().equals(calcVO.getOutputType())){
            Double yd2ToMm2Value = calcVO.getInputValue()*836128.16; // ConversionConstants.YD2_MM2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(yd2ToMm2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
            return convertCalcDto;
        } else
        if(Constants.SQUARE_CENTIMETRES.url().equals(calcVO.getOutputType())){
            Double yd2ToCm2Value = calcVO.getInputValue()*8361.28; // ConversionConstants.YD2_CM2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(yd2ToCm2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.SQUARE_METRES.url().equals(calcVO.getOutputType())){
            Double yd2ToM2Value = calcVO.getInputValue()*0.83613; // ConversionConstants.YD2_M2;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(yd2ToM2Value);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }
        return convertCalcDto;
    }

}
