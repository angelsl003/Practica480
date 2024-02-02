import java.util.ArrayList;

public class Vinilo extends Dispositivo {
    public Vinilo(String nombre, int capacidad, int rpm, ArrayList<String> contenido, int size){
        super(nombre, capacidad, rpm, contenido, size);
    }
    public String giro(){
        return ("El vinilo está girando a "+rpm+" por minuto");
    }

    public String leer(){
        return ("El vinilo está leyendo los datos mediante aguja...");
    }
    public String escribir(){
        return ("El vinilo está escribiendo los datos mediante aguja...");
    }
}
