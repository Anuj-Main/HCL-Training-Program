class Overriding{
    public void display(){
        System.out.println("This is base class method");
    }
}
class OverridingSub extends Overriding{
    public void display(){
        System.out.println("This is child class method");
    }
}
class TestOverride{
    public static void main(String args[]) {
        System.out.println("This is Called Overriding");
        Overriding or= new OverridingSub();
        or.display();
    }
}