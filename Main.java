import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> m=new HashMap<>(5);
       
        
        m.put(5, 5);
        m.remove(5);
        System.out.println(m.size());
        System.out.println(m.get(5));

    }
}
