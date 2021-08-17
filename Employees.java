public class Employees {
    private String name;
    private String address;
    private int salary;
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}
class Show_Details{
    public static void main(String args[]){
        Employees e=new Employees();
        e.setName("Anuj Dwivedi");
        e.setAddress("Bhopal");
        e.setSalary(20000);
        System.out.println("The Details of HCL Employee");
        System.out.println(" Name: " + e.getName() + " Address: " + e.getAddress() + " Salary: " + e.getSalary());
    }
}
