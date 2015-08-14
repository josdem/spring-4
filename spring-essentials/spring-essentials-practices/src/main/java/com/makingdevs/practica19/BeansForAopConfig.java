package com.makingdevs.practica19;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.makingdevs.practica18.TaskServiceEmptyImpl;
import com.makingdevs.practica18.UserServiceEmptyImpl;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;

@Configuration
public class BeansForAopConfig {
  
  @Bean
  public TaskService taskService(){
    return new TaskServiceEmptyImpl();
  }
  
  @Bean
  public UserService userservice(){
    return new UserServiceEmptyImpl();
  }

}
