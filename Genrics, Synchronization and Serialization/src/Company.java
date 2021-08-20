public class Company {
    synchronized public void Class(String EmployeeName){
        for(int i=0; i<5; i++){
            System.out.println(i+ " "+EmployeeName);
        }
    }
}
class MyThread extends Thread{
    Company cmp;
    String EmployeeName;
    public void run(){
        cmp.Class(EmployeeName);
    }
    MyThread(Company C, String EmployeeName){
        this.cmp = cmp;
        this.EmployeeName=EmployeeName;
    }
}