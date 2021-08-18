import java.util.HashSet;
public class Hashset_loop_int{
    public static void main(String[] args){
        HashSet<Integer> check=new HashSet<Integer>();
        check.add(10);
        check.add(21);
        check.add(11);
        check.add(2);
        check.add(8);
        check.add(25);
        check.add(19);
        for(int i=1; i<=25; i++){
            if(check.add(i)){
                System.out.println(i+"This Number is in the Set");
            }
            else{
                System.out.println(i+"This number is not in the Set");
            }
        }
    }
}
