
package vistaPrincipal;

import java.awt.Color;
import vista.VentanaLogin;
import vista.panel.CambiaPanel;


public class VentanaPrincipalAdmin extends javax.swing.JFrame {

  
    public VentanaPrincipalAdmin() {
        initComponents();
         this.setExtendedState(NORMAL);
        this.setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        jLabel3 = new javax.swing.JLabel();
        btnCerrarSesion = new rsbuttom.RSButtonMetro();
        pnlMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnApoderado = new rsbuttom.RSButtonMetro();
        btnProveedor = new rsbuttom.RSButtonMetro();
        btnEmitirOrden = new rsbuttom.RSButtonMetro();
        btnRecepcion = new rsbuttom.RSButtonMetro();
        btnProfesionalServicio = new rsbuttom.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInformes = new rsbuttom.RSButtonMetro();
        btnAgenda = new rsbuttom.RSButtonMetro();
        pnlCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        rSButtonMetro1.setBackground(new java.awt.Color(0, 153, 255));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        rSButtonMetro1.setColorHover(new java.awt.Color(0, 153, 255));
        rSButtonMetro1.setColorNormal(new java.awt.Color(0, 153, 255));
        rSButtonMetro1.setColorPressed(new java.awt.Color(0, 153, 255));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Linda Sonrisa");

        btnCerrarSesion.setBackground(new java.awt.Color(0, 153, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setColorNormal(new java.awt.Color(0, 153, 255));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 849, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 90));

        pnlMenu.setBackground(new java.awt.Color(239, 238, 244));

        jPanel4.setBackground(new java.awt.Color(239, 238, 244));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ADMINISTRADOR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnApoderado.setBackground(new java.awt.Color(239, 238, 244));
        btnApoderado.setForeground(new java.awt.Color(128, 128, 131));
        btnApoderado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
        btnApoderado.setText("Apoderado");
        btnApoderado.setColorHover(new java.awt.Color(204, 204, 204));
        btnApoderado.setColorNormal(new java.awt.Color(239, 238, 244));
        btnApoderado.setColorPressed(new java.awt.Color(204, 204, 204));
        btnApoderado.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnApoderado.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnApoderado.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnApoderadoMousePressed(evt);
            }
        });
        btnApoderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApoderadoActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(239, 238, 244));
        btnProveedor.setForeground(new java.awt.Color(128, 128, 131));
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
        btnProveedor.setText("Proveedor");
        btnProveedor.setColorHover(new java.awt.Color(204, 204, 204));
        btnProveedor.setColorNormal(new java.awt.Color(239, 238, 244));
        btnProveedor.setColorPressed(new java.awt.Color(204, 204, 204));
        btnProveedor.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnProveedor.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnProveedor.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnEmitirOrden.setBackground(new java.awt.Color(239, 238, 244));
        btnEmitirOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/market.png"))); // NOI18N
        btnEmitirOrden.setText("Emitir Orden");
        btnEmitirOrden.setColorHover(new java.awt.Color(204, 204, 204));
        btnEmitirOrden.setColorNormal(new java.awt.Color(239, 238, 244));
        btnEmitirOrden.setColorPressed(new java.awt.Color(204, 204, 204));
        btnEmitirOrden.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnEmitirOrden.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnEmitirOrden.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnEmitirOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirOrdenActionPerformed(evt);
            }
        });

        btnRecepcion.setBackground(new java.awt.Color(239, 238, 244));
        btnRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
        btnRecepcion.setText("Recepción");
        btnRecepcion.setColorHover(new java.awt.Color(204, 204, 204));
        btnRecepcion.setColorNormal(new java.awt.Color(239, 238, 244));
        btnRecepcion.setColorPressed(new java.awt.Color(204, 204, 204));
        btnRecepcion.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnRecepcion.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnRecepcion.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionActionPerformed(evt);
            }
        });

        btnProfesionalServicio.setBackground(new java.awt.Color(239, 238, 244));
        btnProfesionalServicio.setText("Profesionales y Servicios");
        btnProfesionalServicio.setColorHover(new java.awt.Color(204, 204, 204));
        btnProfesionalServicio.setColorNormal(new java.awt.Color(239, 238, 244));
        btnProfesionalServicio.setColorPressed(new java.awt.Color(204, 204, 204));
        btnProfesionalServicio.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnProfesionalServicio.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnProfesionalServicio.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnProfesionalServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesionalServicioActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(239, 238, 244));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("USUARIO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnInformes.setBackground(new java.awt.Color(239, 238, 244));
        btnInformes.setText("Informes");
        btnInformes.setColorHover(new java.awt.Color(204, 204, 204));
        btnInformes.setColorNormal(new java.awt.Color(239, 238, 244));
        btnInformes.setColorPressed(new java.awt.Color(204, 204, 204));
        btnInformes.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnInformes.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnInformes.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesActionPerformed(evt);
            }
        });

        btnAgenda.setBackground(new java.awt.Color(239, 238, 244));
        btnAgenda.setText("Asignar Agenda");
        btnAgenda.setColorHover(new java.awt.Color(204, 204, 204));
        btnAgenda.setColorNormal(new java.awt.Color(239, 238, 244));
        btnAgenda.setColorPressed(new java.awt.Color(204, 204, 204));
        btnAgenda.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnAgenda.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnAgenda.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmitirOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfesionalServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlMenuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnApoderado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmitirOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfesionalServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlMenuLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(588, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 670));

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(pnlCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 1080, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
         int posicion = pnlMenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, pnlMenu);
        }
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void btnApoderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApoderadoActionPerformed
        new CambiaPanel(pnlPrincipal, new vista.panel.pnlApoderado());
        
        if(this.btnApoderado.isSelected()){
            this.btnApoderado.setColorNormal(new Color(204,204,204));
            this.btnApoderado.setColorHover(new Color(204,204,204));
            this.btnApoderado.setColorPressed(new Color(204,204,204));
            
            this.btnProveedor.setColorNormal(new Color(239,238,244));
            this.btnProveedor.setColorHover(new Color(204,204,204));
            this.btnProveedor.setColorPressed(new Color(204,204,204));
            
            this.btnEmitirOrden.setColorNormal(new Color(204,204,204));
            this.btnEmitirOrden.setColorHover(new Color(204,204,204));
            this.btnEmitirOrden.setColorPressed(new Color(204,204,204));
            
            this.btnRecepcion.setColorNormal(new Color(239,238,244));
            this.btnRecepcion.setColorHover(new Color(204,204,204));
            this.btnRecepcion.setColorPressed(new Color(204,204,204));
            
            this.btnProfesionalServicio.setColorNormal(new Color(239,238,244));
            this.btnProfesionalServicio.setColorHover(new Color(204,204,204));
            this.btnProfesionalServicio.setColorPressed(new Color(204,204,204));
            
            
            this.btnInformes.setColorNormal(new Color(239,238,244));
            this.btnInformes.setColorHover(new Color(204,204,204));
            this.btnInformes.setColorPressed(new Color(204,204,204));
        }else{
            this.btnApoderado.setColorNormal(new Color(239,238,244));
            this.btnApoderado.setColorHover(new Color(204,204,204));
            this.btnApoderado.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnApoderadoActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        new CambiaPanel(pnlPrincipal, new vista.panel.pnlProveedor());
        
        if(this.btnProveedor.isSelected()){
            this.btnProveedor.setColorNormal(new Color(204,204,204));
            this.btnProveedor.setColorHover(new Color(204,204,204));
            this.btnProveedor.setColorPressed(new Color(204,204,204));
            
            this.btnApoderado.setColorNormal(new Color(239,238,244));
            this.btnApoderado.setColorHover(new Color(204,204,204));
            this.btnApoderado.setColorPressed(new Color(204,204,204));
            
            this.btnEmitirOrden.setColorNormal(new Color(204,204,204));
            this.btnEmitirOrden.setColorHover(new Color(204,204,204));
            this.btnEmitirOrden.setColorPressed(new Color(204,204,204));
            
            this.btnRecepcion.setColorNormal(new Color(239,238,244));
            this.btnRecepcion.setColorHover(new Color(204,204,204));
            this.btnRecepcion.setColorPressed(new Color(204,204,204));
            
            this.btnProfesionalServicio.setColorNormal(new Color(239,238,244));
            this.btnProfesionalServicio.setColorHover(new Color(204,204,204));
            this.btnProfesionalServicio.setColorPressed(new Color(204,204,204));
            
            
            this.btnInformes.setColorNormal(new Color(239,238,244));
            this.btnInformes.setColorHover(new Color(204,204,204));
            this.btnInformes.setColorPressed(new Color(204,204,204));
        }else{
            this.btnProveedor.setColorNormal(new Color(239,238,244));
            this.btnProveedor.setColorHover(new Color(204,204,204));
            this.btnProveedor.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnEmitirOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirOrdenActionPerformed
        new CambiaPanel(pnlPrincipal, new vista.panel.pnlGeneralOrden());
        
        if(this.btnEmitirOrden.isSelected()){
            this.btnEmitirOrden.setColorNormal(new Color(204,204,204));
            this.btnEmitirOrden.setColorHover(new Color(204,204,204));
            this.btnEmitirOrden.setColorPressed(new Color(204,204,204));
            
            this.btnApoderado.setColorNormal(new Color(239,238,244));
            this.btnApoderado.setColorHover(new Color(204,204,204));
            this.btnApoderado.setColorPressed(new Color(204,204,204));
            
            this.btnProveedor.setColorNormal(new Color(239,238,244));
            this.btnProveedor.setColorHover(new Color(204,204,204));
            this.btnProveedor.setColorPressed(new Color(204,204,204));
            
            this.btnRecepcion.setColorNormal(new Color(239,238,244));
            this.btnRecepcion.setColorHover(new Color(204,204,204));
            this.btnRecepcion.setColorPressed(new Color(204,204,204));
            
            this.btnProfesionalServicio.setColorNormal(new Color(239,238,244));
            this.btnProfesionalServicio.setColorHover(new Color(204,204,204));
            this.btnProfesionalServicio.setColorPressed(new Color(204,204,204));
            
            
             this.btnInformes.setColorNormal(new Color(239,238,244));
            this.btnInformes.setColorHover(new Color(204,204,204));
            this.btnInformes.setColorPressed(new Color(204,204,204));
        }else{
            this.btnEmitirOrden.setColorNormal(new Color(239,238,244));
            this.btnEmitirOrden.setColorHover(new Color(204,204,204));
            this.btnEmitirOrden.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnEmitirOrdenActionPerformed

    private void btnRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionActionPerformed
        new CambiaPanel(pnlPrincipal, new vista.panel.pnlRecepcion());
        
        if(this.btnRecepcion.isSelected()){
            this.btnRecepcion.setColorNormal(new Color(204,204,204));
            this.btnRecepcion.setColorHover(new Color(204,204,204));
            this.btnRecepcion.setColorPressed(new Color(204,204,204));
            
            this.btnApoderado.setColorNormal(new Color(239,238,244));
            this.btnApoderado.setColorHover(new Color(204,204,204));
            this.btnApoderado.setColorPressed(new Color(204,204,204));
            
            this.btnEmitirOrden.setColorNormal(new Color(239,238,244));
            this.btnEmitirOrden.setColorHover(new Color(204,204,204));
            this.btnEmitirOrden.setColorPressed(new Color(204,204,204));
            
            this.btnProveedor.setColorNormal(new Color(239,238,244));
            this.btnProveedor.setColorHover(new Color(204,204,204));
            this.btnProveedor.setColorPressed(new Color(204,204,204));
            
            this.btnProfesionalServicio.setColorNormal(new Color(239,238,244));
            this.btnProfesionalServicio.setColorHover(new Color(204,204,204));
            this.btnProfesionalServicio.setColorPressed(new Color(204,204,204));
            
            this.btnInformes.setColorNormal(new Color(239,238,244));
            this.btnInformes.setColorHover(new Color(204,204,204));
            this.btnInformes.setColorPressed(new Color(204,204,204));
            
        }else{
            this.btnRecepcion.setColorNormal(new Color(239,238,244));
            this.btnRecepcion.setColorHover(new Color(204,204,204));
            this.btnRecepcion.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnRecepcionActionPerformed

    private void btnProfesionalServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesionalServicioActionPerformed
       new CambiaPanel(pnlPrincipal, new vista.panel.pnlProfesionalServicios());
        
        if(this.btnProfesionalServicio.isSelected()){
            this.btnProfesionalServicio.setColorNormal(new Color(204,204,204));
            this.btnProfesionalServicio.setColorHover(new Color(204,204,204));
            this.btnProfesionalServicio.setColorPressed(new Color(204,204,204));
            
            this.btnApoderado.setColorNormal(new Color(239,238,244));
            this.btnApoderado.setColorHover(new Color(204,204,204));
            this.btnApoderado.setColorPressed(new Color(204,204,204));
            
            this.btnEmitirOrden.setColorNormal(new Color(239,238,244));
            this.btnEmitirOrden.setColorHover(new Color(204,204,204));
            this.btnEmitirOrden.setColorPressed(new Color(204,204,204));
            
            this.btnProveedor.setColorNormal(new Color(239,238,244));
            this.btnProveedor.setColorHover(new Color(204,204,204));
            this.btnProveedor.setColorPressed(new Color(204,204,204));
            
            this.btnRecepcion.setColorNormal(new Color(239,238,244));
            this.btnRecepcion.setColorHover(new Color(204,204,204));
            this.btnRecepcion.setColorPressed(new Color(204,204,204));
            
            this.btnInformes.setColorNormal(new Color(239,238,244));
            this.btnInformes.setColorHover(new Color(204,204,204));
            this.btnInformes.setColorPressed(new Color(204,204,204));
            
        }else{
            this.btnProfesionalServicio.setColorNormal(new Color(239,238,244));
            this.btnProfesionalServicio.setColorHover(new Color(204,204,204));
            this.btnProfesionalServicio.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnProfesionalServicioActionPerformed

    private void btnInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesActionPerformed
       new CambiaPanel(pnlPrincipal, new vista.panel.pnlInformes());
        
        if(this.btnInformes.isSelected()){
            this.btnInformes.setColorNormal(new Color(204,204,204));
            this.btnInformes.setColorHover(new Color(204,204,204));
            this.btnInformes.setColorPressed(new Color(204,204,204));
            
            this.btnApoderado.setColorNormal(new Color(239,238,244));
            this.btnApoderado.setColorHover(new Color(204,204,204));
            this.btnApoderado.setColorPressed(new Color(204,204,204));
            
            this.btnEmitirOrden.setColorNormal(new Color(239,238,244));
            this.btnEmitirOrden.setColorHover(new Color(204,204,204));
            this.btnEmitirOrden.setColorPressed(new Color(204,204,204));
            
            this.btnProveedor.setColorNormal(new Color(239,238,244));
            this.btnProveedor.setColorHover(new Color(204,204,204));
            this.btnProveedor.setColorPressed(new Color(204,204,204));
            
            this.btnRecepcion.setColorNormal(new Color(239,238,244));
            this.btnRecepcion.setColorHover(new Color(204,204,204));
            this.btnRecepcion.setColorPressed(new Color(204,204,204));
            
            this.btnProfesionalServicio.setColorNormal(new Color(239,238,244));
            this.btnProfesionalServicio.setColorHover(new Color(204,204,204));
            this.btnProfesionalServicio.setColorPressed(new Color(204,204,204));
            
        }else{
            this.btnInformes.setColorNormal(new Color(239,238,244));
            this.btnInformes.setColorHover(new Color(204,204,204));
            this.btnInformes.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnInformesActionPerformed

    private void btnApoderadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApoderadoMousePressed
        this.btnInformes.setSelected(false);
        this.btnApoderado.setSelected(true);
        this.btnEmitirOrden.setSelected(false);
        this.btnProveedor.setSelected(false);
        this.btnRecepcion.setSelected(false);
        this.btnProfesionalServicio.setSelected(false);
        
    }//GEN-LAST:event_btnApoderadoMousePressed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        VentanaLogin ven = new VentanaLogin();
        ven.setVisible(true);
        ven.setLocationRelativeTo(null);
        ven.setTitle("Linda Sonrisa");
        ven.setResizable(false);
          this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
         new CambiaPanel(pnlPrincipal, new vista.panel.pnlAsignacionAgenda());
        
        if(this.btnAgenda.isSelected()){
            this.btnAgenda.setColorNormal(new Color(204,204,204));
            this.btnAgenda.setColorHover(new Color(204,204,204));
            this.btnAgenda.setColorPressed(new Color(204,204,204));
            
            this.btnApoderado.setColorNormal(new Color(239,238,244));
            this.btnApoderado.setColorHover(new Color(204,204,204));
            this.btnApoderado.setColorPressed(new Color(204,204,204));
            
            this.btnEmitirOrden.setColorNormal(new Color(239,238,244));
            this.btnEmitirOrden.setColorHover(new Color(204,204,204));
            this.btnEmitirOrden.setColorPressed(new Color(204,204,204));
            
            this.btnProveedor.setColorNormal(new Color(239,238,244));
            this.btnProveedor.setColorHover(new Color(204,204,204));
            this.btnProveedor.setColorPressed(new Color(204,204,204));
            
            this.btnRecepcion.setColorNormal(new Color(239,238,244));
            this.btnRecepcion.setColorHover(new Color(204,204,204));
            this.btnRecepcion.setColorPressed(new Color(204,204,204));
            
            this.btnProfesionalServicio.setColorNormal(new Color(239,238,244));
            this.btnProfesionalServicio.setColorHover(new Color(204,204,204));
            this.btnProfesionalServicio.setColorPressed(new Color(204,204,204));
            
            this.btnInformes.setColorNormal(new Color(239,238,244));
            this.btnInformes.setColorHover(new Color(204,204,204));
            this.btnInformes.setColorPressed(new Color(204,204,204));
        }else{
            this.btnAgenda.setColorNormal(new Color(239,238,244));
            this.btnAgenda.setColorHover(new Color(204,204,204));
            this.btnAgenda.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_btnAgendaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnAgenda;
    private rsbuttom.RSButtonMetro btnApoderado;
    private rsbuttom.RSButtonMetro btnCerrarSesion;
    private rsbuttom.RSButtonMetro btnEmitirOrden;
    private rsbuttom.RSButtonMetro btnInformes;
    private rsbuttom.RSButtonMetro btnProfesionalServicio;
    private rsbuttom.RSButtonMetro btnProveedor;
    private rsbuttom.RSButtonMetro btnRecepcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}
