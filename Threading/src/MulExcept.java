public class MulExcept {
    public static void main(String args[]){
        try {
            int a[]={1,2,3,4,5};
            a[5]=5/0;
        } catch (Exception e) {
            System.out.println("1st Exception is Handled");
        }finally{
            System.out.println("All Exception are Handled by Try and Catch ");
        }
    }
}
