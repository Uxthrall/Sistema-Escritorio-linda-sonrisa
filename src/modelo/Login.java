
package modelo;


public class Login {
    private String usuario;
    private String contrasenia;
    private int tipo_user;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Login() {
    }

    public Login(String usuario, String contrasenia, int tipo_user) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.tipo_user = tipo_user;
    }

    public int getTipo_user() {
        return tipo_user;
    }

    public void setTipo_user(int tipo_user) {
        this.tipo_user = tipo_user;
    }
    
    

  
   
    
    
}
