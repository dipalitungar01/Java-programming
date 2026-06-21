public class Ch3_PractQ3 {
    public static void main(String[] args) {

        String text = "Dear <|name|> Thanks a lot !";
        text = text.replace("<|name|>","Harry");
        System.out.println(text);

    }
}
