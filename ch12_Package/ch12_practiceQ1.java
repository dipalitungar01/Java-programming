//Pq1. create three classes calculator ,Sccalclulator,
// and hybridcalculator and group int a package

package ch12_Package;

class Calculator{
    public void calculator(int a, int b){
        System.out.println("Your result is: "+ a+b);
    }
}
class ScCalculator{
    public void calculator(int a, int b){
        System.out.println("Your result is: "+ Math.sin(a+b));
    }
}
class HYCalculator{
    public void calculator(int a, int b){
        System.out.println("Your resul is: "+ (a+b));
        System.out.println("Your resul is: "+ Math.sin(a+b));
    }
}


public class ch12_practiceQ1 {
    public static void main(String[] args) {
        System.out.println("I am main method!");
    }
}
