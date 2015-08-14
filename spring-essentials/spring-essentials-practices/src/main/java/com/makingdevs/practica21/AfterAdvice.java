package com.makingdevs.practica21;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AfterAdvice {

  private Log log = LogFactory.getLog(AfterAdvice.class);

  public void afterMethod(JoinPoint joinPoint) {
    log.debug("After advice method in " + joinPoint.getSignature().getName() + " with arguments:");
    for(Object o:joinPoint.getArgs()){
      log.debug("\t - " + o);
    }
  }

}
