package com.makingdevs.practica12;

import static org.junit.Assert.assertTrue;
import static org.springframework.util.Assert.notNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.makingdevs.practica6.MultiPropertiesBean;
import com.makingdevs.services.ProjectService;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;
import com.makingdevs.services.UserStoryService;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"MultiStyleConfiguration.xml"})
@ContextConfiguration(classes={GlobalConfiguration.class})
public class MultiStyleConfigurationTests {

  @Autowired
  TaskService taskService;
  @Autowired
  ProjectService projectService;
  @Autowired
  UserService userService;
  @Autowired
  UserStoryService userStoryService;
  
  @Autowired
  ApplicationContext appCtx;
  
  @Autowired
  UserStoreImpl userStoreImpl;

  @Test
  public void testBeans() {
    notNull(projectService);
    notNull(taskService);
    notNull(userService);
    notNull(userStoryService);
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
  
  @Test
  public void getAnotherExtraBean(){
    notNull(userStoreImpl);
  }

}