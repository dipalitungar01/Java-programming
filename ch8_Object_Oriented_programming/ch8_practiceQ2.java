//create a class cellphone with methods to print "ringing.." , "vibrating...."etc.

package ch8_Object_Oriented_programming;

class cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void callFriend(){
        System.out.println("Calling priya......");
    }

}
public class ch8_practiceQ2 {
    public static void main(String[] args) {

        //problem 2
        cellphone asus = new cellphone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
    }

}
