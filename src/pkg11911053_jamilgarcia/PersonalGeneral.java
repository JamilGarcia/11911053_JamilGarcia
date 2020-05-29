package pkg11911053_jamilgarcia;

import java.util.ArrayList;

public class PersonalGeneral extends Persona{
    
    private String ocupacion_pg; 
    private String horario_pg; 
    private int tiemtrab_pg; 
    private int sueldo_pg; 

    public PersonalGeneral() {
        super(); 
    }

    public PersonalGeneral(String ocupacion_pg, String horario_pg, int tiemtrab_pg, int sueldo_pg, String id_p, String nombre_p, int edad_p, String sexo_p, String estado_p, double altura_p, int peso_p) {
        super(id_p, nombre_p, edad_p, sexo_p, estado_p, altura_p, peso_p);
        this.ocupacion_pg = ocupacion_pg;
        this.horario_pg = horario_pg;
        this.tiemtrab_pg = tiemtrab_pg;
        this.sueldo_pg = sueldo_pg;
    }

    public String getOcupacion_pg() {
        return ocupacion_pg;
    }

    public void setOcupacion_pg(String ocupacion_pg) {
        this.ocupacion_pg = ocupacion_pg;
    }

    public String getHorario_pg() {
        return horario_pg;
    }

    public void setHorario_pg(String horario_pg) {
        this.horario_pg = horario_pg;
    }

    public int getTiemtrab_pg() {
        return tiemtrab_pg;
    }

    public void setTiemtrab_pg(int tiemtrab_pg) {
        this.tiemtrab_pg = tiemtrab_pg;
    }

    public int getSueldo_pg() {
        return sueldo_pg;
    }

    public void setSueldo_pg(int sueldo_pg) {
        this.sueldo_pg = sueldo_pg;
    }

    public ArrayList<String> getMensajes_p() {
        return mensajes_p;
    }

    public void setMensajes_p(ArrayList<String> mensajes_p) {
        this.mensajes_p = mensajes_p;
    }

    @Override
    public String toString() {
        return "PersonalGeneral{" + "ocupacion_pg=" + ocupacion_pg + ", horario_pg=" + horario_pg + ", tiemtrab_pg=" + tiemtrab_pg + ", sueldo_pg=" + sueldo_pg + '}';
    }
    
    
    
}
