package blah.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingGameTest {

  @Test
  public void theScoreOfAGameWithoutAnyBowlsIsZero() {
    int expectedScore = 0;
    BowlingGame bowlingGame = new BowlingGame();
    int actualScore = bowlingGame.score();
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
    assertEquals(0, bowlingGame.score());
  }

  @Test
  public void aGameScoringOnePerFrameShouldScoreTen() {
    BowlingGame bowlingGame = new BowlingGame();
    for(int frameNumber=1; frameNumber<=10; frameNumber++) {
      bowlingGame.addOpenFrame(1, 0);
    }
    assertEquals(10, bowlingGame.score());
  }

  @Test
  public void aGameScoringANineOneSparePerFrameShouldScore190() {
    BowlingGame bowlingGame = new BowlingGame();
    for(int frameNumber=1; frameNumber<=9; frameNumber++) {
      bowlingGame.addSpare(9);
    }
    bowlingGame.addFinalFrame(9,1,9);
    assertEquals(190, bowlingGame.score());
  }

  @Test
  public void aGameOfAllStrikesShouldScore300() {
    BowlingGame bowlingGame = new BowlingGame();
    for(int frameNumber=1; frameNumber<=9; frameNumber++) {
      bowlingGame.addStrike();
    }
    bowlingGame.addFinalFrame(10,10,10);
    assertEquals(300, bowlingGame.score());
  }

}
