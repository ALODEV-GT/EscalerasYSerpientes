package frontend;

import java.awt.Color;
import javax.swing.JPanel;

public class ManejadorVentanas extends javax.swing.JFrame {
    
    InicioFrtd inicio = new InicioFrtd(this);
    
    public ManejadorVentanas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        contenedorjPanel.add(inicio);
        
    }
    
    public void cambiarVentana(JPanel panel) {
        contenedorjPanel.add(panel);
        contenedorjPanel.validate();
    }
    
    public void mostrarInicio(JPanel panel) {
        panel.setVisible(false);
        this.inicio.setVisible(true);
        cambiarVentana(this.inicio);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorjPanel = new javax.swing.JPanel();
        headjPanel = new javax.swing.JPanel();
        bgCerrarjPanel = new javax.swing.JPanel();
        cerrarjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));

        contenedorjPanel.setLayout(new java.awt.BorderLayout());

        headjPanel.setBackground(new java.awt.Color(106, 76, 147));
        headjPanel.setPreferredSize(new java.awt.Dimension(850, 40));

        bgCerrarjPanel.setBackground(new java.awt.Color(106, 76, 147));
        bgCerrarjPanel.setForeground(new java.awt.Color(254, 254, 254));

        cerrarjLabel.setBackground(new java.awt.Color(106, 46, 107));
        cerrarjLabel.setFont(new java.awt.Font("Roboto Light", 0, 20)); // NOI18N
        cerrarjLabel.setForeground(new java.awt.Color(254, 254, 254));
        cerrarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarjLabel.setText("X");
        cerrarjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarjLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgCerrarjPanelLayout = new javax.swing.GroupLayout(bgCerrarjPanel);
        bgCerrarjPanel.setLayout(bgCerrarjPanelLayout);
        bgCerrarjPanelLayout.setHorizontalGroup(
            bgCerrarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCerrarjPanelLayout.createSequentialGroup()
                .addComponent(cerrarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgCerrarjPanelLayout.setVerticalGroup(
            bgCerrarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCerrarjPanelLayout.createSequentialGroup()
                .addComponent(cerrarjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headjPanelLayout = new javax.swing.GroupLayout(headjPanel);
        headjPanel.setLayout(headjPanelLayout);
        headjPanelLayout.setHorizontalGroup(
            headjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headjPanelLayout.createSequentialGroup()
                .addGap(0, 810, Short.MAX_VALUE)
                .addComponent(bgCerrarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headjPanelLayout.setVerticalGroup(
            headjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headjPanelLayout.createSequentialGroup()
                .addComponent(bgCerrarjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        contenedorjPanel.add(headjPanel, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(contenedorjPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarjLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarjLabelMouseClicked

    private void cerrarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarjLabelMouseEntered
        bgCerrarjPanel.setBackground(new Color(255, 89, 94));
        cerrarjLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_cerrarjLabelMouseEntered

    private void cerrarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarjLabelMouseExited
        bgCerrarjPanel.setBackground(new Color(106, 76, 147));
        cerrarjLabel.setForeground(Color.white);
    }//GEN-LAST:event_cerrarjLabelMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgCerrarjPanel;
    private javax.swing.JLabel cerrarjLabel;
    private javax.swing.JPanel contenedorjPanel;
    private javax.swing.JPanel headjPanel;
    // End of variables declaration//GEN-END:variables
}
