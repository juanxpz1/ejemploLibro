class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregarLibro(libro libro) {
        Nodo nuevoNodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public libro buscarLibro(String titulo) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.libro.titulo.equals(titulo)) {
                return actual.libro;
            }
            actual = actual.siguiente;
        }
        return null; // Si no se encuentra el libro
    }

    public void mostrarLibros() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("Título: " + actual.libro.titulo);
            System.out.println("Autor: " + actual.libro.autor);
            System.out.println("Año de Publicación: " + actual.libro.añoPublicacion);
            System.out.println("Precio: " + actual.libro.precio);
            System.out.println("Prestado: " + (actual.libro.prestado ? "Sí" : "No"));
            System.out.println("----------//----------");
            actual = actual.siguiente;
        }
    }
}