package blah.tdd;

import java.util.Arrays;
import java.util.List;

public class BowlingGame {
  public enum FrameType {
    OPEN,
    SPARE,
    STRIKE,
  }
  int score = 0;
  FrameType lastFrameType = FrameType.OPEN;
  FrameType previousToLastFrameType = FrameType.OPEN;
  List<String> frameScoreStrings;
  public BowlingGame() {
  }
  public BowlingGame(final String scoreString) {
    frameScoreStrings = parseScoreStringIntoListOfStrings(scoreString);
  }
  public int score() {
    return score;
  }
  private List<String> parseScoreStringIntoListOfStrings(String scoreString) {
    List<String> listFrameData = Arrays.asList(scoreString.split("-"));
    return listFrameData;
  }
  public List<String> getFrameScoreStrings() {
    return frameScoreStrings;
  }
  public void addOpenFrame(int firstThrow, int secondThrow) {
    score += firstThrow;
    score += secondThrow;
  }
  public void addFinalFrame(int firstThrow, int secondThrow, int thirdThrow) {
    if(lastFrameType == FrameType.STRIKE) {
      if(previousToLastFrameType == FrameType.STRIKE) {
        score += firstThrow;
      }
      score += firstThrow + secondThrow;
    }
    if(lastFrameType == FrameType.SPARE) {
      score += firstThrow;
    }
    score += firstThrow;
    score += secondThrow;
    score += thirdThrow;
  }
  public void addSpare(int firstThrow) {
    if(lastFrameType == FrameType.SPARE) {
      score += firstThrow;
    }
    score += firstThrow;
    score += (10 - firstThrow);
    lastFrameType = FrameType.SPARE;
  }

  public void addStrike() {
    if(lastFrameType == FrameType.STRIKE) {
      if(previousToLastFrameType == FrameType.STRIKE) {
        score += 10;
      }
      score += 10;
    }
    score += 10;
    previousToLastFrameType = lastFrameType;
    lastFrameType = FrameType.STRIKE;
  }
}
