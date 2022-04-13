package com.obj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obj.entity.PackageEntity;

@Repository
public interface PackageRepository extends JpaRepository<PackageEntity,Integer> {

}
