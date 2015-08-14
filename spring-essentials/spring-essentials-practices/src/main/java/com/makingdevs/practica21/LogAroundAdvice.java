package com.makingdevs.practica21;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class LogAroundAdvice {
  
  private Log log = LogFactory.getLog(LogAroundAdvice.class);

  public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
    log.debug("Antes de ejecutar " + pjp.getSignature().getName());
    Object retVal = pjp.proceed();
    log.debug("Despues de ejecutar " + pjp.getSignature().getName());
    return retVal;
  }
}
