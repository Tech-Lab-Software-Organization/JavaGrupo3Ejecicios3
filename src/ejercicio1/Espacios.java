package ejercicio1;

public class Espacios {
 public static void main(String[] args) {
    
        Cadena cadena = new Cadena();
         String espacios = cadena.CadenaSinEspacios();
         System.out.println(espacios);      

         String noEspacios2 = espacios.replaceAll("\\s", "");
         System.out.println(noEspacios2);        
   }
 }

