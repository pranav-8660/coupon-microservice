package com.pranavv51.microservices.springcloud.couponservice.controller;

import com.pranavv51.microservices.springcloud.couponservice.model.EntityCoupons;
import com.pranavv51.microservices.springcloud.couponservice.service.ServiceCoupons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("coupon/")
public class ControllerCoupons {

    @Autowired
    private ServiceCoupons serviceInst;

    // http://localhost:8500/coupon/generate-coupon/

    @PostMapping("generate-coupon/")
    public String addData(@RequestBody EntityCoupons coupon){
        return serviceInst.addCoupon(coupon);
    }

    // http://localhost:8500/coupon/delete-coupon/couponId/{id}
    @DeleteMapping("delete-coupon/couponId/{id}")
    public String deleteDate(@PathVariable("id") Long cid){
        return serviceInst.deleteCoupon(cid);
    }

    // http://localhost:8500/coupon/get-a-coupon/couponId

    @GetMapping("get-a-coupon/couponId/{id}")
    public ResponseEntity<EntityCoupons> fetchACoupon(@PathVariable("id") Long id){
        return ResponseEntity.ok(serviceInst.getaCoupon(id));
    }
}
