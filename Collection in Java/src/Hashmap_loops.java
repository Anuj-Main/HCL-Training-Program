import java.util.HashMap;
public class Hashmap_loops {
    public static void main(String args[]){
        HashMap<String, String> names=new HashMap<String, String>();
        names.put("Joe", "Biden");
        names.put("John", "Macllen");
        names.put("Travis", "Scott");
        names.put("Larry", "Page");
        names.put("Elon", "Musk");
        names.put("Tim", "Cook");
        names.put("Bill", "Gates");
        for(String k:names.keySet()){
            System.out.println(k);
        }
        for(String v:names.values()){
            System.out.println(v);
        }
        for(String k:names.keySet()){
            System.out.println(k+names.get(k));
            System.out.println("Key: "+k+ "Values: "+names.get(k));
        }
    }
}
