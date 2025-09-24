import java.util.Scanner;
//é possivel fazer com scanner mas nao quero agora


public class ForEachExemplo {
    public static void main(String[] args) {


        //calculando media

        int x = 0;
    int[] numeros = {10, 20, 30};
            for (int n : numeros) {

                 x = x + n;


        
        }
        System.out.println((double)x / numeros.length);
    }
}
