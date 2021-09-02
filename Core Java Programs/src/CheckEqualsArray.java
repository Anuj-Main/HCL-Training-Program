import java.util.Arrays;
import java.util.Scanner;
public class CheckEqualsArray{
    private static Scanner sc;
    private static Scanner scan;
    public static void main(String[] args){
        int a;
        int [] inputArray1st=new int[100];
        int[] inputArray2nd = new int[100];
        sc=new Scanner(System.in);
        System.out.println("Enter 1st Array");
        a=sc.nextInt();
        for(int i=0; i<a;i++){
            inputArray1st[i]= sc.nextInt();
        }
        scan=new Scanner(System.in);
        System.out.print("Enter 2nd Array");
        for(int i=0;i<a;i++){
            inputArray2nd[i] = scan.nextInt();
        }
        if(Arrays.equals(inputArray1st, inputArray2nd)){
            System.out.print("Both the Array are Same.");
        }
        else{
            System.out.print("Both the Array are Different.");
        }
    }
}