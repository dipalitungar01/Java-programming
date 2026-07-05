
//ch7_pQ1.write a java method to print multiplication table of a number n.

package ch7_Methods;

public class ch7_practiceQ1 {
    static void multiplication(int n){
        for(int i=1 ; i<=10 ; i++){
            System.out.format("%d X %d  = %d\n", n, i, n*i );
        }
    }
   public static void main(String[] args) {

        //problem 1
multiplication(7);
    }


}
