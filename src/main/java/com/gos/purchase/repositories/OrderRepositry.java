package com.gos.purchase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gos.purchase.entities.Order;

public interface OrderRepositry extends JpaRepository<Order, Long> {

}
