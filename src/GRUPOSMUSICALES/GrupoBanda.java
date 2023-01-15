package GRUPOSMUSICALES;

public class GrupoBanda extends GRUPOS{
 protected int numeroCanciones;
 public GrupoBanda( int numeroCanciones ,String nombre, String genero, int cantINtegrantes, String pais) {
  super(nombre, genero, cantINtegrantes, pais);
  this.numeroCanciones=numeroCanciones;
 }

 @Override
 public void mostrarInfo() {
  System.out.println("Nombre: " + nombre + "\nGenero: " + genero + "\nCantidad Integrantes: " + cantINtegrantes +
          "\nPais: " + pais +
          "\nNumero Canciones: "+numeroCanciones );

 }
}
