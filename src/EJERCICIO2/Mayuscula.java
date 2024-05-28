package EJERCICIO2;

public class Mayuscula {
    public static String capitalizeFirstLetters(String str) {
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
