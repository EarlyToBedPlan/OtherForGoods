package cn.edu.xmu.provider.model;

import lombok.Data;

import java.util.List;

@Data
public class GoodCartVo {
    String skuName;
    String spuName;
    List<CouponActivity> couponActivityList;//sku优惠活动列表
}
