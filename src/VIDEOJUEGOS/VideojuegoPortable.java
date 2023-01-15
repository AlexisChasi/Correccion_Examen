package VIDEOJUEGOS;

public class VideojuegoPortable extends VIDEOJUEGO {
    protected String dispositivo;

    public VideojuegoPortable(String dispositivo, String nombre, String genero, String categoria,
                              String desarrolladora, int anioLanzamiento) {
        super(nombre, genero, categoria, desarrolladora, anioLanzamiento);
        this.dispositivo=dispositivo;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void mostrarInfo() {

        System.out.println("Nombre: " + nombre + "\nGenero: " + genero + "\nCategoria: " + categoria +
                "\nDesarrolladora: " + desarrolladora +
                "\nAño de lanzamiento: " + anioLanzamiento +
                "\nDispositivo: " + dispositivo);
    }
}
