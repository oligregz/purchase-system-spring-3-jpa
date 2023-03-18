package com.gos.purchase.services;

import com.gos.purchase.entities.User;
import com.gos.purchase.repositories.UserRepositry;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Service.
 *
 */
public class UserService {

  @Autowired
  private UserRepositry repository;

  public List<User> findAll() {
    return repository.findAll();
  }
}
