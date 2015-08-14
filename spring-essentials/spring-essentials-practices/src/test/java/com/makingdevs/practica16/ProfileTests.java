package com.makingdevs.practica16;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.makingdevs.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"ProfileAppCtx.xml"})
@ActiveProfiles(profiles={"dev"}) // Change to 'prod'
public class ProfileTests {
  
  @Autowired
  UserService userService;

  @Test
  public void testProfileInBean() {
    Assert.notNull(userService);
    userService.createUser("makingdevs");
  }

}
