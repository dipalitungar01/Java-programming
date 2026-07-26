
//PQ4. How do you get state of a given thread in java?

package ch13_Multithreading;
class Practice13_c extends  Thread{
    public void run(){
        //while(true){
          //  System.out.println("Good Morning!");
        }
    }

class Practice13_1 extends  Thread{
    public void run() {
//        while(true){
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
public class ch13_PracticeQ3 {
    public static void main(String[] args) {
        Practice13c p1 = new Practice13c();
        Practice13_1 p2 = new Practice13_1();
//        p1.setPriority(6);
//        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

//       p1.start();
//       p2.start();

    }
}
