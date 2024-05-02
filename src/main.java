
import java.util.Scanner;
// Programa principal para interactuar con la librería

public class main {

    public static void main(String[] args) {
        ListaEnlazada biblioteca = new ListaEnlazada();
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos de los libros
        System.out.println("Ingrese los datos de los libros (titulo, autor, año de publicación, precio):");
        while (true) {
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("Año de Publicación: ");
            int añoPublicacion = scanner.nextInt();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            boolean prestado = scanner.nextBoolean();
            System.out.println("Desea prestrar el libro (s/n)");
            scanner.nextLine(); // Limpiar el buffer del scanner

            biblioteca.agregarLibro(new libro(titulo, autor, añoPublicacion, precio));

            System.out.print("¿Desea agregar otro libro? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }
        
        System.out.println("Todos los libros en la biblioteca:\t");
        biblioteca.mostrarLibros();
        
        // Buscar un libro por título
        boolean salir = false;
        while (!salir) {
            System.out.print("Ingrese el título del libro a buscar (o 'salir' para terminar): ");
            String tituloABuscar = scanner.nextLine();

            if (tituloABuscar.equalsIgnoreCase("salir")) {
                salir = true;
            } else {
                libro libroBuscado = biblioteca.buscarLibro(tituloABuscar);
                if (libroBuscado != null) {
                    System.out.println("Libro encontrado:");
                    System.out.println("Título: " + libroBuscado.titulo);
                    System.out.println("Autor: " + libroBuscado.autor);
                    System.out.println("Año de Publicación: " + libroBuscado.añoPublicacion);
                    System.out.println("Precio: " + libroBuscado.precio);
                    System.out.println("Prestado: " + (libroBuscado.prestado ? "Sí" : "No"));
                } else {
                    System.out.println("El libro '" + tituloABuscar + "' no se encuentra en la biblioteca.");
                }

                System.out.print("¿Desea buscar otro libro? (s/n): ");
                String respuesta = scanner.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    salir = true;
                }
            }
        }

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}
