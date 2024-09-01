public class Immutability {
    public static void main(String[] args) {

        String string1 = "Hello";
        System.out.println("string1 = " + string1);

        // This creates a new object in memory
        string1 = "Bye";
        System.out.println("string1 = " + string1);

        // If I want to keep the reference to the object
        // I need to declare a new varible to store the reference before change the original
        // after this there are two variables targeting the same object in memory
        String string2 = string1;
        System.out.println("string2 = " + string2);
        // Now the first string modify its value creating a new object
        // and string1 points to that new object while string2 have the reference to the firsts object
        string1 = "New";
        System.out.println("string1 = " + string1);

    }
}
