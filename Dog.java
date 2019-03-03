public class Dog extends Animal {

  public Dog(String dogName, int numLegs) {
    name = dogName;
    this.numLegs = numLegs;
  }

  public String toString() {
    return name + " - " + numLegs;
  }
}
