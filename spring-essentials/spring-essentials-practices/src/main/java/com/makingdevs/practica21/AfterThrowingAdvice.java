package com.makingdevs.practica21;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AfterThrowingAdvice {

  private Log log = LogFactory.getLog(AfterThrowingAdvice.class);
  
  public void afterReturningMethod(JoinPoint joinPoint, RuntimeException customNameException) {
    StringBuffer buffer = new StringBuffer("Ha ocurrido un error en " + joinPoint.getSignature().getName() + " ");
    buffer.append("de " + joinPoint.getTarget().getClass().getName() + " - Argumentos:");
    for(Object o:joinPoint.getArgs()){
      buffer.append(o + " ");
    }
    buffer.append(" y el error " + customNameException.getMessage());
    log.error(buffer.toString());
  }

}
