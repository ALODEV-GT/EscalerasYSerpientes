package frontend;

import backend.clases.Casilla;
import backend.clases.Jugador;
import backend.clases.Tablero;
import backend.manejadores.MotorJuego;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class JuegoFrt extends javax.swing.JPanel {

    private Tablero tablero;
    private ManejadorVentanas parent;
    private MotorJuego motor;
    private Jugador[] jugadores;
    private boolean dadoEnMovimiento = false;
    

    public JuegoFrt(ManejadorVentanas parent, Tablero tablero, Jugador[] jugadores) {
        //this.jugadores = jugadores;
        this.tablero = tablero;
        this.parent = parent;
        initComponents();
        contenedor.setLayout(new GridLayout(this.tablero.getFilas(), this.tablero.getColumnas()));
        contenedor.setPreferredSize(new Dimension(70 * this.tablero.getFilas(), 55 * this.tablero.getColumnas()));
        dibujarTablero();
        
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador(123, "Brayan", "Alonzo");
        jugadores[1] = new Jugador(578, "Alex", "Ouiji");
        
        motor = new MotorJuego(jugadores, mostrarNumDado, mostrarTurnoDe, tablero, this.parent);
    }
    
    private void dibujarTablero(){
        Casilla[][] tablero = this.tablero.getTablero();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                contenedor.add(tablero[i][j].getPanel());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dadojLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mostrarNumDado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mostrarTurnoDe = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 130, 196));
        setMaximumSize(new java.awt.Dimension(850, 510));
        setMinimumSize(new java.awt.Dimension(850, 510));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(660, 458));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(660, 458));
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(660, 458));

        contenedor.setBackground(new java.awt.Color(25, 130, 196));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contenedor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(140, 140));
        jPanel2.setMinimumSize(new java.awt.Dimension(140, 140));
        jPanel2.setOpaque(false);

        dadojLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parado.png"))); // NOI18N
        dadojLabel.setMaximumSize(new java.awt.Dimension(140, 140));
        dadojLabel.setMinimumSize(new java.awt.Dimension(140, 140));
        dadojLabel.setPreferredSize(new java.awt.Dimension(140, 140));
        dadojLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dadojLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dadojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarNumDado.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        mostrarNumDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(mostrarNumDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 130, 20));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Obtuviste un");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 10, 140, -1));

        mostrarTurnoDe.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mostrarTurnoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mostrarTurnoDe)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dadojLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dadojLabelMouseClicked
        if(dadoEnMovimiento){
            dadojLabel.setIcon(new ImageIcon("src/resources/parado.png") );
            dadoEnMovimiento = false;
            motor.setYaEligio(true);
        }else{
            dadojLabel.setIcon(new ImageIcon("src/resources/dado.gif") );
            dadoEnMovimiento = true;
        }
    }//GEN-LAST:event_dadojLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel dadojLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mostrarNumDado;
    private javax.swing.JLabel mostrarTurnoDe;
    // End of variables declaration//GEN-END:variables
}
