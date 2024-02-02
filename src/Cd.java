import java.util.ArrayList;

public class Cd extends Dispositivo {
    public Cd(String nombre, int capacidad, int rpm, ArrayList<String> contenido, int size){
        super(nombre, capacidad, rpm, contenido, size);
    }
    public String giro(){
        return ("El cd está girando a "+rpm+" por minuto");
    }

    public String leer(){
        return ("El cd está leyendo los datos mediante laser...");
    }
    public String escribir(){
        return ("El cd está escribiendo los datos mediante laser...");
    }
}
