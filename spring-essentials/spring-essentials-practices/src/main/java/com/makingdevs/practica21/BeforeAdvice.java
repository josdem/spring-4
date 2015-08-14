package com.makingdevs.practica21;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class BeforeAdvice {
  
  private Log log = LogFactory.getLog(BeforeAdvice.class);
  
  public void beforeMethod(JoinPoint joinPoint) {
    log.debug("Before advice method in " + joinPoint.getSignature().getName() + " with arguments:");
    for(Object o:joinPoint.getArgs()){
      log.debug("\t - " + o);
    }
  }
}
