import java.util.ArrayList;

public class BluRay extends Dispositivo {
    public BluRay(String nombre, int capacidad, int rpm, ArrayList<String> contenido, int size){
        super(nombre, capacidad, rpm, contenido, size);
    }
    public String giro(){
        return ("El bluRay está girando a "+rpm+" por minuto");
    }

    public String leer(){
        return ("El bluRay está leyendo los datos mediante laser...");
    }
    public String escribir(){
        return ("El bluRay está escribiendo los datos mediante laser...");
    }
}
