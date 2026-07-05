
//pQ2. use 1 to calculate surface area and volume of the cylinder.
//pQ3. use a constructor and repeted 1

package ch9_accessModifier;

class Cylinder {
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

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;

    }
}
public class ch9_practQ2 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        //problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

       }

    }

