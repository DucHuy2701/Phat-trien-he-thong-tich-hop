import java.util.Scanner;

public class Equation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        float a = sc.nextFloat();
        System.out.println("B: ");
        float b = sc.nextFloat();
        System.out.println("C: ");
        float c = sc.nextFloat();
        calculate(a, b, c);
    }

    public static void calculate(float a, float b, float c){
        if(a==0){
            if(b==0)
                System.out.println("Vô nghiệm!");
            else
                System.out.println("x= " + (-c/b));
            return;
        }

        float delta = b*b -4*a*c;
        float x1, x2;

        if(delta > 0){
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("x1 = "+x1+"/ x2 = "+x2);
        }else if(delta==0){
            x1 = (-b/(2*a));
            System.out.println("x1 = x2 = "+x1);
        }else{
            System.out.println("Vô nghiệm!");
        }
    }
}
