package com.example.demo.jpa;

import com.example.demo.bean.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

/**
 * JpaRepository:SpringDataJpa提供的简单数据操作接口
 * JpaSpecificationExecutor:SpringDataJpa提供的复杂查询接口
 * Serializable:序列化接口
 * @Author:Goffy
 */
@Repository
public interface UserJPA extends JpaRepository<UserEntity,Long>, JpaSpecificationExecutor<UserEntity>, Serializable {

    @Query(value = "select * from t_user where t_age > ?",nativeQuery = true)
    List<UserEntity> nativeQuery(int age);

}
