
//pQ1. create a class Cylinder and use getter
// and setters to set its radius and height

package ch9_accessModifier;

class Cylinder1 {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
public class ch9_practQ1 {
    public static void main(String[] args) {
        Cylinder1 myCylinder = new Cylinder1();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
    }
}
