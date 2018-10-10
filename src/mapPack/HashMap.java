package mapPack;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> implements Map<K, V> {

    private int size;
    private static int BUCKET_SIZE = 3;
    private List<Entry<K, V>>[] buckets = (List<Entry<K, V>>[]) new ArrayList[BUCKET_SIZE];

    public HashMap() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    @Override
    public V put(K key, V value) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = buckets[index];
        Entry<K, V> newEntry;
        for (int i = 0; i < bucket.size(); i++) {
            Entry<K, V> entry = bucket.get(i);
            if (entry.key.equals(key)) {
                V oldValue = entry.value;
                entry.value = value;
                return oldValue;
            }
        }
        newEntry = new Entry<K, V>(key, value);
        bucket.add(newEntry);
        size++;
        return null;
    }

    @Override
    public V putIfAbsent(K key, V value) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = buckets[index];
        Entry<K, V> newEntry;
        for (int i = 0; i < bucket.size(); i++) {
            Entry<K, V> entry = bucket.get(i);
            if (entry.key.equals(key)) {
                return null;
            }
        }
        newEntry = new Entry<K, V>(key, value);
        bucket.add(newEntry);
        size++;
        //TODO check this вернуть текущее значение
        return newEntry.value;
    }

    @Override
    public V get(K key) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }


    public int getIndex(K key) {
        int index = Math.abs(key.hashCode()) % buckets.length;
        return index;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Entry<?, ?> entry = (Entry<?, ?>) o;

            return key != null ? key.equals(entry.key) : entry.key == null;

        }

        @Override
        public int hashCode() {
            return key != null ? key.hashCode() : 0;
        }
    }


}
