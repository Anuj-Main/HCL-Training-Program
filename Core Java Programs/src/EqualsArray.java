import java.util.Arrays;

public class EqualsArray{
    public static void main(String[] args) {
        int array1[]={12, 23, 34, 35, 55};
        int array2[]={21, 34, 6, 46, 11};
        boolean equals=Arrays.equals(array1, array2);
        System.out.println("These arrays are same: "+equals);
    }
}