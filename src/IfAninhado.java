import java.util.Scanner;

public class IfAninhado {
    public static void main(String[] args) {
        Scanner numg = new Scanner(System.in);
        int g;

        Scanner numf = new Scanner(System.in);
        float f;

        System.out.println("Enter grade");
        g = numg.nextInt();
        System.out.println("Enter frequency");
        f = numf.nextFloat();


        if (g >= 7){

            if (f >= 75){
                System.out.println("G"+g+": ok, F"+f+"%: ok, student passed");
            }else{
                System.out.println("G"+g+": ok, F"+f+"%: bad, student retained");
            }
            }else{

            if (f >= 75){
                System.out.println("G"+g+": bad, F"+f+"%: ok, student retained");
            }else{
                System.out.println("G"+g+": bad, F"+f+"%: bad, student retained");
            }
        }
    }
}