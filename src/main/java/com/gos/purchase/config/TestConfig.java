package com.gos.purchase.config;

import java.time.Instant;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.gos.purchase.entities.Order;
import com.gos.purchase.entities.User;
import com.gos.purchase.repositories.OrderRepositry;
import com.gos.purchase.repositories.UserRepositry;

/**
 * Test settings.
 * Annotation with name 'test' in profile
 * for spring to identify and implement in the test runtime.
 */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

  @Autowired
  private UserRepositry userRepository;

  @Autowired
  private OrderRepositry orderRepository;

  @Override
  public void run(String... args) throws Exception {
    
    User usr1 = new User(null, 
        "Jão Pé de Foice", "pedefoice@hotmail.com", "+55 83 988339478", "!Jaoz1nPedeFaca");
    User usr2 = new User(null, 
        "Eduardo Trinca Ferro", "trincaferro@gmail.com", "+55 12 988689402", "#Tr1nK4F3rr0");

    Order odr1 = new Order(null, Instant.parse("2019-06-11T19:53:07Z"), usr1);
    Order odr2 = new Order(null, Instant.parse("2019-03-24T13:42:12Z"), usr2);
    Order odr3 = new Order(null, Instant.parse("2019-05-03T03:20:32Z"), usr1);

    userRepository.saveAll(Arrays.asList(usr1, usr2));
    orderRepository.saveAll(Arrays.asList(odr1, odr2, odr3));
  }

  
}
