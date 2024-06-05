package com.kafka.producer.web.mapper;

import com.kafka.producer.model.test.DataTestOptions;
import com.kafka.producer.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {
}