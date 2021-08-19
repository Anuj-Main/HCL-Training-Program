public class MultryExcept {
    public static void main(String args[]){
        int a[]=new int[5];
        try {
            System.out.println("4th Value in a: "+ a[7]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("1st Exception is Handled"+e);
        }finally{
            a[0]=5;
            System.out.println("1st Value in a: "+a[0]);
            System.out.println("Finally is Worked");
        }
    }
}
