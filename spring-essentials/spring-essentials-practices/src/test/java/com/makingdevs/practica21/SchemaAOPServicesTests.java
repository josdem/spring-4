package com.makingdevs.practica21;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"SchemaAOPAppCtx.xml"})
public class SchemaAOPServicesTests {
  
  @Autowired
  UserService userService;
  @Autowired
  TaskService taskService;

  @Test
  public void testUserService() {
    Assert.notNull(userService);
    userService.createUser("EmilyThorn");
  }
  
 @Test
  public void testTaskService() {
    Assert.notNull(taskService);
    taskService.assignTaskToUser(1L, "MakingDevs");
  }
  
  @Test(expected=RuntimeException.class)
  public void testWithException() {
    userService.addToProject("makingdevs", "spring-essentials");
  }

}
