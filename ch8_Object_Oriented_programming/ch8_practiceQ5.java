package ch8_Object_Oriented_programming;

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){

        System.out.println("Running from the enemy");
    }
    public void fire(){

        System.out.println("Firing on the enemy");
    }
}

public class ch8_practiceQ5 {
    public static void main(String[] args) {

        Tommy player = new Tommy();
        player.fire();
        player.run();
        player.hit();
    }
}
