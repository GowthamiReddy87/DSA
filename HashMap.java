import java.util.*;

public class HashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Apple");
        map.put(2,"Mango");
        map.put(3,"Orange");

        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}