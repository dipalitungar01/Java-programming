package ch13_Multithreading;


class Practice13_a extends  Thread{
    public void run(){
        //while(true){
        //  System.out.println("Good Morning!");
    }
}

class Practice13_ extends  Thread{
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
public class ch13_PracticeQ4 {

    public static void main(String[] args) {
        Practice13_a p1 = new Practice13_a();
        Practice13_ p2 = new Practice13_();

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());

        p2.start();
        System.out.println(p2.getState());
    }
}
