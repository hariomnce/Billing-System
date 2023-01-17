
package com.itgarden.entity;

import com.itgarden.common.staticdata.KitchenOrderStatus;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class KitchenOrder extends BaseObject{


    @Column(name = "kitchen_order_code", nullable = false)
    private String kitchenOrderCode;

    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", nullable = false)
    private List<Product> productList;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "order_status", nullable = false)
    private KitchenOrderStatus kitchenOrderStatus;


}

