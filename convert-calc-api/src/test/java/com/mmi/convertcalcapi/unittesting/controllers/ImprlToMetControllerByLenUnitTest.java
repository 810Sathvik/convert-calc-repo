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
public class ImprlToMetControllerByLenUnitTest {

    @Mock
    ConvertCalcService convertCalcService;

    @InjectMocks
    ConvertCalcController convertCalcController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    //Unit Test cases for Imperial To Metric for Inches to Millimeter, Centimeter, Kilometer
    @Test
    public void testImprlToMetricForInToMm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mm");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("in");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("mm");
        convertCalDto.setOutputValue(253.0);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForInToCm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("cm");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("in");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("cm");
        convertCalDto.setOutputValue(25.0);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }
    @Test
    public void testImprlToMetricForInToKm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("km");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("in");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("km");
        convertCalDto.setOutputValue(0.00025);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Imperial To Metric for Feet to Millimeter, Centimeter, Kilometer
    @Test
    public void testImprlToMetricForFtToMm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("ft");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mm");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("ft");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("mm");
        convertCalDto.setOutputValue(3047.99);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForFtToCm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("ft");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("cm");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("ft");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("cm");
        convertCalDto.setOutputValue(304.79);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForFtToKm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("ft");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("km");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("ft");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("km");
        convertCalDto.setOutputValue(0.003);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Metric To Imperial for KiloMetres to Inches, Feet, Yards
    @Test
    public void testImprlToMetricForYdToMm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mm");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("yd");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("mm");
        convertCalDto.setOutputValue(9143.99);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForYdToCm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("cm");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("yd");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("cm");
        convertCalDto.setOutputValue(914.39);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForYdToKm() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("km");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("yd");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("km");
        convertCalDto.setOutputValue(0.0091);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertImperialToMetricByLen(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }
}
