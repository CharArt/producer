package com.kafka.producer.service;

import com.kafka.producer.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions testOptions);
}
