package com.example.demo.jpa;

import com.example.demo.bean.SystemUserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author:Goffy
 */
@Repository
public interface SystemUserInfoJPA extends JpaRepository<SystemUserInfoEntity,Integer> {
}
