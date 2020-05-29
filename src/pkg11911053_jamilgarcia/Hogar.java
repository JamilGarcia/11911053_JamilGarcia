package pkg11911053_jamilgarcia;

public class Hogar extends Objeto{
    
    private String parte_h; 
    private String instruc_h; 
    private int tiempoG_h; 

    public Hogar() {
    }

    public Hogar(String parte_h, String instruc_h, int tiempoG_h, String color_o, String descrip_o, String marca_o, int tamanio_o, Persona persona_o) {
        super(color_o, descrip_o, marca_o, tamanio_o, persona_o);
        this.parte_h = parte_h;
        this.instruc_h = instruc_h;
        this.tiempoG_h = tiempoG_h;
    }

    public String getParte_h() {
        return parte_h;
    }

    public void setParte_h(String parte_h) {
        this.parte_h = parte_h;
    }

    public String getInstruc_h() {
        return instruc_h;
    }

    public void setInstruc_h(String instruc_h) {
        this.instruc_h = instruc_h;
    }

    public int getTiempoG_h() {
        return tiempoG_h;
    }

    public void setTiempoG_h(int tiempoG_h) {
        this.tiempoG_h = tiempoG_h;
    }

    @Override
    public String toString() {
        return super.toString()+"Hogar{" + "parte_h=" + parte_h + ", instruc_h=" + instruc_h + ", tiempoG_h=" + tiempoG_h + '}';
    }
    
    
}
