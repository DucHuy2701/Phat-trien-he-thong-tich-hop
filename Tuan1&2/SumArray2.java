import java.util.Scanner;

public class SumArray2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array n elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Summary: "+sum(arr, n));

    }
    public static int sum(int[] arr, int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i] >= 0)
                sum+=arr[i];
        }
        return sum;
    }
}
