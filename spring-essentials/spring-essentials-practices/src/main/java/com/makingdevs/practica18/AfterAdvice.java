package com.makingdevs.practica18;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
// This is the trick baby!!!
public class AfterAdvice {

  /**
   * You may register aspect classes as regular beans in your Spring XML
   * configuration, or autodetect them through classpath scanning - just like
   * any other Spring-managed bean. However, note that the @Aspect annotation is
   * not sufficient for autodetection in the classpath
   */

  private Log log = LogFactory.getLog(AfterAdvice.class);

  @After("execution(public * *(..))")
  public void afterMethod() {
    log.debug("After method advice");
  }

}
