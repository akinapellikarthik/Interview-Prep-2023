package com.karthik.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class OCIMain {

    public static void main(String[] args) {

    }
}

class Singleton {
    private static Singleton s1 = null;
    private Singleton(){}

    public static Singleton getInstance() {
        if(s1 == null){
            s1 = new Singleton();
        }
        return s1;
    }
}
//
//@Configuration()
//@PropertySource()
//req --> GW --> AUTH, AUTHZ (OPA)
//

