public class ComBreak {
  public static void main(String[] args) {
    // nao como eu nao conseguisse o mesmo resultado sem o break aqui
    for (int i = 0;i < 10 ;i++) { 
      if (i == 7) {
        break;
      }
      System.out.println(i);
    }  
  }
}
