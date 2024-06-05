package com.kafka.producer.web.mapper;

import com.kafka.producer.model.Data;
import com.kafka.producer.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
