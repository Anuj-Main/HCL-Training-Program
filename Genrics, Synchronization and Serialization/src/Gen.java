import java.util.ArrayList;
import java.util.Iterator;
public class Gen{
    public static void main(String args[]){
        ArrayList<String> gl =new ArrayList<String>();
        gl.add("Hi");
        gl.add("How");
        gl.add("are");
        gl.add("you");
        String s=gl.get(2);
        System.out.println("Array: "+s);
        Iterator<String> itr=gl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}