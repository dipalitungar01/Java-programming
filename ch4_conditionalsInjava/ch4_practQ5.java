import java.util.Scanner;
public class ch4_practQ5 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter url");
        String  url = sc.next();

        if (url.endsWith(".com")) {
            System.out.println("It is Commertial website");
        }
        else if (url.endsWith(".org")) {
            System.out.println("It is Organization website");
        }
        else if (url.endsWith(".in")) {
            System.out.println(" It is Indian website");
        }
    }
}