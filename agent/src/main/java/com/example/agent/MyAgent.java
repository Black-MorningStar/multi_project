package com.example.agent;

import java.lang.instrument.Instrumentation;

public class MyAgent {

    public static void premain(String agentArgument, Instrumentation instrumentation) throws Exception{
        System.out.println("进入了代理拦截器");
        System.out.println("代理的配置参数: " + agentArgument);
        //instrumentation.addTransformer();
    }
}
