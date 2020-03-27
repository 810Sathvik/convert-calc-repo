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
public class MetToImprlControllerByLenIntegrationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String HOST = "http://localhost:";

    private static final String PATH = "/convertcalc/metricToImperialByLen";

    //Integrated Test cases for Metric To Imperial for MilliMetres to Inches, Feet, Yards
    @Test
    public void testMetricToImprlForMmToIn() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("in");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }

    @Test
    public void testMetricToImprlForMmToFt() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("ft");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }
	
    @Test
    public void testMetricToImprlForMmToYd() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("mm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("yd");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    //Integrated Test cases for Metric To Imperial for CentiMetres to Inches, Feet, Yards
    @Test
    public void testMetricToImprlForCmToIn() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("in");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
        
    }

    @Test
    public void testMetricToImprlForCmToFt() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("ft");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }

    @Test
    public void testMetricToImprlForCmToYd() throws Exception{
       

        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("cm");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("yd");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }

    //Integrated Test cases for Metric To Imperial for KiloMetres to Inches, Feet, Yards
    @Test
    public void testMetricToImprlForKmToIn() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("km");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("in");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }

    @Test
    public void testMetricToImprlForKmToFt() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("km");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("ft");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }

    @Test
    public void testMetricToImprlForKmToYd() throws Exception{
       
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("km");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("yd");

        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity(HOST + port + PATH, convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());

    }
}
