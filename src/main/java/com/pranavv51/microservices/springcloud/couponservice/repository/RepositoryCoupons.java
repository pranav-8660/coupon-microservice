package com.pranavv51.microservices.springcloud.couponservice.repository;

import com.pranavv51.microservices.springcloud.couponservice.model.EntityCoupons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCoupons extends JpaRepository<EntityCoupons,Long> {
    public EntityCoupons findByid(Long id);
}
