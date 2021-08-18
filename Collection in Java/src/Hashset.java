import java.util.HashSet;
public class Hashset{
    public static void main(String args[]){
        HashSet<String> set=new HashSet<String>();
        set.add("BMW");
        set.add("Volvo");
        set.add("Chevrolet");
        set.add("Mercedes");
        set.add("Ferrari");
        System.out.println(set);
        System.out.println(set.contains("Ferrari"));
    }    
}
