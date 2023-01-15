package COMIDA;

import java.awt.font.TextHitInfo;

public class oriente extends  COMIDAS{
    protected String comunidad;// donde se la prepara
    public oriente(String nombre, String pais, String modoPreparacion, String ingredientePrincipal, String comunidad) {
        super(nombre, pais, modoPreparacion, ingredientePrincipal);
        this.comunidad=comunidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nComida del oriente\n");
        System.out.println("Nombre: " + nombre + "\nPais: " + pais + "\nModo de preparacion: " + modoPreparacion +
                "\nIngrediente principal: " + ingredientePrincipal +
                "\nComunidad : "+comunidad );
    }
}
