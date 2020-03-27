package com.mmi.convertcalcapi.unittesting.controllers;


import com.mmi.convertcalcapi.controllers.ConvertCalcController;
import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;
import com.mmi.convertcalcapi.service.ConvertCalcService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by c817105 on 21/03/2020.
 */
@RunWith(MockitoJUnitRunner.class)
public class MetToImprlControllerByLenUnitTest {

    @Mock
    ConvertCalcService convertCalcService;

    @InjectMocks
    ConvertCalcController convertCalcController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    //Unit Test cases for Metric To Imperial for MilliMetres to Inches, Feet, Yards
    @Test
    public void testMetricToImprlForMmToIn() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("in");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mm");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("in");
        convertCalDto.setOutputValue(0.3937);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForMmToFt() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("ft");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mm");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("ft");
        convertCalDto.setOutputValue(0.0328);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }
    @Test
    public void testMetricToImprlForMmToYd() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("yd");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mm");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("yd");
        convertCalDto.setOutputValue(0.0109);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Metric To Imperial for CentiMetres to Inches, Feet, Yards
    @Test
    public void testMetricToImprlForCmToIn() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("in");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("cm");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("in");
        convertCalDto.setOutputValue(3.9370);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForCmToFt() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("ft");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("cm");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("ft");
        convertCalDto.setOutputValue(0.3280);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForCmToYd() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("yd");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("cm");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("yd");
        convertCalDto.setOutputValue(0.1094);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Metric To Imperial for KiloMetres to Inches, Feet, Yards
    @Test
    public void testMetricToImprlForKmToIn() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("km");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("in");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("km");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("in");
        convertCalDto.setOutputValue(393700.787);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForKmToFt() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("km");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("ft");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("km");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("ft");
        convertCalDto.setOutputValue(32808.399);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForKmToYd() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("km");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("yd");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("km");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("yd");
        convertCalDto.setOutputValue(10936.133);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

}
