//pQ3. write a program to print multiplication table of 10 in revers order


package ch5_loopControlInstruction;

public class ch5_pQ4 {
    public static void main(String[] args){

        int n = 10;
        //for(int i=0; i<10; i++){ - goes from i =0 to i=9
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
}
