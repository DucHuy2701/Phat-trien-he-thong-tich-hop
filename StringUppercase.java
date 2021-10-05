import java.util.*;

public class StringUppercase {
    public static void main(String [] args){
        System.out.println("Input String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("String upper case: " + str.toUpperCase());
    }
}
