package com.makingdevs.practica6;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MultiPropertiesBean {
  
  private Map<String, Integer> aMap;
  private List<String> multiLine;
  private Set<Float> primeNumbers;
  private Properties courseProperties;
  
  public Properties getCourseProperties() {
    return courseProperties;
  }
  public void setCourseProperties(Properties courseProperties) {
    this.courseProperties = courseProperties;
  }
  public Map<String, Integer> getaMap() {
    return aMap;
  }
  public void setaMap(Map<String, Integer> aMap) {
    this.aMap = aMap;
  }
  public List<String> getMultiLine() {
    return multiLine;
  }
  public void setMultiLine(List<String> multiLine) {
    this.multiLine = multiLine;
  }
  public Set<Float> getPrimeNumbers() {
    return primeNumbers;
  }
  public void setPrimeNumbers(Set<Float> primeNumbers) {
    this.primeNumbers = primeNumbers;
  }
  
}
