package com.mmi.convertcalcapi.business.impl;

import com.mmi.convertcalcapi.business.ConvertCalcMetToImprlBusinessByMass;
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
public class ConvertCalcMetToImprlBusinessByMassImpl implements ConvertCalcMetToImprlBusinessByMass {

    @Override
    public ConvertCalcDto convertMetricToImperialByMg(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialByMg() of ConvertCalcMetToImprlBusinessByMassImpl ------------------");

        if(Constants.OUNCES.url().equals(calcVO.getOutputType())){
            Double mgToOzValue = calcVO.getInputValue()/28349.5; //* ConversionConstants.MG_OZ;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mgToOzValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.POUNDS.url().equals(calcVO.getOutputType())){
            Double mgToLbValue = calcVO.getInputValue()/453592; //* ConversionConstants.MG_LB;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mgToLbValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.STONES.url().equals(calcVO.getOutputType())){
            Double mgToSValue = calcVO.getInputValue()*0.00000015747; // ConversionConstants.MG_S;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(mgToSValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }
        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertMetricToImperialByG(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialByG() of ConvertCalcMetToImprlBusinessByMassImpl ------------------");

        if(Constants.OUNCES.url().equals(calcVO.getOutputType())){
            Double gToOzValue = calcVO.getInputValue()/28.3495; //* ConversionConstants.G_OZ;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(gToOzValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.POUNDS.url().equals(calcVO.getOutputType())){
            Double gToLbValue = calcVO.getInputValue()/453.592; //* ConversionConstants.G_LB;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(gToLbValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.STONES.url().equals(calcVO.getOutputType())){
            Double gToSValue = calcVO.getInputValue()*0.00015747; //ConversionConstants.G_S;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(gToSValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }
        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertMetricToImperialByKg(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialByKg() of ConvertCalcMetToImprlBusinessByMassImpl ------------------");

        if(Constants.OUNCES.url().equals(calcVO.getOutputType())){
            Double kgToOzValue = calcVO.getInputValue()/0.02835; //* ConversionConstants.KG_OZ;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(kgToOzValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.POUNDS.url().equals(calcVO.getOutputType())){
            Double kgToLbValue = calcVO.getInputValue()*2.2046; //* ConversionConstants.KG_LB;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(kgToLbValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        } else
        if(Constants.STONES.url().equals(calcVO.getOutputType())){
            Double kgToSValue = calcVO.getInputValue()*0.15747; //* ConversionConstants.KG_S;
            convertCalcDto = new ConvertCalcDto();
            convertCalcDto.setOutputValue(DecimalUtils.round(kgToSValue, ConversionConstants.NO_DIGITS_AFTER_DECIMAL_POINT));
            BeanUtils.copyProperties(calcVO, convertCalcDto);
        }

        return convertCalcDto;
    }

}
