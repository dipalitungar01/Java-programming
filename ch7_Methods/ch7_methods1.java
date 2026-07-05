package ch7_Methods;

public class ch7_methods1 {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;

        }
        else{
            z = (x + y) * 5;
        }
        x= 566;
        return z;

    }


    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c;
        //method invocation using object creation
       // ch7_methods1 obj = new ch7_methods1();
      //  c = obj.logic(a , b);
        c = logic(a , b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        if(a1 > b1){
            c1 = a1 + b1;
        }
         else{
             c1 = ( a1 = b1) * 5;

        }
        System.out.println(c);
        System.out.println(c1);
    }
}
