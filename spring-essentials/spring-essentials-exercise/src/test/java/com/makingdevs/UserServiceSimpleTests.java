package com.makingdevs;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.makingdevs.model.User;
import com.makingdevs.services.UserService;

public class UserServiceSimpleTests {

  @Autowired
  UserService userService;

  @Test
  public void testCreateUser() {
    User user = userService.createUser("makingdevs");
    Assert.isTrue(user.getId() == 1L);
    Assert.isTrue(user.getUsername().equals("makingdevs"));
  }
  
  @Test
  public void testFindUserByUsername() {
    User user = userService.findUserByUsername("makingdevs");
    Assert.isTrue(user.getId() == 1L);
    Assert.isTrue(user.getUsername().equals("makingdevs"));
  }

}
