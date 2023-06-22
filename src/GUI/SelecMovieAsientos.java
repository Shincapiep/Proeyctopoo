
package GUI;
import Data.*;

public class SelecMovieAsientos extends javax.swing.JFrame {

    /**
     * Creates new form Infomovie
     */
    public SelecMovieAsientos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LabelSeleccionHorario = new javax.swing.JLabel();
        ComboBoxHorario = new javax.swing.JComboBox<>();
        LabelNumeroAsientos = new javax.swing.JLabel();
        TextFieldNumeroAsientos = new javax.swing.JTextField();
        ButtonAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Asiento2 = new ColorAsientos();
        Asiento1 = new ColorAsientos();
        Asiento3 = new ColorAsientos();
        Asiento4 = new ColorAsientos();
        Asiento5 = new ColorAsientos();
        Asiento6 = new ColorAsientos();
        Asiento7 = new ColorAsientos();
        Asiento8 = new ColorAsientos();
        Asiento9 = new ColorAsientos();
        Asiento10 = new ColorAsientos();
        Asiento11 = new ColorAsientos();
        Asiento12 = new ColorAsientos();
        Asiento13 = new ColorAsientos();
        Asiento14 = new ColorAsientos();
        Asiento15 = new ColorAsientos();
        Asiento16 = new ColorAsientos();
        Asiento17 = new ColorAsientos();
        Asiento18 = new ColorAsientos();
        Asiento19 = new ColorAsientos();
        Asiento20 = new ColorAsientos();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ButtonContinuar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Los Colores de la Montaña (1) (1).png"))); // NOI18N
        jLabel2.setText("Imagen");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\nDirector: Carlos César Arbeláezr.\nGénero: Drama.\nEstreno: 11 marzo 2011.\nDuración: 88 minutos.\nSinopsis:\nManuel, un niño de nueve años, que juega al fútbol\n todos los días en el campo con una vieja pelota,\nsueña con llegar a ser un gran guardameta.\nSu alegría es enorme cuando su padre, le regala un\nbalón nuevo; pero, desgraciadamente, un accidente\ninesperado hace que el balón caiga en un campo\nminado. A pesar del peligro que supone, Manuel,\nno está dispuesto a renunciar a su balón, convence\na sus dos mejores amigos,para que le ayuden a\nrecuperarlo. En medio de las aventuras y los juegos\ninfantiles. Los signos de un conflicto armado\nperturban la vida de los habitantes de La Pradera. ");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        LabelSeleccionHorario.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        LabelSeleccionHorario.setText("Seleccione el horario");

        ComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4:10 pm", "6:30 pm", "8:00 pm" }));
        ComboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxHorarioActionPerformed(evt);
            }
        });
        ComboBoxHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Hora_proyeccion(evt);
            }
        });

        LabelNumeroAsientos.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        LabelNumeroAsientos.setText("Cantidad entradas");

        TextFieldNumeroAsientos.setText("1");
        TextFieldNumeroAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNumeroAsientosActionPerformed(evt);
            }
        });

        ButtonAtras.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        ButtonAtras.setText("Atrás");
        ButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAtrasActionPerformed(evt);
            }
        });

        Asiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento2ActionPerformed(evt);
            }
        });

        Asiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento1ActionPerformed(evt);
            }
        });

        Asiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento3ActionPerformed(evt);
            }
        });

        Asiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento4ActionPerformed(evt);
            }
        });

        Asiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento5ActionPerformed(evt);
            }
        });

        Asiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento6ActionPerformed(evt);
            }
        });

        Asiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento7ActionPerformed(evt);
            }
        });

        Asiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento8ActionPerformed(evt);
            }
        });

        Asiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento9ActionPerformed(evt);
            }
        });

        Asiento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento10ActionPerformed(evt);
            }
        });

        Asiento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento11ActionPerformed(evt);
            }
        });

        Asiento12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento12ActionPerformed(evt);
            }
        });

        Asiento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento13ActionPerformed(evt);
            }
        });

        Asiento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento14ActionPerformed(evt);
            }
        });

        Asiento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento15ActionPerformed(evt);
            }
        });

        Asiento16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento16ActionPerformed(evt);
            }
        });

        Asiento17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento17ActionPerformed(evt);
            }
        });

        Asiento18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento18ActionPerformed(evt);
            }
        });

        Asiento19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento19ActionPerformed(evt);
            }
        });

        Asiento20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asiento20ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel1.setText("------------------------------Pantalla------------------------------");

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel4.setText("Seleccione los asientos ");

        ButtonContinuar.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        ButtonContinuar.setText("Continuar");
        ButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonContinuarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asiento-de-cine.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Asiento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Asiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Asiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Asiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Asiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Asiento17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Asiento18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Asiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Asiento20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonContinuar)))
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Asiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Asiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Asiento17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonContinuar)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrada-de-cine.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelSeleccionHorario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(LabelNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(ButtonAtras)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelSeleccionHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelNumeroAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextFieldNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(ButtonAtras)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNumeroAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNumeroAsientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNumeroAsientosActionPerformed

    private void ComboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxHorarioActionPerformed

    }//GEN-LAST:event_ComboBoxHorarioActionPerformed

    private void ButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtrasActionPerformed
        this.dispose();
        Seleccionpelicula cartelera1 = new Seleccionpelicula();
        cartelera1.setVisible(true);
    }//GEN-LAST:event_ButtonAtrasActionPerformed

    private void ButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonContinuarActionPerformed
        //this.dispose();
        //AsientosCine asientos = new AsientosCine();
        //asientos.setVisible(true);
        
    }//GEN-LAST:event_ButtonContinuarActionPerformed

    private void Hora_proyeccion(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Hora_proyeccion
        // TODO add your handling code here:
    }//GEN-LAST:event_Hora_proyeccion

    private void Asiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento2ActionPerformed

    }//GEN-LAST:event_Asiento2ActionPerformed

    private void Asiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento1ActionPerformed
        Asiento2.setEnabled(false);
    }//GEN-LAST:event_Asiento1ActionPerformed

    private void Asiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento3ActionPerformed

    private void Asiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento4ActionPerformed

    private void Asiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento5ActionPerformed

    private void Asiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento6ActionPerformed

    private void Asiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento7ActionPerformed

    private void Asiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento8ActionPerformed

    private void Asiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento9ActionPerformed

    private void Asiento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento10ActionPerformed

    private void Asiento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento11ActionPerformed

    private void Asiento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento12ActionPerformed

    private void Asiento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento13ActionPerformed

    private void Asiento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento14ActionPerformed

    private void Asiento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento15ActionPerformed

    private void Asiento16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento16ActionPerformed

    private void Asiento17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento17ActionPerformed

    private void Asiento18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento18ActionPerformed

    private void Asiento19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento19ActionPerformed

    private void Asiento20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Asiento20ActionPerformed

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
            java.util.logging.Logger.getLogger(SelecMovieAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecMovieAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecMovieAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecMovieAsientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecMovieAsientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Asiento1;
    private javax.swing.JToggleButton Asiento10;
    private javax.swing.JToggleButton Asiento11;
    private javax.swing.JToggleButton Asiento12;
    private javax.swing.JToggleButton Asiento13;
    private javax.swing.JToggleButton Asiento14;
    private javax.swing.JToggleButton Asiento15;
    private javax.swing.JToggleButton Asiento16;
    private javax.swing.JToggleButton Asiento17;
    private javax.swing.JToggleButton Asiento18;
    private javax.swing.JToggleButton Asiento19;
    private javax.swing.JToggleButton Asiento2;
    private javax.swing.JToggleButton Asiento20;
    private javax.swing.JToggleButton Asiento3;
    private javax.swing.JToggleButton Asiento4;
    private javax.swing.JToggleButton Asiento5;
    private javax.swing.JToggleButton Asiento6;
    private javax.swing.JToggleButton Asiento7;
    private javax.swing.JToggleButton Asiento8;
    private javax.swing.JToggleButton Asiento9;
    private javax.swing.JButton ButtonAtras;
    private javax.swing.JButton ButtonContinuar;
    private javax.swing.JComboBox<String> ComboBoxHorario;
    private javax.swing.JLabel LabelNumeroAsientos;
    private javax.swing.JLabel LabelSeleccionHorario;
    private javax.swing.JTextField TextFieldNumeroAsientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
