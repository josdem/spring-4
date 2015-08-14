package com.makingdevs.practica17;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.makingdevs.model.User;
import com.makingdevs.services.UserService;

@Service
public class UserServiceLoggedImpl implements UserService {

  private Log log = LogFactory.getLog(UserServiceLoggedImpl.class);

  @Override
  public User findUserByUsername(String username) {
    log.debug("findUserByUsername : params = [" + username + "]");
    return null;
  }

  @Override
  public User createUser(String username) {
    log.debug("createUser : params = [" + username + "]");
    return null;
  }

  @Override
  public void addToProject(String username, String codeName) {
    log.debug("addToProject : params = [" + username + "," + codeName + "]");
  }

}
