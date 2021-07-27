package com.ljq.mybatis03.util;

import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionInvocationHandler implements InvocationHandler {

    //target:zs
    private Object target;

    public TransactionInvocationHandler(Object target) {
        this.target = target;
    }

    //代理类的业务方法，ls的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session = null;
        Object obj=null;
        try {
            session = SqlSessionUtil.getSession();

            //处理业务逻辑,method.invoke zs的方法
            obj = method.invoke(target,args);

            //业务逻辑处理完毕后，提交事务
            session.commit();
        }catch (Exception e){
            session.rollback();
        }finally {
            SqlSessionUtil.myClose(session);
        }

        return obj;
    }
    //获得ls对象
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
}
