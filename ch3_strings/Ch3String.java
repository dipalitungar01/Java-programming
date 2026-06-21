public class Ch3String {
    public static void main(String[] args) {

        String name = "Dipali";

        // length of string
        int value = name.length();
        System.out.println(value);

        // toLowerCase()
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        // toUpperCase()
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        // String with spaces
        String nonTrimmedString = "       Dipali      ";
        System.out.println(nonTrimmedString);

        // trim()
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        // substring(startIndex)
        System.out.println(name.substring(3));

        // substring(startIndex, endIndex)
        System.out.println(name.substring(1, 6));

        // replace character
        System.out.println(name.replace('i', 'e'));

        // replace string
        System.out.println(name.replace("l", "li"));

        // startsWith()
        System.out.println(name.startsWith("dip"));

        // endsWith()
        System.out.println(name.endsWith("ali"));

        // charAt()
        System.out.println(name.charAt(0));

        // indexOf()
        System.out.println(name.indexOf("pa"));

        String modifiedName = "Deepalii";

        // indexOf with starting index
        System.out.println(modifiedName.indexOf("eep", 4));

        // lastIndexOf()
        System.out.println(modifiedName.lastIndexOf("ali"));

        // lastIndexOf with index
        System.out.println(modifiedName.lastIndexOf("epa", 4));

        // equals()
        System.out.println(name.equals("Dipali"));

        // equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("diPali"));

        // Escape sequences
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \t double quote");
    }
}