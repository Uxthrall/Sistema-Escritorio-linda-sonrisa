/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Profesional;
import modelo.ProfesionalDAO;
import modelo.Servicio;
import modelo.ServicioDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class pnlProfesionalServicios extends javax.swing.JPanel {

    /**
     * Creates new form pnlProfesionalServicios
     */
    public pnlProfesionalServicios() {
        initComponents();
        cargarNomProf2();
        txtId_servicio.setText(uuid());
    }

     public static final String uuid()
    {
        String result = java.util.UUID.randomUUID().toString();

        result=result.replaceAll("-", "");
        result=result.substring(0, 8);

        return result;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPServicio = new javax.swing.JPanel();
        txtNombreServicio = new javax.swing.JTextField();
        jlNombreServicio = new javax.swing.JLabel();
        btnRegistrarServicio = new javax.swing.JButton();
        btnBuscarServicio = new javax.swing.JButton();
        btnModificarServicio = new javax.swing.JButton();
        btnEliminarServicio = new javax.swing.JButton();
        jlIdentificador = new javax.swing.JLabel();
        txtId_servicio = new javax.swing.JTextField();
        jlProf = new javax.swing.JLabel();
        cmbProfesionalCargo = new javax.swing.JComboBox<>();
        Actualizar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        jpProfesional = new javax.swing.JPanel();
        txtCelular = new javax.swing.JTextField();
        btnRegistrarProfesional = new javax.swing.JButton();
        txtp_nombre = new javax.swing.JTextField();
        jlNombre1 = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        txtp_apellido = new javax.swing.JTextField();
        txts_apellido = new javax.swing.JTextField();
        jlRun = new javax.swing.JLabel();
        txtRun = new javax.swing.JTextField();
        TxtDvrun = new javax.swing.JTextField();
        btnBuscarRunProfesional = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEliminarProfesional = new javax.swing.JButton();
        btnModificarProfesional = new javax.swing.JButton();
        jlContrasena = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        jlemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jlCelular = new javax.swing.JLabel();
        checkAdministrador = new javax.swing.JCheckBox();
        btnMostrarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtServicios = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPServicio.setBackground(new java.awt.Color(255, 255, 255));
        jPServicio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Servicio"));

        txtNombreServicio.setBackground(new java.awt.Color(204, 204, 255));
        txtNombreServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreServicioActionPerformed(evt);
            }
        });
        txtNombreServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreServicioKeyTyped(evt);
            }
        });

        jlNombreServicio.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlNombreServicio.setForeground(new java.awt.Color(0, 0, 255));
        jlNombreServicio.setText("Nombre Servicio");

        btnRegistrarServicio.setText("Registrar");
        btnRegistrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarServicioActionPerformed(evt);
            }
        });

        btnBuscarServicio.setText("Buscar");
        btnBuscarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarServicioActionPerformed(evt);
            }
        });

        btnModificarServicio.setText("Modificar");
        btnModificarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarServicioActionPerformed(evt);
            }
        });

        btnEliminarServicio.setText("Eliminar");
        btnEliminarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarServicioActionPerformed(evt);
            }
        });

        jlIdentificador.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlIdentificador.setForeground(new java.awt.Color(0, 0, 255));
        jlIdentificador.setText("Identificador ");

        txtId_servicio.setBackground(new java.awt.Color(204, 204, 255));

        jlProf.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlProf.setForeground(new java.awt.Color(0, 0, 255));
        jlProf.setText("Profesional a Cargo");

        cmbProfesionalCargo.setBackground(new java.awt.Color(204, 204, 255));
        cmbProfesionalCargo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cmbProfesionalCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProfesionalCargoActionPerformed(evt);
            }
        });

        Actualizar.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPServicioLayout = new javax.swing.GroupLayout(jPServicio);
        jPServicio.setLayout(jPServicioLayout);
        jPServicioLayout.setHorizontalGroup(
            jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPServicioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPServicioLayout.createSequentialGroup()
                        .addGroup(jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPServicioLayout.createSequentialGroup()
                                .addGroup(jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlNombreServicio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPServicioLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPServicioLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(cmbProfesionalCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                    .addComponent(jlProf, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18))
                            .addGroup(jPServicioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtId_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPServicioLayout.createSequentialGroup()
                        .addGroup(jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlIdentificador)
                            .addGroup(jPServicioLayout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPServicioLayout.setVerticalGroup(
            jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPServicioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlIdentificador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPServicioLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtId_servicio)))
                .addGap(18, 18, 18)
                .addGroup(jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPServicioLayout.createSequentialGroup()
                        .addComponent(btnBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPServicioLayout.createSequentialGroup()
                        .addComponent(jlNombreServicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jlProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProfesionalCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpProfesional.setBackground(new java.awt.Color(255, 255, 255));
        jpProfesional.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Profesional"));

        txtCelular.setBackground(new java.awt.Color(204, 204, 255));
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        btnRegistrarProfesional.setText("Registrar");
        btnRegistrarProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProfesionalActionPerformed(evt);
            }
        });

        txtp_nombre.setBackground(new java.awt.Color(204, 204, 255));
        txtp_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtp_nombreKeyTyped(evt);
            }
        });

        jlNombre1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(0, 0, 255));
        jlNombre1.setText("Nombres ");

        jlApellido.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlApellido.setForeground(new java.awt.Color(0, 0, 255));
        jlApellido.setText("Apellidos");

        txtp_apellido.setBackground(new java.awt.Color(204, 204, 255));
        txtp_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtp_apellidoKeyTyped(evt);
            }
        });

        txts_apellido.setBackground(new java.awt.Color(204, 204, 255));
        txts_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txts_apellidoKeyTyped(evt);
            }
        });

        jlRun.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlRun.setForeground(new java.awt.Color(0, 0, 255));
        jlRun.setText("Run");

        txtRun.setBackground(new java.awt.Color(204, 204, 255));
        txtRun.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRunActionPerformed(evt);
            }
        });
        txtRun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRunKeyTyped(evt);
            }
        });

        TxtDvrun.setBackground(new java.awt.Color(204, 204, 255));
        TxtDvrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDvrunActionPerformed(evt);
            }
        });
        TxtDvrun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDvrunKeyTyped(evt);
            }
        });

        btnBuscarRunProfesional.setText("Buscar ");
        btnBuscarRunProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRunProfesionalActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("-");

        btnEliminarProfesional.setText("Eliminar");
        btnEliminarProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProfesionalActionPerformed(evt);
            }
        });

        btnModificarProfesional.setText("Modificar");
        btnModificarProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProfesionalActionPerformed(evt);
            }
        });

        jlContrasena.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlContrasena.setForeground(new java.awt.Color(0, 0, 255));
        jlContrasena.setText("Contraseña");

        txtContra.setBackground(new java.awt.Color(204, 204, 255));

        jlemail.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlemail.setForeground(new java.awt.Color(0, 0, 255));
        jlemail.setText("E-Mail");

        txtemail.setBackground(new java.awt.Color(204, 204, 255));

        jlCelular.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlCelular.setForeground(new java.awt.Color(0, 0, 255));
        jlCelular.setText("Celular");

        checkAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        checkAdministrador.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        checkAdministrador.setForeground(new java.awt.Color(0, 0, 255));
        checkAdministrador.setText("Administrador (Opcional)");
        checkAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpProfesionalLayout = new javax.swing.GroupLayout(jpProfesional);
        jpProfesional.setLayout(jpProfesionalLayout);
        jpProfesionalLayout.setHorizontalGroup(
            jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProfesionalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(jpProfesionalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProfesionalLayout.createSequentialGroup()
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpProfesionalLayout.createSequentialGroup()
                                .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpProfesionalLayout.createSequentialGroup()
                                        .addComponent(jlApellido)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtp_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(txts_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpProfesionalLayout.createSequentialGroup()
                                        .addComponent(jlRun, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtDvrun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnBuscarRunProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpProfesionalLayout.createSequentialGroup()
                                        .addComponent(jlNombre1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtp_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpProfesionalLayout.createSequentialGroup()
                                .addComponent(jlContrasena)
                                .addGap(16, 16, 16)
                                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231)
                                .addComponent(checkAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addGap(54, 54, 54)))
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRegistrarProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(jpProfesionalLayout.createSequentialGroup()
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpProfesionalLayout.createSequentialGroup()
                                .addComponent(jlCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpProfesionalLayout.createSequentialGroup()
                                .addComponent(jlemail)
                                .addGap(18, 18, 18)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpProfesionalLayout.setVerticalGroup(
            jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProfesionalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpProfesionalLayout.createSequentialGroup()
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(TxtDvrun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlRun)
                                .addComponent(btnBuscarRunProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre1)
                            .addComponent(txtp_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlApellido)
                            .addComponent(txtp_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txts_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlContrasena)
                            .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlemail)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCelular)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
                    .addGroup(jpProfesionalLayout.createSequentialGroup()
                        .addComponent(btnRegistrarProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnMostrarTodo.setText("Mostrar Todo Servicios");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        jtServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_servicio", "Descripcion", "Rut", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jtServicios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1114, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jpProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(btnMostrarTodo)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreServicioActionPerformed

    private void txtNombreServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreServicioKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras ni espacio");
            txts_apellido.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=33 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            txts_apellido.setCursor(null);
        }
    }//GEN-LAST:event_txtNombreServicioKeyTyped

    private void btnRegistrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarServicioActionPerformed
        Servicio serv = new Servicio();

        serv.setId_servicio(this.txtId_servicio.getText());
        serv.setDescripcion(this.txtNombreServicio.getText());
        String nom_prof = this.cmbProfesionalCargo.getSelectedItem().toString();

        ServicioDAO servDAO = new ServicioDAO();
        try {
            if(servDAO.buscarServicio(txtId_servicio.getText(), txtNombreServicio.getText())==null){

                if(servDAO.ingresarServicio(serv,nom_prof))
                {
                    cargarNomProf2();
                    JOptionPane.showMessageDialog(this,"Servicio ingresado");
                    System.out.println("Servicio ingresado");

                }
                else{
                    JOptionPane.showMessageDialog(this,"Hubo problemas....");
                    System.out.println("Hubo problemas....");
                }

            }else{
                JOptionPane.showMessageDialog(this, "Servicio existente");
            }

        } catch (Exception e) {
            Logger.getLogger(pnlProfesionalServicios.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnRegistrarServicioActionPerformed

    private void btnBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarServicioActionPerformed
        String nom_product="";
        String id_codigo=txtId_servicio.getText();
        if (txtNombreServicio.getText()==null) {
            nom_product=" ";
        }
        else
        {
            nom_product=txtNombreServicio.getText();
        }

        ServicioDAO servDAO= new ServicioDAO();
        Servicio serv = servDAO.buscarServicio(id_codigo, nom_product);

        if (serv==null) {
            JOptionPane.showMessageDialog(this,"Id Servicio o nombre no existe");
        }
        else
        {
            txtId_servicio.setEditable(false);
            txtId_servicio.setText(serv.getId_servicio());
            txtNombreServicio.setText(serv.getDescripcion());
            cmbProfesionalCargo.setSelectedItem(serv.getRut_profesional());
        }

    }//GEN-LAST:event_btnBuscarServicioActionPerformed

    private void btnModificarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarServicioActionPerformed
        String id_servicio=txtId_servicio.getText();
        String descripcion=txtNombreServicio.getText();
        String rut_profesional=cmbProfesionalCargo.getSelectedItem().toString();

        Servicio ser = new Servicio(id_servicio, descripcion, rut_profesional);

        ServicioDAO serDAO = new ServicioDAO();

        if (serDAO.ModificarServicio(ser, rut_profesional)) {
            JOptionPane.showMessageDialog(this, "Se modifico");
        }
        else
        JOptionPane.showMessageDialog(this, "No se modifico");

    }//GEN-LAST:event_btnModificarServicioActionPerformed

    private void btnEliminarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarServicioActionPerformed
        int valor=JOptionPane.showConfirmDialog(this, "Quiere Eliminar Datos","Advertencia",JOptionPane.YES_NO_OPTION);
        if(valor==JOptionPane.YES_OPTION){

            String id_servicio= txtId_servicio.getText();
            ServicioDAO serDAO=new ServicioDAO();

            if(serDAO.eliminarServicio(id_servicio))
            {
                JOptionPane.showMessageDialog(this, "Datos Del Servicio Eliminado");
            }
            else
            JOptionPane.showMessageDialog(this, "Datos Del Servicio NO Eliminado");
        }
    }//GEN-LAST:event_btnEliminarServicioActionPerformed

    private void cmbProfesionalCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProfesionalCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProfesionalCargoActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        cargarNomProf2();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        txtId_servicio.setText(null);
        txtId_servicio.setEditable(true);
        txtNombreServicio.setText(null);

    }//GEN-LAST:event_btnLimpiar1ActionPerformed

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
            JOptionPane.showMessageDialog(this, "Ingrese solo letras..sin espacio");
            txtCelular.setCursor(null);
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void btnRegistrarProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProfesionalActionPerformed
        Profesional prof = new Profesional();

        int tipo_usuario=0;

        if(checkAdministrador.isSelected())
        {
            tipo_usuario=3;
        }else
        {
            tipo_usuario=2;
        }
        
        try 
        {
             
           prof.setCelular(Integer.parseInt(this.txtCelular.getText()));
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,"Error En ingreso de registros Numericos");            
        }
         
        try 
        {
            prof.setRut(this.txtRun.getText());
            prof.setDv_rut(this.TxtDvrun.getText());
            prof.setPassword(this.txtContra.getText().toLowerCase());
            prof.setNombre(this.txtp_nombre.getText());
            prof.setP_apellido(this.txtp_apellido.getText());
            prof.setS_apellido(this.txts_apellido.getText());
            prof.setEmail(this.txtemail.getText());
            prof.setTipo_usuario(tipo_usuario);
            
        }catch(ExceptionInInitializerError ex){
            Logger.getLogger(pnlApoderado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProfesionalDAO profDAO = new ProfesionalDAO();
        try {
            if(profDAO.buscarProfesional(this.txtRun.getText())==null){
                if(profDAO.ingresarCuenta(prof))
                {
                    JOptionPane.showMessageDialog(this,"Profesional ingresado");
                    System.out.println("Profesional ingresado");

                }
                else{
                    JOptionPane.showMessageDialog(this,"Hubo problemas....");
                    System.out.println("Hubo problemas....");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Profesional existente");
            }

        } catch (Exception e) {
            Logger.getLogger(pnlProfesionalServicios.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnRegistrarProfesionalActionPerformed

    private void txtp_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtp_nombreKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras ");
            txtp_nombre.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras..sin espacio");
            txtp_nombre.setCursor(null);
        }
    }//GEN-LAST:event_txtp_nombreKeyTyped

    private void txtp_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtp_apellidoKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras ni espacio");
            txtp_apellido.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            txtp_apellido.setCursor(null);
        }
    }//GEN-LAST:event_txtp_apellidoKeyTyped

    private void txts_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txts_apellidoKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras ni espacio");
            txts_apellido.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras");
            txts_apellido.setCursor(null);
        }
    }//GEN-LAST:event_txts_apellidoKeyTyped

    private void txtRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRunActionPerformed

    private void txtRunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRunKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C)&&Character.isLetter(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo Numeros ");
            txtRun.setCursor(null);
        }
        else if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47
            ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=65 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=97 && (int)evt.getKeyChar()<=255)
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras..sin espacio");
            txtRun.setCursor(null);
        }
    }//GEN-LAST:event_txtRunKeyTyped

    private void TxtDvrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDvrunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDvrunActionPerformed

    private void TxtDvrunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDvrunKeyTyped
        char C= evt.getKeyChar();

        if(Character.isDigit(C)&&Character.isLetter(C))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Ingrese solo letras ni espacio");
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

    private void btnBuscarRunProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRunProfesionalActionPerformed
        String run =txtRun.getText();

        ProfesionalDAO profDAO=new ProfesionalDAO();
        Profesional prof = profDAO.buscarProfesional(run);

        if (prof==null) {
            JOptionPane.showMessageDialog(this,"Rut no existe");
        }
        else{
            txtRun.setEditable(false);
            TxtDvrun.setText(prof.getDv_rut());
            TxtDvrun.setEditable(false);
            txtContra.setText(prof.getPassword());
            txtp_nombre.setText(prof.getNombre());
            txtp_apellido.setText(prof.getP_apellido());
            txts_apellido.setText(prof.getS_apellido());
            txtCelular.setText(String.valueOf(prof.getCelular()));
            txtemail.setText(prof.getEmail());
        }
    }//GEN-LAST:event_btnBuscarRunProfesionalActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRun.setText(null);
        txtRun.setEditable(true);
        TxtDvrun.setText(null);
        TxtDvrun.setEditable(true);
        txtContra.setText(null);
        txtp_nombre.setText(null);
        txtp_apellido.setText(null);
        txts_apellido.setText(null);
        txtCelular.setText(null);
        txtemail.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProfesionalActionPerformed
        int valor=JOptionPane.showConfirmDialog(this, "Quiere Eliminar Datos","Advertencia",JOptionPane.YES_NO_OPTION);
        if(valor==JOptionPane.YES_OPTION){

            String run= txtRun.getText();
            ProfesionalDAO profDAO=new ProfesionalDAO();

            if(profDAO.eliminarProfesional(run))
            {
                JOptionPane.showMessageDialog(this, "Datos Del Profesional Eliminado");
            }
            else
            JOptionPane.showMessageDialog(this, "Datos Del Profesional NO Eliminado");
        }
    }//GEN-LAST:event_btnEliminarProfesionalActionPerformed

    private void btnModificarProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProfesionalActionPerformed
        String rut,dv_rut,usuario,contrasena,nombre,p_apellido,s_apellido,email;
        int celular;
        int tipo_usuario=0;

        if(checkAdministrador.isSelected())
        {
            tipo_usuario=3;
        }else
        {
            tipo_usuario=2;
        }

        rut=txtRun.getText();
        dv_rut=this.TxtDvrun.getText();
        contrasena=this.txtContra.getText().toLowerCase();
        nombre=this.txtp_nombre.getText();
        p_apellido=this.txtp_apellido.getText();
        s_apellido=this.txts_apellido.getText();
        celular=Integer.parseInt(this.txtCelular.getText());
        email=this.txtemail.getText();

        Profesional apo = new Profesional(rut, dv_rut, nombre, p_apellido, s_apellido,  contrasena, tipo_usuario, email, celular);

        ProfesionalDAO profDAO=new ProfesionalDAO();

        if (profDAO.ModificarProfesional(apo)) {
            JOptionPane.showMessageDialog(this, "Se modifico");
        }
        else
        JOptionPane.showMessageDialog(this, "No se modifico");
    }//GEN-LAST:event_btnModificarProfesionalActionPerformed

    private void checkAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAdministradorActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        eliminar();
        ServicioDAO serDao=new ServicioDAO();

        ArrayList<Servicio>ser=serDao.buscartodoSer();

        DefaultTableModel model = (DefaultTableModel) jtServicios.getModel();
        for (int i = 0; i < ser.size(); i++) {

            String id_servicio = ser.get(i).getId_servicio();
            String descripcion= ser.get(i).getDescripcion();
            String rut=ser.get(i).getRut_profesional();
            String profesional= ser.get(i).getNombre_prof();

            Object[] row = {id_servicio,descripcion,rut,profesional};

            model.addRow(row);
        }
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

