public class Strings {
    public static void main(String[] args) {
        System.out.println("*** Strings ***");

        String string1 = "Hola";
        System.out.println("string1 = " + string1);

        String string2 = new String("Mundo");
        System.out.println("string2 = " + string2);

        String string3 = string1 + " " + string2;
        System.out.println("string3 = " + string3);

        String stringTextBlock = """
                Hi, this is a multi line
                String on Java
                """;
        System.out.println("stringTextBlock = " + stringTextBlock);
    }
}
