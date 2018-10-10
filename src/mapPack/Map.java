package mapPack;

public interface Map<K, V> {
    V put(K key, V value);

    V putIfAbsent(K key, V value);

    V get(K key);

    int size();

    boolean containsKey(K key);
}