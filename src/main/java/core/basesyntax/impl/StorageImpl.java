package core.basesyntax.impl;

import core.basesyntax.Storage;
import java.util.HashMap;

public class StorageImpl<K, V> implements Storage<K, V> {
    private static final int MAX_STORAGE_CAPACITY = 10;

    private final HashMap<K, V> db = new HashMap<>();

    @Override
    public void put(K key, V value) {
        if (db.size() >= MAX_STORAGE_CAPACITY && !db.containsKey(key)) {
            throw new RuntimeException("Storage is full");
        }
        db.put(key, value);
    }

    @Override
    public V get(K key) {
        return db.get(key);
    }

    @Override
    public int size() {
        return db.size();
    }
}
