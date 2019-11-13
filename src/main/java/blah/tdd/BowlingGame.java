package blah.tdd;

import java.util.Arrays;
import java.util.List;

public class BowlingGame {
  int runningTotal = 0;
  List<String> frameScoreStrings;
  public BowlingGame() {
  }
  public BowlingGame(final String scoreString) {
    frameScoreStrings = parseScoreStringIntoListOfStrings(scoreString);
  }
  public int calculateScore() {
    return 0;
  }
  private List<String> parseScoreStringIntoListOfStrings(String scoreString) {
    List<String> listFrameData = Arrays.asList(scoreString.split("-"));
    return listFrameData;
  }
  public List<String> getFrameScoreStrings() {
    return frameScoreStrings;
  }
  public void addOpenFrame(int firstThrow, int secondThrow) {
    
  }

}
