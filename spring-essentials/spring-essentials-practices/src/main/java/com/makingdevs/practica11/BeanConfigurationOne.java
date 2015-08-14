package com.makingdevs.practica11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.makingdevs.practica10.ProjectServiceImpl;
import com.makingdevs.practica10.UserServiceImpl;
import com.makingdevs.services.ProjectService;
import com.makingdevs.services.UserService;

// Look ma, I'm confguration and a Spring bean at the same time
@Configuration
@Component
public class BeanConfigurationOne implements BeanConfigurationContractOne {

  @Bean
  public ProjectService projectService(){
    ProjectService projectService = new ProjectServiceImpl();
    return projectService;
  }
  
  @Bean
  public UserService userService() {
    UserService userService = new UserServiceImpl();
    return userService;
  }

}
