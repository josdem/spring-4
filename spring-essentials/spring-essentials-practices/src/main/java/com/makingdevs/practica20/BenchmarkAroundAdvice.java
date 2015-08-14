package com.makingdevs.practica20;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BenchmarkAroundAdvice {
  private Log log = LogFactory.getLog(BenchmarkAroundAdvice.class);

  @Around("com.makingdevs.practica20.CommonPointcut.servicesLayer()")
  public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
    long startTime = System.currentTimeMillis();
    Object retVal = pjp.proceed();
    long endTime = System.currentTimeMillis();
    log.debug("Method " + pjp.getSignature().getName() +" executed in " + (endTime-startTime) + " ms.");
    return retVal;
  }
}
