package modelo;

import javax.swing.JOptionPane;


public class Profesional {
    private String rut;
    private String dv_rut;
    private String nombre;
    private String p_apellido;
    private String s_apellido;
    private String password;
    private int tipo_usuario;
    private String email;
    private int celular;

    public Profesional(String rut, String dv_rut, String nombre, String p_apellido, 
                             String s_apellido, String password, int tipo_usuario, String email, 
                             int celular) {
        this.rut = rut;
        this.dv_rut = dv_rut;
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
        this.password = password;
        this.tipo_usuario = tipo_usuario;
        this.email = email;
        this.celular = celular;
    }

    public Profesional() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        
        if (rut.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo rut no debe estar vacio");
        }else if (rut.length() > 8) {
            JOptionPane.showMessageDialog(null, "El campo rut Ha excedido el largo permitido");
        }else if (rut.length() < 7) {
            JOptionPane.showMessageDialog(null, "El campo rut: El largo minimo debe ser de 8 o 7");
        }else 
        {
            this.rut = rut;
        }
    }

    public String getDv_rut() {
        return dv_rut;
    }

    public void setDv_rut(String dv_rut) {
        
        if (dv_rut.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El digito verificador no puede estar vacio");
        }else if (dv_rut.length() > 1) {
            JOptionPane.showMessageDialog(null, "el digito verificador no puede tener un largo mayor a 1");
        }else 
        {
            this.dv_rut = dv_rut;            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo nombre no debe estar vacio");
        }else if (nombre.length() > 40) 
        {
            JOptionPane.showMessageDialog(null, "El campo nombre Ha excedido el largo permitido");
        }else
        {
            this.nombre = nombre; 
        }
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public void setP_apellido(String p_apellido) {
        
        if (p_apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo primer apellido no debe estar vacio");
        }else if (p_apellido.length() > 40) 
        {
            JOptionPane.showMessageDialog(null, "El campo primer apellido Ha excedido el largo permitido");
        }else
        {
            this.p_apellido = p_apellido; 
        }
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        
        if (s_apellido.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo segundo apellido no debe estar vacio");
        }else if (s_apellido.length() > 40) 
        {
            JOptionPane.showMessageDialog(null, "El campo segundo apellido Ha excedido el largo permitido");
        }else
        {
            this.s_apellido = s_apellido; 
        }
    }

  

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo contraseña no puede estar vacio");
        }else if (password.length() > 20) 
        {
            JOptionPane.showMessageDialog(null, "El campo contraseña Ha excedido el largo maximo de caracteres");
        }else if (password.length() < 8) 
        {
            JOptionPane.showMessageDialog(null, "El minimo de la contraseña debe ser de 8 caracteres");
        }else 
        {
            this.password = password;    
        }
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        String type = Integer.toString(tipo_usuario);
        if (type.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El tipo_usuario no puede estar vacio");
        }else if (type.length() > 1) {
            JOptionPane.showMessageDialog(null, "El tipo_usuario no puede tener un largo mayor a 1");
        }else 
        {
            this.tipo_usuario = tipo_usuario;            
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo email no puede estar vacio");
        }else if (email.length() > 20) 
        {
            JOptionPane.showMessageDialog(null, "El campo email Ha excedido el largo maximo de caracteres");
        }else
        {
            this.email = email;    
        }
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        String cel = Integer.toString(celular);
        if (cel.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo celular no puede estar vacio");
        }else if (cel.length() > 9) 
        {
            JOptionPane.showMessageDialog(null, "El campo celular  ha excedido el largo permitido");
        }else if (cel.length() < 9) 
        {
            JOptionPane.showMessageDialog(null, "El campo celular No ha cumplico con el minimo de caracteres");
        }else
        {
            this.celular = celular;    
        }
    }

   
    
    
}
