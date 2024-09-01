public class StringMethods {
    public static void main(String[] args) {
        String string1 = "Hello world";

        // obtain the length
        int stringLength = string1.length();
        System.out.println(stringLength);

        // character replacement
        String stringModified = string1.replace('o', 'i');
        System.out.println(stringModified);

        // transform to uppercase
        String stringUppercase = string1.toUpperCase();
        System.out.println(stringUppercase);

        // transform to lowercase
        String stringLowerCase = string1.toLowerCase();
        System.out.println(stringLowerCase);

        // Delete spaces at the beggining and at the end
        String stringWithSpaces = "    Hello JJJJ     ";
        System.out.println(stringWithSpaces);
        String stringWithoutSpaces = stringWithSpaces.trim();
        System.out.println(stringWithoutSpaces);

        // SubStrings, first index last index
        String substringOfString1 = string1.substring(0, 5);
        System.out.println(substringOfString1);
        String world = string1.substring(6); // from to the end
        System.out.println(world);

        // String search
        // getting the first index of the string
        string1 = "Hello world, Hello town";
        int indexOfHello = string1.indexOf("Hello");
        System.out.println("indexOfHello = " + indexOfHello);
        
        // getting the first index of the last occurrence of the word 
        int lastIndexOfHello = string1.lastIndexOf("Hello");
        System.out.println("lastIndexOfHello = " + lastIndexOfHello);
        
        // to get the full word
        String helloWord = string1.substring(indexOfHello, "Hello".length());
        System.out.println("helloWord = " + helloWord);

        // substring not found
        int indexNotFound = string1.indexOf("Java");
        System.out.println("indexNotFound = " + indexNotFound);

        // Substring replacement
        // it doesn't modify the original string
        String stringReplaced = string1.replace("world", "all");
        System.out.println("stringReplaced = " + stringReplaced);
        // this will keep world because the original string does not change
        // it also replaces all occurrences
        String replaceHello = string1.replace("Hello", "Bye");
        System.out.println("replaceHello = " + replaceHello);

        // replace all
        // this one accepts regular expressions
        String text = "Hello World";
        // Replaces one or more "l"s with "x"
        String newText = text.replaceAll("l+", "x");
        System.out.println("newText = " + newText);
    }
}
