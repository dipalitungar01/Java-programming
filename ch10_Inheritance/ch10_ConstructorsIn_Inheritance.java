package ch10_Inheritance;

class Base1{
    Base1(){
        System.out.println(" I am a constructor");
    }

    Base1(int x){
        System.out.println(" I am an overloaded constructor with value of x as: "+ x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am Derived class constructor ");
    }

    Derived1(int x, int y){
        super(x);
        System.out.println(" I am an overloaded constructor with value of y as: "+ y);

    }
}

class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        //super(0);
        System.out.println("I am a child of Derived constructor ");
    }

    ChildOfDerived1(int x, int y, int z){
        super(x, y);
        System.out.println(" I am an overloaded constructor with value of z as: "+ z);

    }
}

public class ch10_ConstructorsIn_Inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(13,6);
         ChildOfDerived1 cd = new ChildOfDerived1(12 ,14 ,23);
    }
}
