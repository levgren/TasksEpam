package hashMapTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTask {

    public static void main(String[] args) {

        String myString = "Akuna matata!";

        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("A", 1);
        hashMap.put("k", 1);
        hashMap.put("u", 1);
        hashMap.put("n", 1);
        hashMap.put("a", 4);
        hashMap.put(" ", 1);
        hashMap.put("m", 1);
        hashMap.put("t", 2);
        hashMap.put("!", 1);

        String numberOfChar = hashMap.get("a").toString();
        System.out.println("quantity of chars = " + numberOfChar);

        Set<String> keys = hashMap.keySet();
        for (String key : keys){
            System.out.println(key + " ");
            new ArrayList<Integer>().stream().map(x->x.toString());
        }
        Comparable c = x -> (int) x + 1;

    }
}
