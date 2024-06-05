package com.kafka.producer.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kafka.producer.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
public class DataDto {

    private Long sensorId;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timestamp;

    private double measurement;

    private Data.MeasurementType measurementType;

}
