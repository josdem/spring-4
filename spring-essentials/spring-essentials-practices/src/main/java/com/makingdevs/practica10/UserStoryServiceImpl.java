package com.makingdevs.practica10;

import java.util.List;

import com.makingdevs.model.UserStory;
import com.makingdevs.services.ProjectService;
import com.makingdevs.services.UserStoryService;

//Look ma! No annotations, Spring is not invading this class
public class UserStoryServiceImpl implements UserStoryService {
  
  private ProjectService projectService;

  public ProjectService getProjectService() {
    return projectService;
  }

  public void setProjectService(ProjectService projectService) {
    this.projectService = projectService;
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
