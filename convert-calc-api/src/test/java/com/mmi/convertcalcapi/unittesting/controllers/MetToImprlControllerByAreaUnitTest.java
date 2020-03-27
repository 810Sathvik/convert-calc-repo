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
public class MetToImprlControllerByAreaUnitTest {

    @Mock
    ConvertCalcService convertCalcService;

    @InjectMocks
    ConvertCalcController convertCalcController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    //Unit Test cases for Metric To Imperial for Square MilliMetres to Square Inches, Feet
    @Test
    public void testMetricToImprlForMm2ToIn2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("in2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mm2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("in2");
        convertCalDto.setOutputValue(0.015);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForMm2ToFt() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("sq ft");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mm2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("sq ft");
        convertCalDto.setOutputValue(0.0001);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }
    @Test
    public void testMetricToImprlForMm2ToYd2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("yd2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mm2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("yd2");
        convertCalDto.setOutputValue(0.000011);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Metric To Imperial for Square CentiMetres to Square Inches, Feet, Yards
    @Test
    public void testMetricToImprlForCm2ToIn2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("in2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("cm2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("in2");
        convertCalDto.setOutputValue(1.55);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForCm2ToFt() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("sq ft");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("cm2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("sq ft");
        convertCalDto.setOutputValue(0.0107);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }
    @Test
    public void testMetricToImprlForCm2ToYd2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("yd2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("cm2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("yd2");
        convertCalDto.setOutputValue(0.0011);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Metric To Imperial for Square Metres to Square Inches, Feet, Yards
    @Test
    public void testMetricToImprlForM2ToIn2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("m2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("in2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("m2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("in2");
        convertCalDto.setOutputValue(15500.016);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForM2ToFt() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("m2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("sq ft");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("m2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("sq ft");
        convertCalDto.setOutputValue(107.63);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }
    @Test
    public void testMetricToImprlForM2ToYd2() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("m2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("yd2");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("m2");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("yd2");
        convertCalDto.setOutputValue(11.95);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByArea(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }
}
