package com.itgarden.repository;

import com.itgarden.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer, Long> {

	List<Offer> findOfferByIdIn(List<Long> ids);
}
