import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cd cd=new Cd("cd",500, 100, new ArrayList<String>(),20);
        DiscoDuro discoDuro=new DiscoDuro("disco duro",80, 50, new ArrayList<String>(), 35);
        Vinilo vinilo=new Vinilo("vinilo",30, 15, new ArrayList<String>(), 60);
        BluRay bluRay=new BluRay("bluray",1000, 300, new ArrayList<String>(), 10);
        System.out.println(cd.giro());
        System.out.println(discoDuro.giro());
        System.out.println(cd.leer());
        System.out.println(discoDuro.leer());
        System.out.println(cd.escribir());
        System.out.println(discoDuro.escribir());
        cd.setContenido("Hola");
        cd.setContenido(new ArrayList<String>(Arrays.asList("Mundo", ":D")));
        discoDuro.setContenido("Adios");
        discoDuro.setContenido(new ArrayList<String>(Arrays.asList("Planeta", "D:")));
        System.out.println(cd.informacion());
        System.out.println(discoDuro.informacion());
        System.out.println(cd.getContenido(cd.getContenido()));
        System.out.println(discoDuro.getContenido(discoDuro.getContenido()));


        System.out.println(vinilo.giro());
        System.out.println(bluRay.giro());
        System.out.println(vinilo.leer());
        System.out.println(bluRay.leer());
        System.out.println(vinilo.escribir());
        System.out.println(bluRay.escribir());
        vinilo.setContenido("Tengo");
        vinilo.setContenido(new ArrayList<String>(Arrays.asList("Música", "Pro")));
        bluRay.setContenido("Contengo");
        bluRay.setContenido(new ArrayList<String>(Arrays.asList("Peliculas", "Modernas")));
        System.out.println(vinilo.informacion());
        System.out.println(bluRay.informacion());
        System.out.println(vinilo.getContenido(vinilo.getContenido()));
        System.out.println(bluRay.getContenido(bluRay.getContenido()));
    }
}