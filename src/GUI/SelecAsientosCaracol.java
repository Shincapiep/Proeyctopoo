/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;
import Data.RegistroVenta;
import Data.Sala_cine;
import java.io.FileOutputStream;
import javax.swing.*;
import java.io.*;
import java.util.List;
/**
 *
 * @author Juan Diego Rubiano
 */
public class SelecAsientosCaracol extends javax.swing.JFrame {

    /**
     * Creates new form SelecAsientosCaracol
     */
    public SelecAsientosCaracol() {
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

        LabelPeliculaimg = new javax.swing.JLabel();
        ScrollPaneDescripcion = new javax.swing.JScrollPane();
        TextAreaDescripción = new javax.swing.JTextArea();
        LabelSeleccionHorario = new javax.swing.JLabel();
        ComboBoxHorario = new javax.swing.JComboBox<>();
        LabelNumeroAsientos = new javax.swing.JLabel();
        TextFieldNumeroAsientos = new javax.swing.JTextField();
        ButtonAtras = new javax.swing.JButton();
        PanelAsientos = new javax.swing.JPanel();
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
        LabelPantalla = new javax.swing.JLabel();
        Labelseleccioneasientos = new javax.swing.JLabel();
        ButtonContinuar = new javax.swing.JButton();
        Labelimagen = new javax.swing.JLabel();
        LabelIconCinema = new javax.swing.JLabel();

        LabelPeliculaimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/La estrategia del caracol (1993) (1).png"))); // NOI18N
        LabelPeliculaimg.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                LabelPeliculaimgComponentAdded(evt);
            }
        });

        TextAreaDescripción.setColumns(20);
        TextAreaDescripción.setRows(5);
        TextAreaDescripción.setText("\nDirector: Sergio Cabrera.\nGénero: Drama y Comedia.\nEstreno: 25 Diciembre 1993.\nDuración: 116 minutos.\nSinopsis:\nLa historia de un grupo de inquilinos que habita una\nmagnífica casa que debe ser restaurada, y aunque \nse han opuesto a abandonarla, deben buscar e idear \nlas formas de quedarse. Rechazada la idea de \nresistir por la fuerza, Jacinto, un viejo anarquista \nespañol en el exilio propone adoptar una \nespecialísima estrategia.");
        TextAreaDescripción.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPaneDescripcion.setViewportView(TextAreaDescripción);

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
                ComboBoxHorarioHora_proyeccion(evt);
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

        LabelPantalla.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        LabelPantalla.setText("------------------------------Pantalla------------------------------");

        Labelseleccioneasientos.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        Labelseleccioneasientos.setText("Seleccione los asientos ");

        ButtonContinuar.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        ButtonContinuar.setText("Continuar");
        ButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonContinuarActionPerformed(evt);
            }
        });

        Labelimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camara.png"))); // NOI18N

        javax.swing.GroupLayout PanelAsientosLayout = new javax.swing.GroupLayout(PanelAsientos);
        PanelAsientos.setLayout(PanelAsientosLayout);
        PanelAsientosLayout.setHorizontalGroup(
            PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAsientosLayout.createSequentialGroup()
                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAsientosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAsientosLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Asiento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(PanelAsientosLayout.createSequentialGroup()
                                            .addComponent(Asiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Asiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelAsientosLayout.createSequentialGroup()
                                            .addComponent(Asiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Asiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelAsientosLayout.createSequentialGroup()
                                            .addComponent(Asiento17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Asiento18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelAsientosLayout.createSequentialGroup()
                                        .addComponent(Asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Asiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Asiento20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Asiento15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Labelseleccioneasientos, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelAsientosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Labelimagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonContinuar)))
                .addGap(147, 147, 147))
            .addGroup(PanelAsientosLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(LabelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAsientosLayout.setVerticalGroup(
            PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAsientosLayout.createSequentialGroup()
                .addComponent(Labelseleccioneasientos)
                .addGap(18, 18, 18)
                .addComponent(LabelPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Asiento4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Asiento7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Asiento12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Asiento17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Asiento18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonContinuar)
                    .addComponent(Labelimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        LabelIconCinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrada-de-cine.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(LabelIconCinema))
                        .addComponent(ButtonAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelPeliculaimg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(PanelAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelPeliculaimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ScrollPaneDescripcion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelSeleccionHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelNumeroAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextFieldNumeroAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelIconCinema, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(ButtonAtras)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelPeliculaimgComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_LabelPeliculaimgComponentAdded

    }//GEN-LAST:event_LabelPeliculaimgComponentAdded

    private void ComboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxHorarioActionPerformed

    }//GEN-LAST:event_ComboBoxHorarioActionPerformed

    private void ComboBoxHorarioHora_proyeccion(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboBoxHorarioHora_proyeccion
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxHorarioHora_proyeccion

    private void TextFieldNumeroAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNumeroAsientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNumeroAsientosActionPerformed

    private void ButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAtrasActionPerformed
        this.dispose();
        Seleccionpelicula cartelera1 = new Seleccionpelicula();
        cartelera1.setVisible(true);
    }//GEN-LAST:event_ButtonAtrasActionPerformed

    private void Asiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento2ActionPerformed

    }//GEN-LAST:event_Asiento2ActionPerformed

    private void Asiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asiento1ActionPerformed

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

    private void ButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonContinuarActionPerformed

        // Obtener los valores seleccionados por el usuario
        Seleccionpelicula seleccionPelicula = new Seleccionpelicula();
        String nombrePeliculaSeleccionada = seleccionPelicula.getNombrePeliculaSeleccionada();
        String horaSeleccionada = ComboBoxHorario.getSelectedItem().toString();
        int cantidadEntradas = Integer.parseInt(TextFieldNumeroAsientos.getText());

        // Crear un objeto de tipo RegistroVenta con los valores seleccionados
        RegistroVenta registroVenta = new RegistroVenta(nombrePeliculaSeleccionada, horaSeleccionada, cantidadEntradas);

        // Establecer el ícono del LabelPeliculaimg
        LabelPeliculaimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Los Colores de la Montaña (1) (1).png")));

        // Guardar el objeto RegistroVenta en un archivo .dat
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("informacionpelis.dat"));
            salida.writeObject(registroVenta);
            salida.close();
            JOptionPane.showMessageDialog(this, "La información ha sido guardada exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la información.");
            e.printStackTrace();
        }

        // Obtener los asientos seleccionados desde los ToggleButtons
       // List<Integer> asientosSeleccionados1 = obtenerAsientosSeleccionados();

        // Crear una instancia de Sala_cine y ocupar los asientos seleccionados
      //  Sala_cine salaCine = new Sala_cine();
        //salaCine.ocuparAsientos(asientosSeleccionados1);
    }//GEN-LAST:event_ButtonContinuarActionPerformed


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
    private javax.swing.JLabel LabelIconCinema;
    private javax.swing.JLabel LabelNumeroAsientos;
    private javax.swing.JLabel LabelPantalla;
    private javax.swing.JLabel LabelPeliculaimg;
    private javax.swing.JLabel LabelSeleccionHorario;
    private javax.swing.JLabel Labelimagen;
    private javax.swing.JLabel Labelseleccioneasientos;
    private javax.swing.JPanel PanelAsientos;
    private javax.swing.JScrollPane ScrollPaneDescripcion;
    private javax.swing.JTextArea TextAreaDescripción;
    private javax.swing.JTextField TextFieldNumeroAsientos;
    // End of variables declaration//GEN-END:variables
}
