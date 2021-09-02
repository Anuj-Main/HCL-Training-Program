import java.util.Scanner;
import java.util.InputMismatchException;
public class MultiEmployeId {
    private static Scanner sc;

    public static void main(String[] args) throws InputMismatchException{
        sc = new Scanner(System.in);
        System.out.println("Enter How much Entries do you want to Enter? ");
        int arr[]=new int[sc.nextInt()];
        sc.nextInt();
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("It's Stored these Employees Id: ");
        for(int a:arr){
            System.out.println(a);
        }
    }
}
