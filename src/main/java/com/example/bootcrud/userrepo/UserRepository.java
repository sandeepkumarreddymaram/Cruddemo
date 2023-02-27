package com.example.bootcrud.userrepo;

import com.example.bootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

}
