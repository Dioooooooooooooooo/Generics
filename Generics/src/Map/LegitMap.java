package Map;

import java.util.ArrayList;

public class LegitMap <K, V>{
    private ArrayList <K> keys;
    private ArrayList <V> values;

    public LegitMap(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V val){
        int i = keys.indexOf(key);
        if(i == -1){
            keys.add(key);
            values.add(val);
        }else {
            values.set(i, val);
        }
    }

    public V get(K key){
        int i = keys.indexOf(key);
        if(i == -1){
            return null;
        }
        return values.get(i);
    }

    public V remove(K key){
        int i = keys.indexOf(key);
        if(i == -1){
            return null;
        }
        V rmv = values.remove(i);
        keys.remove(i);
        return rmv;
    }


    @Override
    public String toString() {
        return "Map is \nKeys = " + keys +"\nValues = " + values ;
    }
}
