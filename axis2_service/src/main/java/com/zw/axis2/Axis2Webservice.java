package com.zw.axis2;


import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/26.
 */
@Component("springAwareService")
public class Axis2Webservice {
    public String getStrA(String str){
       // String str="123";
        System.out.println("你输入的是："+str);
        return "获取参数为："+str;
    }
}
