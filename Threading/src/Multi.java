class Multi extends Thread{  
    public void run(){
        System.out.println("thread is running...");
    } 
    public static void main(String args[]){
        for(int i=0; i<5; i++){
            Multi t1 = new Multi();
            t1.start();
        }
    }
} 