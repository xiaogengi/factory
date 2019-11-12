package com.xg.factory.abstpknmfactory.impltest;

import com.xg.factory.abstpknmfactory.inter.IBankCard;
import com.xg.factory.abstpknmfactory.inter.IPay;

/**
 * @program: factory
 * @description:
 * @author: gzk
 * @create: 2019-11-12 09:58
 **/
public class IU51BankCard implements IBankCard, IPay {
    @Override
    public String BankTest() {
        return "51绑卡";
    }

    @Override
    public String pay() {
        return "51支付";
    }
}
