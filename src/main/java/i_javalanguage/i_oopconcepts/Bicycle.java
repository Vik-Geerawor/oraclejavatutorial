package i_javalanguage.i_oopconcepts;

public interface Bicycle {
    /* behaviours only */
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
