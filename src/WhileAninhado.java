public class WhileAninhado {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        while (x < 11){

            while(y < 11){
                System.out.println(x*y);
             y++;
            }
            y = 1;
            x++;

        }




    }

}
