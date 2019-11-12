package com.xg.factory.abstclass.abst;

import com.xg.factory.abstpknmfactory.inter.IBankCard;
import com.xg.factory.abstpknmfactory.inter.IPay;
import com.xg.factory.abstpknmfactory.inter.IRepay;

/**
 * @program: factory
 * @description:
 * @author: gzk
 * @create: 2019-11-12 11:56
 **/
public abstract class AbstPknm {

    public abstract IBankCard getBank();
    public abstract IPay getPay();
    public abstract IRepay getRepay();



}
