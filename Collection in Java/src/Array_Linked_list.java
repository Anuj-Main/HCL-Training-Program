import java.util.ArrayList;
import java.util.LinkedList;
public class Array_Linked_list{
    public static void main(String args[]){
        System.out.println("Luxury Car Company List: ");
        System.out.println("Sports Car Company List: ");
        ArrayList<String> Luxury=new ArrayList<String>();
        LinkedList<String> Sports = new LinkedList<String>();
        Luxury.remove("Rolls Royce");
        Luxury.add("BMW");
        Luxury.add("Volvo");
        Luxury.add("Chevrolet");
        Luxury.add("Mercedes");
        Sports.add("Ferrari");
        Sports.add("Aqua");
        Sports.add("Lamborghini");
        Sports.addFirst("Bugatti");
        Sports.addLast("Aston Martin");
        System.out.println(Luxury);
        System.out.println(Sports);
        System.out.println(Sports.getFirst()+'\n'+Sports.getLast());
    }
}
