
package modelo;

import javax.swing.JOptionPane;

public class Orden {
    private String id_orden;
    private String nom_product;
    private int stock;
    private String descripcion;
    private String rut_proveedor;
    private String rut_profesional;

    public Orden() {
    }

    public Orden(String id_orden, String nom_product, int stock, String descripcion, String rut_proveedor, String rut_profesional) {
        this.id_orden = id_orden;
        this.nom_product = nom_product;
        this.stock = stock;
        this.descripcion = descripcion;
        this.rut_proveedor = rut_proveedor;
        this.rut_profesional = rut_profesional;
    }

    public String getId_orden() {
        return id_orden;
    }

    public void setId_orden(String id_orden) {
        if (id_orden.length()>8) {
            JOptionPane.showMessageDialog(null,"Campo id orden maximo de lo permitido");
        }
        else if (id_orden.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Campo id orden Vacio");
        }
        else
        {
            this.id_orden = id_orden;
        }
        
    }

    public String getNom_product() {
        return nom_product;
    }

    public void setNom_product(String nom_product) 
    {
        if (nom_product.length()>60) {
            JOptionPane.showMessageDialog(null,"Campo Nombre Producto maximo de lo permitido");
        }
        else if (nom_product.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Campo Nombre Producto Vacio");
        }
        else
        {
            this.nom_product = nom_product;
        }
        
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        String Stock= Integer.toString(stock);
        
        if (Stock.length()>4) {
            JOptionPane.showMessageDialog(null,"Campo stock Producto maximo de lo permitido");
        }else if (Stock.isEmpty()) {
           JOptionPane.showMessageDialog(null,"Campo stock Producto Vacio"); 
        }
        else
        {
            this.stock = stock;
        }
                
                
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.length()>60) {
            JOptionPane.showMessageDialog(null,"Campo descripcion Producto maximo de lo permitido");
        }
        else if (descripcion.isEmpty()) {
             JOptionPane.showMessageDialog(null,"Campo descripcion Producto Vacio"); 
        }
        else
        {
            this.descripcion = descripcion;
        }
        
    }

    public String getRut_proveedor() {
        return rut_proveedor;
    }

    public void setRut_proveedor(String rut_proveedor) {
        if (rut_proveedor.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Campo rut proveedor  Vacio"); 
        }
        else{
            this.rut_proveedor = rut_proveedor;
        }
                
        
    }

    public String getRut_profesional() {
        return rut_profesional;
    }

    public void setRut_profesional(String rut_profesional) {
        if (rut_profesional.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Campo rut profesional  Vacio"); 
        }
        else{
            this.rut_profesional = rut_profesional;
        }
    }
    
    
}
