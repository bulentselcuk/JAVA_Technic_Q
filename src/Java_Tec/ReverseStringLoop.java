package Java_Tec;


public class ReverseStringLoop {
    public static void main(String[] args) {

        reverseString ( "Bulent" );
    }
    public static String reverseString(String str) {
        String reverse="";
        for (int i=str.length () - 1; i >= 0; i--) {
            reverse+=str.charAt ( i );
        }
        return reverse;
    }
}
