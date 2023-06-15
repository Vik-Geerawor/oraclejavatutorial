package i_javalanguage.ii_langbasics;

public class ArrayDemo {
    public static void main(String[] args) {

        // Arrays
        int[] myIntArray = new int[10];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = 100 * (i + 1);
        }

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Value at index " + i + " = " + myIntArray[i]);
        }


        // Multidimensional Arrays
//        int[][] myMultiArray = new int[3][5];
//
//        System.out.println("multi array length = " + myMultiArray.length);
//
//
//        for (int i = 0; i < myMultiArray.length; i++) {
//            for (int j = 0; j < myMultiArray[i].length; j++){
//                myMultiArray[i][j] = i + j;
//            }
//        }
//
//        for (int i = 0; i < myMultiArray.length; i++) {
//            for (int j = 0; j < myMultiArray[i].length; j++){
////                System.out.println("Index [" + i + "][" + j + "] = " + myMultiArray[i][j]);
//                System.out.print("[" + i + "][" + j + "] = " + myMultiArray[i][j] + ", ");
//            }
//            System.out.println("");
//        }

        // Copying Arrays
        /**
         * "from" parameter is the initial index inclusive
         * "to" parameter is the final index EXCLUSIVE
         */
        int[] myIntArrayCopy = java.util.Arrays.copyOfRange(myIntArray,2, 7);
        for (int i = 0; i < myIntArrayCopy.length; i++) {
            System.out.println(myIntArrayCopy[i]);
        }

    }
}
