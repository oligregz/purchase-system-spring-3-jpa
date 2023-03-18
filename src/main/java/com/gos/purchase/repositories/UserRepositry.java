package com.gos.purchase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gos.purchase.entities.User;

public interface UserRepositry extends JpaRepository<User, Long> {

}
