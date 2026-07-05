
//pQ6.WAP to find the maximum element in an array.

package ch6_Array;

public class ch6_pQ6 {
    public static void main(String[] args){

        int[] arr = {1, 2, 4433, 455, 5, 6, 34, 45, 21};
        int max = 0;
        for(int e: arr){
            if(e>max){
              max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: " +max);
    }
}
