package i_javalanguage.vii_generics;

public class OrderedPairDemo {
    public static void main(String[] args) {
        OrderedPair<String, Double> myKeyValue = new OrderedPair<>("hello", 1.01);
        System.out.println("Key: " + myKeyValue.getKey() + ", Value: " + myKeyValue.getValue());

        // array of 5 OrderedPair
        OrderedPair<String, Double>[] index = new OrderedPair[5];

        index[0] = new OrderedPair("Milk", 1.5);
        index[1] = new OrderedPair("Milk", 1.5);
        index[2] = new OrderedPair("Banana", 5);
//        index[3] = new OrderedPair(1, 9.2);         // runtime error
        index[4] = new OrderedPair("Eggs", 8.8);

        for (int i = 0; i < index.length; i++) {
            if (index[i] == null) {
                continue;
            }
            System.out.println("Key:" + index[i].getKey() + ", Value:" + index[i].getValue());
        }

        boolean same = Util.compare(index[0], index[1]);
        System.out.println("The first and second items are equal? " + same);
    }
}
