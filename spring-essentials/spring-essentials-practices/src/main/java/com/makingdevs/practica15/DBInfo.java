package com.makingdevs.practica15;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@ImportResource({"classpath:/com/makingdevs/practica15/AnnotationConfigAppCtx.xml"})
@Component
public class DBInfo {
  @Value("#{dbProperties['username'] ?: 'username'}")
  private String username;
  @Value("#{dbProperties['password'] ?: 'password'}")
  private String password;
  @Value("#{dbProperties['url'] ?: 'jdbc:h2:tcp://localhost/md'}")
  private String url;
  @Value("#{dbProperties['driver'] ?: 'org.h2.Driver'}")
  private String driver;
  
  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
  public String getUrl() {
    return url;
  }
  public String getDriver() {
    return driver;
  }
  
}