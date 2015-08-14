package com.makingdevs.practica9;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.makingdevs.model.UserStory;
import com.makingdevs.services.ProjectService;
import com.makingdevs.services.UserStoryService;

@Component
public class UserStoryServiceImpl implements UserStoryService {
  
  @Autowired
  private ProjectService projectService;

  public ProjectService getProjectService() {
    return projectService;
  }

  @Override
  public void createUserStory(UserStory userStory) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<UserStory> findUserStoriesByProject(String codeName) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isUserStoryDone(Long userStoryId) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public UserStory findUserStoryByIdentifier(Long userStoryId) {
    // TODO Auto-generated method stub
    return null;
  }

}
