abstract class Animals{
    abstract void eat();
    public void sleep(){
        System.out.println("Cats are resting");
    }
}
class Cat extends Animals{
    public void eat(){
    System.out.println("Cats are eating");
    }
    public static void main(String args[]){
        Cat d= new Cat();
        d.eat();
        d.sleep();
    }
}
