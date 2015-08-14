package com.makingdevs.practica9;

import org.springframework.stereotype.Repository;

import com.makingdevs.model.User;
import com.makingdevs.services.UserService;

// We use @Repository only for demo purposes
@Repository
public class UserServiceImpl implements UserService {

  @Override
  public User findUserByUsername(String username) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public User createUser(String username) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void addToProject(String username, String codeName) {
    // TODO Auto-generated method stub
    
  }

}
