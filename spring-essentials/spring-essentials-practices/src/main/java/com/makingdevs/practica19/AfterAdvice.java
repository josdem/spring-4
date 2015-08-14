package com.makingdevs.practica19;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdvice {

  private Log log = LogFactory.getLog(AfterAdvice.class);

  @After("execution(* createUser*(..))")
  public void afterMethod(JoinPoint joinPoint) {
    log.debug("After advice method in " + joinPoint.getSignature().getName() + " with arguments:");
    for(Object o:joinPoint.getArgs()){
      log.debug("\t - " + o);
    }
  }

}
