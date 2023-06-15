package i_javalanguage.iii_classesandobjects;

public class OuterClass {
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    class InnerClass {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    /**
     * Behaves like another top level class
     * can access members of outer class only via its object
     */
    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();      // instantiate outer class
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();   // instantiate inner class
        innerObject.accessMembers();                    // access outer members

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);

        System.out.println("\nShadow Test");
        System.out.println("--------------------");
        ShadowClass sc = new ShadowClass();
        ShadowClass.FirstLevel f1 = sc.new FirstLevel();
        f1.methodInFirstLevel(23);

    }
}

class TopLevelClass {
    void accessMembers(OuterClass outer) {
        // Compiler error: Cannot make a static reference to the non-static
        //     field OuterClass.outerField
        // System.out.println(OuterClass.outerField);
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}

class ShadowClass {
    public int x = 0;

    class FirstLevel {
        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);             // refers to the parameter
            System.out.println("this.x = " + this.x);   // refers to the inner class member
            System.out.println("ShadowClass.this.x = " + ShadowClass.this.x);   // refers to outerclass member
        }
    }
}



