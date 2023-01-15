package VIDEOJUEGOS;

public abstract class VIDEOJUEGO {
    protected String nombre;
    protected String genero;

    protected String categoria;// para niños, +18 etc
    protected String desarrolladora;
    protected int anioLanzamiento;

    public VIDEOJUEGO(String nombre, String genero, String categoria
            , String desarrolladora, int anioLanzamiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.categoria = categoria;
        this.desarrolladora = desarrolladora;
        this.anioLanzamiento = anioLanzamiento;

    }


    public abstract void mostrarInfo();

}
