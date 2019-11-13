package blah.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import blah.tdd.App.BowlRoll;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue()
  {
    assertTrue( true );
  }


  @Test
  public void getGreetingShouldReturnCorrectGreeting() {
    String expectedGreeting = "Hello World!";
    App a = new App();
    String actualGreeting = a.getGreeting();
    assertEquals(expectedGreeting, actualGreeting);
  }

  @Test
  public void bowlRollReturnedIs5IfStoredBowlRollIs5() {
    int expectedResult = 5;
    BowlRoll bowlRoll = new App.BowlRoll(5);
    int actualResult = bowlRoll.getNumberOfPinsKnockedDown();
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void bowlRollReturnedIs6IfStoredBowlRollIs6() {
    int expectedResult = 6;
    BowlRoll bowlRoll = new App.BowlRoll(6);
    int actualResult = bowlRoll.getNumberOfPinsKnockedDown();
    assertEquals(expectedResult, actualResult);
  }


}
