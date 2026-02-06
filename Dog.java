public class Dog extends Pet {
  public Dog(String n, int l) {
    super(n, l);
  }

  @Override
  public void sound() {
    System.out.println("Woof!");
  }
}
