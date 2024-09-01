public class StringConcatenation {
    public static void main(String[] args) {

        // basic
        String string1 = "Hello " + "World";
        System.out.println("string1 = " + string1);

        // Using concat method
        String stringConcat = string1.concat(" ").concat("Two");
        System.out.println("stringConcat = " + stringConcat);

        // using string builder to create strings
        // this one doesn't create new instances
        // this class is mutable and more efficient to make repeated concatenations
        StringBuilder builder = new StringBuilder();
        builder.append("New");
        builder.append(" ");
        builder.append("World");

        System.out.println("builder = " + builder);
        
        // converting to string, previously is the type StringBuilder
        String newString = builder.toString();
        System.out.println("newString = " + newString);

        // String buffer
        // It is good when it works with more than one process
        StringBuffer stringBuffered = new StringBuffer();
        stringBuffered.append("String ").append("Buffered");
        System.out.println("stringBuffered = " + stringBuffered);
        // to string
        String stringBufferedToString = stringBuffered.toString();
        System.out.println("stringBufferedToString = " + stringBufferedToString);

        // Join
        // it will join all the string passed by the delimiter, first option passed
        newString = String.join(" - ", string1, stringBufferedToString, newString);
        System.out.println(newString);
    }
}
