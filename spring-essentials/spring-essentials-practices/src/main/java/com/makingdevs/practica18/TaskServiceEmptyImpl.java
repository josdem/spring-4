package com.makingdevs.practica18;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makingdevs.model.Task;
import com.makingdevs.model.TaskStatus;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserService;

@Service
public class TaskServiceEmptyImpl implements TaskService {
  
  @Autowired
  UserService userService;

  @Override
  public Task createTaskForUserStory(String taskDescription, Long userStoryId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void assignTaskToUser(Long taskId, String username) {
    userService.findUserByUsername(username);
  }

  @Override
  public void changeTaskStatus(Long taskId, TaskStatus taskStatus) {
    throw new RuntimeException("WTF fail!!!!");
  }

}
