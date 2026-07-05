
//pQ5. write a function to print nth term of fibonacci series using recrsion

package ch7_Methods;

public class ch7_practiceQ5 {

    static int fib(int n){
       /* if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }*/
        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
 public static void main(String[] args) {

     //fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

     int result = fib(8);
     System.out.println(result);
 }
}
