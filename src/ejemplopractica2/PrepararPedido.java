/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplopractica2;

import ejemplopractica2.Inicio;
import java.util.Arrays;
import java.io.BufferedReader;
import javax.swing.table.DefaultTableModel;
import ejemplopractica2.Producto;
import ejemplopractica2.VerRecorridos;
import ejemplopractica2.Historial;
import javax.swing.JLabel;
import javax.swing.JLabel;
import ejemplopractica2.RegistroProducto;
import static ejemplopractica2.VerRecorridos.txtDistancia1;
import static ejemplopractica2.VerRecorridos.txtDistancia2;
import static ejemplopractica2.VerRecorridos.txtDistancia3;


/**
 *
 * @author Josue Hurtarte
 */
public class PrepararPedido extends javax.swing.JFrame {

    
    public static Producto[] productos = new Producto[50];
    public static int contadorProductos;
    
    
    public static int distancia1;
    public static int distancia2;
    public static int distancia3;
    public static String opcion;
   
    public static int fila;
    public static String nombre;
    public static String precio;
    /**
     * Creates new form PrepararPedido
     */
    public PrepararPedido() {
        
        initComponents();
        actualizarListadoProductos();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        

    }
    
    public int suma(){
        
        int contar=ListadoPedidos.getRowCount();
        int suma=0;
        
       
        for (int i = 0; i < contar; i++) {
            suma=suma+Integer.parseInt(ListadoPedidos.getValueAt(i,1).toString());
        }
            return suma;
    }
  
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoProductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListadoPedidos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        BtnConfirmar = new javax.swing.JButton();
        Distancia1Input = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Distancia3Input = new javax.swing.JTextField();
        Distancia2Input = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtsuma = new javax.swing.JTextField();
        BtnSumar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Pedido");

        ListadoProductos.setBackground(new java.awt.Color(204, 204, 204));
        ListadoProductos.setForeground(new java.awt.Color(0, 0, 0));
        ListadoProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pizza Grande", "50"},
                {"Hamburguesa", "25"},
                {"Gaseosa", "10"},
                {"Papas Fritas", "15"},
                {null, null}
            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane1.setViewportView(ListadoProductos);

        ListadoPedidos.setBackground(new java.awt.Color(204, 204, 204));
        ListadoPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane2.setViewportView(ListadoPedidos);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Agregar Producto Seleccionado al Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Motocicleta");

        jLabel4.setText("Distancia");

        jLabel5.setText("Km");

        jLabelTotal.setText("Total: Q ");

        BtnConfirmar.setBackground(new java.awt.Color(51, 255, 51));
        BtnConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        BtnConfirmar.setText("Confirmar Pedido");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });

        Distancia1Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Distancia1InputActionPerformed(evt);
            }
        });

        jLabel6.setText("Moto 1");

        jLabel7.setText("Moto 1");

        jLabel8.setText("Moto 1");

        Distancia2Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Distancia2InputActionPerformed(evt);
            }
        });

        jLabel9.setText("Km");

        jLabel10.setText("Km");

        txtsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsumaActionPerformed(evt);
            }
        });

        BtnSumar.setText("Sumar");
        BtnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(191, 191, 191))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Distancia1Input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                        .addComponent(Distancia3Input))
                                    .addComponent(Distancia2Input, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(439, 439, 439))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSumar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnConfirmar))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabelTotal)
                    .addComponent(txtsuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSumar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(BtnConfirmar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(Distancia1Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(Distancia2Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Distancia3Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
            this.setVisible(false);
            Inicio in = new Inicio();
            in.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
            VerRecorridos vr = new VerRecorridos();
            vr.setVisible(true);
            
            String info = Distancia1Input.getText();
            txtDistancia1.setText(info);
            String info2 = Distancia2Input.getText();
            txtDistancia2.setText(info2);
            String info3 = Distancia3Input.getText();
            txtDistancia3.setText(info3);
            
             
            distancia1 = Integer.parseInt(Distancia1Input.getText());
            distancia2 = Integer.parseInt(Distancia2Input.getText());
            distancia3 = Integer.parseInt(Distancia3Input.getText());
            
            
            String []text=new String[4];
            text[0]=Distancia1Input.getText();
            text[1]=Distancia2Input.getText();
            text[2]=txtsuma.getText();
           
            Historial.ListadoHistorial.addRowSelectionInterval(0, Historial.ListadoHistorial.getRowCount()-1);
          
            
            
            
            
            
           
            
     
            
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void Distancia1InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Distancia1InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Distancia1InputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fila = ListadoProductos.getSelectedRow();
        
        nombre = ListadoProductos.getModel().getValueAt(fila, 0).toString();
        precio = ListadoProductos.getModel().getValueAt(fila, 1).toString();
        
        String datos[] = {nombre,precio};
        DefaultTableModel modeloProducto = (DefaultTableModel)ListadoPedidos.getModel();
        modeloProducto.addRow(datos);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Distancia2InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Distancia2InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Distancia2InputActionPerformed

    private void BtnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumarActionPerformed
        // TODO add your handling code here:
        txtsuma.setText(Integer.toString(suma()));
    }//GEN-LAST:event_BtnSumarActionPerformed

    private void txtsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsumaActionPerformed

    
    public void actualizarListadoProductos(){
                if (contadorProductos > 0) {

         // actualizar listado
        DefaultTableModel modeloListado = (DefaultTableModel) ListadoProductos.getModel();
        int filaInicial = 4; // Fila inicial donde quieres que comiencen los datos

        // Obtener la cantidad actual de filas en la tabla
        int filasActuales = modeloListado.getRowCount();

        // Calcular la cantidad total de filas requeridas
        int filasTotales = filaInicial + contadorProductos;

        // Ajustar la cantidad de filas en el modelo si es necesario
        if (filasActuales < filasTotales) {
            modeloListado.setRowCount(filasTotales);
        }

        for (int i = 0; i < contadorProductos; i++) {
            modeloListado.setValueAt(productos[i].nombre, filaInicial + i, 0);
            modeloListado.setValueAt(productos[i].precio, filaInicial + i, 1);
        }
        
       
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrepararPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrepararPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrepararPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrepararPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrepararPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnSumar;
    private javax.swing.JTextField Distancia1Input;
    private javax.swing.JTextField Distancia2Input;
    private javax.swing.JTextField Distancia3Input;
    private javax.swing.JTable ListadoPedidos;
    private javax.swing.JTable ListadoProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtsuma;
    // End of variables declaration//GEN-END:variables
}