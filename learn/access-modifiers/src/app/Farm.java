package app;

public class Farm {
  public void dailyFeeding() {
    Cage cage = new Cage();

    // Can't be accessed, this line below cause errors
    // cage.leaderDuck; // <- Errors
    // Because leaderDuck is a private attribue of 'A Cage'

    // This method can be accessed, and you don't know what is does
    // but it can be accessed
    cage.feedTheDucks((float) 10.0);
    // Because feedTheDucks is a public method of 'A Cage'
  }
}