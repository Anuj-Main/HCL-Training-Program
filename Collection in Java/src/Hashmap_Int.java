import java.util.HashMap;
public class Hashmap_Int{
    public static void main(String args[]){
        HashMap<String, Integer> details=new HashMap<String, Integer>();
        details.put("Elon Musk", 200000);
        details.put("Joe Biden", 34050);
        details.put("Larry Page", 205000);
        details.put("Joe Mac", 20400);
        details.put("Caroline", 204900);
        details.put("Elijah Mikelson", 68800);
        details.put("Kristen Mikelson", 20000);
        for(String d: details.keySet()){
            System.out.print("Name: "+d+"Salary: "+details.get(d));
        }
    }
}
