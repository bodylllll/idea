package com.ljq.mybatis03.util;

import com.ljq.mybatis03.util.TransactionInvocationHandler;

public class ServiceFactory {
    //传递zs对象，获取ls对象的过程
    public static Object getService(Object service){
        return new TransactionInvocationHandler(service).getProxy();
    }
}
