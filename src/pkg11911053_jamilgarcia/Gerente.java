package pkg11911053_jamilgarcia;

import java.util.ArrayList;

public class Gerente extends Persona{
    
    private String usuario_g; 
    private String pass_p; 
    private String cargo_p; 

    public Gerente() {
        super();
    }

    public Gerente(String usuario_g, String pass_p, String cargo_p, String id_p, String nombre_p, int edad_p, String sexo_p, String estado_p, double altura_p, int peso_p) {
        super(id_p, nombre_p, edad_p, sexo_p, estado_p, altura_p, peso_p);
        this.usuario_g = usuario_g;
        this.pass_p = pass_p;
        this.cargo_p = cargo_p;
    }

    public String getUsuario_g() {
        return usuario_g;
    }

    public void setUsuario_g(String usuario_g) {
        this.usuario_g = usuario_g;
    }

    public String getPass_p() {
        return pass_p;
    }

    public void setPass_p(String pass_p) {
        this.pass_p = pass_p;
    }

    public String getCargo_p() {
        return cargo_p;
    }

    public void setCargo_p(String cargo_p) {
        this.cargo_p = cargo_p;
    }

    public ArrayList<Mensaje> getMensajes_p() {
        return mensajes_p;
    }

    public void setMensajes_p(ArrayList<Mensaje> mensajes_p) {
        this.mensajes_p = mensajes_p;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
