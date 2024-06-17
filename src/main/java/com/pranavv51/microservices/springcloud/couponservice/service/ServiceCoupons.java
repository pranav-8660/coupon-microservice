package com.pranavv51.microservices.springcloud.couponservice.service;

import com.pranavv51.microservices.springcloud.couponservice.model.EntityCoupons;
import com.pranavv51.microservices.springcloud.couponservice.repository.RepositoryCoupons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCoupons {

    @Autowired
    private RepositoryCoupons repoInst;

    private boolean fetchId(Long id){
        EntityCoupons coup = repoInst.findByid(id);
        if(coup!=null)
            return true;
        return false;
    }

    public String addCoupon(EntityCoupons coupon){
        repoInst.save(coupon);
        return "Success";
    }

    public String deleteCoupon(Long id){
        if(fetchId(id)){
            repoInst.deleteById(id);
            return "Coupon successfully deleted!";
        }
        else{
            return "Couldnt fetch the coupon";
        }

    }

    public EntityCoupons getaCoupon(long id){
        EntityCoupons fetchedCoup =  repoInst.findByid(id);
        if(fetchedCoup==null){
            return new EntityCoupons("coupon not available","not available ",0.0f);
        }

        return fetchedCoup;
    }


}
