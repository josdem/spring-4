package com.makingdevs.practica13;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.util.Assert;
import static org.springframework.util.Assert.*;
import static org.junit.Assert.*;

public class UsingLanguageTests {

  ExpressionParser parser = new SpelExpressionParser();

  @Test
  public void testInvokeStaticMethod() {
    // El prefijo 'T' indica el tipo, en este caso la clase Math
    Expression exp = parser.parseExpression("T(Math).random() * 100.0");
    // En la expresion anterior, el resultado de la llamada a random
    double value = exp.getValue(double.class);
    Assert.notNull(value);
    System.out.println(value);
  }

  @Test
  public void testRelationalOperators() {
    ExpressionParser parser = new SpelExpressionParser();
    isTrue(parser.parseExpression("2==2").getValue(boolean.class));
    isTrue(parser.parseExpression("2<3").getValue(boolean.class));
    isTrue(parser.parseExpression("3>2").getValue(boolean.class));
    isTrue(parser.parseExpression("0!=1").getValue(boolean.class));
  }

  @Test
  public void testLogicalOperators() {
    isTrue(parser.parseExpression("true and true").getValue(boolean.class));
    isTrue(parser.parseExpression("true or true").getValue(boolean.class));
    isTrue(parser.parseExpression("!false").getValue(boolean.class));
    isTrue(parser.parseExpression("not false").getValue(boolean.class));
    isTrue(parser.parseExpression("true and not false").getValue(boolean.class));
  }

  @Test
  public void testMathematicalOperators() {
    ExpressionParser parser = new SpelExpressionParser();
    assertSame(2, parser.parseExpression("1+1").getValue(int.class));
    assertSame(0, parser.parseExpression("1-1").getValue(int.class));
    assertSame(1, parser.parseExpression("1/1").getValue(int.class));
    assertSame(1, parser.parseExpression("1*1").getValue(int.class));
    assertSame(1, parser.parseExpression("1^1").getValue(int.class));
    assertTrue(1D == parser.parseExpression("1e0").getValue(double.class));
    assertEquals("foobar", parser.parseExpression("'foo'+'bar'").getValue(String.class));
  }

  @Test
  public void testTernaryElvisAndSafeNavigationOperators() {
    assertEquals("foo", parser.parseExpression("true ? 'foo' : 'bar'").getValue(String.class));
    assertEquals("es nulo", parser.parseExpression("null?:'es nulo'").getValue(String.class));
    assertEquals(null, parser.parseExpression("null?.foo").getValue(String.class));
  }

}
