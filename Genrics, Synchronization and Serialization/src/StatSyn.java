class StatSyn{
    synchronized static  void printStatSyn(int n){
        for(int i=0; i<5; i++){
            System.out.print(n*i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }
}
class MyThread1 extends Thread{
    public void run(){
        StatSyn.printStatSyn(1);
    }
}
class MyThread2 extends Thread{
    public void run(){
        StatSyn.printStatSyn(5);
    }
}
class MyThread3 extends Thread{
    public void run(){
        StatSyn.printStatSyn(10);
    }
}