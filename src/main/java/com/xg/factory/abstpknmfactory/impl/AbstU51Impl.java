package com.xg.factory.abstpknmfactory.impl;

import com.xg.factory.abstpknmfactory.IAbstPknm;
import com.xg.factory.abstpknmfactory.impltest.IU51BankCard;
import com.xg.factory.abstpknmfactory.inter.IBankCard;
import com.xg.factory.abstpknmfactory.inter.IPay;
import com.xg.factory.abstpknmfactory.inter.IRepay;

/**
 * @program: factory
 * @description: 51实现类
 * @author: gzk
 * @create: 2019-11-12 09:54
 **/
public class AbstU51Impl implements IAbstPknm {


    @Override
    public IBankCard bankCard() {
        return new IU51BankCard();
    }

    @Override
    public IPay pay() {
        return new IU51BankCard();
    }

    @Override
    public IRepay repay() {
        return null;
    }
}
