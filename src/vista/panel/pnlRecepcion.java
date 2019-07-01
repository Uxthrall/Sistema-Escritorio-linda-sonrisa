/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Orden;
import modelo.OrdenDAO;
import modelo.Recepcion;
import modelo.RecepcionDAO;

public class pnlRecepcion extends javax.swing.JPanel {

   
    public pnlRecepcion() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtResumenProduct = new javax.swing.JTable();
        jpmenu = new javax.swing.JPanel();
        jlnumeroorden = new javax.swing.JLabel();
        txtN_Orden = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jdtFechaVencimiento = new com.toedter.calendar.JDateChooser();
        jlfecha = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jtResumenProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Orden", "Stock", "Producto", "Proveedor", "Profesional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtResumenProduct.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtResumenProduct);

        jpmenu.setBackground(new java.awt.Color(255, 255, 255));
        jpmenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlnumeroorden.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlnumeroorden.setForeground(new java.awt.Color(0, 0, 255));
        jlnumeroorden.setText("N° Orden");

        txtN_Orden.setBackground(new java.awt.Color(204, 204, 255));
        txtN_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN_OrdenActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar Recepcion");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jdtFechaVencimiento.setBackground(new java.awt.Color(204, 204, 255));
        jdtFechaVencimiento.setForeground(new java.awt.Color(204, 204, 255));

        jlfecha.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jlfecha.setForeground(new java.awt.Color(0, 0, 255));
        jlfecha.setText("Fecha vencimiento(Opcional)");

        javax.swing.GroupLayout jpmenuLayout = new javax.swing.GroupLayout(jpmenu);
        jpmenu.setLayout(jpmenuLayout);
        jpmenuLayout.setHorizontalGroup(
            jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpmenuLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpmenuLayout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpmenuLayout.createSequentialGroup()
                        .addGroup(jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpmenuLayout.createSequentialGroup()
                                .addComponent(jlfecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpmenuLayout.createSequentialGroup()
                                .addComponent(jlnumeroorden, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtN_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(139, 139, 139))))
        );
        jpmenuLayout.setVerticalGroup(
            jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlnumeroorden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpmenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpmenuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jpmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdtFechaVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jlfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(jpmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtN_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN_OrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN_OrdenActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        eliminar();

        OrdenDAO ordDao=new OrdenDAO();
        String id_orden=this.txtN_Orden.getText();
        ArrayList<Orden>ord=ordDao.VerificarOrdenCompra(id_orden);

        if(ord.size()==0){
            JOptionPane.showMessageDialog(this,"No hay Orden");
        }
        else
        {
            DefaultTableModel model = (DefaultTableModel) jtResumenProduct.getModel();
            for (int i = 0; i < ord.size(); i++)
            {

                String id_Orden = ord.get(i).getId_orden();
                int stock= ord.get(i).getStock();
                String nom_product=ord.get(i).getNom_product();
                String proveedor = ord.get(i).getRut_proveedor();
                String profesional= ord.get(i).getRut_profesional();

                Object[] row = {id_Orden,stock,nom_product,proveedor,profesional};

                model.addRow(row);

            }

        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Recepcion rec = new Recepcion();
        OrdenDAO ordDAO = new OrdenDAO();
        Orden ord = ordDAO.buscarOrden2(txtN_Orden.getText());

        Calendar c1 = Calendar.getInstance();
        SimpleDateFormat objSDF = new SimpleDateFormat("ddMMyyyy");

        String dia = Integer.toString(c1.get(Calendar.DATE));
        int p_mes =c1.get(Calendar.MONTH);
        String mes;

        if ((p_mes+1)<=9) {
            mes = 0+Integer.toString(c1.get(Calendar.MONTH)+1);
        }
        else
        {
            mes = Integer.toString(c1.get(Calendar.MONTH)+1);
        }
        String annio = Integer.toString(c1.get(Calendar.YEAR));
        String hora = Integer.toString(c1.get(Calendar.HOUR_OF_DAY));
        String minuto = Integer.toString(c1.get(Calendar.MINUTE));
        String fecha =dia+"-"+mes+"-"+annio+" "+hora+":"+minuto;

        if (ord==null) {
            JOptionPane.showMessageDialog(this,"No fue exitosa la Segunda Verificacion Revise codigo Ingresado");
        }
        else
        {
            String codigo;
            if (this.jdtFechaVencimiento.getDate()==null) {
                String ah=ord.getRut_proveedor().substring(0,3);
                String be=ord.getNom_product().substring(0,3);
                String ce="00000000";
                int de = ord.getStock();

                codigo=ah+be+ce+de;

            }
            else
            {
                Date fecha_vencimiento=this.jdtFechaVencimiento.getDate();
                //generar codigo
                String ah=ord.getRut_proveedor().substring(0,3);
                String be=ord.getNom_product().substring(0,3);
                String ce=objSDF.format(fecha_vencimiento);
                int de = ord.getStock();

                codigo=ah+be+ce+de;
            }

            rec.setCodigo(codigo);
            rec.setFecha(fecha);
            rec.setId_orden(ord.getId_orden());
            rec.setProveedor(ord.getRut_proveedor());
            rec.setProfesional(ord.getRut_profesional());

            RecepcionDAO respDAO= new RecepcionDAO();
            try{
                 System.out.println("codigo "+codigo+" fecha "+fecha+" ord.getId_orden() "+ord.getId_orden()+" ord.getRut_proveedor() "+ord.getRut_proveedor()+" ord.getRut_profesional() "+ord.getRut_profesional()+" ");

                if(respDAO.buscarRecepcion(codigo)==null){

                    if(respDAO.ingresarRecepcion(rec))
                    {
                        JOptionPane.showMessageDialog(this,"Recepcion ingresada");
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Esta orden ya ha sido registrada");
                    }
               }
               else{
                   JOptionPane.showMessageDialog(this, "Recepcion existente");
                }
            }catch (Exception ex) {
                Logger.getLogger(pnlRecepcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed
 public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) jtResumenProduct.getModel();
        int a = jtResumenProduct.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        } 
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdtFechaVencimiento;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JLabel jlnumeroorden;
    private javax.swing.JPanel jpmenu;
    private javax.swing.JTable jtResumenProduct;
    private javax.swing.JTextField txtN_Orden;
    // End of variables declaration//GEN-END:variables
}
