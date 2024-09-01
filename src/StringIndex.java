public class StringIndex {

    public static void main(String[] args) {
        String string1 = "Hi, this is a string";
        // Getting the first character
        System.out.println(string1.charAt(0));
        // Getting the last character
        System.out.println(string1.charAt(string1.length()-1));
        // Getting a char on the middle
        System.out.println(string1.charAt(7));
        // Or looking for a specific character
        System.out.println(string1.charAt(string1.indexOf('s')));
    }

}
