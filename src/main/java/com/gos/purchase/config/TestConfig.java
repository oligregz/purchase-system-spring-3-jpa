package com.gos.purchase.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.gos.purchase.entities.User;
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

  @Override
  public void run(String... args) throws Exception {
    
    User usr1 = new User(null, 
        "Jão Pé de Foice", "pedefoice@hotmail.com", "+55 83 988339478", "!Jaoz1nPedeFaca");
    User usr2 = new User(null, 
        "Eduardo Trinca Ferro", "trincaferro@gmail.com", "+55 12 988689402", "#Tr1nK4F3rr0");

    userRepository.saveAll(Arrays.asList(usr1, usr2));
  }

  
}
