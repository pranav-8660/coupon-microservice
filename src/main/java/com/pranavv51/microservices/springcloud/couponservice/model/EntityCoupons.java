package com.pranavv51.microservices.springcloud.couponservice.model;

import jakarta.persistence.*;



@Entity(name = "coupon_details")
public class EntityCoupons {
    @Id
    @Column(name = "coupon_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "coupon_code",nullable = false)
    private String code;
    @Column(name = "coupon_expiry_date")
    private String expiryDate;
    @Column(name = "coupon_discount",nullable = false)
    private float discount;

    public EntityCoupons(String code, String expiryDate, float discount) {

        this.code = code;
        this.expiryDate = expiryDate;
        this.discount = discount;
    }

    public EntityCoupons() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
