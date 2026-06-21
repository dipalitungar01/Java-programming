
//pQ6. repet 5 using while loop

package ch5_loopControlInstruction;

public class ch5_pQ6 {
    public static void main(String[] args){
        int n =5;
        //what is factorial n = n*n-1 * n-2 ......
        //5! = 5*4*3*2*1 =120
        int i=1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }

        System.out.println(factorial);
    }


}
