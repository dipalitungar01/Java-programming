
//pQ3. create a class square with a method to initialize
// its side, calculating area , perimeter etc.

package ch8_Object_Oriented_programming;

class square{
    int side;
    public  int area(){
        return side * side;
    }
    public int perimeter(){
        return 4* side;
    }
}


public class ch8_practiceQ3 {
    public static void main(String[] args) {

        //problem 3
         square sq = new square();
         sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
