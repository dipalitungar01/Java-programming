package ch8_Object_Oriented_programming;

class Employee{
    int id ;
    int salary ;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class ch8_creating_ownClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee dipali = new Employee();//instantiating a new employee object
        Employee riya = new Employee();//instantiating a new employee object

        //Setting Attributes for riya
        dipali.id = 12;
        dipali.salary = 35;
        dipali.name = "dipali tungar";

        //Setting Attributes for riya
        riya.id = 18;
        riya.salary=13;
        riya.name = "riya Khandelwal";


        //printing the Attributes
        dipali.printDetails();
        riya.printDetails();
        int salary = riya.getSalary();
        System.out.println(salary);
        //System.out.println(dipali.id);
        //System.out.println(dipali.name);
    }

}
