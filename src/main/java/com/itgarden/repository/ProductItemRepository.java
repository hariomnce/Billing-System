package com.itgarden.repository;

import com.itgarden.entity.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;



public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {

    List<ProductItem> findProductItemByProductItemCodeIn(List<String> productItemCodes);
}
