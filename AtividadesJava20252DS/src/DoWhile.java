import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num;
        do{
            System.out.println("type any number, type -1 to exit");
            num = x.nextInt();
        }while (num != -1);
        x.close();
    }
}
