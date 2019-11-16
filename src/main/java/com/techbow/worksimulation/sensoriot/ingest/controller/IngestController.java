package com.techbow.worksimulation.sensoriot.ingest.controller;

import com.techbow.worksimulation.sensoriot.ingest.data.AirData;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ingest")
public class IngestController {

    @PostMapping("/data")
    public int ingest(@RequestBody AirData airData) {

        System.out.println("here we go!!");

        return Response.SC_OK;
    }
}
