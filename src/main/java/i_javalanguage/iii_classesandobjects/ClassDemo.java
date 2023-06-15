package i_javalanguage.iii_classesandobjects;

public class ClassDemo {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();
        System.out.println(Bicycle.getNumberOfBicycles());
        Bicycle myBike2 = new Bicycle();
        System.out.println(Bicycle.getNumberOfBicycles());
    }
}

class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    // add an instance variable for the object ID
    private int id;

    // add a class variable for the
    // number of Bicycle objects instantiated
    private static int numberOfBicycles = 0;

    public void Bicycle() {
        numberOfBicycles++;
    }

    // a class method
    // returns the valure of a class variable
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

}
