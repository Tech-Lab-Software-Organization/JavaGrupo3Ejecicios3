package ejercicio3;

public class App extends libro{
    public static void main(String[] args) {

        libro libro = new  libro();
        libro libro2 = new libro(1, "titulo", "guitierrez", "armando");
        libro libro3 = new libro(2, "titulo", "guitierrez", "armando");

        libro.addBook(libro2);
        libro.addBook(libro3);

        libro.toListBook();
        libro.removeBook(1);
        libro.removeBook(2);
        libro.toListBook();
    }
}
