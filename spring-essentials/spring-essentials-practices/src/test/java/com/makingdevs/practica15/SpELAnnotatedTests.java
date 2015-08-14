package com.makingdevs.practica15;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.springframework.util.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DBInfo.class })
public class SpELAnnotatedTests {

  @Autowired
  DBInfo dbInfo;

  @Test
  public void testDBProperties() {
    notNull(dbInfo);
    isTrue(dbInfo.getDriver().equals("org.postgresql.Driver"));
    isTrue(dbInfo.getUrl().equals("jdbc:postgresql://localhost:5432/MakingDevs"));
    // Anything else...
  }

}
