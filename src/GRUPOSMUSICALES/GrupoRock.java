package GRUPOSMUSICALES;

 public class GrupoRock  extends GRUPOS{
  protected String vocalista;

  public GrupoRock(String nombre, String genero, int cantINtegrantes, String pais,String vocalista) {
   super(nombre, genero, cantINtegrantes, pais);
   this.vocalista=vocalista;
  }

  @Override
  public void mostrarInfo() {
   System.out.println("Nombre: " + nombre + "\nGenero: " + genero + "\nCantidad Integrantes: " + cantINtegrantes +
           "\nPais: " + pais +
           "\nVocalista: "+vocalista );
  }

 }
