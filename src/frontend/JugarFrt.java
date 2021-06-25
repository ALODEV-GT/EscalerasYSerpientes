package frontend;

import java.awt.Color;

public class JugarFrt extends javax.swing.JPanel {
    
    private ManejadorVentanas parent;
    
    public JugarFrt(ManejadorVentanas parent) {
        this.parent = parent;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bgRegresarjPanel = new javax.swing.JPanel();
        btnRegresarjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        bgCargarjPanel = new javax.swing.JPanel();
        btCargarjLabel = new javax.swing.JLabel();
        bgAceptarjPanel = new javax.swing.JPanel();
        btAceptarjLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

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
            .addComponent(btnRegresarjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );
        bgRegresarjPanelLayout.setVerticalGroup(
            bgRegresarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresarjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(bgRegresarjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, -1, -1));
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 280, 430));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        jLabel2.setText("Numero de jugares");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        bgCargarjPanel.setBackground(new java.awt.Color(255, 202, 58));

        btCargarjLabel.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btCargarjLabel.setForeground(new java.awt.Color(1, 1, 1));
        btCargarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btCargarjLabel.setText("CARGAR TABLERO");
        btCargarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCargarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCargarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCargarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgCargarjPanelLayout = new javax.swing.GroupLayout(bgCargarjPanel);
        bgCargarjPanel.setLayout(bgCargarjPanelLayout);
        bgCargarjPanelLayout.setHorizontalGroup(
            bgCargarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btCargarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        bgCargarjPanelLayout.setVerticalGroup(
            bgCargarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btCargarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        add(bgCargarjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 200, 57));

        bgAceptarjPanel.setBackground(new java.awt.Color(255, 202, 58));

        btAceptarjLabel.setBackground(new java.awt.Color(255, 202, 58));
        btAceptarjLabel.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btAceptarjLabel.setForeground(new java.awt.Color(1, 1, 1));
        btAceptarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btAceptarjLabel.setText("ACEPTAR");
        btAceptarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAceptarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAceptarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAceptarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgAceptarjPanelLayout = new javax.swing.GroupLayout(bgAceptarjPanel);
        bgAceptarjPanel.setLayout(bgAceptarjPanelLayout);
        bgAceptarjPanelLayout.setHorizontalGroup(
            bgAceptarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAceptarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        bgAceptarjPanelLayout.setVerticalGroup(
            bgAceptarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAceptarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        add(bgAceptarjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 200, 57));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jPanel9.setBackground(new java.awt.Color(255, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel8.add(jPanel9, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(0, 224, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel8.add(jPanel1, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(155, 2, 2));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel4, new java.awt.GridBagConstraints());

        jPanel2.setBackground(new java.awt.Color(248, 207, 85));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel8.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(137, 233, 35));
        jPanel3.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel8.add(jPanel3, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setForeground(new java.awt.Color(254, 254, 254));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("6");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel8.add(jPanel6, gridBagConstraints);

        add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, 310));
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

    private void btCargarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCargarjLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btCargarjLabelMouseClicked

    private void btCargarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCargarjLabelMouseEntered
        bgCargarjPanel.setBackground(new Color(138,201,38));
    }//GEN-LAST:event_btCargarjLabelMouseEntered

    private void btCargarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCargarjLabelMouseExited
        bgCargarjPanel.setBackground(new Color(255,202,58));
    }//GEN-LAST:event_btCargarjLabelMouseExited

    private void btAceptarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAceptarjLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btAceptarjLabelMouseClicked

    private void btAceptarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAceptarjLabelMouseEntered
        bgAceptarjPanel.setBackground(new Color(138,201,38));
    }//GEN-LAST:event_btAceptarjLabelMouseEntered

    private void btAceptarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAceptarjLabelMouseExited
        bgAceptarjPanel.setBackground(new Color(255,202,58));
    }//GEN-LAST:event_btAceptarjLabelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAceptarjPanel;
    private javax.swing.JPanel bgCargarjPanel;
    private javax.swing.JPanel bgRegresarjPanel;
    private javax.swing.JLabel btAceptarjLabel;
    private javax.swing.JLabel btCargarjLabel;
    private javax.swing.JLabel btnRegresarjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
