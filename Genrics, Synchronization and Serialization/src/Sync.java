class Sync extends Thread{
    public static void main(String args[]){
        Company cmp=new Company();
        MyThread th1=new MyThread(cmp, "Anuj Dwivedi");
        MyThread th2=new MyThread(cmp, "Jacob Anthony");
        th1.start();
        th2.start();
    }    
}