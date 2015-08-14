package com.makingdevs.practica18;

import org.springframework.stereotype.Service;

import com.makingdevs.model.User;
import com.makingdevs.services.UserService;

@Service
public class UserServiceEmptyImpl implements UserService {

  @Override
  public User findUserByUsername(String username) {
    return null;
  }

  @Override
  public User createUser(String username) {
    return null;
  }

  @Override
  public void addToProject(String username, String codeName) {
    throw new RuntimeException("Cannot find project or username");
  }

}
