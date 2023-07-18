public class StringOperations {
    public static void main(String[] args) {
        // string is not a data type, it is a class
        // To create a String,we need to do this : String variable = new String("Yogi")
        // But as it is created in background by java developers ,we don't need to specify explicitly
        // Insted we can use : Stirng variable = "Yogi"
        String variable = "Full Stack Developer";
        System.out.println(variable);
        // Index of character : charOf()
        System.out.println(variable.charAt(3));
        // Length operation
        System.out.println(variable.length());
        // Concatination
        System.out.println("Hari is "+variable);
        // makes all letters to upper
        System.out.println(variable.toUpperCase());
        // makes all letters to lower
        System.out.println(variable.toLowerCase());
        // returns the index value 
        System.out.println(variable.indexOf('e'));
        System.out.println(variable.toString());
    }
}
