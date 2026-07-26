package ch13_Multithreading;

class MyThr extends Thread{
    public MyThr (String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class ch13_Constructor {
    public static void main(String[] args) {
         MyThr t = new MyThr("dipali");
         t.start();
        System.out.println("The id of the thread t is "+ t.getId());
        System.out.println("The name of the thread t is "+ t.getName());
    }
}
