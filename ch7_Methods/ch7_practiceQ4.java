
//pQ4 . write a function to print the following pattern

package ch7_Methods;

public class ch7_practiceQ4 {
    static void pattern2(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j <=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        pattern2(4);

    }
}


