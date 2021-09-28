import java.util.Scanner;

public class CheckPrime {
    public static void main(String [] args){
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m=n/2, flag=0;

        if(n==0||n==1)
            System.out.println(n + " is not a prime number!");
        else{
            for(int i=2; i<=m; i++){
                if(n%i==0){
                    flag=1;
                    System.out.println(n + " is not a prime number!");
                    break;
                }
            }
            if(flag==0)
                System.out.println(n + " is a prime number!");
        }
    }
}
