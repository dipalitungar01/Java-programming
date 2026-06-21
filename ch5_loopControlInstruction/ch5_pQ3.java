//pQ3. write a program to print multiplication table of a given number n

package ch5_loopControlInstruction;

public class ch5_pQ3 {
    public static void  main(String[] args) {
        int n = 8;
        //for(int i=0; i<10; i++){ - goes from i =0 to i=9
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
}
