/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package notasacademicas;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class NotasAcademicasForm extends javax.swing.JFrame {

    /**
     * Creates new form NotasAcademicasForm
     */
    public NotasAcademicasForm() {
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

        lbTitulo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbMateria1 = new javax.swing.JComboBox<>();
        cbMateria2 = new javax.swing.JComboBox<>();
        cbMateria3 = new javax.swing.JComboBox<>();
        cbUV1 = new javax.swing.JComboBox<>();
        lbEstado1 = new javax.swing.JLabel();
        tfNota1 = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        cbMateria4 = new javax.swing.JComboBox<>();
        cbMateria5 = new javax.swing.JComboBox<>();
        cbUV2 = new javax.swing.JComboBox<>();
        cbUV3 = new javax.swing.JComboBox<>();
        cbUV4 = new javax.swing.JComboBox<>();
        cbUV5 = new javax.swing.JComboBox<>();
        tfNota2 = new javax.swing.JTextField();
        tfNota3 = new javax.swing.JTextField();
        tfNota4 = new javax.swing.JTextField();
        tfNota5 = new javax.swing.JTextField();
        lbEstado2 = new javax.swing.JLabel();
        lbEstado3 = new javax.swing.JLabel();
        lbEstado4 = new javax.swing.JLabel();
        lbEstado5 = new javax.swing.JLabel();
        lbTitulo1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCUM = new javax.swing.JTextField();
        lbNombre1 = new javax.swing.JLabel();
        tfNombre1 = new javax.swing.JTextField();
        lbCarrera = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbCarrera = new javax.swing.JComboBox<>();
        cbCiclo = new javax.swing.JComboBox<>();
        lbMensaje = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        lbTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lbTitulo.setText("CONTROL DE NOTAS");

        lbNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombre.setText("Nombre");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("UV");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nota");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Estado");

        cbMateria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Bases de Datos II", "Desarrollo de Software I", "Electronica", "Investigacion de Operaciones I", "Lesgilacion Aplicada a la Empresa" }));
        cbMateria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateria1ActionPerformed(evt);
            }
        });

        cbMateria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Bases de Datos II", "Desarrollo de Software I", "Electronica", "Investigacion de Operaciones I", "Lesgilacion Aplicada a la Empresa" }));
        cbMateria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateria2ActionPerformed(evt);
            }
        });

        cbMateria3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Bases de Datos II", "Desarrollo de Software I", "Electronica", "Investigacion de Operaciones I", "Lesgilacion Aplicada a la Empresa" }));

        cbUV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "3", "4" }));

        lbEstado1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEstado1.setText("Estado");

        tfNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota1ActionPerformed(evt);
            }
        });

        btCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        cbMateria4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Bases de Datos II", "Desarrollo de Software I", "Electronica", "Investigacion de Operaciones I", "Lesgilacion Aplicada a la Empresa" }));

        cbMateria5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Bases de Datos II", "Desarrollo de Software I", "Electronica", "Investigacion de Operaciones I", "Lesgilacion Aplicada a la Empresa" }));

        cbUV2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "3", "4" }));

        cbUV3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "3", "4" }));

        cbUV4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "3", "4" }));

        cbUV5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "3", "4" }));

        lbEstado2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEstado2.setText("Estado");

        lbEstado3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEstado3.setText("Estado");

        lbEstado4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEstado4.setText("Estado");

        lbEstado5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEstado5.setText("Estado");

        lbTitulo1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lbTitulo1.setText("CONTROL DE NOTAS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CUM");

        tfCUM.setEditable(false);

        lbNombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombre1.setText("Nombre");

        lbCarrera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCarrera.setText("Carrera");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ciclo");

        cbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ing. Sistemas", "Ing. Industrial", "Ing. Agronegocios", "Ing. Electrica" }));

        cbCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ciclo 01", "Ciclo 02", "Ciclo 03", "Ciclo 04", "Ciclo 05", "Ciclo 06", "Ciclo 07", "Ciclo 08", "Ciclo 09", "Ciclo 10", "Ciclo 11" }));

        lbMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\gabri\\Downloads\\324498627_915522396471139_3651679528498006811_n.jpg")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(lbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfCUM, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel5)
                                        .addGap(59, 59, 59))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(84, 84, 84)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbUV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbUV2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbUV3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbUV4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(36, 36, 36))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbUV5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbEstado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbEstado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbEstado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(lbEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbEstado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitulo1)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre1)
                            .addComponent(lbCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado1)
                            .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbUV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado3))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbUV4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUV5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstado5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMateria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMateria1ActionPerformed

    private void tfNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNota1ActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        // TODO add your handling code here:

        //VALIDACION PARA NOMBRE, CARRERA Y CICLO
        if ( !this.ValidarCampos((String) this.tfNombre1.getText(), "textField", "nombre") ) {
            return;
        }
        
        if(!this.ValidarCampos((String) this.cbCarrera.getSelectedItem(), "combobox", "carrera")){
            return;
        }
        if(!this.ValidarCampos((String) this.cbCiclo.getSelectedItem(), "combobox", "ciclo")){
            return;
        }
        //VALIDACIONES DE CAMPOS PARA COMBOBOX Y TEXTFLIED QUE ESTEN VACIOS
        //PRIMERA LINEA DE CAMPOS
        if(!this.ValidarCampos((String) this.cbMateria1.getSelectedItem(), "combobox", "materia")){
            return;
        }
        if(!this.ValidarCampos((String) this.cbUV1.getSelectedItem(), "combobox", "unidad valorativa")){
            return;
        }
        if(!this.ValidarCampos((String) this.tfNota1.getText(), "textField", "nota")){
            return;
        }

        //SEGUNDA LINEA DE CAMPOS
        if(!this.ValidarCampos((String) this.cbMateria2.getSelectedItem(), "combobox", "materia")){
            return;
        }
        if(!this.ValidarCampos((String) this.cbUV2.getSelectedItem(), "combobox", "unidad valorativa")){
            return;
        }
        if(!this.ValidarCampos((String) this.tfNota2.getText(), "textField", "nota")){
            return;
        }

        //TERCERA LINEA DE CAMPOS
        if(!this.ValidarCampos((String) this.cbMateria3.getSelectedItem(), "combobox", "materia")){
            return;
        }
        if(!this.ValidarCampos((String) this.cbUV3.getSelectedItem(), "combobox", "unidad valorativa")){
            return;
        }
        if(!this.ValidarCampos((String) this.tfNota3.getText(), "textField", "nota")){
             return;
        }

        //CUARTA LINEA DE CAMPOS
        if(!this.ValidarCampos((String) this.cbMateria4.getSelectedItem(), "combobox", "materia")){
             return;
        }
        if(!this.ValidarCampos((String) this.cbUV4.getSelectedItem(), "combobox", "unidad valorativa")){
             return;
        }
        if(!this.ValidarCampos((String) this.tfNota4.getText(), "textField", "nota")){
             return;
        }

        //QUINTA LINEA DE CAMPOS
        if(!this.ValidarCampos((String) this.cbMateria5.getSelectedItem(), "combobox", "materia")){
             return;
        }
        if(!this.ValidarCampos((String) this.cbUV5.getSelectedItem(), "combobox", "unidad valorativa")){
             return;
        }
        if(!this.ValidarCampos((String) this.tfNota5.getText(), "textField", "nota")){
         return;
        }

        //AQUI SE VALIDA SI LA MATERIA ES APROBADA O REPROBADA CUANDO EL USUARIO 
        // INGRESA EN LA CAJITA DE TEXTO :)
        this.lbEstado1.setText(
                this.ValidaMateriaAprobadaReprobada(Double.parseDouble(this.tfNota1.getText()))
        );

        this.lbEstado2.setText(
                this.ValidaMateriaAprobadaReprobada(Double.parseDouble(this.tfNota2.getText()))
        );
        this.lbEstado3.setText(
                this.ValidaMateriaAprobadaReprobada(Double.parseDouble(this.tfNota3.getText()))
        );

        this.lbEstado4.setText(
                this.ValidaMateriaAprobadaReprobada(Double.parseDouble(this.tfNota4.getText()))
        );

        this.lbEstado5.setText(
                this.ValidaMateriaAprobadaReprobada(Double.parseDouble(this.tfNota5.getText()))
        );

        //AQUI SE CALCULA EL CUM 
        double nota1 = Double.parseDouble(this.tfNota1.getText());
        double nota2 = Double.parseDouble(this.tfNota2.getText());
        double nota3 = Double.parseDouble(this.tfNota3.getText());
        double nota4 = Double.parseDouble(this.tfNota4.getText());
        double nota5 = Double.parseDouble(this.tfNota5.getText());
        int unidadv1 = Integer.valueOf((String) this.cbUV1.getSelectedItem());
        int unidadv2 = Integer.valueOf((String) this.cbUV2.getSelectedItem());
        int unidadv3 = Integer.valueOf((String) this.cbUV3.getSelectedItem());
        int unidadv4 = Integer.valueOf((String) this.cbUV4.getSelectedItem());
        int unidadv5 = Integer.valueOf((String) this.cbUV5.getSelectedItem());

        double cum;

        cum = this.CalcularCum(
                nota1,
                nota2,
                nota3,
                nota4,
                nota5,
                unidadv1,
                unidadv2,
                unidadv3,
                unidadv4,
                unidadv5
        );

        this.tfCUM.setText(Double.toString(cum));

        lbMensaje.setText(this.tfNombre1.getText() + " su estado actual es de " + this.aprobadas + " materias aprobadas "
        + this.reprobadas + " materias reprobadas " + " y su CUM actual es " + this.tfCUM.getText());
          
    }//GEN-LAST:event_btCalcularActionPerformed


    private void cbMateria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMateria2ActionPerformed

    //FUNCION QUE VALIDA CAMPOS VACIOS
    private boolean ValidarCampos(String campo, String tipo, String nombre) {
        boolean esValido = true;
        switch (tipo) {
            case "combobox":
                ///Validar el campo para los combobox
                if (campo.equals("Seleccionar")) {

                    JOptionPane.showMessageDialog(this, "Seleccione una " + nombre, "Error", JOptionPane.ERROR_MESSAGE);

                    esValido = false;
                }
                break;
            case "textField":
                ///Validar el campo para las cajitas de texto
                if (campo.equals("")) {

                    JOptionPane.showMessageDialog(this, "Seleccione una " + nombre, "Error", JOptionPane.ERROR_MESSAGE);
                    esValido = false;
                }

                break;
            default:

        }

        return esValido;
    }

    // FUNCION PARA CALCULAR CUM
    private double CalcularCum(double nota1, double nota2, double nota3, double nota4, double nota5, double UnidadV1, double UnidadV2, double UnidadV3, double UnidadV4, double UnidadV5) {
        double calcularCUM;

        calcularCUM = ((nota1 * UnidadV1) + (nota2 * UnidadV2)
                + (nota3 * UnidadV3) + (nota4 * UnidadV4) + (nota5 * UnidadV5))
                / (UnidadV1 + UnidadV2 + UnidadV3 + UnidadV4 + UnidadV5);

        double resultado = Math.round(calcularCUM * 100.0) / 100.0;

        return resultado;
    }

