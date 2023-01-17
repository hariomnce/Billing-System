
package com.itgarden.dto;

import com.itgarden.common.staticdata.KitchenOrderStatus;
import com.itgarden.entity.BaseObject;
import com.itgarden.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class KitchenOrderInfo extends BaseObject {


    private String kitchenOrderCode;

    private String customerId;

    private List<Product> productList;

    private int quantity;

    private KitchenOrderStatus kitchenOrderStatus;


}

