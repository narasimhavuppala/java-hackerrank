package com.company.datastructures.z_pluralsight.hash;

public class BasicHashTable<X, Y> {
    private HashEntry[] data;
    private int capacity;
    private int size;

    public BasicHashTable(int tableSize) {
        this.capacity = tableSize;
        this.data = new HashEntry[this.capacity];
        this.size = 0;
    }

    public Y get(X key){
        int hash = calculateHash(key);

        if(data[hash] == null) {
            return null;
        } else {
            return (Y) data[hash].getValue();
        }
    }

    public void put(X key, Y value) {
        int hash = calculateHash(key);
        data[hash] = new HashEntry<X, Y>(key, value);
        size++;
    }

    public Y delete(X key) {
        Y value = get(key);

        if(value != null) {
            int hash = calculateHash(key);
            data[hash] = null;
            size--;
            hash = (hash + 1) % this.capacity;

            while(data[hash] != null) {
                HashEntry hashEntry = data[hash];
                data[hash] = null;
                put((X)hashEntry.getKey(), (Y)hashEntry.getValue());
                size--;
                hash = (hash + 1) % this.capacity;
            }
        }

        return value;
    }

    public boolean hasKey(X key){
        int hash = calculateHash(key);

        if(data[hash] == null) {
            return false;
        } else {
            if(data[hash].getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public boolean hasValue(Y key){
        for(int i = 0; i < this.capacity; i++) {
            HashEntry entry = data[i];

            if(entry != null && entry.getValue().equals(key)) {
                return true;
            }
        }

        return false;
    }

    private int calculateHash(X key) {
        int hash = (key.hashCode() % this.capacity);
        while(data[hash] != null && !data[hash].getKey().equals(key)) {
            hash = (hash + 1) % this.capacity;
        }
        return hash;
    }

    public int size() {
        return this.size;
    }

    private class HashEntry<X, Y> {
        private X key;
        private Y value;

        public HashEntry(X key, Y value) {
            this.key = key;
            this.value = value;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public void setValue(Y value) {
            this.value = value;
        }

        public X getKey() {
            return key;
        }

        public Y getValue() {
            return value;
        }
    }
}
