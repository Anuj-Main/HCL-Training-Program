public class Multi2 implements Runnable {
    public void run(){
        System.out.println("Thread is running ");
    }
    public static void main(String args[]){
        for(int i=0; i<5; i++){
            Multi2 m2 = new Multi2();
            Thread t1 = new Thread(m2);
            t1.start();
        }
    }
}
