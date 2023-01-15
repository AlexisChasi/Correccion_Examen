package VIDEOJUEGOS;

public class VideojuegoPC extends VIDEOJUEGO {
    protected String mobo;
    protected int ram;
    protected String procesador;
    protected String gpu;


    public VideojuegoPC(String mobo, String procesador,
                        String gpu, int ram,
                        String nombre, String genero, String categoria, String desarrolladora, int anioLanzamiento) {
        super(nombre, genero, categoria, desarrolladora, anioLanzamiento);
        this.mobo=mobo;
        this.ram=ram;
        this.procesador=procesador;
        this.gpu=gpu;
    }

    public String getMobo() {
        return mobo;
    }

    public int getRam() {
        return ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getGpu() {
        return gpu;
    }

    public void mostrarInfo() {


        System.out.println("Nombre: " + nombre + "\nGenero: " + genero + "\nCategoria: " + categoria +
                "\nDesarrolladora: " + desarrolladora +
                "\nAño de lanzamiento: " + anioLanzamiento +
                "\nMain Board: " + mobo + "\nRAM: " + ram + "\nProcesador: " + procesador + "\nGPU: " + gpu);


    }
}
