package modelo;

import javax.swing.JOptionPane;

public class Proveedor {
    
    private String run;
    private String dv_run;
    private String nombre;
    private String descripcion; 
    private String direccion;
    private String comuna;
    private String ciudad;
    private String email;
    private int celular;     
    private int n_direccion;
    
    

    public Proveedor() {
    }

    public Proveedor(String run, String dv_run, String nombre, String descripcion, String direccion, String comuna, String ciudad, String email,  int celular, int n_direccion) {
        this.run = run;
        this.dv_run = dv_run;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.email = email;
        this.celular = celular;
        this.n_direccion = n_direccion;
    }

    public Proveedor(String run, String email) {
        this.run = run;
        this.email = email;
    }
    
    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        
        if (run.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo run  no debe estar vacio");
        }else if (run.length() == 9 ) {
            this.run = run;        
        }else 
        {
            JOptionPane.showMessageDialog(null, "El RUT ha excedido el largo permitido");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if(descripcion.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo no debe estar vacio");
        }else if(descripcion.length() > 60)
        {
            JOptionPane.showMessageDialog(null, "Ha superado el largo permitido");
        }else
        {
            this.descripcion = descripcion;
        }
    }

    public String getDv_run() {
        return dv_run;
    }

    public void setDv_run(String dv_run) {
        
        if (dv_run.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El digito verificador no puede estar vacio");
        }else if (dv_run.length() > 1) {
            JOptionPane.showMessageDialog(null, "el digito verificador no puede tener un largo mayor a 1");
        }else 
        {
            this.dv_run = dv_run;            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "el campo no debe estar vacio");
        }else if (nombre.length() > 60) 
        {
            JOptionPane.showMessageDialog(null, "Ha excedido el largo permitido");
        }else
        {
            this.nombre = nombre; 
        }
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        
        String cel = Integer.toString(celular);
        if (cel.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        }else if (cel.length() > 9) 
        {
            JOptionPane.showMessageDialog(null, "ha excedido el largo permitido");
        }else if (cel.length() < 9) 
        {
            JOptionPane.showMessageDialog(null, "No ha cumplico con el minimo de caracteres");
        }else
        {
            this.celular = celular;    
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        
        if (email.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        }else if (email.length() > 60) 
        {
            JOptionPane.showMessageDialog(null, "Ha excedido el largo maximo de caracteres");
        }else
        {
            this.email = email;    
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        
        if(direccion.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo no debe estar vacio");
        }else if(direccion.length() > 60)
        {
            JOptionPane.showMessageDialog(null, "Ha superado el largo permitido");
        }else
        {
            this.direccion = direccion;
        }
    }

    public int getN_direccion() {
        return n_direccion;
    }

    public void setN_direccion(int n_direccion) {
        
        String direc = Integer.toString(n_direccion);
        if(direc.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo no debe estar vacio");
        }else if(direc.length() > 6)
        {
            JOptionPane.showMessageDialog(null, "Ha superado el largo permitido");
        }else
        {
            this.n_direccion = n_direccion;
        }
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        if(comuna.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo no debe estar vacio");
        }else if(comuna.length() > 60)
        {
            JOptionPane.showMessageDialog(null, "Ha superado el largo permitido");
        }else
        {
            this.comuna = comuna;
        }
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if(ciudad.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo no debe estar vacio");
        }else if(ciudad.length() > 60)
        {
            JOptionPane.showMessageDialog(null, "Ha superado el largo permitido");
        }else
        {
            this.ciudad = ciudad;
        }
    }

   

    @Override
    public String toString() {
        return "Proveedor{" + "run=" + run + ", descripcion=" + descripcion + ", dv_run=" + dv_run + ", nombre=" + nombre + ", celular=" + celular + ", email=" + email + ", direccion=" + direccion + ", n_direccion=" + n_direccion + ", comuna=" + comuna + ", ciudad=" + ciudad  + '}';
    }
    
    
}
