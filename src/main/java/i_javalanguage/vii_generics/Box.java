package i_javalanguage.vii_generics;

public class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public Object get() {
        return this.t;
    }

    /**
     * Bounded Type Parameters in Methods
     * @param u is a variable of the type parameter
     * @param <U> is a bounded type parameter
     */
    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}
