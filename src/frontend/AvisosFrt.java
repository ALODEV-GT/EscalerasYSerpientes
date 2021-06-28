package frontend;

import java.awt.Color;

public class AvisosFrt extends javax.swing.JDialog {
    
    
    public AvisosFrt(java.awt.Frame parent, boolean modal, String mensaje) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.mensajejLabel.setText(mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgjPanel = new javax.swing.JPanel();
        bgbtnAceptarjPanel = new javax.swing.JPanel();
        aceptarjLabel = new javax.swing.JLabel();
        mensajejLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bgjPanel.setBackground(new java.awt.Color(106, 76, 147));

        bgbtnAceptarjPanel.setBackground(new java.awt.Color(25, 130, 196));

        aceptarjLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        aceptarjLabel.setForeground(new java.awt.Color(1, 1, 1));
        aceptarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptarjLabel.setText("Aceptar");
        aceptarjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgbtnAceptarjPanelLayout = new javax.swing.GroupLayout(bgbtnAceptarjPanel);
        bgbtnAceptarjPanel.setLayout(bgbtnAceptarjPanelLayout);
        bgbtnAceptarjPanelLayout.setHorizontalGroup(
            bgbtnAceptarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgbtnAceptarjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aceptarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );
        bgbtnAceptarjPanelLayout.setVerticalGroup(
            bgbtnAceptarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgbtnAceptarjPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aceptarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mensajejLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        mensajejLabel.setForeground(new java.awt.Color(1, 1, 1));
        mensajejLabel.setText("Mensaje");

        javax.swing.GroupLayout bgjPanelLayout = new javax.swing.GroupLayout(bgjPanel);
        bgjPanel.setLayout(bgjPanelLayout);
        bgjPanelLayout.setHorizontalGroup(
            bgjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bgbtnAceptarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(bgjPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(mensajejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        bgjPanelLayout.setVerticalGroup(
            bgjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgjPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(mensajejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgbtnAceptarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarjLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_aceptarjLabelMouseClicked

    private void aceptarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarjLabelMouseEntered
        bgbtnAceptarjPanel.setBackground(new Color(255,89,94));
    }//GEN-LAST:event_aceptarjLabelMouseEntered

    private void aceptarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarjLabelMouseExited
        bgbtnAceptarjPanel.setBackground(new Color(25,130,195));
    }//GEN-LAST:event_aceptarjLabelMouseExited

    
    public static void mostrarMensaje(ManejadorVentanas parent, String mensaje ){
        AvisosFrt aviso = new AvisosFrt(parent, true , mensaje);
        aviso.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptarjLabel;
    private javax.swing.JPanel bgbtnAceptarjPanel;
    private javax.swing.JPanel bgjPanel;
    private javax.swing.JLabel mensajejLabel;
    // End of variables declaration//GEN-END:variables
}
