public class Car {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class Details{
    public static void main(String args[]) {
        Car c=new Car();
        c.setName("Mustang");
        System.out.println(c.getName());
    }
}
