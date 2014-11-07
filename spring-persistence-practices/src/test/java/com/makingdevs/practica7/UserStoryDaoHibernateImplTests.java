package com.makingdevs.practica7;

import static org.junit.Assert.assertNotNull;
import static org.springframework.util.Assert.notNull;

import javax.sql.DataSource;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { HibernateConfiguration.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserStoryDaoHibernateImplTests {

  @Autowired
  UserStoryDaoHibernateImpl userStoryDao;
  @Autowired
  DataSource dataSource;
  
  @Test
  public void testUserStoryDao() {
    notNull(userStoryDao);
    notNull(dataSource);
  }

  @Test
  public void shouldListByEffort() throws Exception {
    Integer lowValue = 1;
    Integer maxValue = 2;
    assertNotNull(userStoryDao.findAllByEffortBetween(lowValue, maxValue));
  }

}