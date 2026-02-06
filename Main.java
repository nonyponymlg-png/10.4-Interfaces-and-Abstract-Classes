public class Main {
    public static void main(String[] args) {
      Dog myDog = new Dog("Clam", 1498134);
      Cat myCat = new Cat("Frank", 323570);
      Person myFriend = new Person("Aiden", 323570);
      Person myBFF = new Person("Eli", 0);
      myDog.interact();
      myDog.sound();
      System.out.println();
      myCat.interact();
      myCat.sound();
      System.out.println();
      myFriend.interact();
      System.out.println();
      myBFF.interact();
      
    }
}
