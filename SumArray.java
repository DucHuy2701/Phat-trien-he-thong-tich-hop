import java.util.Scanner;

public class SumArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int n = sc.nextInt();
        System.out.println("Summary from 1 to "+n+" = "+sum(n));
    }
    public static int sum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
