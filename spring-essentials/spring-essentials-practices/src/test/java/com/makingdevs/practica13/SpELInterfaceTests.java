package com.makingdevs.practica13;

import static org.springframework.util.Assert.isTrue;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpELInterfaceTests {

  ExpressionParser parser = new SpelExpressionParser();

  @Test
  public void testStringExpression() {
    Expression exp = parser.parseExpression("'Making Devs'");
    String message = (String) exp.getValue();
    isTrue("Making Devs".equals(message));
  }

  @Test
  public void testMethodInvocation() {
    Expression exp = parser.parseExpression("('We are ' + 'Making Devs').concat('!!!')");
    String message = (String) exp.getValue();
    isTrue("We are Making Devs!!!".equals(message));
  }

  @Test
  public void testTypeInvocation() {
    Expression exp = parser.parseExpression("'Making Devs'.bytes");
    byte[] bytes = (byte[]) exp.getValue();
    isTrue(new String(bytes).equals("Making Devs"));
    exp = parser.parseExpression("'We are making software'.bytes.length");
    int length = (Integer) exp.getValue();
    isTrue("We are making software".getBytes().length == length);
  }

  @Test
  public void testValueByType() {
    ExpressionParser parser = new SpelExpressionParser();
    Expression exp = parser.parseExpression("new String('Software development').toUpperCase()");
    String message = exp.getValue(String.class);
    isTrue("SOFTWARE DEVELOPMENT".equals(message));
  }
  
  @Test
  public void testGetValueFromADifferentContext() {
    GregorianCalendar calendar = new GregorianCalendar(2013, 6, 12);
    ExpressionParser parser = new SpelExpressionParser();
    Expression exp = parser.parseExpression("time");
    EvaluationContext context = new StandardEvaluationContext(calendar);
    Date date = (Date) exp.getValue(context);
    isTrue(date.equals(calendar.getTime()));
  }

}