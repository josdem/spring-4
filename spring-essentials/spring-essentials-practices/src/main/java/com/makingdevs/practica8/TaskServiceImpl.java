package com.makingdevs.practica8;

import org.springframework.beans.factory.annotation.Autowired;

import com.makingdevs.model.Task;
import com.makingdevs.model.TaskStatus;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;

public class TaskServiceImpl implements TaskService {
  
  private UserService userService;

  // @Inject
  // @Resource
  @Autowired
  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  public UserService getUserService() {
    return userService;
  }

  @Override
  public Task createTaskForUserStory(String taskDescription, Long userStoryId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void assignTaskToUser(Long taskId, String username) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void changeTaskStatus(Long taskId, TaskStatus taskStatus) {
    // TODO Auto-generated method stub
    
  }

}
