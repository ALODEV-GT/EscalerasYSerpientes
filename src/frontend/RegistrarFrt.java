package frontend;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

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

        jTextField1.setBackground(new java.awt.Color(45, 117, 162));
        jTextField1.setForeground(new java.awt.Color(254, 254, 254));
        jTextField1.setText("Ingrese su apellido");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 15, 230, 30));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(45, 117, 162));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 42, 42)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(45, 117, 162));
        jTextField2.setForeground(new java.awt.Color(254, 254, 254));
        jTextField2.setText("Ingrese su id");
        jTextField2.setBorder(null);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 15, 230, 30));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Id");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(45, 117, 162));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 42, 42)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setBackground(new java.awt.Color(45, 117, 162));
        jTextField3.setForeground(new java.awt.Color(254, 254, 254));
        jTextField3.setText("Ingrese su nombre");
        jTextField3.setBorder(null);
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 15, 230, 30));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(45, 117, 162));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 45, 45)));

        jLabel5.setBackground(new java.awt.Color(45, 117, 162));
        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(47, 47, 47));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRAR");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ///45,117,162
        jPanel5.setBackground(new Color(138,201,38));
        jPanel5.setBorder(null);
        jLabel5.setForeground(Color.BLACK);
        jLabel5.setFont(new Font("Roboto Light", Font.BOLD, 18));
        
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jPanel5.setBackground(new Color(45,117,162));
        Border borde = new TitledBorder(new LineBorder(new Color(45,45,45)), "");
        jPanel5.setBorder(borde);
        jLabel5.setForeground(new Color(47,47,47));
        jLabel5.setFont(new Font("Roboto Light", Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgRegresarjPanel;
    private javax.swing.JLabel btnRegresarjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
