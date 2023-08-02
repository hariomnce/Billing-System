package com.itgarden.service.bo;

import com.itgarden.common.CodeGenerator;
import com.itgarden.common.staticdata.CodeType;
import com.itgarden.common.staticdata.KitchenOrderStatus;
import com.itgarden.dto.KitchenOrderInfo;
import com.itgarden.entity.*;
import com.itgarden.mapper.KitchenOrderMapper;
import com.itgarden.messages.ResponseMessage;
import com.itgarden.repository.KitchenOrderRepository;
import com.itgarden.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
public class KitchenService extends BaseService {

	@Autowired
	private KitchenOrderRepository kitchenOrderRepository;

	@Autowired
	private CodeGenerator codeGenerator;

	public ResponseMessage<KitchenOrderInfo> save(KitchenOrderInfo kitchenOrderInfo) {

		KitchenOrder kitchenOrder = KitchenOrderMapper.INSTANCE.kitchenOrderInfotoKitchenOrder(kitchenOrderInfo);
		if (kitchenOrderInfo.getId() == null) {
			String kitchenOrderCode = codeGenerator.newCode(CodeType.KITCHEN_ORDER_CODE);
			kitchenOrder.setKitchenOrderCode(kitchenOrderCode);
			kitchenOrder.setKitchenOrderStatus(KitchenOrderStatus.PENDING);
		}

		KitchenOrder newKitchenOrder = kitchenOrderRepository.save(kitchenOrder);

		KitchenOrderInfo newKitchenOrderInfo = KitchenOrderMapper.INSTANCE
				.kitchenOrderToKitchenOrderInfo(newKitchenOrder);
		ResponseMessage<KitchenOrderInfo> responseMessage = ResponseMessage.withResponseData(newKitchenOrderInfo,
				"Kitchen Order Created %s", kitchenOrder.getKitchenOrderCode());

		return responseMessage;
	}

	@Override
	public ResponseMessage findResourceById(String id) throws Exception {
		return null;
	}

	@Override
	public ResponseMessage findAll() throws Exception {
		return null;
	}
}
