import java.util.Scanner;

public class SwitchAninhado {
    public static void main(String[] args){


        Scanner num = new Scanner(System.in);
        int o;

        Scanner n1 = new Scanner(System.in);
        int x;

        Scanner n2 = new Scanner(System.in);
        int y;

        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        System.out.println("default - exit");
        System.out.println("Enter a number:");
            o = num.nextInt();

        switch (o) {
            case 1 -> {
                System.out.println("Enter two numbers (x + y):");
                x = n1.nextInt();
                y = n2.nextInt();
                System.out.println(x+y);
            }
            case 2 -> {
                System.out.println("Enter two numbers (x - y):");
                x = n1.nextInt();
                y = n2.nextInt();
                System.out.println(x-y);
            }
            case 3 -> {
                System.out.println("Enter two numbers (x * y):");
                x = n1.nextInt();
                y = n2.nextInt();
                System.out.println(x*y);
            }
            case 4 -> {
                System.out.println("Enter two numbers (x / y):");
                x = n1.nextInt();
                y = n2.nextInt();
                System.out.println(x/y);
            }
            default -> {
            }
        }

    }
}
