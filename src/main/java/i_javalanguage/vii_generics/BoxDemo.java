package i_javalanguage.vii_generics;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();

        integerBox.set(10);
        System.out.println(integerBox.get());

        integerBox.inspect(20.1);
    }
}
