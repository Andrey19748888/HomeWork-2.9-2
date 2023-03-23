import java.util.LinkedHashMap;
import java.util.Map;

public class MainOrdered {

    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();        // сохраняет порядок добавления

        map.put(3,"a");
        map.put(8,"z");
        map.put(4,"r");
        map.put(1,"m");

        System.out.println(map);

        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

    }
}
