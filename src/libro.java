// Clase para representar cada libro
public class libro {
    String titulo;
    String autor;
    int añoPublicacion;
    double precio;
    boolean prestado;

    public libro(String titulo, String autor, int añoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.precio = precio;
        this.prestado = false; // Inicialmente no prestado
    }

}
   