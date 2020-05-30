package pkg11911053_jamilgarcia;

public class Ropa extends Objeto{
    
    private String talla_r; 
    private String tela_r; 
    private String pais_r; 

    public Ropa() {
    }

    public Ropa(String talla_r, String tela_r, String pais_r, String color_o, String descrip_o, String marca_o, int tamanio_o, Persona persona_o, String calidad) {
        super(color_o, descrip_o, marca_o, tamanio_o, persona_o, calidad);
        this.talla_r = talla_r;
        this.tela_r = tela_r;
        this.pais_r = pais_r;
    }

   

    public String getTalla_r() {
        return talla_r;
    }

    public void setTalla_r(String talla_r) {
        this.talla_r = talla_r;
    }

    public String getTela_r() {
        return tela_r;
    }

    public void setTela_r(String tela_r) {
        this.tela_r = tela_r;
    }

    public String getPais_r() {
        return pais_r;
    }

    public void setPais_r(String pais_r) {
        this.pais_r = pais_r;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
