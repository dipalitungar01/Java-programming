
//Overload a Constructor used to initialize a rectangle of
// length 4 and breadth 5 for using custom parameters

package ch9_accessModifier;


class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


public class ch9_practQ4 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(12 ,56);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}
