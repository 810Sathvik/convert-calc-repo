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
public class ImprlToMetControllerByMassUnitTest {

    @Mock
    ConvertCalcService convertCalcService;

    @InjectMocks
    ConvertCalcController convertCalcController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    //Unit Test cases for Imperial To Metric for Ounces to MilliGram, KiloGram, Gram
    @Test
    public void testImprlToMetricForOzToMg() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("oz");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mg");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("oz");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("mg");
        convertCalDto.setOutputValue(283495.0);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForOzToKg() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("oz");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("kg");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("oz");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("kg");
        convertCalDto.setOutputValue(0.28);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }
    @Test
    public void testImprlToMetricForOzToG() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("oz");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("g");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("oz");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("g");
        convertCalDto.setOutputValue(283.49);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Imperial To Metric for Pounds to MilliGram, KiloGram, Gram
    @Test
    public void testImprlToMetricForLbToMg() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("lb");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mg");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("lb");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("mg");
        convertCalDto.setOutputValue(4535920.0);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForLbToKg() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("lb");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("kg");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("lb");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("kg");
        convertCalDto.setOutputValue(4.53);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForLbToG() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("lb");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("g");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("lb");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("g");
        convertCalDto.setOutputValue(4535.92);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }


    //Unit Test cases for Imperial To Metric for Stones to MilliGram, KiloGram, Gram
    @Test
    public void testImprlToMetricForSToMg() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("s");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mg");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("s");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("mg");
        convertCalDto.setOutputValue(0.35);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForSToKg() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("s");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("kg");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("s");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("kg");
        convertCalDto.setOutputValue(0.022);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForSToG() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("s");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("g");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("s");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("g");
        convertCalDto.setOutputValue(0.1094);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

}
