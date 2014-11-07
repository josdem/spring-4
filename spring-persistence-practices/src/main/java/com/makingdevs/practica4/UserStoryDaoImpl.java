package com.makingdevs.practica4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.makingdevs.dao.UserStoryDao;
import com.makingdevs.model.Project;
import com.makingdevs.model.UserStory;

@Repository
public class UserStoryDaoImpl implements UserStoryDao {

  @Override
  public Long create(UserStory newInstance) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UserStory read(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void update(UserStory transientObject) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void delete(UserStory persistentObject) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<UserStory> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int countAll() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public List<UserStory> findAllByEffortBetween(Integer lowValue, Integer maxValue) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<UserStory> findAllByPriorityBetween(Integer lowValue, Integer maxValue) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<UserStory> findAllByProject(Project project) {
    // TODO Auto-generated method stub
    return null;
  }

}
