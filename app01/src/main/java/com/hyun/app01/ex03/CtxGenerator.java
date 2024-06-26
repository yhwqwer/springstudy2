package com.hyun.app01.ex03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CtxGenerator {
  private CtxGenerator() {
    
  }
  
  
  private static AbstractApplicationContext ctx = new AnnotationConfigApplicationContext();
  public static AbstractApplicationContext getInstance() {
    return ctx;
  }
  
}
