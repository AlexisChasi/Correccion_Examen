package COMIDA;

public class sierra extends COMIDAS{
    protected String provincia;
    public sierra(String nombre, String pais, String modoPreparacion, String ingredientePrincipal,String provincia) {
        super(nombre, pais, modoPreparacion, ingredientePrincipal);
        this.provincia=provincia;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nCOmida de la sierra\n");
        System.out.println("Nombre: " + nombre + "\nPais: " + pais + "\nModo de preparacion: " + modoPreparacion +
                "\nIngrediente principal: " + ingredientePrincipal +
                "\nProvincia : "+provincia );
    }
}
