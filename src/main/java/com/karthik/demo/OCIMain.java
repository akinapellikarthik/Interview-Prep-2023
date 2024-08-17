package com.karthik.demo;


public class OCIMain {

  public static void main(String[] args) {}
}

class Singleton {
  private static Singleton s1 = null;

  private Singleton() {}

  public static Singleton getInstance() {
    if (s1 == null) {
      s1 = new Singleton();
    }
    return s1;
  }
}
//
// @Configuration()
// @PropertySource()
// req --> GW --> AUTH, AUTHZ (OPA)
//
