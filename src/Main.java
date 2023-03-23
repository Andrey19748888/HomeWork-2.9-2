import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;




public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            map.put("str" + i, List.of(r.nextInt(1001),
                    r.nextInt(1001),
                    r.nextInt(1001)));
        }

        System.out.println(map);

        Map<String, Integer> sumMap = new HashMap<>();

        List<Integer> list;
        int sum;
        for (String key: map.keySet()) {
            list = map.get(key);
            sum = list.get(0) + list.get(1) + list.get(2);
            sumMap.put(key, sum);
        }


        System.out.println(sumMap);
    }



}