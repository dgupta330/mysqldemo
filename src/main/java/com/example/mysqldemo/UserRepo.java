package com.example.mysqldemo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {
    List<User> findByName(String name);

    @Query ("from User where mobile=?1 and pwd=?2")
    User findBYMobileAndPwd(String mobile,String pwd);
}