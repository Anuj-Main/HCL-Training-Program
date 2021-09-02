import java.util.Scanner;
public class LinearSearch {
    private static Scanner in;
    public static void main(String[] args) {
        int linear, a, i;
        int []inputArray=new int[100];
        in=new Scanner(System.in);
        System.out.println("Enter The list of Numbers: ");
        linear=in.nextInt();
        System.out.println("Enter "+linear+" Numbers ");
        for(i=0;i<linear;i++){
            inputArray[i]=in.nextInt();
        }
        System.out.println("Linear Search: ");
        a=in.nextInt();
        for(i=0;i<linear;i++){
            if(a==inputArray[i]){
                System.out.println(a+" This is what you looking for. ");
                break;
            }
        }
        if(i==linear){
            System.out.println(a+"  This Number is not in Number of list. ");
        }
    }
}
