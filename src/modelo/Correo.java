
package modelo;


public class Correo {
    private String usuarioCorreo;
    private String contrasenia;
    private String rutArchivo;
    private String nombreArchivo;
    private String destino;
    private String asunto;
    private String mensaje;

    public Correo(String usuarioCorreo, String contrasenia, String rutArchivo, String nombreArchivo, String destino, String asunto, String mensaje) {
        this.usuarioCorreo = usuarioCorreo;
        this.contrasenia = contrasenia;
        this.rutArchivo = rutArchivo;
        this.nombreArchivo = nombreArchivo;
        this.destino = destino;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public Correo() {
    }

    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRutArchivo() {
        return rutArchivo;
    }

    public void setRutArchivo(String rutArchivo) {
        this.rutArchivo = rutArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
