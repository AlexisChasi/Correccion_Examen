package VIDEOJUEGOS;

public class VideojuegoConsola extends VIDEOJUEGO {

    protected int cantidad;

    public VideojuegoConsola(int cantidad, String nombre, String genero, String categoria, String desarrolladora, int anioLanzamiento) {
        super(nombre, genero, categoria, desarrolladora, anioLanzamiento);
       this.cantidad=cantidad;

    }

    public int getCantidad() {
        return cantidad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nGenero: " + genero + "\nCategoria: " + categoria +
                "\nDesarrolladora: " + desarrolladora +
                "\nAño de lanzamiento: " + anioLanzamiento +
                "\nCantida juegos de consola: " + cantidad);

    }
}
