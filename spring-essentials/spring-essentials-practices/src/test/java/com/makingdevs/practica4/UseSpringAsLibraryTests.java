package com.makingdevs.practica4;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.makingdevs.services.UserService;

public class UseSpringAsLibraryTests {

  @Test
  public void useSpringWithBeanFactory() {
    Resource resource = new ClassPathResource("com/makingdevs/practica4/ApplicationContext.xml");
    BeanFactory beanFactory = new XmlBeanFactory(resource);
    UserService userService = (UserService)beanFactory.getBean("userService");
    assertNotNull(userService);
  }
  
  @Test
  public void useSpringWithAppCtx() {
    ApplicationContext appCtx = new ClassPathXmlApplicationContext("com/makingdevs/practica4/ApplicationContext.xml");
    UserService userService = (UserService)appCtx.getBean("userService");
    assertNotNull(userService);
  }
  
  @Test
  public void useSpringWithAppCtxByType() {
    ApplicationContext appCtx = new ClassPathXmlApplicationContext("com/makingdevs/practica4/ApplicationContext.xml");
    UserService userService = appCtx.getBean(UserService.class);
    assertNotNull(userService);
  }

}