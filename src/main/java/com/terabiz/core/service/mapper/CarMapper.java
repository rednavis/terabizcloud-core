package com.terabiz.core.service.mapper;

import com.terabiz.core.domain.*;
import com.terabiz.core.service.dto.CarDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Car} and its DTO {@link CarDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CarMapper extends EntityMapper<CarDTO, Car> {



    default Car fromId(Long id) {
        if (id == null) {
            return null;
        }
        Car car = new Car();
        car.setId(id);
        return car;
    }
}
