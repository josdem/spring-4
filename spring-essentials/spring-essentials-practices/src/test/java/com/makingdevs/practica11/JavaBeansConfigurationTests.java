package com.makingdevs.practica11;

import static org.springframework.util.Assert.notNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.makingdevs.practica10.TaskServiceImpl;
import com.makingdevs.practica10.UserStoryServiceImpl;
import com.makingdevs.services.ProjectService;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;
import com.makingdevs.services.UserStoryService;

@RunWith(SpringJUnit4ClassRunner.class)
//Hey look the configuration, It's Java!!!
@ContextConfiguration(classes = { BeanConfigurationTwo.class })
public class JavaBeansConfigurationTests {

  // You must inject abstractions, like this.
  @Autowired
  TaskService taskService;
  @Autowired
  ProjectService projectService;
  @Autowired
  UserService userService;
  @Autowired
  UserStoryService userStoryService;

  // This is bad practice, is only for demo purposes.
  @Autowired
  TaskServiceImpl taskServiceImpl;
  @Autowired
  UserStoryServiceImpl userStoryServiceImpl;

  @Test
  public void testBeans() {

    notNull(projectService);
    notNull(taskService);
    notNull(userService);
    notNull(userStoryService);
  }

  @Test
  public void testImplementedBeans() {
    notNull(taskServiceImpl);
    notNull(taskServiceImpl.getUserService());
    notNull(userStoryServiceImpl);
    notNull(userStoryServiceImpl.getProjectService());
  }

}