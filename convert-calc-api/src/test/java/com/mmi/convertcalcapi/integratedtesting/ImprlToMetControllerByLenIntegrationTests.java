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
public class ImprlToMetControllerByLenIntegrationTests {

	@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

	private static final String HOST = "http://localhost:";
	
	private static final String PATH = "/convertcalc/imperialToMetricByLen";



    //Integrated Test cases for Imperial To Metric for Inches to Millimeter, Centimeter, Kilometer
    @Test
    public void testImprlToMetricForInToMm() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mm");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }

    @Test
    public void testImprlToMetricForInToCm() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("cm");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
     

    }
    @Test
    public void testImprlToMetricForInToKm() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("in");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("km");

       ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
       
    }

    //Integrated Test cases for Imperial To Metric for Feet to Millimeter, Centimeter, Kilometer
    @Test
    public void testImprlToMetricForFtToMm() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("ft");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mm");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
       
    }

    @Test
    public void testImprlToMetricForFtToCm() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("ft");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("cm");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
       
    }

    @Test
    public void testImprlToMetricForFtToKm() throws Exception{
        

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("ft");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("km");

       ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
       
    }

    //Integrated Test cases for Metric To Imperial for KiloMetres to Inches, Feet, Yards
    @Test
    public void testImprlToMetricForYdToMm() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mm");

       ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
      
    }

    @Test
    public void testImprlToMetricForYdToCm() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("cm");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
       
    }

    @Test
    public void testImprlToMetricForYdToKm() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("yd");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("km");

       ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
       
    }
}
