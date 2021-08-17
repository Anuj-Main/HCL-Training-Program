abstract class Vehicle{
    private String vehicle_name;
    private String vehicle_ownersname;
    private int vehicle_number;

    public Vehicle(String vehicle_name, String vehicle_ownersname, int vehicle_number) {
        System.out.println("Vehicle Details");
        this.vehicle_name = vehicle_name;
        this.vehicle_ownersname = vehicle_ownersname;
        this.vehicle_number = vehicle_number;
    }
    public void check_details(){
        System.out.println("Check Details to " + this.vehicle_name + " " + this.vehicle_ownersname+" " +this.vehicle_number);
    }
}
public class Main extends Vehicle{
    public static void main(String args[]) {
        Vehicle v = new Vehicle("Mustang", "Anuj", "2615");
        v.check_details();
    }
}