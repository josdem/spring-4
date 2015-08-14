package com.makingdevs.practica11;

import com.makingdevs.services.ProjectService;
import com.makingdevs.services.UserService;

public interface BeanConfigurationContractOne {
  ProjectService projectService();
  UserService userService();
}