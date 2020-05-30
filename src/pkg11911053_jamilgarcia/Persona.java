package pkg11911053_jamilgarcia;

import java.util.ArrayList;

public class Persona {
    
    private String id_p; 
    private String nombre_p; 
    private int edad_p; 
    private String sexo_p; 
    private String estado_p; 
    private double altura_p; 
    private int peso_p; 
    ArrayList <Mensaje> mensajes_p = new ArrayList(); 

    public Persona() {
    }

    public Persona(String id_p, String nombre_p, int edad_p, String sexo_p, String estado_p, double altura_p, int peso_p) {
        this.id_p = id_p;
        this.nombre_p = nombre_p;
        this.edad_p = edad_p;
        this.sexo_p = sexo_p;
        this.estado_p = estado_p;
        this.altura_p = altura_p;
        this.peso_p = peso_p;
    }

    public String getId_p() {
        return id_p;
    }

    public void setId_p(String id_p) {
        this.id_p = id_p;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public int getEdad_p() {
        return edad_p;
    }

    public void setEdad_p(int edad_p) {
        this.edad_p = edad_p;
    }

    public String getSexo_p() {
        return sexo_p;
    }

    public void setSexo_p(String sexo_p) {
        this.sexo_p = sexo_p;
    }

    public String getEstado_p() {
        return estado_p;
    }

    public void setEstado_p(String estado_p) {
        this.estado_p = estado_p;
    }

    public double getAltura_p() {
        return altura_p;
    }

    public void setAltura_p(double altura_p) {
        this.altura_p = altura_p;
    }

    public int getPeso_p() {
        return peso_p;
    }

    public void setPeso_p(int peso_p) {
        this.peso_p = peso_p;
    }

    public ArrayList<Mensaje> getMensajes_p() {
        return mensajes_p;
    }

    public void setMensajes_p(ArrayList<Mensaje> mensajes_p) {
        this.mensajes_p = mensajes_p;
    }

    @Override
    public String toString() {
        return id_p + "/" + nombre_p;
    }
    
    
    
}
