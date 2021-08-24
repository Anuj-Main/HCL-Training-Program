import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Sorting {
    String numbers;
    Sorting(String numbers){
        this.numbers=numbers;
    }
}
class Sorting1 implements Comparator<Sorting>{
    public int compare(Sorting a, Sorting b){
        return a.numbers.compareTo(b.numbers);
    }
}
class TestSort{
    public static void main(String[] args) {
        ArrayList<Sorting> al=new ArrayList<>();
        al.add(new Sorting1("86"));
        al.add(new Sorting2("24"));
        al.add(new Sorting3("18"));
        al.add(new Sorting4("55"));
        al.add(new Sorting5("34")); 
        Collection.sort(Sorting, new Sorting1()); 
        System.out.println("Sorting in Ascending Order: "); 
        for(Sorting s: al){
            System.out.println(s.numbers);
        }
    }
}