//FUNCION QUE VALIDA LA MATERIA SI ES APROBADA O REPROBADA
    private String ValidaMateriaAprobadaReprobada(double nota) {
        String estado = "REPROBADA";
        if (nota >= 6) {
            estado = "APROBADA";
            this.aprobadas ++;
        }else{
                    
            this.reprobadas++;
        }
        return estado;
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
            java.util.logging.Logger.getLogger(NotasAcademicasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotasAcademicasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotasAcademicasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotasAcademicasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotasAcademicasForm().setVisible(true);
            }
        });
    }
    
    //DECLARANDO VARIABLES O ATRIBUTOS GLOBALES
    public int aprobadas = 0;
    public int reprobadas = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JComboBox<String> cbCarrera;
    private javax.swing.JComboBox<String> cbCiclo;
    private javax.swing.JComboBox<String> cbMateria1;
    private javax.swing.JComboBox<String> cbMateria2;
    private javax.swing.JComboBox<String> cbMateria3;
    private javax.swing.JComboBox<String> cbMateria4;
    private javax.swing.JComboBox<String> cbMateria5;
    private javax.swing.JComboBox<String> cbUV1;
    private javax.swing.JComboBox<String> cbUV2;
    private javax.swing.JComboBox<String> cbUV3;
    private javax.swing.JComboBox<String> cbUV4;
    private javax.swing.JComboBox<String> cbUV5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbEstado1;
    private javax.swing.JLabel lbEstado2;
    private javax.swing.JLabel lbEstado3;
    private javax.swing.JLabel lbEstado4;
    private javax.swing.JLabel lbEstado5;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JTextField tfCUM;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombre1;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNota2;
    private javax.swing.JTextField tfNota3;
    private javax.swing.JTextField tfNota4;
    private javax.swing.JTextField tfNota5;
    // End of variables declaration//GEN-END:variables
}
