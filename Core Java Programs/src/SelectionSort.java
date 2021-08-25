import java.util.Scanner;
public class SelectionSort{
    public static void main(String args[]){
        int size, i, j, a;
        int arr[]=new int[50];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Array Size: ");
        size = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        for(i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Sorting Array using Selection Sort Technique..\n");
        for(i=0; i<size; i++){
            for (j=i+1; j<size; j++){
                if (arr[i]>arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        System.out.print("This is the Array After Sorting by Selection Sort :\n");
        for (i=0; i<size; i++) {
            System.out.print(arr[i]+ "  ");
        }
    }
}