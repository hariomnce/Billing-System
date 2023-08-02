
package com.itgarden.mapper.impl;

import com.itgarden.dto.KitchenOrderInfo;
import com.itgarden.entity.KitchenOrder;
import com.itgarden.mapper.KitchenOrderMapper;

import javax.annotation.Generated;

@Generated(value = "org.mapstruct.ap.MappingProcessor", date = "2022-06-26T02:23:18+0530", comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)")

public class KitchenOrderMapperImpl implements KitchenOrderMapper {

	@Override
	public KitchenOrder kitchenOrderInfotoKitchenOrder(KitchenOrderInfo kitchenOrderInfo) {

		if (kitchenOrderInfo == null) {
			return null;
		}

		KitchenOrder kitchenOrder = new KitchenOrder();

		kitchenOrder.setId(kitchenOrderInfo.getId());
		kitchenOrder.setDeleted(kitchenOrderInfo.isDeleted());
		kitchenOrder.setDateCreated(kitchenOrderInfo.getDateCreated());
		kitchenOrder.setDateModified(kitchenOrderInfo.getDateModified());
		kitchenOrder.setCustomerId(kitchenOrderInfo.getCustomerId());
		kitchenOrder.setProductList(kitchenOrderInfo.getProductList());
		kitchenOrder.setKitchenOrderCode(kitchenOrderInfo.getKitchenOrderCode());
		kitchenOrder.setKitchenOrderCode(kitchenOrderInfo.getKitchenOrderCode());
		kitchenOrder.setQuantity(kitchenOrderInfo.getQuantity());

		return kitchenOrder;
	}

	@Override
	public KitchenOrderInfo kitchenOrderToKitchenOrderInfo(KitchenOrder kitchenOrder) {

		if (kitchenOrder == null) {
			return null;
		}
		KitchenOrderInfo kitchenOrderInfo = new KitchenOrderInfo();

		kitchenOrderInfo.setId(kitchenOrder.getId());
		kitchenOrderInfo.setDeleted(kitchenOrder.isDeleted());
		kitchenOrderInfo.setDateCreated(kitchenOrder.getDateCreated());
		kitchenOrderInfo.setDateModified(kitchenOrder.getDateModified());
		kitchenOrderInfo.setCustomerId(kitchenOrder.getCustomerId());
		kitchenOrderInfo.setProductList(kitchenOrder.getProductList());
		kitchenOrderInfo.setKitchenOrderCode(kitchenOrder.getKitchenOrderCode());
		kitchenOrderInfo.setKitchenOrderStatus(kitchenOrder.getKitchenOrderStatus());
		kitchenOrderInfo.setQuantity(kitchenOrder.getQuantity());

		return kitchenOrderInfo;
	}
}
