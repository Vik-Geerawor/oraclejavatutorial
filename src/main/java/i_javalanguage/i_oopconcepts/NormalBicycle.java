package i_javalanguage.i_oopconcepts;

public class NormalBicycle implements Bicycle {
    /* state */
    int cadence = 0;        // pedaling speed
    int speed = 0;          // bicycle speed
    int gear = 1;           // current gear

    /**         behaviours
     * this class implements an interface
     * so each method must be implemented
     * so that this class can compile
     */
    // change in the pedaling speed
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    // current gear
    public void changeGear(int newValue) {
        gear = newValue;
    }

    // bicycle speed
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // pressing the hand brakes
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    // displays the current state of the object in the console
    public void printStates() {
        System.out.println("Cadence: " + cadence);
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }

}

