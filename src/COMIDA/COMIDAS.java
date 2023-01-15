package COMIDA;

public abstract class COMIDAS {
    protected String nombre;
    protected String pais;
    protected String modoPreparacion;// cocinada-frita-etc
    protected String ingredientePrincipal;

    public COMIDAS(String nombre, String pais, String modoPreparacion, String ingredientePrincipal) {
        this.nombre = nombre;
        this.pais = pais;
        this.modoPreparacion = modoPreparacion;
        this.ingredientePrincipal = ingredientePrincipal;
    }
    public abstract void mostrarInfo();
}
