public class ExceptProgram {
    public static void main(String args[]){
        try {
            int n[]={1,2,3,4};
            n[5]=30/0;
        } catch (Exception e) {
            System.out.print(e);
        }
        System.out.print("Exception Handling is Worked by try and catch perfectly");
    }
}
