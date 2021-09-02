import java.util.*;
public class MergeSort{
    public static void main(String[] args) {
        Integer[] a = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
    @SuppressWarnings("rawtypes")
    public static Comparable[] mergeSort(Comparable[] list) {
        if (list.length <= 1) {
            return list;
        }
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        mergeSort(first);
        mergeSort(second);
        merge(first, second, list);
        return list;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
        int First1=0;
        int Second2=0;
        int Merged=0;
        while (First1 < first.length && Second2 < second.length) {
            if (first[First1].compareTo(second[Second2]) < 0) {
                result[Merged] = first[First1];
                First1++;
            } else {
                result[Merged] = second[Second2];
                Second2++;
            }
            Merged++;
        }
        System.arraycopy(first, First1, result, Merged, first.length - First1);
        System.arraycopy(second, Second2, result, Merged, second.length - Second2);
    }
}