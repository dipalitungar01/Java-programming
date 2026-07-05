
//pQ3. calculate the average marks from an array containing marks of
// all students in physics using for-each loop

package ch6_Array;

public class ch6_pQ3 {
    public static void main(String[] args){

        //practice problem 3
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks  is" + sum/marks.length);
    }
}



