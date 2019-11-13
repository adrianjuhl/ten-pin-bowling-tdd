package blah.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingGameTest {

  @Test
  public void theScoreOfAGameWithoutAnyBowlsIsZero() {
    int expectedScore = 0;
    BowlingGame bowlingGame = new BowlingGame();
    int actualScore = bowlingGame.calculateScore();
    assertEquals(expectedScore, actualScore);
  }

  @Test
  public void tenFramesOfScoreDataShouldBeParsedIntoTenFrameScoreStrings() {
    String data = "7,1-10-9,1-5,0-3,5-5,5-7,3-9,1-0,0-8,2,5";
    BowlingGame bowlingGame = new BowlingGame(data);
    for(String frameScoreString : bowlingGame.getFrameScoreStrings()) {
      System.out.println("frameScoreString: " + frameScoreString);
    }
    assertEquals(10, bowlingGame.getFrameScoreStrings().size());
  }

  @Test
  public void aGameOfAllGutterBallsShouldScoreZero() {
    BowlingGame bowlingGame = new BowlingGame();
    for(int i=0; i<10; i++) {
      bowlingGame.addOpenFrame(0, 0);
    }
    assertEquals(0, bowlingGame.calculateScore());
  }

//  @Test
//  public void aGameOfAllGutterBallsShouldScoreZero() {
//    BowlingGame bowlingGame = new BowlingGame();
//    for(int i=0; i<10; i++) {
//      bowlingGame.addOpenFrame(0, 0);
//    }
//    assertEquals(0, bowlingGame.calculateScore());
//  }

}
