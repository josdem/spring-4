package com.makingdevs.practica10;

import com.makingdevs.model.Task;
import com.makingdevs.model.TaskStatus;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;

//Look ma! No annotations, Spring is not invading this class
public class TaskServiceImpl implements TaskService {
  
  private UserService userService;
  
  public TaskServiceImpl(){ super(); }

  public TaskServiceImpl(UserService userService){
    this.userService = userService;
  }

  public UserService getUserService() {
    return userService;
  }

  public void setUserService(UserService userService) {
    this.userService = userService;
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
