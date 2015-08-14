package com.makingdevs.practica11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.makingdevs.practica10.TaskServiceImpl;
import com.makingdevs.practica10.UserStoryServiceImpl;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserStoryService;

@Configuration
@Import(BeanConfigurationOne.class) // Look ma, importing configuration
public class BeanConfigurationTwo implements BeanConfigurationContractTwo{

  // WTF!, are you serious? Inject configuration?
  @Autowired
  BeanConfigurationContractOne beanConfigurationContractOne;

  @Bean
  public UserStoryService userStoryService(){
    UserStoryServiceImpl userStoryServiceImpl = new UserStoryServiceImpl();
    // Setter injection
    userStoryServiceImpl.setProjectService(beanConfigurationContractOne.projectService());
    return userStoryServiceImpl; 
  }
  
  
  @Bean
  public TaskService taskService(){
    // Constructor injection
    TaskService taskService = new TaskServiceImpl(beanConfigurationContractOne.userService());
    return taskService;
  }

}