package ch6_Array;

public class Array_1 {
    public static void main(String[] args){
    /*Classroom of 500 students - You have to store marks of these 500 students
    you have 2 options:
    1. create 500 variables
    2. use arrays (recommended)
    */
        //1. Declaration and memory allocation
        //int [] marks = new int[5];


        //2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        //Initialization
        //  marks[0] =100;
        //  marks[1] =68;
        //  marks[2] =70;
        // marks[3] =98;
        // marks[4] =86;

        //3. Declaration , memory allocation and initialization together
        int [] marks = {98, 45,79, 99, 80};
        //marks[5] =95; - throws an error
        System.out.println(marks[4]);

    }
}
