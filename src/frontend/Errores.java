package frontend;

import java.awt.Color;
import javax.swing.JTextArea;

public class Errores extends javax.swing.JDialog {

    public Errores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }
    
    public JTextArea getMostrarErrores(){
        return espacioErroresjTextArea;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        espacioErroresjTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        bgAceptarjPanel = new javax.swing.JPanel();
        btnAceptarjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 89, 94));

        espacioErroresjTextArea.setEditable(false);
        espacioErroresjTextArea.setBackground(new java.awt.Color(255, 202, 58));
        espacioErroresjTextArea.setColumns(20);
        espacioErroresjTextArea.setFont(new java.awt.Font("Roboto Light", 0, 15)); // NOI18N
        espacioErroresjTextArea.setRows(5);
        jScrollPane1.setViewportView(espacioErroresjTextArea);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ERRORES");

        bgAceptarjPanel.setBackground(new java.awt.Color(106, 76, 147));
        bgAceptarjPanel.setForeground(new java.awt.Color(106, 76, 147));

        btnAceptarjLabel.setFont(new java.awt.Font("Roboto Light", 0, 15)); // NOI18N
        btnAceptarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptarjLabel.setText("ACEPTAR");
        btnAceptarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgAceptarjPanelLayout = new javax.swing.GroupLayout(bgAceptarjPanel);
        bgAceptarjPanel.setLayout(bgAceptarjPanelLayout);
        bgAceptarjPanelLayout.setHorizontalGroup(
            bgAceptarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAceptarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );
        bgAceptarjPanelLayout.setVerticalGroup(
            bgAceptarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAceptarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(bgAceptarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bgAceptarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarjLabelMouseClicked
       this.dispose();
    }//GEN-LAST:event_btnAceptarjLabelMouseClicked

    private void btnAceptarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarjLabelMouseEntered
        bgAceptarjPanel.setBackground(new Color(25, 130, 196));
    }//GEN-LAST:event_btnAceptarjLabelMouseEntered

    private void btnAceptarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarjLabelMouseExited
        bgAceptarjPanel.setBackground(new Color(106, 76, 147));
    }//GEN-LAST:event_btnAceptarjLabelMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAceptarjPanel;
    private javax.swing.JLabel btnAceptarjLabel;
    private javax.swing.JTextArea espacioErroresjTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
