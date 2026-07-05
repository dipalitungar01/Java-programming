
//pQ1 . create a class Employee with following properties and methods:
//salary(property)(int)
//getsalary(method returning int)
//name (property)(string)
//getname(method returning string)
//setname(method changing name)


package ch8_Object_Oriented_programming;
class Employee1 {
    int salary;
    String  name;


    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class ch8_practiceQ1 {
    public static void main(String[] args) {

        //problem 1
        Employee1 dipali = new Employee1();
        dipali.setName("dipaliTungar");
        dipali.salary = 244;
        System.out.println(dipali.getName());
        System.out.println(dipali.getSalary());
    }

}
