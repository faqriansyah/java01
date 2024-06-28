package classes;

import java.util.HashMap;

class Key {
    private String Key;

    public Key(String key) {
        this.Key = key;
    }

    @Override
    public boolean equals(Object obj) {{
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Key key1 = (Key) obj;
        return Key != null ?  Key.equals(key1.Key) : key1.Key == null;
    }} 

    @Override
    public int hashCode() {
        return Key != null ? Key.hashCode() : 0;
    }
}

public class KeyMap {
    public static void main(String[] args) {
        HashMap<Key, Integer> map = new HashMap<>();
        map.put(new Key("Eko"), 19);
        map.put(new Key("Alam"), 23);
        map.put(new Key("Fikri"), 25);
        map.put(new Key("Asmi"), 51);

        Integer nilaiEko = map.get(new Key("Eko"));

        if(nilaiEko != null) {
            System.out.println("Nilai kunci " + nilaiEko);
        } else {
            System.out.println("Nilai kunci " + nilaiEko);
        }
    }
}