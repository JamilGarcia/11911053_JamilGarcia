package pkg11911053_jamilgarcia;

public class Zapatos extends Objeto{
    
    private int talla_z; 
    private String descripS_z; 
    private int comodidad_z; 

    public Zapatos() {
    }

    public Zapatos(int talla_z, String descripS_z, int comodidad_z, String color_o, String descrip_o, String marca_o, int tamanio_o, Persona persona_o, String calidad) {
        super(color_o, descrip_o, marca_o, tamanio_o, persona_o, calidad);
        this.talla_z = talla_z;
        this.descripS_z = descripS_z;
        this.comodidad_z = comodidad_z;
    }

    

    public int getTalla_z() {
        return talla_z;
    }

    public void setTalla_z(int talla_z) {
        this.talla_z = talla_z;
    }

    public String getDescripS_z() {
        return descripS_z;
    }

    public void setDescripS_z(String descripS_z) {
        this.descripS_z = descripS_z;
    }

    public int getComodidad_z() {
        return comodidad_z;
    }

    public void setComodidad_z(int comodidad_z) {
        this.comodidad_z = comodidad_z;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
