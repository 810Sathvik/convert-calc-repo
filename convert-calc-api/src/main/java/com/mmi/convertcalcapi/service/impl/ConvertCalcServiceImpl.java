package com.mmi.convertcalcapi.service.impl;


import com.mmi.convertcalcapi.business.*;
import com.mmi.convertcalcapi.constants.Constants;
import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;
import com.mmi.convertcalcapi.service.ConvertCalcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * This class ConvertCalcServiceImpl will handles the functionality of
 * Metric To Imperial & Vice Versa by Length Mass Area along with Temperature Conversions.
 *
 * Created by c817105 on 21/03/2020.
 */

@Slf4j
@Service
public class ConvertCalcServiceImpl implements ConvertCalcService {

    @Autowired
    ConvertCalcMetToImprlBusinessByLen metToImprlByLen;

    @Autowired
    ConvertCalcMetToImprlBusinessByArea metToImprlByArea;

    @Autowired
    ConvertCalcMetToImprlBusinessByMass metToImprlByMass;

    @Autowired
    ConvertCalcTempBusiness convertCalcTemp;


    @Autowired
    ConvertCalcImprlToMetBusinessByLen imprlToMetByLen;

    @Autowired
    ConvertCalcImprlToMetBusinessByArea imprlToMetByArea;

    @Autowired
    ConvertCalcImprlToMetBusinessByMass imprlToMetByMass;


    @Override
    public ConvertCalcDto convertMetricToImperialByLen(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;

        log.info("inside convertMetricToImperialByLen() of ConvertCalcServiceImpl ------------------");

        if(Constants.MILLIMETRE.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByLen.convertMetricToImperialByMM(calcVO);
        } else
        if(Constants.CENTIMETRE.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByLen.convertMetricToImperialByCM(calcVO);
        } else
            if(Constants.KILOMETRE.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByLen.convertMetricToImperialByKM(calcVO);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricByLen(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertImperialToMetricByLen() of ConvertCalcServiceImpl ------------------");

        if(Constants.INCHES.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByLen.convertImperialToMetricByIN(calcVO);
        } else
        if(Constants.FEET.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByLen.convertImperialToMetricByFT(calcVO);
        } else
        if(Constants.YARDS.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByLen.convertImperialToMetricByYD(calcVO);
        }

        return convertCalcDto;

    }

    @Override
    public ConvertCalcDto convertMetricToImperialByArea(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;
        log.info("inside convertMetricToImperialByArea() of ConvertCalcServiceImpl ------------------");
        if(Constants.SQUARE_MILLIMETRES.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByArea.convertMetricToImperialBySqMm(calcVO);
        } else
        if(Constants.SQUARE_CENTIMETRES.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByArea.convertMetricToImperialBySqCm(calcVO);
        } else
        if(Constants.SQUARE_METRES.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByArea.convertMetricToImperialBySqM(calcVO);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricByArea(ConvertCalcVO calcVO) {

        ConvertCalcDto convertCalcDto = null;

        log.info("inside convertImperialToMetricByArea() of ConvertCalcServiceImpl ------------------");

        if(Constants.SQUARE_INCHES.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByArea.convertImperialToMetricBySqIn(calcVO);
        } else
        if(Constants.SQUARE_FEET.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByArea.convertImperialToMetricBySqFt(calcVO);
        } else
        if(Constants.SQUARE_YARDS.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByArea.convertImperialToMetricBySqYd(calcVO);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertMetricToImperialByMass(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;

        log.info("inside convertMetricToImperialByMass() of ConvertCalcServiceImpl ------------------");

        if(Constants.MILLIGRAM.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByMass.convertMetricToImperialByMg(calcVO);
        } else
        if(Constants.GRAM.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByMass.convertMetricToImperialByG(calcVO);
        } else
        if(Constants.KILOGRAM.url().equals(calcVO.getInputType()) ){
            convertCalcDto = metToImprlByMass.convertMetricToImperialByKg(calcVO);
        }

        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertImperialToMetricByMass(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;

        log.info("inside convertImperialToMetricByMass() of ConvertCalcServiceImpl ------------------");

        if(Constants.OUNCES.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByMass.convertImperialToMetricByOz(calcVO);
        } else
        if(Constants.POUNDS.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByMass.convertImperialToMetricByLb(calcVO);
        } else
        if(Constants.STONES.url().equals(calcVO.getInputType()) ){
            convertCalcDto = imprlToMetByMass.convertImperialToMetricByS(calcVO);
        }
        return convertCalcDto;
    }

    @Override
    public ConvertCalcDto convertTemp(ConvertCalcVO calcVO) {
        ConvertCalcDto convertCalcDto = null;

        log.info("inside convertTemp() of ConvertCalcServiceImpl ------------------");

        if(Constants.FARHENHEIT.url().equals(calcVO.getInputType()) ){
            convertCalcDto = convertCalcTemp.convertFarhenheitToCelsius(calcVO);
        } else
        if(Constants.CELSIUS.url().equals(calcVO.getInputType()) ){
            convertCalcDto = convertCalcTemp.convertCelsiusToFarhenheit(calcVO);
        }
        return convertCalcDto;
    }

}
