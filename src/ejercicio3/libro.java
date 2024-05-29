package ejercicio3;

import java.util.LinkedHashSet;

/*DESARROLLAR UN PROGRAMA QUE PERMITA ALMACENAR MULRIPLES ELEMENTOS DE LA
 CADENA DE LA CLASE LIBRO LA CLASE LIBRO VA A TENER LOS
  SIGUIENTE (Id,Titulo,Edicion,Autor) EN UN LINKEDHASHSET*/


public class libro {

    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    LinkedHashSet<libro> Libros = new LinkedHashSet<>();

    public libro() {
        super();
    }

    public libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void addBook(libro libro) {
        
        Libros.add(libro);

        System.out.println("se agrego el libro");
    }

    
    public void toListBook() {

        for (libro libro : Libros) {
            
          System.out.println("id: " + libro.getId() + " Titulo: " + libro.getTitulo()
          + " Edicion: " + libro.getEdicion() + " Autor: " + libro.getAutor());
        }
    }

    public boolean removeBook(int id) {
        for (libro libro : Libros) {
            if (libro.getId() == id) {
                Libros.remove(libro);
                System.out.println("Se eliminó el libro : " + id);
                return true;
            }
        }
        System.out.println("No se encontró el libro : " + id);
        return false;
    }
}

