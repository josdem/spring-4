package com.makingdevs.practica5;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.makingdevs.model.Project;
import com.makingdevs.model.User;

public class SetterInjectionTest {
  
  private ApplicationContext appCtx;
  
  @Before
  public void setup(){
    // Look ma! String array.
    String[] configurations = {"com/makingdevs/practica5/SetterInjectionAppCtx.xml"};
    appCtx = new ClassPathXmlApplicationContext(configurations);
    assertNotNull(appCtx);
  }

  @Test
  public void getBeanWithConstructorInjection() {
    assertTrue(appCtx.containsBean("projectFromConstructor"));
    Project project = (Project)appCtx.getBean("projectFromConstructor");
    assertTrue(project.getId() == 1L);
    assertTrue(project.getName().equals("My taskboards"));
    assertTrue(project.getCodeName().equals("TASKBOARD"));
    assertTrue(project.getDescription().equals("Project description"));
  }
  
  @Test
  public void getAnotherBeanWithConstructor(){
    User user = appCtx.getBean(User.class);
    assertTrue(user.getId() == 100L);
    assertTrue(user.getUsername().equals("makingdevs"));
    assertTrue(user.isEnabled());
    assertNotNull(user.getDateCreated());
  }

}
