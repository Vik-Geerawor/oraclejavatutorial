package i_javalanguage.ii_langbasics;

/**
 * Inner class example
 */

public class DataStructure {
    // create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill array with integers
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    // inner class implement DataStructureIterator

    private class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            // check if the current element is the last in the array
            return (nextIndex <= SIZE -1);
        }

        public Integer next() {
            // record the value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
