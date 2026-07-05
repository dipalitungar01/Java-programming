package ch6_Array;

public class Array_2 {
    public static void main(String[] args) {

          /*float [] marks = {98.1f, 45.5f,79.5f, 99.5f, 80.5f};
          String [] students ={"dipali", "riya","puja"};
          System.out.println(students.length);
          System.out.println(students[2]);*/

        int[] marks = {98, 45, 79, 99, 80};
        // System.out.println(marks.length);
        // System.out.println(marks[2]);

        //Displaying the array (Naive way)
        System.out.println("printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //displaying the Array (for loop)
        System.out.println("printing using for loop");
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);

    }
        //displaying the Array in reverse order (for loop)
        System.out.println("printing using for loop in reverse order");
        for (int i = marks.length -1; i >=0; i--){
            System.out.println(marks[i]);

        }

        //Quick Quiz displaying the Array (for-each loop)
        System.out.println("printing using for-each loop");
        for (int element: marks) {
            System.out.println(element);
        }

    }

}
