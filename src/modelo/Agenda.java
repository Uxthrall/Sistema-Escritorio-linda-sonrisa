package modelo;

import java.util.Date;
import javax.swing.JOptionPane;

public class Agenda 
{
    private Date fecha;
    private String hora;
    private int reservado;
    private String profesional_rut;

    public Agenda(Date fecha, String hora, int reservado, String profesional_rut) {
        this.fecha = fecha;
        this.hora = hora;
        this.reservado = reservado;
        this.profesional_rut = profesional_rut;
    }

    public Agenda() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        
        if (fecha==null) {
             JOptionPane.showMessageDialog(null, "Ingrese Fecha");
        }
        else
        {
            this.fecha = fecha;
        }
            
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        
        this.hora = hora;
    }

    public int getReservado() {
        return reservado;
    }

    public void setReservado(int reservado) {
        this.reservado = reservado;
    }

    public String getProfesional_rut() {
        return profesional_rut;
    }

    public void setProfesional_rut(String profesional_rut) {
        if (profesional_rut.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecciones profesional"+JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            this.profesional_rut = profesional_rut;
        }
            
    }
    
    
}
