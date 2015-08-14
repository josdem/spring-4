package com.makingdevs.practica11;

import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserStoryService;

public interface BeanConfigurationContractTwo {
  TaskService taskService();
  UserStoryService userStoryService();
}
