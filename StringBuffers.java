public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Yogi");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        // append the data
        sb.append(" Shetty");
        System.out.println(sb);

        // to convert the StirngBuffer to String we use toString() method
        String var = sb.toString();
        System.out.println(var);

        // Delete the cahracter at specified location : deleteCharAt(location)
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(2,'g');
        System.out.println(sb);
        sb.substring(0,3);
        System.out.println(sb);
        // To fix the capacity of the string we use ensureCapacity(value)
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
    }
}
