package com.xg.factory.abstpknmfactory.impl;

import com.xg.factory.abstpknmfactory.IAbstPknm;
import com.xg.factory.abstpknmfactory.impltest.IQCBankCard;
import com.xg.factory.abstpknmfactory.inter.IBankCard;
import com.xg.factory.abstpknmfactory.inter.IPay;
import com.xg.factory.abstpknmfactory.inter.IRepay;

/**
 * @program: factory
 * @description:
 * @author: gzk
 * @create: 2019-11-12 09:56
 **/
public class AbstQcImpl implements IAbstPknm {
    @Override
    public IBankCard bankCard() {
        return new IQCBankCard();
    }

    @Override
    public IPay pay() {
        return new IQCBankCard();
    }

    @Override
    public IRepay repay() {
        return null;
    }
}
