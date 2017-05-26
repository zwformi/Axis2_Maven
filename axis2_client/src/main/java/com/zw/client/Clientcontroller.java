package com.zw.client;

import org.apache.axis2.AxisFault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/26.
 */
@Controller("client")
@RequestMapping("/test")
public class Clientcontroller {
@Resource
private  Test test;

@RequestMapping("/method2")
@ResponseBody
public String getService(){
    String rs="";
    try {
         rs=test.method2();
    } catch (AxisFault axisFault) {
        axisFault.printStackTrace();
    }
    return rs;
}

@RequestMapping("/home")
@ResponseBody
public String toHome(){
    System.out.println("comecome!!!");
    return "Home page";
}

}
