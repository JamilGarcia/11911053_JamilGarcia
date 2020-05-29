package pkg11911053_jamilgarcia;

public class Objeto {
    
    private String color_o; 
    private String descrip_o; 
    private String marca_o; 
    private int tamanio_o; 
    private Persona persona_o; 

    public Objeto() {
    }

    public Objeto(String color_o, String descrip_o, String marca_o, int tamanio_o, Persona persona_o) {
        this.color_o = color_o;
        this.descrip_o = descrip_o;
        this.marca_o = marca_o;
        this.tamanio_o = tamanio_o;
        this.persona_o = persona_o;
    }

    public String getColor_o() {
        return color_o;
    }

    public void setColor_o(String color_o) {
        this.color_o = color_o;
    }

    public String getDescrip_o() {
        return descrip_o;
    }

    public void setDescrip_o(String descrip_o) {
        this.descrip_o = descrip_o;
    }

    public String getMarca_o() {
        return marca_o;
    }

    public void setMarca_o(String marca_o) {
        this.marca_o = marca_o;
    }

    public int getTamanio_o() {
        return tamanio_o;
    }

    public void setTamanio_o(int tamanio_o) {
        this.tamanio_o = tamanio_o;
    }

    public Persona getPersona_o() {
        return persona_o;
    }

    public void setPersona_o(Persona persona_o) {
        this.persona_o = persona_o;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color_o=" + color_o + ", descrip_o=" + descrip_o + ", marca_o=" + marca_o + ", tamanio_o=" + tamanio_o + ", persona_o=" + persona_o + '}';
    }
    
    
    
}
