package Java_Tec;

public class ReverseString1 {
    public static void main(String[] args) {

        String name= "Bulent Selcuk";

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println(reversed);
    }

}
