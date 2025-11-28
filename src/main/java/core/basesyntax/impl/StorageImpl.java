package core.basesyntax.impl;

import core.basesyntax.Storage;

public class StorageImpl<K, V> implements Storage<K, V> {
    private final CustomStorage<K, V> db = new CustomStorage<>();

    @Override
    public void put(K key, V value) {
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
