package com.makingdevs.practica16;

import com.makingdevs.model.User;
import com.makingdevs.services.UserService;

public class UserServiceDevImpl implements UserService {

  @Override
  public User findUserByUsername(String username) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public User createUser(String username) {
    System.out.println("Creating user in development environment");
    return null;
  }

  @Override
  public void addToProject(String username, String codeName) {
    // TODO Auto-generated method stub
    
  }

}
