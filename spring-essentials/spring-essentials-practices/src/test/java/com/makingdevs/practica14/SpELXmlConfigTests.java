package com.makingdevs.practica14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.makingdevs.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"SpELInjection.xml"})
public class SpELXmlConfigTests {
  
  @Autowired
  SystemInfo systemInfo;
  
  @Autowired
  User userInfoSpel;
  
  @Autowired
  User userInfoPlaceholders;

  @Test
  public void testSpELInjection() {
    Assert.notNull(systemInfo);
    Assert.notNull(systemInfo.getJavaHome());
    // everything else ...
    System.out.println(systemInfo);
  }
  
  @Test
  public void testSpELInjectionOnUser(){
    Assert.notNull(userInfoSpel);
    Assert.isTrue(userInfoSpel.getUsername().equals("makingdevs"));
    Assert.isTrue(userInfoSpel.isEnabled());
    Assert.isTrue(userInfoSpel.getId() == 100L);
  }
  
  @Test
  public void testSpELInjectionPlaceholders(){
    Assert.notNull(userInfoPlaceholders);
    Assert.isTrue(userInfoPlaceholders.getUsername().equals("makingdevs"));
    Assert.isTrue(userInfoPlaceholders.isEnabled());
    Assert.isTrue(userInfoPlaceholders.getId() == 100L);
  }

}