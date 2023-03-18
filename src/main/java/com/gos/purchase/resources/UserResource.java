package com.gos.purchase.resources;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gos.purchase.entities.User;
import com.gos.purchase.services.UserService;

/**
 * User controller.
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

  private UserService service;

  /**
   * Test method.
   */
  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }
}
