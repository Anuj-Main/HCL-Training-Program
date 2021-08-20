import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class GenHash{
    public static void main(String args[]){
        HashMap<String, Integer> gh=new HashMap<String, Integer>();
        gh.put("Verna", 1000000);
        gh.put("City", 1100000);
        gh.put("Amaze", 680000);
        gh.put("Swift", 600000);
        gh.put("XUV 300", 800000);  
        Set<Map.Entry<String, Integer>> set=gh.entrySet();  
        Iterator<Map.Entry<String, Integer>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry<String, Integer>me=itr.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }    
    }
}
