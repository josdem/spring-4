package com.makingdevs.practica18;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAdvice {

  private Log log = LogFactory.getLog(AfterReturningAdvice.class);

  @AfterReturning("execution(public * *(..))")
  public void afterReturningMethod() {
    log.debug("After returning method advice");
  }

}
