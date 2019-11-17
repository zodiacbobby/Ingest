package com.techbow.worksimulation.sensoriot.ingest.controller;

import com.techbow.worksimulation.sensoriot.ingest.data.AirData;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/ingest")
public class IngestController {

    @PostMapping("/data")
    public int ingest(@RequestBody AirData airData) {

        try{
            System.out.println("here we go!!");
        } catch (Exception e) {
            log.error("Data Ingest {} method error with message {}", IngestController.class.getSimpleName(), e);
        }
        System.out.println("*****");
        return Response.SC_OK;
    }
}
