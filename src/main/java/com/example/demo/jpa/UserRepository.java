package com.example.demo.jpa;

import com.example.demo.bean.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author:Goffy
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
