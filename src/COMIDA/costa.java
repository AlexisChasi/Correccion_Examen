package COMIDA;

public class costa extends  COMIDAS{
    protected  String ciudad;
    public costa(String nombre, String pais, String modoPreparacion, String ingredientePrincipal,String ciudad) {
        super(nombre, pais, modoPreparacion, ingredientePrincipal);
        this.ciudad=ciudad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nCOmida de la Costa\n");
        System.out.println("Nombre: " + nombre + "\nPais: " + pais + "\nModo de preparacion: " + modoPreparacion +
                "\nIngrediente principal: " + ingredientePrincipal +
                "\nCiudad : "+ciudad );
    }

}
