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
public class MetToImprlControllerByMassUnitTest {

    @Mock
    ConvertCalcService convertCalcService;

    @InjectMocks
    ConvertCalcController convertCalcController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    //Unit Test cases for Metric To Imperial for MilliGram to Ounce, Pounds, Stones
    @Test
    public void testMetricToImprlForMgToOz() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("oz");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mg");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("oz");
        convertCalDto.setOutputValue(0.00035);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForMgToLb() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("lb");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mg");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("lb");
        convertCalDto.setOutputValue(0.000022);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }
    @Test
    public void testMetricToImprlForMgToS() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("s");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("mg");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("s");
        convertCalDto.setOutputValue(0.0109);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Metric To Imperial for KiloGram to Ounce, Pounds, Stones
    @Test
    public void testMetricToImprlForKgToOz() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("kg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("oz");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("kg");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("oz");
        convertCalDto.setOutputValue(352.73);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForKgToLb() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("kg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("lb");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("kg");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("lb");
        convertCalDto.setOutputValue(22.046);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForKgToS() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("kg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("s");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("kg");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("s");
        convertCalDto.setOutputValue(0.1094);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Unit Test cases for Metric To Imperial for Gram to Ounce, Pounds, Stones
    @Test
    public void testMetricToImprlForGToOz() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("g");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("oz");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("g");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("oz");
        convertCalDto.setOutputValue(0.35);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForGToLb() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("g");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("lb");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("g");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("lb");
        convertCalDto.setOutputValue(0.022);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testMetricToImprlForGToS() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("g");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("s");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("g");
        convertCalDto.setInputValue(10.0);
        convertCalDto.setOutputType("s");
        convertCalDto.setOutputValue(0.1094);

        when(convertCalcService.convertMetricToImperialByLen(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertMetricToImperialByMass(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

}
