package com.saad.pays.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saad.pays.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}