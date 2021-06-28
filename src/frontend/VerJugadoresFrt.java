package frontend;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class VerJugadoresFrt extends javax.swing.JPanel {

    private ManejadorVentanas parent;
    private DefaultTableModel jugadoresModelo = new DefaultTableModel();

    public VerJugadoresFrt(ManejadorVentanas parent) {
        this.parent = parent;
        initComponents(); 
        cargarModeloTabla();
        imprimirJugadores();
    }
    
    public void imprimirJugadores(){
        if (!parent.getJugadores().isEmpty()) {
            for (int i = 0; i < parent.getJugadores().size(); i++) {
                jugadoresModelo.addRow(parent.getJugadores().get(i).getInformacion());
            }
        }
    }
    
    private void cargarModeloTabla() {
        jugadoresModelo.addColumn("Id");
        jugadoresModelo.addColumn("Nombre");
        jugadoresModelo.addColumn("Apellido");
        jugadoresModelo.addColumn("Partidas ganadas");
        jugadoresModelo.addColumn("Partidas perdidas");
        jugadoresModelo.addColumn("Partidas jugadas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRegresarjPanel = new javax.swing.JPanel();
        btnRegresarjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoJugadoresjTable = new javax.swing.JTable();

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

        infoJugadoresjTable.setBackground(new java.awt.Color(138, 201, 38));
        infoJugadoresjTable.setBorder(null);
        infoJugadoresjTable.setFont(new java.awt.Font("Roboto Light", 0, 15)); // NOI18N
        infoJugadoresjTable.setForeground(new java.awt.Color(1, 1, 1));
        infoJugadoresjTable.setModel(jugadoresModelo);
        infoJugadoresjTable.setGridColor(new java.awt.Color(138, 201, 38));
        jScrollPane1.setViewportView(infoJugadoresjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 800, -1));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgRegresarjPanel;
    private javax.swing.JLabel btnRegresarjLabel;
    private javax.swing.JTable infoJugadoresjTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
