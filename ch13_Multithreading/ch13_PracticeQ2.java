//PQ2. add a sleep method in welcome thread of
//question to dealay its execution for 200ms.

package ch13_Multithreading;
class Practice13a extends  Thread{
public void run(){
    while(true){
        System.out.println("Good Morning!");
    }
}
}
class Practice13c extends  Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class ch13_PracticeQ2 {
    public static void main(String[] args) {

        Practice13a p1 = new Practice13a();
        Practice13c p2 = new Practice13c();
        p1.start();
        p2.start();
    }

}
