package com.makingdevs.practica7;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.makingdevs.practica6.MultiPropertiesBean;

public class MultiPropertiesWithNamespaceCollaboratorInjectionTest {

  private ApplicationContext appCtx;

  @Before
  public void setup() {
    String[] configurations = { "com/makingdevs/practica7/UsingNamespacesAppCtx.xml" };
    appCtx = new ClassPathXmlApplicationContext(configurations);
    assertNotNull(appCtx);
  }

  @Test
  public void getBeanWitMultiProperties() {
    MultiPropertiesBean multi = appCtx.getBean(MultiPropertiesBean.class);
    assertTrue(multi.getaMap().size() == 3);
    assertTrue(multi.getaMap().containsKey("Uno"));
    assertTrue(multi.getMultiLine().size() == 4);
    assertTrue(multi.getPrimeNumbers().size() == 6);
    assertTrue(multi.getCourseProperties().size() == 3);
    assertTrue(multi.getCourseProperties().get("SPRING-WEB").equals("Desarrollo Web con Spring"));
    // Wherever you want...
  }

}