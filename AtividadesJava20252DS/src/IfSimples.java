import java.util.Scanner;
public class IfSimples {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x;

        System.out.println("Enter a number");
        x = num.nextInt();


        if (x >= 0){
            System.out.println("number is positive? True");
        }else{
            System.out.println("number is positive? False");
        }
    }
}