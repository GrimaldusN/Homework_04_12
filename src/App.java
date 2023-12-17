import java.util.*;

public class App {
    public static void main(String[] args){
        HashMap<String, String> key = new HashMap<>();
        key.put("Hello1", "Privet");
        key.put("Hello2", "Prit");
        key.put("Hello3", "Pvet");
        key.put("Hello4", "vet");
        key.put("Hello5", "Prit");
        List<String> list = new LinkedList<>();
        HashMap<String,Integer> c = new HashMap<>();
        c.put("1", 1);
        c.put("2", 5);
        c.put("3", 3);
        c.put("4", 2);
        HashMap<Integer, Integer> d = new HashMap<>();
        d.put(152, 321);
        d.put(24, 26);
        d.put(36, 84);
        list.add("Hello World");
        list.add("Hello Wod");
        list.add("Herld");
        HashMap<Integer, List<String>> y = new HashMap<>();
        pairOfReverse(key);
        strInt(c);

        int sum = 0;

        for (Map.Entry<String, String> e : key.entrySet()) {

            if (e.getKey().length()==e.getValue().length()){
                System.out.println(e);
            }

        }

        for (Map.Entry<String, Integer> e : c.entrySet()) {
            if (e.getKey().startsWith("H")){
                sum += e.getValue();
                System.out.println(sum++);
            }

        }

//        for (Map.Entry<Integer, List<String>> e : y.entrySet()){
//            if (e.getValue())
//        }

        var maxValue = d.entrySet().stream().max(Map.Entry.comparingByKey());
        System.out.println(maxValue);


    }

    public static boolean pairOfReverse(HashMap<String, String> e){

        for (Map.Entry<String, String> w: e.entrySet()) {
            StringBuilder a = new StringBuilder(w.getValue());
            if (w.getKey().equals(a.reverse())){
                return true;
            }
        }
        return false;
    }

    public static void strInt(HashMap<String,Integer> e){
        for (Map.Entry<String, Integer> w: e.entrySet()) {
            w.getValue().equals(w.getValue()*2);
            w.getValue().toString();
            System.out.println(w);
        }
    }
}
