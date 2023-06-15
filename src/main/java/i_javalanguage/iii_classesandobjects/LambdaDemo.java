package i_javalanguage.iii_classesandobjects;

import java.util.function.Consumer;

public class LambdaDemo {
    // a functional interface which performs a math op
    interface IntegerMath {
        int operation(int a, int b);
    }

    // invokes the method in the functional interface
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        LambdaDemo myApp = new LambdaDemo();

        // 2 implementations of the function interface
        // the name is an object of an anonymous class which implements
        // functional interface
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (x, y)-> x - y;

        int ans1 = myApp.operateBinary(40, 1, addition);
        int ans2 = myApp.operateBinary(20, 10, subtraction);

        System.out.println("40 + 2 = " + ans1);
        System.out.println("20 - 10 = " + ans2);
    }
}

class LambdaScopeTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {

            int z = 2;

            Consumer<Integer> myConsumer = (y) ->
            {
                // The following statement causes the compiler to generate
                // the error "Local variable z defined in an enclosing scope
                // must be final or effectively final"
                //
                // z = 99;

                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScopeTest.this.x = " +
                        LambdaScopeTest.this.x);
            };

            myConsumer.accept(x);

        }
    }

    public static void main(String... args) {
        LambdaScopeTest st = new LambdaScopeTest();
        LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
