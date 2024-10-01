package com.algu.algumon.discount.domain.repository;

import com.algu.algumon.discount.domain.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
}
