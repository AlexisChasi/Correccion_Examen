import GRUPOSMUSICALES.GRUPOS;
import GRUPOSMUSICALES.GrupoBanda;
import GRUPOSMUSICALES.GrupoRock;
import GRUPOSMUSICALES.GrupoSalsa;
import VIDEOJUEGOS.VIDEOJUEGO;
import VIDEOJUEGOS.VideojuegoConsola;
import VIDEOJUEGOS.VideojuegoPC;
import VIDEOJUEGOS.VideojuegoPortable;

import java.util.ArrayList;

public class principal {
    public static ArrayList<VIDEOJUEGO> misJuegos = new ArrayList<>();
    public static ArrayList<GRUPOS> misgrupos = new ArrayList<>();

    public static void main(String[] args) {
        try {


            VideojuegoConsola consola = new VideojuegoConsola(6,
                    "FIFA", "DEPORTE", "FUTBOL",
                    "ea-SPORTS", 2006);
            VideojuegoPC pc = new VideojuegoPC("ASUS ROG CROSSHAIR VIII EXTREME ", "AMD Ryzen™ 7 5800X 3D  WOF",
                    "Gigabyte Tarjeta gráfica GeForce RTX 3060 Gaming OC 12 GB ", 16, "DOTA 2", "MOBA", "MULTIJUGADOR", "VALVE",
                    2011);
            VideojuegoPortable portable = new VideojuegoPortable("NINTENGO SWITCH", "MARIO BROS", "AVENTURA", "+18", "NINTENDO", 2020);
            misJuegos.add(consola);
            misJuegos.add(pc);
            misJuegos.add(portable);
            for (VIDEOJUEGO videojuego : misJuegos) {
                videojuego.mostrarInfo();
            }

            System.out.println("\tGRUPOS MUSICALES\n");
            GrupoBanda banda =new GrupoBanda(10,"Don medarso y sus players","CUMBIA",15,"ECUADOR");
            GrupoRock rock=new GrupoRock("SODA ESTEREO","ROCK ALTERNATIVO",3,"ARGENTINA","GUSTAVO CERATTI");
            GrupoSalsa salsa=new GrupoSalsa("Algo Que Se Quede","GRUPO NICHE","SALSA",30,"COLOMBIA");
            misgrupos.add(banda);
            misgrupos.add(rock);
            misgrupos.add(salsa);
            for (GRUPOS grupos : misgrupos) {
                grupos.mostrarInfo();
            }
        } catch (Exception e) {

            System.out.println("\nDatos Incorrectos!! ... Finalizado!!....");
        }
    }


}
