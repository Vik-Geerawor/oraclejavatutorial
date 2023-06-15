package i_javalanguage.vi_inheritance;

public class SubClass extends SuperClass {

    public SubClass() {
        // implicit super()
        System.out.println("SubClass constructor invoked");
    }

    // overrides printMethod in Superclass
    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }

    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();

        Class obj = s.getClass();
        System.out.println("class name: " + obj.getSimpleName());
        System.out.println("superclass name: " + obj.getSuperclass());
        System.out.println("interfaces: " + obj.getInterfaces());
    }
}
