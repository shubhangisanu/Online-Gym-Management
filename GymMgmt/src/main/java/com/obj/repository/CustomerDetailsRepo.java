package com.obj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obj.entity.CustomerDetailsEntity;

@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetailsEntity, Integer> {

}
