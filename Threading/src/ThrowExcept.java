public class ThrowExcept {
    static void checkSalary(int salary){
        if(salary<20000){
            throw new ArithmeticException("You are a ESI(Employee's State Insurance) Holder ");
        }
        else{
            System.out.println("You are GHMI(Group Health Medical Health Insurance) Holder");
        }
    }
    public static void main(String args[]){
        checkSalary(16375);
    }
}
