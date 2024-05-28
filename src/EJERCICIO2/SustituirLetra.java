package EJERCICIO2;

public class SustituirLetra {
    public static void main(String[] args) {
        
        String input = "me gusta la musica jazz";
        
        
        String result = Mayuscula(input);
        
        System.out.println("Resultado: " + result);
    }

    private static String Mayuscula(String str) {
        StringBuilder result = new StringBuilder(str.length());

        boolean capitalizeNext = true;
        for (char ch : str.toCharArray()) {
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }
            
            if (ch == ' ') {
                capitalizeNext = true;
            }
        }
        
        return result.toString();
    }
    
}
