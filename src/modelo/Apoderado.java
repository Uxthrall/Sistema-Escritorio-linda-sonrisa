
package modelo;

import javax.swing.JOptionPane;


public class Apoderado {
    private String rut;
    private String dvRut;
    private String contra;
    private String nombre;
    private String p_apellido;
    private String s_apelledio;
    private int celular;    
    private String email;
    private String direccion;
    private int tipo_usuario;
    private int n_direccion;
    private String comuna;
    private String ciudad;
    public Apoderado() {
    }

    public Apoderado(String rut, String dvRut,  String contra, String nombre, String p_apellido, String s_apelledio, int celular, 
            String email, String direccion, int tipo_usuario, int n_direccion, String comuna, String ciudad) {
        this.rut = rut;
        this.dvRut = dvRut;
        this.contra = contra;
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apelledio = s_apelledio;
        this.celular = celular;
        this.email = email;
        this.direccion = direccion;
        this.tipo_usuario = tipo_usuario;
        this.n_direccion = n_direccion;
        this.comuna = comuna;
        this.ciudad = ciudad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (rut.length()==8 || rut.length()==7) {
            this.rut = rut;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El run debe ser de 7 o 8 digitos");
        }
            
    }

    public String getDvRut() {
        return dvRut;
    }

    public void setDvRut(String dvRut) {
        if (dvRut.length()==1) {
            this.dvRut = dvRut;
        }
        else if (dvRut.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El digito del rut vacio");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El digito del rut debe tener 1 digito");
        }
            
    }

    

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        
        if (contra.length()>20) 
        {
            JOptionPane.showMessageDialog(null, "Campo Contraseña maximo de lo permitido");
        }
        else if (contra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Llenar el Campo Contraseña");
        }else if (contra.length() < 8) 
        {
            JOptionPane.showMessageDialog(null, "El minimo de la contraseña debe ser de 8 caracteres");
        }
        else
        {
            this.contra = contra;
        }           
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Llenar el Campo Nombre");
        }
        else if (nombre.length()>25) {
            JOptionPane.showMessageDialog(null, "Campo nombre maximo de lo permitido");
        }
        else
        {
            this.nombre = nombre;
        }          
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public void setP_apellido(String p_apellido) {
        if (p_apellido.length()>30) 
        {
            JOptionPane.showMessageDialog(null, "Campo apellido maximo de lo permitido");
        }
        else if (p_apellido.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Campo apellido vacio");
        }
        else
        {
            this.p_apellido = p_apellido;
        }
        
    }

    public String getS_apelledio() {
        return s_apelledio;
    }

    public void setS_apelledio(String s_apelledio) 
    {
        if (s_apelledio.length()>30) {
            JOptionPane.showMessageDialog(null, "Campo segundo apellido maximo de lo permitido");
        }
        else if (s_apelledio.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo segundo apellido vacio");
        }
        else
        {
            this.s_apelledio = s_apelledio;
        }
        
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) 
    {
        String Celular= Integer.toString(celular);
        if (Celular.length()>9) {
            JOptionPane.showMessageDialog(null, "Campo celular maximo de lo permitido");
        }
        else if (Celular.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo celular vacio");
        }
        else if (Celular.length()<9) {
            JOptionPane.showMessageDialog(null, "Campo celular no cumple con lo permitido");
        }
        else
        {
            this.celular = celular;
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) 
    {
        if (email.length()>60) {
            JOptionPane.showMessageDialog(null, "Campo email maximo de lo permitido");
        }
        else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo email vacio");
        }
        else
        {
            this.email = email;
        }     
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion.length()>60) {
            JOptionPane.showMessageDialog(null, "Campo direccion maximo de lo permitido");
        }
        else if(direccion.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Campo direccion vacio");
        }
        else
        {
            this.direccion = direccion;
        }
        
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {  
        String tipoUsuario= Integer.toString(tipo_usuario);  
        if (tipoUsuario.length()==1) {
            this.tipo_usuario = tipo_usuario;
        }
        else if (tipoUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tipo usuario No indicado");
        }
        
    }

    public int getN_direccion() {
        return n_direccion;
    }

    public void setN_direccion(int n_direccion) 
    {
        String nDireccion = Integer.toString(n_direccion);
        if (nDireccion.length()>6) {
            JOptionPane.showMessageDialog(null, "Campo Numero Direccion maximo de lo permitido");
        }
        else if (nDireccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo Numero Direccion No indicado");
        }
        else
        {
            this.n_direccion = n_direccion;
        }
 
            
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) 
    {
        if (comuna.length()>40) {
            JOptionPane.showMessageDialog(null, "Campo comuna maximo de lo permitido");
        }
        else if (comuna.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo comuna No indicado");
        }
        else
        {
            this.comuna = comuna;
        }      
        
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if (ciudad.length()>40) {
            JOptionPane.showMessageDialog(null, "Campo ciudad maximo de lo permitido");
        }
        else if (ciudad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo ciudad No indicado");
        }
        else
        {
            this.ciudad = ciudad;
        }
            
        
    }

   

    @Override
    public String toString() {
        return "Apoderado{" + "rut=" + rut + ", dvRut=" + dvRut +  ", contra=" + contra + ", nombre=" + nombre + ", p_apellido=" + p_apellido + ", s_apelledio=" + s_apelledio + ", celular=" + celular + ", email=" + email + ", direccion=" + direccion + ", tipo_usuario=" + tipo_usuario + ", n_direccion=" + n_direccion + ", comuna=" + comuna + ", ciudad=" + ciudad  + '}';
    }
    
    
    
    
}
