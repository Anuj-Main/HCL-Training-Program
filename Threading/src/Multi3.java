public class Multi3 implements Runnable{
    private String threadname; 
    Multi3(String name){
        threadname=name;
        System.out.println("Thread is Created"+threadname);
    }
    public void run(){
        System.out.println("Thread is now Run"+threadname);
        for(int i=1; i<5;i++){
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thread"+i+threadname);
        }
    }
    public void start(){
        System.out.println("Threading is Start"+threadname);
    }
    public static void main(String args[]){
        Multi3 m3=new Multi3("Thread 1");
        m3.start();
        Multi3 m=new Multi3("Thread 2");
        m.start();
    }
}
