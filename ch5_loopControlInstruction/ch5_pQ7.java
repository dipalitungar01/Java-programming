package ch5_loopControlInstruction;

public class ch5_pQ7 {
    public static void main(String[] args) {
        int n = 1;

        int i = 1;
        int factorial = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println(factorial);
    }
}



