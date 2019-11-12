package com.xg.factory.abstclass.abst;

import com.xg.factory.abstpknmfactory.inter.IBankCard;
import com.xg.factory.abstpknmfactory.inter.IPay;
import com.xg.factory.abstpknmfactory.inter.IRepay;

/**
 * @program: factory
 * @description:
 * @author: gzk
 * @create: 2019-11-12 11:57
 **/
public class AbstImpl extends AbstPknm {


    @Override
    public IBankCard getBank() {
        return null;
    }

    @Override
    public IPay getPay() {
        return null;
    }

    @Override
    public IRepay getRepay() {
        return null;
    }
}
