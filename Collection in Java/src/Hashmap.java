import java.util.HashMap;
public class Hashmap{
    public static void main(String args[]){
        HashMap<String, String> names=new HashMap<String, String>();
        names.put("Joe", "Biden");
        names.put("John", "Macllen");
        names.put("Travis", "Scott");
        names.put("Larry", "Page");
        names.put("Elon", "Musk");
        names.put("Tim", "Cook");
        names.put("Bill", "Gates");
        System.out.println(names);
        System.out.println(names.get("Elon"));
        System.out.println(names.remove("John"));
        System.out.println(names);
        System.out.println(names.size());
    }
}