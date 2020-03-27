package com.mmi.convertcalcapi.unittesting.controllers;

import com.mmi.convertcalcapi.controllers.ConvertCalcController;
import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;
import com.mmi.convertcalcapi.service.ConvertCalcService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by c817105 on 23/03/2020.
 */
public class ImprlToMetControllerByAreaUnitTest {

    @Mock
    ConvertCalcService convertCalcService;

    @InjectMocks
    ConvertCalcController convertCalcController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    //Unit Test cases for Imperial To Metric for Square Inches to Square Millimeter, Centimeter, Meter
    @Test
    public void testImprlToMetricForIn2ToMm2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("mm2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("in2");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("mm2");
        convertCalDto.setOutputValue(6451.6);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }


    @Test
    public void testImprlToMetricForIn2ToCm2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("cm2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("in");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("cm2");
        convertCalDto.setOutputValue(64.51);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForIn2ToM2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("m2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("in2");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("m2");
        convertCalDto.setOutputValue(0.0064);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }


    //Unit Test cases for Imperial To Metric for Square Feet to Square Millimeter, Centimeter, Meter
    @Test
    public void testImprlToMetricForFtToMm2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("sq ft");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("mm2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("sq ft");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("mm2");
        convertCalDto.setOutputValue(929030.4);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }


    @Test
    public void testImprlToMetricForFtToCm2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("sq ft");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("cm2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("sq ft");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("cm2");
        convertCalDto.setOutputValue(9290.304);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForFtToM2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("sq ft");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("m2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("sq ft");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("m2");
        convertCalDto.setOutputValue(0.9290);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Imperial To Metric for Square Yards to Square Millimeter, Centimeter, Meter
    @Test
    public void testImprlToMetricForYd2ToMm2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("mm2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("yd2");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("mm2");
        convertCalDto.setOutputValue(8361281.69);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }


    @Test
    public void testImprlToMetricForYd2ToCm2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("cm2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("yd2");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("cm2");
        convertCalDto.setOutputValue(83612.81);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForYd2ToM2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("m2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("yd2");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("m2");
        convertCalDto.setOutputValue(8.36);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }
}