public void cargarNomProf2(){
         cmbProfesionalCargo.removeAllItems();
        ProfesionalDAO profDao=new ProfesionalDAO();
        
        ArrayList<Profesional>prof=profDao.buscarNomProf();

            for (int i = 0; i < prof.size(); i++) {

                    String p_nombre=prof.get(i).getNombre();                  
                    String p_apellido=prof.get(i).getP_apellido();  
                    String s_apellido=prof.get(i).getS_apellido();  
                    
                    String fullname=p_nombre+" "+p_apellido+" "+s_apellido;
                    
                    cmbProfesionalCargo.addItem(fullname); 
                   
    
         }
    
        
    }
    public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) jtServicios.getModel();
        int a = jtServicios.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        } 
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JTextField TxtDvrun;
    private javax.swing.JButton btnBuscarRunProfesional;
    private javax.swing.JButton btnBuscarServicio;
    private javax.swing.JButton btnEliminarProfesional;
    private javax.swing.JButton btnEliminarServicio;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnModificarProfesional;
    private javax.swing.JButton btnModificarServicio;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnRegistrarProfesional;
    private javax.swing.JButton btnRegistrarServicio;
    private javax.swing.JCheckBox checkAdministrador;
    private javax.swing.JComboBox<String> cmbProfesionalCargo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPServicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCelular;
    private javax.swing.JLabel jlContrasena;
    private javax.swing.JLabel jlIdentificador;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombreServicio;
    private javax.swing.JLabel jlProf;
    private javax.swing.JLabel jlRun;
    private javax.swing.JLabel jlemail;
    private javax.swing.JPanel jpProfesional;
    private javax.swing.JTable jtServicios;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtId_servicio;
    private javax.swing.JTextField txtNombreServicio;
    private javax.swing.JTextField txtRun;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtp_apellido;
    private javax.swing.JTextField txtp_nombre;
    private javax.swing.JTextField txts_apellido;
    // End of variables declaration//GEN-END:variables
}
