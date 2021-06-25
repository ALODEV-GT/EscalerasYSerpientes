package frontend;

import java.awt.Color;

public class InicioFrtd extends javax.swing.JPanel {

    private ManejadorVentanas parent;

    public InicioFrtd(ManejadorVentanas parent) {
        this.parent = parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bgJugarjPanel = new javax.swing.JPanel();
        jugarjLabel = new javax.swing.JLabel();
        bgRegistrarjPanel = new javax.swing.JPanel();
        registrarjLabel = new javax.swing.JLabel();
        bgVerJugadoresjPanel = new javax.swing.JPanel();
        verJugadoresjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 130, 196));

        jLabel1.setBackground(new java.awt.Color(25, 130, 196));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESCALERAS Y SERPIENTES");

        jPanel1.setBackground(new java.awt.Color(25, 130, 196));

        bgJugarjPanel.setBackground(new java.awt.Color(138, 201, 38));

        jugarjLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jugarjLabel.setForeground(new java.awt.Color(1, 1, 1));
        jugarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugarjLabel.setText("JUGAR");
        jugarjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jugarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jugarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jugarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgJugarjPanelLayout = new javax.swing.GroupLayout(bgJugarjPanel);
        bgJugarjPanel.setLayout(bgJugarjPanelLayout);
        bgJugarjPanelLayout.setHorizontalGroup(
            bgJugarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        bgJugarjPanelLayout.setVerticalGroup(
            bgJugarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bgRegistrarjPanel.setBackground(new java.awt.Color(138, 201, 38));

        registrarjLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        registrarjLabel.setForeground(new java.awt.Color(1, 1, 1));
        registrarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarjLabel.setText("REGISTRAR JUGADOR");
        registrarjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgRegistrarjPanelLayout = new javax.swing.GroupLayout(bgRegistrarjPanel);
        bgRegistrarjPanel.setLayout(bgRegistrarjPanelLayout);
        bgRegistrarjPanelLayout.setHorizontalGroup(
            bgRegistrarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        bgRegistrarjPanelLayout.setVerticalGroup(
            bgRegistrarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bgVerJugadoresjPanel.setBackground(new java.awt.Color(138, 201, 38));

        verJugadoresjLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        verJugadoresjLabel.setForeground(new java.awt.Color(1, 1, 1));
        verJugadoresjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verJugadoresjLabel.setText("VER JUGADORES");
        verJugadoresjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verJugadoresjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verJugadoresjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verJugadoresjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verJugadoresjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgVerJugadoresjPanelLayout = new javax.swing.GroupLayout(bgVerJugadoresjPanel);
        bgVerJugadoresjPanel.setLayout(bgVerJugadoresjPanelLayout);
        bgVerJugadoresjPanelLayout.setHorizontalGroup(
            bgVerJugadoresjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verJugadoresjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        bgVerJugadoresjPanelLayout.setVerticalGroup(
            bgVerJugadoresjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verJugadoresjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bgJugarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bgRegistrarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bgVerJugadoresjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bgJugarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(bgRegistrarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(bgVerJugadoresjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jugarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarjLabelMouseClicked
        JugarFrt jugar = new JugarFrt(parent);
        this.setVisible(false);
        jugar.setVisible(true);
        parent.cambiarVentana(jugar);
    }//GEN-LAST:event_jugarjLabelMouseClicked

    private void jugarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarjLabelMouseEntered
        bgJugarjPanel.setBackground(new Color(255, 202, 58));
    }//GEN-LAST:event_jugarjLabelMouseEntered

    private void jugarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarjLabelMouseExited
        bgJugarjPanel.setBackground(new Color(138, 201, 38));
    }//GEN-LAST:event_jugarjLabelMouseExited

    private void registrarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarjLabelMouseEntered
        bgRegistrarjPanel.setBackground(new Color(255, 202, 58));
    }//GEN-LAST:event_registrarjLabelMouseEntered

    private void registrarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarjLabelMouseExited
        bgRegistrarjPanel.setBackground(new Color(138, 201, 38));
    }//GEN-LAST:event_registrarjLabelMouseExited

    private void verJugadoresjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verJugadoresjLabelMouseEntered
        bgVerJugadoresjPanel.setBackground(new Color(255, 202, 58));
    }//GEN-LAST:event_verJugadoresjLabelMouseEntered

    private void verJugadoresjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verJugadoresjLabelMouseExited
        bgVerJugadoresjPanel.setBackground(new Color(138, 201, 38));
    }//GEN-LAST:event_verJugadoresjLabelMouseExited

    private void verJugadoresjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verJugadoresjLabelMouseClicked
        VerJugadoresFrt verJugadores = new VerJugadoresFrt(parent);
        this.setVisible(false);
        verJugadores.setVisible(true);
        parent.cambiarVentana(verJugadores);


    }//GEN-LAST:event_verJugadoresjLabelMouseClicked

    private void registrarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarjLabelMouseClicked
        RegistrarFrt registrar = new RegistrarFrt(parent);
        this.setVisible(false);
        registrar.setVisible(true);
        parent.cambiarVentana(registrar);
    }//GEN-LAST:event_registrarjLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgJugarjPanel;
    private javax.swing.JPanel bgRegistrarjPanel;
    private javax.swing.JPanel bgVerJugadoresjPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugarjLabel;
    private javax.swing.JLabel registrarjLabel;
    private javax.swing.JLabel verJugadoresjLabel;
    // End of variables declaration//GEN-END:variables
}
