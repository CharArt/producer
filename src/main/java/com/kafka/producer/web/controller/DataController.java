package com.kafka.producer.web.controller;

import com.kafka.producer.model.Data;
import com.kafka.producer.model.test.DataTestOptions;
import com.kafka.producer.service.KafkaDataService;
import com.kafka.producer.service.TestDataService;
import com.kafka.producer.web.dto.DataDto;
import com.kafka.producer.web.dto.DataTestOptionsDto;
import com.kafka.producer.web.mapper.DataMapper;
import com.kafka.producer.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final DataMapper dataMapper;
    private final TestDataService testDataService;
    private final DataTestOptionsMapper dataTestOptionsMapper;


    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDTO) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDTO);
        testDataService.sendMessages(testOptions);
    }
}
