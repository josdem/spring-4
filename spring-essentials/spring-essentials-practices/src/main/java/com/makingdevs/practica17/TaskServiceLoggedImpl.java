package com.makingdevs.practica17;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makingdevs.model.Task;
import com.makingdevs.model.TaskStatus;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;

@Service
public class TaskServiceLoggedImpl implements TaskService {
  
  private Log log = LogFactory.getLog(TaskServiceLoggedImpl.class);
  
  @Autowired
  UserService userService;

  @Override
  public Task createTaskForUserStory(String taskDescription, Long userStoryId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void assignTaskToUser(Long taskId, String username) {
    log.debug("Starting: assignTaskToUser");
    userService.findUserByUsername(username);
    log.debug("Ending: assignTaskToUser");
  }

  @Override
  public void changeTaskStatus(Long taskId, TaskStatus taskStatus) {
    // TODO Auto-generated method stub
    
  }

}
