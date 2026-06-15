
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        
        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>(); // it is Obsolete Collection, however it used with when we have multiple thread , so to make it all process should work in a cuncurrent way , we use Synchronize with it.
        students.put("Danish", 90);
        students.put("Nawaz" , 90);
        students.put("Liaqat", 99);

        // System.out.println(students);
        // System.out.println(students.get("Liaqat"));
        System.out.println(students.keySet());
        for(String key:students.keySet()){
            System.out.println(key + ":" + students.get(key));
        }
    }
}
