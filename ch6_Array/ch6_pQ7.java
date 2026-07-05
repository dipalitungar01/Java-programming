

//pQ7.WAP to find the minimum element in an array.
package ch6_Array;

public class ch6_pQ7 {
    public static void main(String[] args){

        int[] arr = {1, 2, 4433, 455, 5, 6, 34, 45, 21};
        int min = Integer.MIN_VALUE;
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println(Integer.MIN_VALUE);
        System.out.println("the value of the minimum element in this array is: " +min);
    }
}
