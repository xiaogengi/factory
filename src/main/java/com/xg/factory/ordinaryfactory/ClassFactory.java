package com.xg.factory.ordinaryfactory;

import com.xg.factory.factory.IPknm;

/**
 * @program: factory
 * @description: 普通工厂方法
 * @author: gzk
 * @create: 2019-11-12 09:40
 **/
public class ClassFactory {


    public static IPknm infoIPknm (String className){
        try {
            return (IPknm) Class.forName("com.xg.factory.factory.impl."+className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static IPknm infoIPknm (Class zClass){
        try {
            return (IPknm) zClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
