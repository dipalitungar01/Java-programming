//PQ9. write a program to calculate the sum of the
// //numbers occuring in the multiplication table of 8

package ch5_loopControlInstruction;

public class ch5_pQ9 {
    public static void main(String[] args) {

        int n = 8;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += n * i;
        }

        System.out.println(sum);
    }
}