package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.GreaterThan;
import org.mockito.internal.matchers.LessThan;

import com.javatpoint.SpringBootHelloWorldExampleApplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestSpringBoot {


  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "Pranathi Sri Vallabhaneni";

    System.out.println("This is Test 1");
    //assertThat(SpringBootHelloWorldExampleApplication.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";
    System.out.println("This is Test 2");
    //assertThat(SpringBootHelloWorldExampleApplication.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "World, Thank you making me Happy";
    System.out.println("This is Test 3");
    //(SpringBootHelloWorldExampleApplication.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
