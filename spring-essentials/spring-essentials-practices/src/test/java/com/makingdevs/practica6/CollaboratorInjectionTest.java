package com.makingdevs.practica6;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.makingdevs.model.Project;
import com.makingdevs.model.User;
import com.makingdevs.model.UserStory;

public class CollaboratorInjectionTest {
  
  private ApplicationContext appCtx;

  @Before
  public void setup(){
    String[] configurations = {
        "com/makingdevs/practica6/CollaboratorInjectionAppCtx.xml",
        "com/makingdevs/practica6/AnotherCollaboratorInjectionAppCtx.xml"
        };
    appCtx = new ClassPathXmlApplicationContext(configurations);
    assertNotNull(appCtx);
  }

  @Test
  public void getBeanWithDependencies() {
    Project project = appCtx.getBean(Project.class);
    assertTrue(project.getId() == 2L);
    assertTrue(project.getCodeName().equals("TASKBOARD"));
    assertTrue(project.getUserStories().size() == 1);
    assertTrue(project.getParticipants().size() == 1);
    User user = project.getParticipants().get(0);
    assertTrue(user.getUsername().equals("makingdevs"));
    UserStory userStory = project.getUserStories().get(0);
    assertTrue(userStory.getEffort() == 3);
    assertTrue(userStory.getTasks().size() == 4);
    assertTrue(userStory.getTasks().contains(null));
    // Wherever you want...
  }

}