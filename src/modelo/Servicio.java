package modelo;
import javax.swing.JOptionPane;


public class Servicio {
    private String id_servicio;
    private String descripcion;
    private String rut_profesional;
    private String nombre_prof;

    public String getNombre_prof() {
        return nombre_prof;
    }

    public void setNombre_prof(String nombre_prof) {
        if (nombre_prof.isEmpty()) {
            JOptionPane.showMessageDialog(null, "el campo no debe estar vacio");
        }else if (nombre_prof.length() > 40) 
        {
            JOptionPane.showMessageDialog(null, "Ha excedido el largo permitido");
        }else
        {
            this.nombre_prof = nombre_prof; 
        }
    }

    public Servicio(String id_servicio, String descripcion, String rut_profesional, String nombre_prof) {
        this.id_servicio = id_servicio;
        this.descripcion = descripcion;
        this.rut_profesional = rut_profesional;
        this.nombre_prof = nombre_prof;
    }

    public Servicio() {
    }

    public Servicio(String id_servicio, String descripcion, String rut_profesional) {
        this.id_servicio = id_servicio;
        this.descripcion = descripcion;        
        this.rut_profesional = rut_profesional;
    }

    public Servicio(String rut_profesional) {
        this.rut_profesional = rut_profesional;
    }
    
    
    public String getRut_profesional() {
        return rut_profesional;
    }

    public void setRut_profesional(String rut_profesional) {
        if (rut_profesional.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo no debe estar vacio");
        }else if (rut_profesional.length() > 8) {
            JOptionPane.showMessageDialog(null, "Ha excedido el largo permitido");
        }else if (rut_profesional.length() < 7) {
            JOptionPane.showMessageDialog(null, "El largo minimo debe ser de 8 o 7");
        }else 
        {
            this.rut_profesional = rut_profesional;
        }
    }

   

    public String getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(String id_servicio) {
        if (id_servicio.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo no debe estar vacio");
        }else if (id_servicio.length()> 8) 
        {
            JOptionPane.showMessageDialog(null, "Ha superado el largo maximo");
        }
        
        this.id_servicio = id_servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if(descripcion.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo no debe estar vacio");
        }else if(descripcion.length() > 50)
        {
            JOptionPane.showMessageDialog(null, "Ha superado el largo permitido");
        }else
        {
            this.descripcion = descripcion;
        }
    }

   
    
    
    
}
