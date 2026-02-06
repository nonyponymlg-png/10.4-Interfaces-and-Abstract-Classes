public class Cat extends Pet {
  public Cat(String n, int l) {
    super(n,l);
  }

  @Override
  public void sound() {
    System.out.println("Meoowww!");
  }
}
