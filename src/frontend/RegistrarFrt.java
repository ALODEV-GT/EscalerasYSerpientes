package frontend;

import backend.clases.Jugador;
import backend.manejadores.LecturaEscrituraArchivosBinario;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class RegistrarFrt extends javax.swing.JPanel {

    private ManejadorVentanas parent;

    public RegistrarFrt(ManejadorVentanas parent) {
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRegresarjPanel = new javax.swing.JPanel();
        btnRegresarjLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        apellidojTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        idjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nombrejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bgRegistrarjPanel = new javax.swing.JPanel();
        btnRegistrarjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 130, 196));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgRegresarjPanel.setBackground(new java.awt.Color(25, 130, 196));

        btnRegresarjLabel.setFont(new java.awt.Font("Roboto Light", 0, 19)); // NOI18N
        btnRegresarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresarjLabel.setText("Regresar");
        btnRegresarjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgRegresarjPanelLayout = new javax.swing.GroupLayout(bgRegresarjPanel);
        bgRegresarjPanel.setLayout(bgRegresarjPanelLayout);
        bgRegresarjPanelLayout.setHorizontalGroup(
            bgRegresarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        bgRegresarjPanelLayout.setVerticalGroup(
            bgRegresarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresarjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(bgRegresarjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 468, -1, -1));

        jPanel4.setBackground(new java.awt.Color(45, 117, 162));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO");

        jPanel1.setBackground(new java.awt.Color(45, 117, 162));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 42, 42)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apellidojTextField.setBackground(new java.awt.Color(45, 117, 162));
        apellidojTextField.setForeground(new java.awt.Color(254, 254, 254));
        apellidojTextField.setBorder(null);
        jPanel1.add(apellidojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 15, 230, 30));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(45, 117, 162));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 42, 42)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idjTextField.setBackground(new java.awt.Color(45, 117, 162));
        idjTextField.setForeground(new java.awt.Color(254, 254, 254));
        idjTextField.setBorder(null);
        jPanel2.add(idjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 15, 230, 30));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Id");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(45, 117, 162));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 42, 42)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrejTextField.setBackground(new java.awt.Color(45, 117, 162));
        nombrejTextField.setForeground(new java.awt.Color(254, 254, 254));
        nombrejTextField.setBorder(null);
        jPanel3.add(nombrejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 15, 230, 30));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Nombre");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        bgRegistrarjPanel.setBackground(new java.awt.Color(45, 117, 162));
        bgRegistrarjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 45, 45)));

        btnRegistrarjLabel.setBackground(new java.awt.Color(45, 117, 162));
        btnRegistrarjLabel.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnRegistrarjLabel.setForeground(new java.awt.Color(47, 47, 47));
        btnRegistrarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarjLabel.setText("REGISTRAR");
        btnRegistrarjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgRegistrarjPanelLayout = new javax.swing.GroupLayout(bgRegistrarjPanel);
        bgRegistrarjPanel.setLayout(bgRegistrarjPanelLayout);
        bgRegistrarjPanelLayout.setHorizontalGroup(
            bgRegistrarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRegistrarjPanelLayout.createSequentialGroup()
                .addComponent(btnRegistrarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgRegistrarjPanelLayout.setVerticalGroup(
            bgRegistrarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(bgRegistrarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(bgRegistrarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 300, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarjLabelMouseClicked
        parent.mostrarInicio(this);
    }//GEN-LAST:event_btnRegresarjLabelMouseClicked

    private void btnRegresarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarjLabelMouseEntered
        bgRegresarjPanel.setBackground(new Color(255, 89, 94));
    }//GEN-LAST:event_btnRegresarjLabelMouseEntered

    private void btnRegresarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarjLabelMouseExited
        bgRegresarjPanel.setBackground(new Color(25, 130, 196));
    }//GEN-LAST:event_btnRegresarjLabelMouseExited

    private void btnRegistrarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarjLabelMouseEntered
        ///45,117,162
        bgRegistrarjPanel.setBackground(new Color(138, 201, 38));
        bgRegistrarjPanel.setBorder(null);
        btnRegistrarjLabel.setForeground(Color.BLACK);
        btnRegistrarjLabel.setFont(new Font("Roboto Light", Font.BOLD, 18));

    }//GEN-LAST:event_btnRegistrarjLabelMouseEntered

    private void btnRegistrarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarjLabelMouseExited
        bgRegistrarjPanel.setBackground(new Color(45, 117, 162));
        Border borde = new TitledBorder(new LineBorder(new Color(45, 45, 45)), "");
        bgRegistrarjPanel.setBorder(borde);
        btnRegistrarjLabel.setForeground(new Color(47, 47, 47));
        btnRegistrarjLabel.setFont(new Font("Roboto Light", Font.PLAIN, 18));
    }//GEN-LAST:event_btnRegistrarjLabelMouseExited

    private void btnRegistrarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarjLabelMouseClicked
        try {

            int id = Integer.valueOf(idjTextField.getText());
            String nombre = nombrejTextField.getText();
            String apellido = apellidojTextField.getText();

            if (parent.getJugadores().isEmpty()) {
                Jugador jugador = new Jugador(id, nombre, apellido);
                parent.getJugadores().add(jugador);
                LecturaEscrituraArchivosBinario<Jugador> escritura = new LecturaEscrituraArchivosBinario<>("src/binarios/" + jugador.getId() + ".bin");
                escritura.escribirArchivoBin(jugador);
                AvisosFrt.mostrarMensaje(parent, "Te has registrado correctamente");
                limpiar();
            } else {
                boolean existe = false;

                Jugador jugador = new Jugador(id, nombre, apellido);

                for (int i = 0; i < parent.getJugadores().size(); i++) {
                    if (jugador.equals(parent.getJugadores().get(i))) {
                        existe = true;
                    }
                }

                if (existe) {
                    AvisosFrt.mostrarMensaje(parent, "Un usuario ya uso este id");
                    idjTextField.setText("");
                } else {
                    parent.getJugadores().add(jugador);
                    LecturaEscrituraArchivosBinario<Jugador> escritura = new LecturaEscrituraArchivosBinario<>("src/binarios/" + jugador.getId() + ".bin");
                    escritura.escribirArchivoBin(jugador);
                    AvisosFrt.mostrarMensaje(parent, "Te has registrado correctamente");
                    limpiar();
                }
            }

        } catch (NumberFormatException e) {
            idjTextField.setText("");
            AvisosFrt.mostrarMensaje(parent, "En el id, solo se admite numeros");
        }
    }//GEN-LAST:event_btnRegistrarjLabelMouseClicked

    private void limpiar() {
        idjTextField.setText("");
        nombrejTextField.setText("");
        apellidojTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidojTextField;
    private javax.swing.JPanel bgRegistrarjPanel;
    private javax.swing.JPanel bgRegresarjPanel;
    private javax.swing.JLabel btnRegistrarjLabel;
    private javax.swing.JLabel btnRegresarjLabel;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nombrejTextField;
    // End of variables declaration//GEN-END:variables
}
