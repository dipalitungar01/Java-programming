
//PQ5. how do you get refrence to the current thread in java?

package ch13_Multithreading;


class Practice13a1 extends  Thread{
    public void run(){
        //while(true){
        //  System.out.println("Good Morning!");
    }
}

class Practice132 extends  Thread{
    public void run() {
//        while(false){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("welcome");
//        }
    }
}
public class ch13_PracticeQ5 {
    public static void main(String[] args) {
        Practice13a1 p1 = new Practice13a1();
        Practice132  p2 = new Practice132();

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());

        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}


