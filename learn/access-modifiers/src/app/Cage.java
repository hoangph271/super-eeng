package app;

public class Cage {
  private Duck leaderDuck = new Duck();

  public void feedTheDucks(float foodLevel) {
    // The greedy leaderDuck eat all the food
    leaderDuck.foodLevel += foodLevel;
    // And doesn't give other ducks anything...! :"{
  }
}
