//pQ2. write a program to sum first n even numbers using while loop.

package ch5_loopControlInstruction;

public class ch5_pQ2 {
    public static void main(String[] args){
        int sum =0;
        int n=4;
        for(int i=0; i<n; i++){
            sum = sum + (2 *i);
        }
        System.out.println("sum of even numbers is: ");
        System.out.println(sum);
        //first 4 even numbers are - 0 2 4 6
    }
}
