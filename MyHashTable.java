import java.util.ArrayList;
import java.util.List;


public class MyHashTable<K, V> {
    // Node<K, V>[] data;
    ArrayList<ArrayList<Node<K, V>>> data;
    MyHashTable(int size) {
        this.data = new ArrayList<>(size);
        
    }

    private int hash(K key) {
        String k = key.toString();
        int hash = 0;
        for (int i = 0; i < k.length(); i++) {
            hash = (hash + k.charAt(i) * i) % this.data.size();
        }
        return hash;
    }

    public void set(K key, V value) {
        int addres = hash(key);
        if (this.data.get(addres) == null) {
            this.data.add(addres, new ArrayList<>());
        }
        this.data.get(addres).add(new Node<K, V>(key, value));

    }

    public V get(K key) {
        int address = hash(key);
        V value = null;
        var dataRecord = this.data.get(address);
        for (int i = 0; i < dataRecord.size(); i++) {
            if (dataRecord.get(i).getKey().equals(key)) {
                value = dataRecord.get(i).getValue();
            }
        }
        return value;
    }

    public List<K> keys() {
        List<K> keys = new ArrayList<>();

        return keys;
    }
}

class Node<K, V> {
    private K key;
    private V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
