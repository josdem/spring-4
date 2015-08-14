package com.makingdevs;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.makingdevs.model.Project;
import com.makingdevs.services.ProjectService;

public class ProjectServiceSimpleTests {

  @Autowired
  ProjectService projectService;

  @Test
  void testCreateNewProject() {
    Project project = new Project();
    project.setCodeName("MD");
    project.setDescription("This is the new project");
    project.setName("MakingDevs Project");
    Assert.notNull(project.getDateCreated());
    Assert.notNull(project.getLastUpdated());
    Assert.notNull(project.getId());
    Assert.isTrue(project.getId() > 1);
  }
  
  @Test
  void testFindProjectByCodename(){
    Project project = projectService.findProjectByCodeName("MD");
    Assert.notNull(project.getDateCreated());
    Assert.notNull(project.getLastUpdated());
    Assert.notNull(project.getId());
    Assert.isTrue(project.getId() > 1);
    Assert.isTrue(project.getName().equals("MakingDevs Project"));
  }

}
