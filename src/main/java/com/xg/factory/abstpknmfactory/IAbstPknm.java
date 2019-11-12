package com.xg.factory.abstpknmfactory;

import com.xg.factory.abstpknmfactory.inter.IBankCard;
import com.xg.factory.abstpknmfactory.inter.IPay;
import com.xg.factory.abstpknmfactory.inter.IRepay;

public interface IAbstPknm {


    // 绑卡
    IBankCard bankCard();

    //支付
    IPay pay();

    //还款
    IRepay repay();


}
