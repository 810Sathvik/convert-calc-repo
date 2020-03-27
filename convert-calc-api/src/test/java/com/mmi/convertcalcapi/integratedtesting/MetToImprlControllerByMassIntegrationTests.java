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
public class MetToImprlControllerByMassIntegrationTests {


    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String HOST = "http://localhost:";

    private static final String PATH = "/convertcalc/metricToImperialByMass";


    //Integrated Test cases for Metric To Imperial for MilliGram to Ounce, Pounds, Stones
    @Test
    public void testMetricToImprlForMgToOz() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("oz");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForMgToLb() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("lb");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }
	
    @Test
    public void testMetricToImprlForMgToS() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("s");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    //Integrated Test cases for Metric To Imperial for KiloGram to Ounce, Pounds, Stones
    @Test
    public void testMetricToImprlForKgToOz() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("kg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("oz");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForKgToLb() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("kg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("lb");

       ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForKgToS() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("kg");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("s");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    //Integrated Test cases for Metric To Imperial for Gram to Ounce, Pounds, Stones
    @Test
    public void testMetricToImprlForGToOz() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("g");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("oz");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForGToLb() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("g");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("lb");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForGToS() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("g");
        convertCalVO.setInputValue(10.0);
        convertCalVO.setOutputType("s");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }
}
