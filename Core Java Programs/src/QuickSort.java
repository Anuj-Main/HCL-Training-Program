public class QuickSort{
    public int partition(int arr[], int left, int right){
        int pivot=arr[left];
        int i=left;
        for(int j=left+1; j<=right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i, left);
        return i;
    }
    public void quicksort(int arr[], int mini, int maxi) {
        if (mini<maxi) {
            int p=partition(arr, mini, maxi);
            quicksort(arr, mini, p-1);
            quicksort(arr, p+1, maxi);
        }
    }
    public void swap(int arr[], int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String args[]){
        int arr[]={23, 45, 34, 74, 33, 12, 61, 39, 29, 49};
        QuickSort qs=new QuickSort();
        System.out.print("This is element of Array Before Sorting: ");
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
        qs.quicksort(arr,0,9);
        System.out.print("This is element of Array after Sorting by Quicksort: ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
