/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel;


import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Proveedor;
import modelo.ProveedorDAO;
import javax.swing.JOptionPane;

public class pnlProveedor extends javax.swing.JPanel {

    /**
     * Creates new form pnlProveedor
     */
    public pnlProveedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCelular = new javax.swing.JTextField();
        txtp_nombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jlComuna = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        TxtN_direccion = new javax.swing.JTextField();
        txtRun = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jlNumeroDireccion = new javax.swing.JLabel();
        jlCelular = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jlDireccion = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        jlRun = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        TxtDvrun = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jlemail = new javax.swing.JLabel();
        TxtCiudad = new javax.swing.JTextField();
        jlCiudad = new javax.swing.JLabel();
        TxtComuna = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCelular.setBackground(new java.awt.Color(204, 204, 255));
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        txtp_nombre.setBackground(new java.awt.Color(204, 204, 255));
        txtp_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtp_nombreKeyTyped(evt);
            }
        });

        txtDireccion.setBackground(new java.awt.Color(204, 204, 255));
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        jlComuna.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlComuna.setForeground(new java.awt.Color(0, 0, 255));
        jlComuna.setText("Comuna");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        TxtN_direccion.setBackground(new java.awt.Color(204, 204, 255));
        TxtN_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtN_direccionActionPerformed(evt);
            }
        });
        TxtN_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtN_direccionKeyTyped(evt);
            }
        });

        txtRun.setBackground(new java.awt.Color(204, 204, 255));
        txtRun.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRunKeyTyped(evt);
            }
        });

        jlNombre.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(0, 0, 255));
        jlNombre.setText("Nombres ");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jlNumeroDireccion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlNumeroDireccion.setForeground(new java.awt.Color(0, 0, 255));
        jlNumeroDireccion.setText("N°");

        jlCelular.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlCelular.setForeground(new java.awt.Color(0, 0, 255));
        jlCelular.setText("Celular");

        txtemail.setBackground(new java.awt.Color(204, 204, 255));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jlDireccion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlDireccion.setForeground(new java.awt.Color(0, 0, 255));
        jlDireccion.setText("Direccion");

        lbDescripcion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbDescripcion.setForeground(new java.awt.Color(0, 0, 255));
        lbDescripcion.setText("Descripcion ");

        jlRun.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlRun.setForeground(new java.awt.Color(0, 0, 255));
        jlRun.setText("Run Empresarial");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("-");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        TxtDvrun.setBackground(new java.awt.Color(204, 204, 255));
        TxtDvrun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDvrunKeyTyped(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(204, 204, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jlemail.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlemail.setForeground(new java.awt.Color(0, 0, 255));
        jlemail.setText("E-Mail");

        TxtCiudad.setBackground(new java.awt.Color(204, 204, 255));
        TxtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCiudadKeyTyped(evt);
            }
        });

        jlCiudad.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlCiudad.setForeground(new java.awt.Color(0, 0, 255));
        jlCiudad.setText("Ciudad");

        TxtComuna.setBackground(new java.awt.Color(204, 204, 255));
        TxtComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtComunaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDvrun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 352, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtp_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbDescripcion)
                                    .addGap(26, 26, 26)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlRun, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(195, 195, 195)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlemail)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(107, 107, 107))
                                        .addComponent(TxtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlDireccion)
                            .addGap(18, 18, 18)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlNumeroDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(TxtN_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDvrun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(115, 115, 115)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlRun)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlNombre)
                        .addComponent(txtp_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlDireccion)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlNumeroDireccion)
                        .addComponent(TxtN_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(14, 14, 14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCiudad)
                        .addComponent(TxtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlComuna))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlemail)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlCelular)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbDescripcion)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(170, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtN_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtN_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtN_direccionActionPerformed

    private void TxtN_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtN_direccionKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C)&&Character.isLetter(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo Numeros ");
            TxtN_direccion.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=65 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=97 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo Numeros..sin espacio");
            TxtN_direccion.setCursor(null);
        }
    }//GEN-LAST:event_TxtN_direccionKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String run =txtRun.getText();

        ProveedorDAO provDao= new ProveedorDAO();
        Proveedor prov = provDao.buscarProveedor(run);

        if (prov==null) {
            JOptionPane.showMessageDialog(this,"Rut no existe");
        }
        else{
            txtRun.setEditable(false);
            TxtDvrun.setText(prov.getDv_run());
            TxtDvrun.setEditable(false);
            txtp_nombre.setText(prov.getNombre());
            txtDescripcion.setText(prov.getDescripcion());
            txtCelular.setText(String.valueOf(prov.getCelular()));
            txtemail.setText(prov.getEmail());
            txtDireccion.setText(prov.getDireccion());
            TxtN_direccion.setText(String.valueOf(prov.getN_direccion()));
            TxtComuna.setText(prov.getComuna());
            TxtCiudad.setText(prov.getCiudad());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRun.setText(null);
        txtRun.setEditable(true);
        TxtDvrun.setText(null);
        TxtDvrun.setEditable(true);
        txtp_nombre.setText(null);
        txtDescripcion.setText(null);
        txtCelular.setText(null);
        txtemail.setText(null);
        txtDireccion.setText(null);
        TxtN_direccion.setText(null);
        TxtComuna.setText(null);
        TxtCiudad.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int valor=JOptionPane.showConfirmDialog(this, "Quiere Eliminar Datos","Advertencia",JOptionPane.YES_NO_OPTION);
        if(valor==JOptionPane.YES_OPTION){

            String run= txtRun.getText();
            ProveedorDAO provDao = new ProveedorDAO();

            if(provDao.eliminarProveedor(run))
            {
                JOptionPane.showMessageDialog(this, "Datos Del Proveedor Eliminado");
                txtRun.setText(null);
                txtRun.setEditable(true);
                TxtDvrun.setText(null);
                TxtDvrun.setEditable(true);
                txtp_nombre.setText(null);
                txtDescripcion.setText(null);
                txtCelular.setText(null);
                txtemail.setText(null);
                txtDireccion.setText(null);
                TxtN_direccion.setText(null);
                TxtComuna.setText(null);
                TxtCiudad.setText(null);
            }
            else
            JOptionPane.showMessageDialog(this, "Datos Del Proveedor NO Eliminado");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtp_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtp_nombreKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras ");
            txtp_nombre.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=33 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            txtp_nombre.setCursor(null);
        }
    }//GEN-LAST:event_txtp_nombreKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String rut,dv_rut,descripcion,nombre,email,direccion,comuna,ciudad;
        int celular,n_direccion,telefono;

        rut=this.txtRun.getText();
        dv_rut=this.TxtDvrun.getText();
        nombre=this.txtp_nombre.getText();
        descripcion=this.txtDescripcion.getText();
        celular=Integer.parseInt(this.txtCelular.getText());
        email=this.txtemail.getText();
        direccion=this.txtDireccion.getText();
        n_direccion=Integer.parseInt(this.TxtN_direccion.getText());
        comuna=this.TxtComuna.getText();
        ciudad=this.TxtCiudad.getText();

        Proveedor prov = new Proveedor(rut, dv_rut, nombre, descripcion, direccion, comuna, ciudad, email,  celular, n_direccion);

        ProveedorDAO provDao = new ProveedorDAO();

        if (provDao.ModificarProveedor(prov)) {
            JOptionPane.showMessageDialog(this, "Se modifico");
        }
        else
        JOptionPane.showMessageDialog(this, "No se modifico");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void TxtComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtComunaKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras ");
            TxtComuna.setCursor(null);
        }
        else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras..sin espacio");
            TxtComuna.setCursor(null);
        }
    }//GEN-LAST:event_TxtComunaKeyTyped

    private void TxtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCiudadKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras ");
            TxtCiudad.setCursor(null);
        }
        else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras..sin espacio");
            TxtCiudad.setCursor(null);
        }
    }//GEN-LAST:event_TxtCiudadKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C)&&Character.isLetter(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo Numeros ");
            txtCelular.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=65 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=97 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo Numeros..sin espacio");
            txtCelular.setCursor(null);
        }

    }//GEN-LAST:event_txtCelularKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Proveedor prov = new Proveedor();
        
        try {
            prov.setRun(this.txtRun.getText());
            prov.setDv_run(this.TxtDvrun.getText());
            prov.setNombre(this.txtp_nombre.getText());
            prov.setDescripcion(this.txtDescripcion.getText());
            prov.setEmail(this.txtemail.getText());
            prov.setDireccion(this.txtDireccion.getText());
            prov.setComuna(this.TxtComuna.getText());
            prov.setCiudad(this.TxtCiudad.getText());
            
       }catch(ExceptionInInitializerError ex){
            Logger.getLogger(pnlApoderado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            prov.setCelular(Integer.parseInt(this.txtCelular.getText()));
            prov.setN_direccion(Integer.parseInt(this.TxtN_direccion.getText()));
         } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,"Error En ingreso de registros Numericos");
            
        }
        ProveedorDAO provDao = new ProveedorDAO();
        try {
            if(provDao.buscarProveedor(this.txtRun.getText())==null){
                if(provDao.ingresarProveedor(prov))
                {
                    JOptionPane.showMessageDialog(this,"Proveedor ingresado");
                    System.out.println("Apoderado ingresado");

                }
                else{
                    JOptionPane.showMessageDialog(this,"Hubo problemas....");
                    System.out.println("Hubo problemas....");
                }
            }else{
                JOptionPane.showMessageDialog(this,"Proveedor ya existe");
            }

        } catch (Exception e) {
            Logger.getLogger(pnlProveedor.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtRunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRunKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C)&&Character.isLetter(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros ni espacio");
            TxtDvrun.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            ||(int)evt.getKeyChar()>=65 && (int)evt.getKeyChar()<=96
            ||(int)evt.getKeyChar()>=97 && (int)evt.getKeyChar()<=255

        )
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros");

        }
    }//GEN-LAST:event_txtRunKeyTyped

    private void TxtDvrunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDvrunKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C)&&Character.isLetter(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros ni espacio");
            TxtDvrun.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=74
            ||(int)evt.getKeyChar()>=76 && (int)evt.getKeyChar()<=106
            ||(int)evt.getKeyChar()>=108 && (int)evt.getKeyChar()<=255

        )
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo numeros o 'K'");

        }
    }//GEN-LAST:event_TxtDvrunKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCiudad;
    private javax.swing.JTextField TxtComuna;
    private javax.swing.JTextField TxtDvrun;
    private javax.swing.JTextField TxtN_direccion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCelular;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlComuna;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNumeroDireccion;
    private javax.swing.JLabel jlRun;
    private javax.swing.JLabel jlemail;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtRun;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtp_nombre;
    // End of variables declaration//GEN-END:variables
}
