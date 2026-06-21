import java.util.Scanner;
public class ch4_practQ2 {
public static void main(String[] args) {

byte m1,m2,m3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks in java");
 m1 = sc.nextByte();

System.out.println("Enter your marks in python");
m2 = sc.nextByte();

System.out.println("Enter your marks in c++");
 m3 = sc.nextByte();
float avg = (m1+m2+m3)/3.0f;
if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
    System.out.println("Congratulations you have been pass!");
}
else{
    System.out.println("Sorry you have not been passed!");
  }
 }
}