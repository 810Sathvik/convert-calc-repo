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
public class ImprlToMetControllerByMassIntegrationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String HOST = "http://localhost:";

    private static final String PATH = "/convertcalc/imperialToMetricByMass";

    //Integrated Test cases for Imperial To Metric for Ounces to MilliGram, KiloGram, Gram
    @Test
    public void testImprlToMetricForOzToMg() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("oz");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mg");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

        
    }

    @Test
    public void testImprlToMetricForOzToKg() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("oz");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("kg");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        

    }
    @Test
    public void testImprlToMetricForOzToG() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("oz");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("g");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

        
    }

    //Integrated Test cases for Imperial To Metric for Pounds to MilliGram, KiloGram, Gram
    @Test
    public void testImprlToMetricForLbToMg() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("lb");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mg");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testImprlToMetricForLbToKg() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("lb");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("kg");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

        
    }

    @Test
    public void testImprlToMetricForLbToG() throws Exception{
        

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("lb");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("g");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

        
    }


    //Integrated Test cases for Imperial To Metric for Stones to MilliGram, KiloGram, Gram
    @Test
    public void testImprlToMetricForSToMg() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("s");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("mg");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

        
    }

    @Test
    public void testImprlToMetricForSToKg() throws Exception{
        
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("s");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("kg");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

        
    }

    @Test
    public void testImprlToMetricForSToG() throws Exception{
        

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("s");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("g");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

        
    }

}
