public abstract class Pet implements Entity {
  protected String name;
  protected int life;
  
  public Pet(String _name, int _life) {
    name = _name;
    life = _life;
  }
  
  @Override
  void interact() {
    System.out.println("Hi master!");
  }

  @Override
  void update() {
    life--;
  }

  public abstract void sound();
}
