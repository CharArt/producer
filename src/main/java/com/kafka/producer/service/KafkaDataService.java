package com.kafka.producer.service;

import com.kafka.producer.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
