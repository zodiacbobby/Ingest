package com.techbow.worksimulation.sensoriot.ingest.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirData {
    private String productId;
    private String sensorType;
    private Long timeCreated;
    private Integer idInSensorGroup;
    private Double voltage;
    private Double current;
}
