package com.makingdevs.practica14;

public class SystemInfo {
  private String javaHome;
  private String osName;
  private String osVersion;
  private String userDir;
  private String userHome;
  private String userName;
  
  public String getJavaHome() {
    return javaHome;
  }
  public void setJavaHome(String javaHome) {
    this.javaHome = javaHome;
  }
  public String getOsName() {
    return osName;
  }
  public void setOsName(String osName) {
    this.osName = osName;
  }
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }
  public String getUserDir() {
    return userDir;
  }
  public void setUserDir(String userDir) {
    this.userDir = userDir;
  }
  public String getUserHome() {
    return userHome;
  }
  public void setUserHome(String userHome) {
    this.userHome = userHome;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  @Override
  public String toString() {
    return "SystemInfo [javaHome=" + javaHome + ", osName=" + osName + ", osVersion=" + osVersion + ", userDir="
        + userDir + ", userHome=" + userHome + ", userName=" + userName + "]";
  }
  
}