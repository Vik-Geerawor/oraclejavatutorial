package i_javalanguage.v_interface;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat kitty = new Cat();
        Animal myAnimal = kitty;

        System.out.println("myAnimal instanceof Cat: " + (myAnimal instanceof Cat));    // true

        kitty.testInstanceMethod();
        myAnimal.testInstanceMethod();      //TODO: myAnimal holds a cat obj

        kitty.testClassMethod();            //TODO: Cat.testClassMethod is actually invoked
        myAnimal.testClassMethod();         //TODO: Animal.testCalssMethod is actually invoked

    }
}
