package Map;

public class Main {

    public static void main(String[] args) {
        LegitMap<Integer, String> map = new LegitMap<>();

        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map);
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Removed value for key 2: " + map.remove(2));
        System.out.println(map);
        

    }
}
