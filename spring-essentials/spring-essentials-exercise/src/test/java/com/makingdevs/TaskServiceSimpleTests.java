package com.makingdevs;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.makingdevs.model.UserStory;
import com.makingdevs.services.TaskService;
import com.makingdevs.services.UserStoryService;

public class TaskServiceSimpleTests {

  @Autowired
  TaskService taskService;

  @Autowired
  UserStoryService userStoryService;

  @Test
  public void testCreateUserStory() {
    UserStory userStory = new UserStory();
    userStory.setEffort(3);
    userStory.setPriority(1);
    userStoryService.createUserStory(userStory);
    Assert.isTrue(userStory.getId() > 1L);
  }

  @Test
  public void testCreate1000Tasks() {
    for (int i = 1; i <= 1000; i++) {
      taskService.createTaskForUserStory("Task #" + i, 1L);
    }
    UserStory userStory = userStoryService.findUserStoryByIdentifier(1L);
    Assert.isTrue(userStory.getTasks().size() == 1000);
  }

  @Test(expected = Exception.class)
  public void testCreateTaskWithError() {
    taskService.createTaskForUserStory(null, null);
  }

}
