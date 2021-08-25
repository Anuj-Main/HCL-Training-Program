public class BubbleSort{
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int a=0;
        for (int i=0; i<n; i++) {
            for (int j=1; j<(n-i); j++){
                if (arr[j-1]>arr[j]) {
                    a=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=a;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {10, 450, 345, 122, 45, 320, 51, 45, 65, 99, 76, 34, 88};
        System.out.println("This is the given Array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("This is the Sorted Array: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}