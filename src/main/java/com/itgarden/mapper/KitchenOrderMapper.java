
package com.itgarden.mapper;

import com.itgarden.dto.KitchenOrderInfo;
import com.itgarden.entity.KitchenOrder;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface KitchenOrderMapper {

    KitchenOrderMapper INSTANCE= Mappers.getMapper(KitchenOrderMapper.class);
    KitchenOrder kitchenOrderInfotoKitchenOrder(KitchenOrderInfo kitchenOrderInfo);
    @InheritInverseConfiguration
    KitchenOrderInfo kitchenOrderToKitchenOrderInfo(KitchenOrder kitchenOrder);

}

