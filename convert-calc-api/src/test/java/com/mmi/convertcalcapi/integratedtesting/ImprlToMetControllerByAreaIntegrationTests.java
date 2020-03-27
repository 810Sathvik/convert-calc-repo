package com.mmi.convertcalcapi.integratedtesting;

import com.mmi.convertcalcapi.ConvertCalcApplication;
import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by c817105 on 23/03/2020.
 */
@SpringBootTest(classes = ConvertCalcApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ImprlToMetControllerByAreaIntegrationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

	private static final String HOST = "http://localhost:";
	
	private static final String PATH = "/convertcalc/imperialToMetricByArea";

	
    @Test
    public void testImprlToMetricForIn2ToMm2() throws Exception{

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("mm2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate.postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }


    @org.junit.Test
    public void testImprlToMetricForIn2ToCm2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("cm2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

        
    }

    @Test
    public void testImprlToMetricForIn2ToM2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("m2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }


    //Integrated Test cases for Imperial To Metric for Square Feet to Square Millimeter, Centimeter, Meter
    @Test
    public void testImprlToMetricForFtToMm2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("sq ft");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("mm2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }


    @Test
    public void testImprlToMetricForFtToCm2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("sq ft");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("cm2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForFtToM2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("sq ft");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("m2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    //Integrated Test cases for Imperial To Metric for Square Yards to Square Millimeter, Centimeter, Meter
    @Test
    public void testImprlToMetricForYd2ToMm2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("mm2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }


    @Test
    public void testImprlToMetricForYd2ToCm2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("cm2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testImprlToMetricForYd2ToM2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd2");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("m2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }
}
