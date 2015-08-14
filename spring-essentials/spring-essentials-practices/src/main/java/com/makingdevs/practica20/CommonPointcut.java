package com.makingdevs.practica20;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonPointcut {

  @Pointcut("this(com.makingdevs.services.UserService)")
  public void dataAccessLayer() {
  }

  @Pointcut("execution(* com.makingdevs.practica18.*Service*.*(..))")
  public void servicesLayer() {
  }

  @Pointcut("within(com.makingdevs.services.*)")
  public void webLayer() {
  }
}
