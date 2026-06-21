//PQ1. write a program to print the following pattern.

package ch5_loopControlInstruction;

public class ch5_pQ1 {
    public static void main(String[] args) {
        // practice problem 1
        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
