public class SuperKeyword {
    String color="Brown";
}
class Son extends SuperKeyword{
    String color="Golden";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
class Super1{
    public static void main(String args[]){
        Son s=new Son();
        s.printColor();
    }
}
