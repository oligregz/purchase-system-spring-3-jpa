package com.gos.purchase.resources;

import com.gos.purchase.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User controller.
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

  /**
   * Test method.
   */
  @GetMapping
  public ResponseEntity<User> findAll() {
    User usr = new User(1L, 
        "Jão Pé de Foice", "pedefoice@hotmail.com", "+55 83 988339478", "!Jaoz1nPedeFaca");
    return ResponseEntity.ok().body(usr);
  }
}
