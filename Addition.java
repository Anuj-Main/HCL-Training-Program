public class Addition {
    int c;
    void add(int a, int b){
        c=a+b;
        System.out.println("Sum: "+c);
    }
}
class Subtraction extends Addition{
    public void sub(int a, int b){
        c=a-b;
        System.out.println("Difference: " + c);
    }
    public static void main(String args[]){
        int a=10;
        int b=10;
        Subtraction s =new Subtraction();
        s.sub(a, b);
        s.add(a, b);
    }
}
