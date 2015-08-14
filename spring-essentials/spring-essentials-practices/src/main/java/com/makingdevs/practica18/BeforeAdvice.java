package com.makingdevs.practica18;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdvice {
  
  private Log log = LogFactory.getLog(BeforeAdvice.class);
  
  @Before("execution(public * *(..))")
  public void beforeMethod() {
    log.debug("Before method advice");
  }

}
