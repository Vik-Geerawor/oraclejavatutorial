package i_javalanguage.vii_generics;

/**
 * Generic Type with Bounded Parameter Type
 * @param <K> Parameter Type restricted to a string
 * @param <V> Parameter Type restricted to a double
 */
public class OrderedPair<K extends String, V extends Number> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }


}
