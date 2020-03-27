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
public class TempControllerUnitTest {

    @Mock
    ConvertCalcService convertCalcService;

    @InjectMocks
    ConvertCalcController convertCalcController;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    //Unit Test cases for Temperature Conversion from F To C
    @Test
    public void testTempConvertForFToC() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("f");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("c");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("f");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("c");
        convertCalDto.setOutputValue(-12.21);

        when(convertCalcService.convertTemp(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertTemp(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

	//Unit Test cases for Temperature Conversion from C To F
    @Test
    public void testTempConvertForCToF() throws Exception{
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("c");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("f");

        ConvertCalcDto convertCalDto = new ConvertCalcDto();
        convertCalDto.setInputType("c");
        convertCalDto.setInputValue(Double.valueOf(10));
        convertCalDto.setOutputType("f");
        convertCalDto.setOutputValue(Double.valueOf(50));

        when(convertCalcService.convertTemp(convertCalVO)).thenReturn(convertCalDto);
        ResponseEntity<Object> responseEntity = convertCalcController.convertTemp(convertCalVO);

        assertEquals(200, responseEntity.getStatusCodeValue());

    }
}
