import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner datos=new Scanner (System.in); 
    int valor; 
    do {
      System.out.print("Ingrese eun valor entre 0 y 999 (0 finaliza):"); 
      valor=datos.nextInt(); 
      if (valor>=100) {
        System.out.println("Es de 3 dígitos."); 
      }   else {
        if (valor>=10) {
          System.out.println("Es de 2 dígitos");
        } else {
          System.out.println("Es de 1 dígito"); 
        }
          }
    } while (valor!=0); 
  }
}