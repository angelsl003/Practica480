import java.util.ArrayList;

public class DiscoDuro extends Dispositivo {
    public DiscoDuro(String nombre, int capacidad, int rpm, ArrayList<String> contenido, int size){
        super(nombre, capacidad, rpm, contenido,size);
    }
    public String giro(){
        return ("El disco duro está girando a "+rpm+" por minuto");
    }

    public String leer(){
        return ("El disco duro está leyendo los datos mediante cabezal magnético...");
    }
    public String escribir(){
        return ("El disco duro está escribiendo los datos mediante cabezal magnético...");
    }
}
