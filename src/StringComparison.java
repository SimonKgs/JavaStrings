public class StringComparison {
    public static void main(String[] args) {
        // String Pool
        // When I don't use `new String` to create a string,
        // the string is stored in a special memory area called the String Pool.
        // In this section, string objects are reusable.
        // So, in this case, both values go to the pool.
        // If they have the same value ("Java") in the pool, they point to the same
        // memory reference due to the reusability of strings in the pool.
        String string1 = "Java";
        String string2 = "Java";
        // If I don't want to use the reusability I need to use new Object syntax
        String string3 = new String("Java");

        // string comparison
        System.out.println("Have the string one the same reference that string2");
        System.out.println(string1 == string2);
        // this time even if they have the same value they are not equal because
        // they point to a different reference in memory
        System.out.println("Have the string one the same reference that string3");
        System.out.println(string1 == string3);

        // to compare the values I need to use equals
        System.out.println("Have the string1 the same value that string2");
        System.out.println(string1.equals(string2));
        System.out.println("Have the string1 the same value that string3");
        System.out.println(string1.equals(string3));

    }
}
