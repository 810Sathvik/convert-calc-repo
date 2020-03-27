package com.mmi.convertcalcapi.integratedtesting;

import com.mmi.convertcalcapi.ConvertCalcApplication;
import com.mmi.convertcalcapi.dto.ConvertCalcDto;
import com.mmi.convertcalcapi.model.ConvertCalcVO;
import org.junit.jupiter.api.Test;
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
public class TempControllerIntegrationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testTempConversionFToC() {
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("f");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("c");
        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity("http://localhost:" + port + "/convertcalc/convertTemp", convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testTempConversionCToF() {
        ConvertCalcVO convertCalVO = new ConvertCalcVO();
        convertCalVO.setInputType("c");
        convertCalVO.setInputValue(Double.valueOf(10));
        convertCalVO.setOutputType("f");
        ResponseEntity<ConvertCalcDto> responseEntity = this.restTemplate
                .postForEntity("http://localhost:" + port + "/convertcalc/convertTemp", convertCalVO, ConvertCalcDto.class);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }
}
