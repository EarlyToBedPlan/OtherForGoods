package cn.edu.xmu.provider.server;

import cn.edu.xmu.provider.model.CouponActivity;
import cn.edu.xmu.provider.model.GoodCartVo;

import java.util.List;


//bo使用商品组的默认的bo，这里随便起名了
public interface GoodService {
    //通过skuid获取goodssku
    public goodsSKUBo getGoodByskuId(Long skuid);

    //通过店铺id获取sku列表
    public List<goodsSKUBo> getSkuListByShopId(Long shopId);

    //通过店铺id获取skuId列表
    public List<Long> getSkuIdListByShopId(Long shopId);

    //通过skuid组装GoodsCartVo
    public GoodCartVo getCAByskuId(Long Sku);

    //通过skuid获取价格bo
    public floatpriceBo getPriceByskuId(Long skuId);

}
