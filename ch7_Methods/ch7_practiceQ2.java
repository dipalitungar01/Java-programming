
// ch_pQ2. write a program using function to print the following pattern

package ch7_Methods;

public class ch7_practiceQ2 {
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j <i+1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

    pattern1(4);

    }
}
