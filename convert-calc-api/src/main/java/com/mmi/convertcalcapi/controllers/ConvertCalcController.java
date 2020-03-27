package com.mmi.convertcalcapi.controllers;

import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;
import com.mmi.convertcalcapi.service.ConvertCalcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 *
 * This class ConvertCalcController will handles the functionality of
 * Metric To Imperial & Vice Versa by Length Mass Area along with Temperature Conversions.
 *
 * Created by c817105 on 21/03/2020.
 */

@Slf4j
@RestController
@RequestMapping("/convertcalc")
@CrossOrigin(origins = "*")
public class ConvertCalcController {

    @Autowired
    ConvertCalcService currencyHolidaysService;

    @PostMapping(value = "/metricToImperialByLen", consumes = "application/json", produces = "application/json")
    public ResponseEntity convertMetricToImperialByLen(@RequestBody ConvertCalcVO convertCalcVO) {

       log.info("inside convertMetricToImperialByLen() of ConvertCalcController ------------------");

       ResponseEntity responseEntity = null;
       ConvertCalcDto convertCalcDto =  currencyHolidaysService.convertMetricToImperialByLen(convertCalcVO);
       if(convertCalcDto != null){
           responseEntity = new ResponseEntity<>(convertCalcDto, HttpStatus.OK);
       }
       return responseEntity;
    }

    @PostMapping(value = "/imperialToMetricByLen", consumes = "application/json", produces = "application/json")
    public ResponseEntity convertImperialToMetricByLen(@RequestBody ConvertCalcVO convertCalcVO) {

        log.info("inside convertImperialToMetricByLen() of ConvertCalcController ------------------");

        ResponseEntity responseEntity = null;
        ConvertCalcDto convertCalcDto =  currencyHolidaysService.convertImperialToMetricByLen(convertCalcVO);
        if(convertCalcDto != null){
            responseEntity = new ResponseEntity<>(convertCalcDto, HttpStatus.OK);
        }
        return responseEntity;
    }

    @PostMapping(value = "/metricToImperialByArea", consumes = "application/json", produces = "application/json")
    public ResponseEntity convertMetricToImperialByArea(@RequestBody ConvertCalcVO convertCalcVO) {

        log.info("inside convertMetricToImperialByArea() of ConvertCalcController ------------------");

        ResponseEntity responseEntity = null;

        ConvertCalcDto convertCalcDto =  currencyHolidaysService.convertMetricToImperialByArea(convertCalcVO);
        if(convertCalcDto != null){
            responseEntity = new ResponseEntity<>(convertCalcDto, HttpStatus.OK);
        }
        return responseEntity;
    }

    @PostMapping(value = "/imperialToMetricByArea", consumes = "application/json", produces = "application/json")
    public ResponseEntity convertImperialToMetricByArea(@RequestBody ConvertCalcVO convertCalcVO) {

        ResponseEntity responseEntity = null;

        log.info("inside convertImperialToMetricByArea() of ConvertCalcController ------------------");

        ConvertCalcDto convertCalcDto =  currencyHolidaysService.convertImperialToMetricByArea(convertCalcVO);

        if(convertCalcDto != null){
            responseEntity = new ResponseEntity<>(convertCalcDto, HttpStatus.OK);
        }

        return responseEntity;
    }

    @PostMapping(value = "/metricToImperialByMass", consumes = "application/json", produces = "application/json")
    public ResponseEntity convertMetricToImperialByMass(@RequestBody ConvertCalcVO convertCalcVO) {

        ResponseEntity responseEntity = null;

        log.info("inside convertMetricToImperialByMass() of ConvertCalcController ------------------");

        ConvertCalcDto convertCalcDto =  currencyHolidaysService.convertMetricToImperialByMass(convertCalcVO);

        if(convertCalcDto != null){
            responseEntity = new ResponseEntity<>(convertCalcDto, HttpStatus.OK);
        }

        return responseEntity;
    }

    @PostMapping(value = "/imperialToMetricByMass", consumes = "application/json", produces = "application/json")
    public ResponseEntity convertImperialToMetricByMass(@RequestBody ConvertCalcVO convertCalcVO) {

        log.info("inside convertImperialToMetricByMass() of ConvertCalcController ------------------");

        ResponseEntity responseEntity = null;

        ConvertCalcDto convertCalcDto =  currencyHolidaysService.convertImperialToMetricByMass(convertCalcVO);

        if(convertCalcDto != null){
            responseEntity = new ResponseEntity<>(convertCalcDto, HttpStatus.OK);
        }
        return responseEntity;
    }

    @PostMapping(value = "/convertTemp", consumes = "application/json", produces = "application/json")
    public ResponseEntity convertTemp(@RequestBody ConvertCalcVO convertCalcVO) {

        log.info("inside convertTemp() of ConvertCalcController ------------------");

        ResponseEntity responseEntity = null;

        ConvertCalcDto convertCalcDto =  currencyHolidaysService.convertTemp(convertCalcVO);

        if(convertCalcDto != null){
            responseEntity = new ResponseEntity<>(convertCalcDto, HttpStatus.OK);
        }

        return responseEntity;
    }

}
