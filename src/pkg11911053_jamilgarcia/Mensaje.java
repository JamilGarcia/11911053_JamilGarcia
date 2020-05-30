package pkg11911053_jamilgarcia;

public class Mensaje {
    
    private String Emisor;
    private String Receptor;
    private String Mensaje;

    public Mensaje() {
    }

    public Mensaje(String Emisor, String Receptor, String Mensaje) {
        this.Emisor = Emisor;
        this.Receptor = Receptor;
        this.Mensaje = Mensaje;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    @Override
    public String toString() {
        return Emisor + "--> " + Receptor + ": " + Mensaje; 
    }
    
    
}
