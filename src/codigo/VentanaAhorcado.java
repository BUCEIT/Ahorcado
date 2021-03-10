/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author xp
 */
public class VentanaAhorcado extends javax.swing.JFrame {
    
    String paLabraOculta = "CETYS";
    int contadorFallos= 0;
     
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        //
        dibujaImagen();
    }
    private void chequeaBoton(JButton boton){
        chequeaLetra(boton.getText());
        boton.setEnabled(false);
        
    }
    private void chequeaLetra(String letra){
        if (paLabraOculta.contains(letra)){
            //la letra si que esta. Tengo que quitar el guion bajo
            //y ponerla en su lugar
        }
        else{
            //la letra no esta y hat que aumentar el contador de fallos
            //y cambiar la imagen del ahoracado
            contadorFallos++;
            dibujaImagen();
        }
    }
        private void dibujaImagen() {
        String nombreImagen = "";
        if (contadorFallos ==0){
        }
        switch(contadorFallos){
            case 0: nombreImagen = "/imagenes/ahorcado_0.png"; break;
            case 1: nombreImagen = "/imagenes/ahorcado_1.png"; break;
            case 2: nombreImagen = "/imagenes/ahorcado_2.png"; break;
            case 3: nombreImagen = "/imagenes/ahorcado_3.png"; break;
            case 4: nombreImagen = "/imagenes/ahorcado_4.png"; break;
            case 5: nombreImagen = "/imagenes/ahorcado_5.png"; break;
            default : nombreImagen = "/imagenes/ahorcado_fin.png"; break;
        }
            //cargar la imagen correspondiente en el JLabel del imegenahorcado
                ImageIcon miImagen = new ImageIcon(
                new ImageIcon(getClass().getResource(nombreImagen)).getImage()
                        .getScaledInstance(imagenAhorcado.getWidth(),
                                    imagenAhorcado.getHeight(),
                                    Image.SCALE_DEFAULT)
                );
                imagenAhorcado.setIcon(miImagen);
        
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        palabraGuiones = new javax.swing.JLabel();
        imagenAhorcado = new javax.swing.JLabel();
        letra_A = new javax.swing.JButton();
        letra_A1 = new javax.swing.JButton();
        letra_A2 = new javax.swing.JButton();
        letra_A3 = new javax.swing.JButton();
        letra_A4 = new javax.swing.JButton();
        letra_A5 = new javax.swing.JButton();
        letra_A6 = new javax.swing.JButton();
        letra_A7 = new javax.swing.JButton();
        letra_A8 = new javax.swing.JButton();
        letra_A9 = new javax.swing.JButton();
        letra_A10 = new javax.swing.JButton();
        letra_A11 = new javax.swing.JButton();
        letra_A12 = new javax.swing.JButton();
        letra_A13 = new javax.swing.JButton();
        letra_A14 = new javax.swing.JButton();
        letra_A15 = new javax.swing.JButton();
        letra_A16 = new javax.swing.JButton();
        letra_A17 = new javax.swing.JButton();
        letra_A18 = new javax.swing.JButton();
        letra_A19 = new javax.swing.JButton();
        letra_A20 = new javax.swing.JButton();
        letra_A21 = new javax.swing.JButton();
        letra_A22 = new javax.swing.JButton();
        letra_A23 = new javax.swing.JButton();
        letra_A24 = new javax.swing.JButton();
        letra_A25 = new javax.swing.JButton();
        letra_A26 = new javax.swing.JButton();
        letra_A27 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        palabraGuiones.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        palabraGuiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        palabraGuiones.setText("_ _ _ _ _");

        letra_A.setText("A");
        letra_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_AActionPerformed(evt);
            }
        });

        letra_A1.setText("B");
        letra_A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A1ActionPerformed(evt);
            }
        });

        letra_A2.setText("C");
        letra_A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A2ActionPerformed(evt);
            }
        });

        letra_A3.setText("D");
        letra_A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A3ActionPerformed(evt);
            }
        });

        letra_A4.setText("E");
        letra_A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A4ActionPerformed(evt);
            }
        });

        letra_A5.setText("F");
        letra_A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A5ActionPerformed(evt);
            }
        });

        letra_A6.setText("G");
        letra_A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A6ActionPerformed(evt);
            }
        });

        letra_A7.setText("H");
        letra_A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A7ActionPerformed(evt);
            }
        });

        letra_A8.setText("I");
        letra_A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A8ActionPerformed(evt);
            }
        });

        letra_A9.setText("J");
        letra_A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A9ActionPerformed(evt);
            }
        });

        letra_A10.setText("K");
        letra_A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A10ActionPerformed(evt);
            }
        });

        letra_A11.setText("L");
        letra_A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A11ActionPerformed(evt);
            }
        });

        letra_A12.setText("M");
        letra_A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A12ActionPerformed(evt);
            }
        });

        letra_A13.setText("N");
        letra_A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A13ActionPerformed(evt);
            }
        });

        letra_A14.setText("�");
        letra_A14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A14ActionPerformed(evt);
            }
        });

        letra_A15.setText("O");
        letra_A15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A15ActionPerformed(evt);
            }
        });

        letra_A16.setText("P");
        letra_A16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A16ActionPerformed(evt);
            }
        });

        letra_A17.setText("Q");
        letra_A17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A17ActionPerformed(evt);
            }
        });

        letra_A18.setText("R");
        letra_A18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A18ActionPerformed(evt);
            }
        });

        letra_A19.setText("S");
        letra_A19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A19ActionPerformed(evt);
            }
        });

        letra_A20.setText("T");
        letra_A20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A20ActionPerformed(evt);
            }
        });

        letra_A21.setText("U");
        letra_A21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A21ActionPerformed(evt);
            }
        });

        letra_A22.setText("V");
        letra_A22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A22ActionPerformed(evt);
            }
        });

        letra_A23.setText("W");
        letra_A23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A23ActionPerformed(evt);
            }
        });

        letra_A24.setText("X");
        letra_A24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A24ActionPerformed(evt);
            }
        });

        letra_A25.setText("Y");
        letra_A25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A25ActionPerformed(evt);
            }
        });

        letra_A26.setText("Z");
        letra_A26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A26ActionPerformed(evt);
            }
        });

        letra_A27.setEnabled(false);
        letra_A27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letra_A27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(letra_A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(palabraGuiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(imagenAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(letra_A7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(letra_A13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(letra_A14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra_A15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra_A16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra_A17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra_A18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra_A19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(letra_A20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(letra_A21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(letra_A22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(letra_A23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(letra_A24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(letra_A25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(letra_A26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(letra_A27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(palabraGuiones, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagenAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra_A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra_A7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra_A14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letra_A21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letra_A27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void letra_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_AActionPerformed
       chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_AActionPerformed

    private void letra_A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A1ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A1ActionPerformed

    private void letra_A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A2ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A2ActionPerformed

    private void letra_A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A3ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A3ActionPerformed

    private void letra_A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A4ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A4ActionPerformed

    private void letra_A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A5ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A5ActionPerformed

    private void letra_A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A6ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A6ActionPerformed

    private void letra_A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A7ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A7ActionPerformed

    private void letra_A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A8ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A8ActionPerformed

    private void letra_A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A9ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A9ActionPerformed

    private void letra_A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A10ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A10ActionPerformed

    private void letra_A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A11ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A11ActionPerformed

    private void letra_A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A12ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A12ActionPerformed

    private void letra_A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A13ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A13ActionPerformed

    private void letra_A14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A14ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A14ActionPerformed

    private void letra_A15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A15ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A15ActionPerformed

    private void letra_A16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A16ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A16ActionPerformed

    private void letra_A17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A17ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A17ActionPerformed

    private void letra_A18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A18ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A18ActionPerformed

    private void letra_A19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A19ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A19ActionPerformed

    private void letra_A20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A20ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A20ActionPerformed

    private void letra_A21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A21ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A21ActionPerformed

    private void letra_A22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A22ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A22ActionPerformed

    private void letra_A23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A23ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A23ActionPerformed

    private void letra_A24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A24ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A24ActionPerformed

    private void letra_A25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A25ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A25ActionPerformed

    private void letra_A26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A26ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A26ActionPerformed

    private void letra_A27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letra_A27ActionPerformed
         chequeaBoton((JButton)evt.getSource()); //castear
    }//GEN-LAST:event_letra_A27ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenAhorcado;
    private javax.swing.JButton letra_A;
    private javax.swing.JButton letra_A1;
    private javax.swing.JButton letra_A10;
    private javax.swing.JButton letra_A11;
    private javax.swing.JButton letra_A12;
    private javax.swing.JButton letra_A13;
    private javax.swing.JButton letra_A14;
    private javax.swing.JButton letra_A15;
    private javax.swing.JButton letra_A16;
    private javax.swing.JButton letra_A17;
    private javax.swing.JButton letra_A18;
    private javax.swing.JButton letra_A19;
    private javax.swing.JButton letra_A2;
    private javax.swing.JButton letra_A20;
    private javax.swing.JButton letra_A21;
    private javax.swing.JButton letra_A22;
    private javax.swing.JButton letra_A23;
    private javax.swing.JButton letra_A24;
    private javax.swing.JButton letra_A25;
    private javax.swing.JButton letra_A26;
    private javax.swing.JButton letra_A27;
    private javax.swing.JButton letra_A3;
    private javax.swing.JButton letra_A4;
    private javax.swing.JButton letra_A5;
    private javax.swing.JButton letra_A6;
    private javax.swing.JButton letra_A7;
    private javax.swing.JButton letra_A8;
    private javax.swing.JButton letra_A9;
    private javax.swing.JLabel palabraGuiones;
    // End of variables declaration//GEN-END:variables
}
