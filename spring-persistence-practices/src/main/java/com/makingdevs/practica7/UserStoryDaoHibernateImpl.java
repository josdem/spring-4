package com.makingdevs.practica7;
 
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.makingdevs.dao.UserStoryDao;
import com.makingdevs.model.Project;
import com.makingdevs.model.UserStory;
 
@Repository
public class UserStoryDaoHibernateImpl extends GenericDaoHibernateImpl<UserStory, Long> implements UserStoryDao {
 
  @Autowired
  public UserStoryDaoHibernateImpl(SessionFactory sessionFactory) {
    super.setSessionFactory(sessionFactory);
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public List<UserStory> findAllByEffortBetween(Integer lowValue, Integer maxValue) {
    Query query = getSessionFactory().getCurrentSession().createQuery("from UserStory where effort between :lowValue and :maxValue");
    query.setInteger("lowValue", lowValue);
    query.setInteger("maxValue", maxValue);
    return (List<UserStory>) query.list();
  }

  @Override
  public List<UserStory> findAllByPriorityBetween(Integer lowValue, Integer maxValue) {
    return null;
  }

  @Override
  public List<UserStory> findAllByProject(Project project) {
    return null;
  }
 
}