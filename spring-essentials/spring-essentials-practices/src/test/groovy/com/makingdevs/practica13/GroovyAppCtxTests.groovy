package com.makingdevs.practica13;

import static org.junit.Assert.*
import static org.springframework.util.Assert.notNull;

import org.junit.Before
import org.junit.Test
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader
import org.springframework.context.support.GenericApplicationContext

import com.makingdevs.practica10.ProjectServiceImpl
import com.makingdevs.practica10.TaskServiceImpl
import com.makingdevs.practica10.UserServiceImpl
import com.makingdevs.practica10.UserStoryServiceImpl

class GroovyAppCtxTests {
  
  def appCtx
  
  @Before
  void before() {
    appCtx = new GenericApplicationContext()
    def reader = new GroovyBeanDefinitionReader(appCtx)
    
    reader.beans {
      projectService(ProjectServiceImpl)
      userService(UserServiceImpl)
      userStoryService(UserStoryServiceImpl){
        projectService = projectService 
      }
      taskService(TaskServiceImpl){
         userService = userService
      }
    }
    
    appCtx.refresh()
  }

  @Test
  public void testAppCtx() {
    def taskService = appCtx.getBean("taskService")
    notNull(taskService)
    notNull(taskService.userService)
  }

}
