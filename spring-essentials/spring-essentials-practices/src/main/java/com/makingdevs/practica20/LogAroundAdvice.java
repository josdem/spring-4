package com.makingdevs.practica20;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAroundAdvice {
  
  private Log log = LogFactory.getLog(LogAroundAdvice.class);

  @Around("com.makingdevs.practica20.CommonPointcut.servicesLayer()")
  public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
    log.debug("Antes de ejecutar " + pjp.getSignature().getName());
    Object retVal = pjp.proceed();
    log.debug("Despues de ejecutar " + pjp.getSignature().getName());
    return retVal;
  }
}
