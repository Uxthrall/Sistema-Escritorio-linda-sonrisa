
package modelo;

import java.sql.Date;
import javax.swing.JOptionPane;


public class Recepcion {
    private String codigo;
    private String fecha;
    private String id_orden;
    private String proveedor;
    private String profesional;

    public Recepcion() {
    }

    public Recepcion(String codigo, String fecha, String id_orden, String proveedor, String profesional) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.id_orden = id_orden;
        this.proveedor = proveedor;
        this.profesional = profesional;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.length()>20) {
            JOptionPane.showMessageDialog(null, "Campo codigo maximo de lo permitido");
        }
        else if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo codigo vacio");
        }
        else
        {
            this.codigo = codigo;
        }            
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        if (fecha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "campo fecha esta vacia");
        }
        else if (fecha.length() > 16) {
            JOptionPane.showMessageDialog(null, "campo fecha maximo de lo  permitido");
        }
        else
        {
            this.fecha = fecha;
        }
            
    }

    

    public String getId_orden() {
        return id_orden;
    }

    public void setId_orden(String id_orden) {
        if (id_orden.length()>8) {
            JOptionPane.showMessageDialog(null, "campo Id Orden maximo de lo  permitido");
        }
        else if (id_orden.isEmpty()) {
             JOptionPane.showMessageDialog(null, "campo Id Orden esta vacia");
        }
        else
        {
            this.id_orden = id_orden;
        }            
            
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        if (proveedor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "campo proveedor vacio");
        }
        else{
            this.proveedor = proveedor;
        }
        
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        if (profesional.isEmpty()) {
            JOptionPane.showMessageDialog(null, "campo profesional vacio");
        }
        else
        {
            this.profesional = profesional;
        }
        
    }
    
    
}
