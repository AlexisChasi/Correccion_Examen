package GRUPOSMUSICALES;

public abstract class GRUPOS  {
    protected String nombre;
    protected String genero;
    protected int cantINtegrantes;
    protected String pais;

    public GRUPOS(String nombre, String genero, int cantINtegrantes, String pais) {
        this.nombre = nombre;
        this.genero = genero;
        this.cantINtegrantes = cantINtegrantes;
        this.pais = pais;
    }
    public abstract void mostrarInfo();

}
