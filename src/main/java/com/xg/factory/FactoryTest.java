package com.xg.factory;

import com.xg.factory.abstpknmfactory.IAbstPknm;
import com.xg.factory.abstpknmfactory.impl.AbstU51Impl;
import com.xg.factory.abstpknmfactory.inter.IBankCard;

/**
 * @program: factory
 * @description: 测试类
 * @author: gzk
 * @create: 2019-11-12 09:27
 **/
public class FactoryTest {


    public static void main(String[] args) {

//        抽象工厂
//        IAbstPknm abst = new AbstQcImpl();
        IAbstPknm abst = new AbstU51Impl();
        IBankCard iBankCard = abst.bankCard();
        System.out.println(iBankCard.BankTest());
        System.out.println(abst.pay().pay());


//==============================================================================

        //普通工厂方法
//        通过类名
//        IPknm pknm = ClassFactory.infoIPknm("U51");
//        IPknm pknm = ClassFactory.infoIPknm("QIanCheng");
//        System.out.println(pknm.bankCard());

//        通过class
//          IPknm pknm = ClassFactory.infoIPknm(U51.class);
//          IPknm pknm = ClassFactory.infoIPknm(QIanCheng.class);
//          System.out.println(pknm.bankCard());

//===============================================================================
//        工厂方法
//        IPknm factory = new QIanCheng();
//        IPknm factory = new U51();
//        System.out.println(factory.bankCard());
    }


}
