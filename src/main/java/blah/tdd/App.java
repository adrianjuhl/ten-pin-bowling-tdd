package blah.tdd;

/**
 * Hello world!
 *
 */
public class App {

  public static void main( String[] args ) {
    App a = new App();
    System.out.println(a.getGreeting());
  }

  public String getGreeting() {
    return "Hello World!";
  }

  public static class BowlRoll {
    private int numberOfPinsKnockedDown;
    public BowlRoll(final int numberOfPinsKnockedDown) {
      this.numberOfPinsKnockedDown = numberOfPinsKnockedDown;
    }
    public int getNumberOfPinsKnockedDown() {
      return numberOfPinsKnockedDown;
    }
  }

}
