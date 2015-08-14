package com.makingdevs.practica8;

import static org.springframework.util.Assert.notNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.makingdevs.services.ProjectService;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;
import com.makingdevs.services.UserStoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"AnnotationConfigAppCtx.xml"})
public class AnnotationConfigBeansTests {
  
  @Autowired
  ApplicationContext applicationContext;

  @Test
  public void testAppCtx() {
    notNull(applicationContext);
  }
  
  @Test
  public void testBeans(){
    ProjectService projectService = applicationContext.getBean(ProjectService.class);
    TaskService taskService= applicationContext.getBean(TaskService.class);
    UserService userService = applicationContext.getBean(UserService.class);
    UserStoryService userStoryService = applicationContext.getBean(UserStoryService.class);
    
    notNull(projectService);
    notNull(taskService);
    notNull(userService);
    notNull(userStoryService);
  }
  
  @Test
  public void testImplementedBeans(){
    TaskServiceImpl taskServiceImpl = applicationContext.getBean(TaskServiceImpl.class);
    notNull(taskServiceImpl);
    notNull(taskServiceImpl.getUserService());
    
    UserStoryServiceImpl userStoryServiceImpl = applicationContext.getBean(UserStoryServiceImpl.class);
    notNull(userStoryServiceImpl);
    notNull(userStoryServiceImpl.getProjectService());
  }

}
