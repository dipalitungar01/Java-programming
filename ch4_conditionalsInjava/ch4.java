
import java.util.Scanner;
public class ch4 {
    public static void main(String[] args) {

        int age =18;
        boolean cond = (age==18);
          if (cond){
          System.out.println("Yes boy you can drive !");
          }
          else{
            System.out.println(" No boy you cannot drive");
           }
//
//         logical opraters

         boolean a= true;
          boolean b = false;
           if(a && b ) { //this operater check a and b is true in this case is N
              System.out.println("Y");
            }
          else{
             System.out.println("N");
        }

        boolean A = true;
        boolean B = false;
        if (a || b ){
            System.out.println("Y");
         }
        else {
            System.out.println("N");

        }


        System.out.println("For Logical NOt----");
        System.out.println("NOt(a) is ");
        System.out.println(!a);
        System.out.println("NOt(B) is ");
        System.out.println(!b);


       int age1;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age1 = sc.nextInt();
        if (age1 > 56) {
            System.out.println("You are exprianced");
        } else if (age1 > 46) {
            System.out.println("You are semi-exprianced");
        } else if (age1 > 36) {
            System.out.println("You are semi-semi-exprianced");
        } else {
            System.out.println(" You are not exprianced");
        }

        int age2;
        System.out.println("Enter your age");
        Scanner sc1 = new Scanner(System.in);
        age2 = sc.nextInt();

        switch (age2) {
            case 18:
                System.out.println("You are going to adult!");
                break;

            case 23:
                System.out.println("You are going to join job!");
                break;

            case 60:
                System.out.println("Your going to get retired!");
                break;

            default:
                System.out.println("Enjoy your Life!");

        }

String var= "riya ";
        switch (var){
    case "riya" -> {
        System.out.println("You are going to become adult!");
        System.out.println("You are going to become adult");
        System.out.println("You are going to become adult");
        System.out.println("You are going to become adult!");
    }
    case "raj" -> System.out.println("you are going to join a job!");
     case "priya" -> System.out.println("You are get tetired!");
        default -> System.out.println("Enjoy your life! ");
    }
        }
}

