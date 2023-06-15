package i_javalanguage.v_interface;

public class CharSequenceDemo implements CharSequence {
    private String myString;

    public CharSequenceDemo(String myString) {
        this.myString = myString;
    }

    @Override
    public int length() {
        return myString.length();
    }

    @Override
    public char charAt(int index) {
        return this.myString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.myString.subSequence(start, end);
    }

    public static void main(String[] args) {
        CharSequenceDemo myString = new CharSequenceDemo("Hello world");
        System.out.println("Length: " + myString.length());
        System.out.println("Char at index 3: " + myString.charAt(3));
        System.out.println("Sub string - index 3 - 6: " + myString.subSequence(3, 6));

    }
}
