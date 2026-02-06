public class Person implements Entity {
  public String name;
  public int attractiveness;
  
  public Person(String _name, int _attractiveness) {
    name = _name;
    attractiveness = _attractiveness;
  }

  @Override
  public void interact() {
    if(attractiveness > 5) {
      System.out.println("hi im someone who would traditionally be considered pretty attractive. Date me?");
    } else {
      System.out.println("hi im a lame single loser.");
    }
    if(attractiveness <= 0) {
      System.out.println("unless a mericle happens, its probably going to stay this way.");
    }
  }

  @Override
  public void update() {
    if(attractiveness > 5) {
      attractiveness++; // the gap only gets bigger, huh?
    }
  }
}
