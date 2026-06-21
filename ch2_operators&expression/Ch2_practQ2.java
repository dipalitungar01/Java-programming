public class Ch2_practQ2 {
    public static void main(String[] args) {
        System.out.println("Encrypted grade is");
        char grade = 'A';
        grade = (char) (grade + 8);
        System.out.println(grade);


        System.out.println("Decrypted grade or it correct");
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}