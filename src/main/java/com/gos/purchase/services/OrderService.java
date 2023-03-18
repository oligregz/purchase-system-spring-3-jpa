package com.gos.purchase.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gos.purchase.entities.Order;
import com.gos.purchase.repositories.OrderRepositry;

/**
 * Service.
 *
 */
@Service
public class OrderService {

  @Autowired
  private OrderRepositry repository;

  public List<Order> findAll() {
    return repository.findAll();
  }
  
  public Order findById(Long id) {
    Optional<Order> obj = repository.findById(id);
    return obj.get();
  }
}

