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
public class MetToImprlControllerByAreaIntegrationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String HOST = "http://localhost:";

    private static final String PATH = "/convertcalc/metricToImperialByArea";

    //Integrated Test cases for Metric To Imperial for Square MilliMetres to Square Inches, Feet
    @Test
    public void testMetricToImprlForMm2ToIn2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("in2");

         ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForMm2ToFt() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("sq ft");

         ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
		
    }
	
    @Test
    public void testMetricToImprlForMm2ToYd2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("yd2");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    //Integrated Test cases for Metric To Imperial for Square CentiMetres to Square Inches, Feet, Yards
    @Test
    public void testMetricToImprlForCm2ToIn2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("in2");

         ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForCm2ToFt() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("sq ft");

         ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }
	
    @Test
    public void testMetricToImprlForCm2ToYd2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("yd2");

         ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    //Integrated Test cases for Metric To Imperial for Square Metres to Square Inches, Feet, Yards
    @Test
    public void testMetricToImprlForM2ToIn2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("m2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("in2");

         ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForM2ToFt() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("m2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("sq ft");

         ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
		
    }
	
    @Test
    public void testMetricToImprlForM2ToYd2() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("m2");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("yd2");

         ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }
}
