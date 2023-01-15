package GRUPOSMUSICALES;

 public  class GrupoSalsa  extends GRUPOS{
  protected String cancionIconica;

  public GrupoSalsa(String cancionIconica, String nombre, String genero, int cantINtegrantes, String pais) {
   super(nombre,genero,cantINtegrantes,pais);
   this.cancionIconica=cancionIconica;
  }

  @Override
  public void mostrarInfo() {
   System.out.println("Nombre: " + nombre + "\nGenero: " + genero + "\nCantidad Integrantes: " + cantINtegrantes +
           "\nPais: " + pais +
           "\nCancion Iconica: "+cancionIconica );
  }
 }
