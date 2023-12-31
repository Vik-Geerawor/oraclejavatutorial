package i_javalanguage.iii_classesandobjects;

public class AnonymousClass {
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        // inner class which is implementing an interface
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        // not an anonymous class
        HelloWorld englishGreeting = new EnglishGreeting();

        // anonymous class
        HelloWorld frenchGreeting = new HelloWorld() {
            // implementation of the interface
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        // anonymous class
        HelloWorld spanishGreeting = new HelloWorld() {
            // implementation of the interface
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        AnonymousClass myApp = new AnonymousClass();
        myApp.sayHello();
    }

}
