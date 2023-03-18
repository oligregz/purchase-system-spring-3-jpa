package com.gos.purchase.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gos.purchase.entities.User;
import com.gos.purchase.repositories.UserRepositry;

/**
 * Service.
 *
 */
@Service
public class UserService {

  @Autowired
  private UserRepositry repository;

  public List<User> findAll() {
    return repository.findAll();
  }
  
  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.get();
  }
}
