import java.util.ArrayList;

public abstract class Dispositivo {
    private String nombre;
    private int capacidad;
    protected int rpm;
    private ArrayList<String> contenido;
    int size;
    public Dispositivo(String nombre, int capacidad, int rpm, ArrayList<String> contenido, int size){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.rpm=rpm;
        this.contenido=contenido;
        this.size=size;
    }

    public ArrayList<String> getContenido() {
        return contenido;
    }
    public String getContenido(ArrayList<String> contenido){
        String content="";
        for(int i=0;i< contenido.size();i++){
            content+=(i+1)+") "+contenido.get(i)+"\n";
        }
        return content;
    }


    public void setContenido(ArrayList<String> contenido) {
        this.contenido.addAll(contenido);
    }

    public void setContenido(String contenido){
        this.contenido.add(contenido);
    }
    public abstract String giro();
    public abstract String leer();
    public abstract String escribir();
    public String informacion(){
        return ("Nombre: "+nombre+"\nTamaño: "+size+" cm\nCapacidad: "+capacidad+" Mb\nTipo de disco: "+obtenerTipo()+"\nContenido: \n"+getContenido(contenido));
    }

    public String obtenerTipo(){
        String tipo="";
        switch (this.getClass().getSimpleName()){
            case "Cd":
                tipo= "CD";
                break;
            case "DiscoDuro":
                tipo="Disco Duro";
                break;
            case "Vinilo":
                tipo= "Vinilo";
                break;
            case "BluRay":
                tipo= "bluRay";
                break;
        }return tipo;
    }
}

