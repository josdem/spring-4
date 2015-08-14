package com.makingdevs.practica10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.makingdevs.services.ProjectService;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;
import com.makingdevs.services.UserStoryService;

@Configuration
public class JavaBeanConfiguration {

  @Bean
  public ProjectService projectService(){
    ProjectService projectService = new ProjectServiceImpl();
    return projectService;
  }
  
  @Bean
  public UserStoryService userStoryService(){
    UserStoryServiceImpl userStoryServiceImpl = new UserStoryServiceImpl();
    // Setter injection
    userStoryServiceImpl.setProjectService(projectService());
    return userStoryServiceImpl; 
  }
  
  @Bean
  public UserService userService() {
    UserService userService = new UserServiceImpl();
    return userService;
  }
  
  @Bean
  public TaskService taskService(){
    // Constructor injection
    TaskService taskService = new TaskServiceImpl(userService());
    return taskService;
  }
}
