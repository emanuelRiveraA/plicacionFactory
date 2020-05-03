/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class registroCliente extends javax.swing.JFrame {

    public registroCliente() {
        initComponents();
    }

// Metodo para obtener el tipo de cuenta del cliente segun el registro
    public String tipoCuenta(){
        int edad = Integer.parseInt(txtEdad.getText());
        String varAux = "";
        
        if(edad <= 25){
            varAux =  "cuentaJoven";
        }else
        if((edad > 25 & edad <= 65) & chkTarjetaNomina.isSelected()){
            varAux = "cuenta10";
        }else
        if(edad > 65 & chkPension.isSelected()){
            varAux = "cuentaOro";
        }
        else{
            varAux = "cuentaEstandar";
        }
        return varAux;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenido = new javax.swing.JLabel();
        lblBienvenido1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        chkTarjetaNomina = new javax.swing.JCheckBox();
        chkPension = new javax.swing.JCheckBox();
        botRegistrar = new javax.swing.JButton();
        botCancelar = new javax.swing.JButton();
        botRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBienvenido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBienvenido.setText("Registrar nuevo Cliente");

        lblBienvenido1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblBienvenido1.setForeground(new java.awt.Color(255, 102, 102));
        lblBienvenido1.setText("Bienvenido a su Banco");

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        lblNombre.setText("Nombre del Cliente:");

        lblDireccion.setText("Dirección del Cliente:");

        lblEdad.setText("Edad del Cliente:");

        chkTarjetaNomina.setText("Tarjeta de Nomina");

        chkPension.setText("Cuenta con pensión?");

        botRegistrar.setText("Registrar");
        botRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegistrarActionPerformed(evt);
            }
        });

        botCancelar.setText("Cancelar");
        botCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCancelarActionPerformed(evt);
            }
        });

        botRegresar.setText("Regresar");
        botRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblBienvenido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botRegresar)
                                .addGap(18, 18, 18)
                                .addComponent(botCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(botRegistrar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBienvenido1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre)
                                        .addComponent(lblDireccion)
                                        .addComponent(lblEdad))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkTarjetaNomina)
                                        .addComponent(chkPension)))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBienvenido1)
                .addGap(18, 18, 18)
                .addComponent(lblBienvenido)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkTarjetaNomina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkPension)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botRegistrar)
                    .addComponent(botCancelar)
                    .addComponent(botRegresar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCancelarActionPerformed
        txtNombre.setText("");
        txtDireccion.setText("");
        txtEdad.setText("");
        chkTarjetaNomina.setSelected(false);
        chkPension.setSelected(false);
    }//GEN-LAST:event_botCancelarActionPerformed

    private void botRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegresarActionPerformed
        menu men = new menu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botRegresarActionPerformed

    private void botRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegistrarActionPerformed
// Se valida los check box y se crean variables para guardar resultado en archivo .txt       
        String tarjetaNomina = "";
        String pension = "";
        if (chkTarjetaNomina.isSelected()) {
            tarjetaNomina = "nomina";
        }
        if (chkPension.isSelected()) {
            pension = "pension";
        }

        try {
//Crear un objeto File se encarga de crear o abrir acceso a un archivo .txt para gurdar los datos
            File archivo = new File(System.getProperty("user.home") + "\\Desktop\\DB_banco.txt");

//Crear objeto FileWriter para escribir dentro del .txt
            FileWriter escribir = new FileWriter(archivo, true);

//Se guardan los datos del formulario dentro del archivo .txt
            escribir.append(tipoCuenta() + "," + txtNombre.getText() + "," 
                    + txtDireccion.getText() + ","
                    + txtEdad.getText() + "," + tarjetaNomina + "," 
                    + pension + "\r\n");
          

//Se cierra la conexion para gurdar los cambios en el archivo .txt
            escribir.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se realizó el registro del cliente", "Error detectado", JOptionPane.DEFAULT_OPTION);
        }
        JOptionPane.showMessageDialog(null, "Cliente registrado con éxito", "En hora buena", JOptionPane.DEFAULT_OPTION);
        menu men = new menu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botRegistrarActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
       int k =(int)evt.getKeyChar();
       if(k >= 97 && k <= 122 || k>=65 && k<=90){
           evt.setKeyChar((char)KeyEvent.VK_CLEAR);
           JOptionPane.showMessageDialog(null, "Ingrese solo Números", "Error detectado", JOptionPane.DEFAULT_OPTION);
       }if(k == 241 || k == 209){
           evt.setKeyChar((char)KeyEvent.VK_CLEAR);
           JOptionPane.showMessageDialog(null, "Ingrese solo Números", "Error detectado", JOptionPane.DEFAULT_OPTION);
       }if(k == 10){
           txtEdad.transferFocus();
       }
    }//GEN-LAST:event_txtEdadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botCancelar;
    private javax.swing.JButton botRegistrar;
    private javax.swing.JButton botRegresar;
    public javax.swing.JCheckBox chkPension;
    public javax.swing.JCheckBox chkTarjetaNomina;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblBienvenido1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
