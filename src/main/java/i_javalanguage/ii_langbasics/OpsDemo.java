package i_javalanguage.ii_langbasics;

public class OpsDemo {
    public static void main(String[] args) {
//        int i = 2;
//        System.out.println("i = " + i);
//        System.out.println("after ++i, i = " + ++i);
//        System.out.println("after i++, i = " + i++);
//        System.out.println("finally i = " + i);

        // instanceof
//        Parent prnt = new Parent();
//        Child chd = new Child();
//
//        System.out.println("prnt instanceof Parent: " + (prnt instanceof Parent));
//        System.out.println("prnt instanceof Child: " + (prnt instanceof Child));
//        System.out.println("prnt instanceof MyInterface: " + (prnt instanceof MyInterface));
//
//        System.out.println("chd instanceof Parent: " + (chd instanceof Parent));
//        System.out.println("chd instanceof Child: " + (chd instanceof Child));
//        System.out.println("chd instanceof MyInterface: " + (chd instanceof MyInterface));

        // Ex
//        int i = 10;
//        int n = ++i%5;
//        System.out.println(n);  // 1

        int r = 1 + 2;
        System.out.println(r);
        r -= 1;
        System.out.println(r);
        r *= 2;
        System.out.println(r);
        r /= 2;
        System.out.println(r);
        r += 8;
        System.out.println(r);
        r %= 7;
        System.out.println(r);

    }
}

class Parent {}
interface MyInterface {}
class Child extends Parent implements MyInterface {}

