
package com.itgarden.repository;

import com.itgarden.common.staticdata.KitchenOrderStatus;
import com.itgarden.entity.Customer;
import com.itgarden.entity.KitchenOrder;
import com.itgarden.entity.Product;
import com.itgarden.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenOrderRepository extends JpaRepository<KitchenOrder, Long>
{

   // @Query(value = "select * from KitchenOrder k where k.user.id in (Select u.id from User u where u.mobileNo = :mobileNo)", nativeQuery = true)

       KitchenOrder findByKitchenOrderCodeAndCustomerIdAndProductList
            (String Code, String customerCode, Product product);


}
