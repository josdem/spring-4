package com.makingdevs.practica9;

import org.springframework.stereotype.Component;

import com.makingdevs.model.Project;
import com.makingdevs.services.ProjectService;

@Component
public class ProjectServiceImpl implements ProjectService {

  @Override
  public void createNewProject(Project project) {
    // TODO Auto-generated method stub

  }

  @Override
  public Project findProjectByCodeName(String codeName) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Integer totalEffortForProject(String codeName) {
    // TODO Auto-generated method stub
    return null;
  }

}
