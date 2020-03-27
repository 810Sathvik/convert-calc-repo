package com.mmi.convertcalcapi.business.impl;

import com.mmi.convertcalcapi.business.ConvertCalcImprlToMetBusinessByLen;
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
public class ConvertCalcImprlToMetBusinessByLenImpl implements ConvertCalcImprlToMetBusinessByLen {


    @Override
    public ConvertCalcDto convertImperialToMetricByIN(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricByIN() of ConvertCalcImprlToMetBusinessByLenImpl ------------------");

        if(Constants.MILLIMETRE.url().equals(calcVO.getOutputType())){
            Double inToMmValue = calcVO.getInputValue()*25.4; //ConversionConstants.IN_MM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(inToMmValue);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.CENTIMETRE.url().equals(calcVO.getOutputType())){
            Double inToCmValue = calcVO.getInputValue()*2.54; //ConversionConstants.IN_CM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(inToCmValue);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.KILOMETRE.url().equals(calcVO.getOutputType())){
            Double inToKmValue = calcVO.getInputValue()*0.000025; //ConversionConstants.IN_KM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(inToKmValue);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricByFT(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricByFT() of ConvertCalcImprlToMetBusinessByLenImpl ------------------");

        if(Constants.MILLIMETRE.url().equals(calcVO.getOutputType())){
            Double ftToMmValue = calcVO.getInputValue()/0.003281; //* ConversionConstants.FT_MM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ftToMmValue);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
            return convertCalcDto;
        } else
        if(Constants.CENTIMETRE.url().equals(calcVO.getOutputType())){
            Double ftToCmValue = calcVO.getInputValue()/0.032808; //* ConversionConstants.FT_CM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ftToCmValue);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.KILOMETRE.url().equals(calcVO.getOutputType())){
            Double ftToKmValue = calcVO.getInputValue()/3280.84; //* ConversionConstants.FT_KM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ftToKmValue);

            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricByYD(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricByYD() of ConvertCalcImprlToMetBusinessByLenImpl ------------------");

        if(Constants.MILLIMETRE.url().equals(calcVO.getOutputType())){
            Double ydToMmValue = calcVO.getInputValue()*914.39997; //ConversionConstants.YD_MM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ydToMmValue);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.CENTIMETRE.url().equals(calcVO.getOutputType())){
            Double ydToCmValue = calcVO.getInputValue()*91.44; //ConversionConstants.YD_CM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ydToCmValue);
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.KILOMETRE.url().equals(calcVO.getOutputType())){
            Double ydToKmValue = calcVO.getInputValue()*0.00091; //ConversionConstants.YD_KM;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(ydToKmValue);
            //convertCalcDto.setOutputValue(DecimalUtils.round(ydToKmValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

}
