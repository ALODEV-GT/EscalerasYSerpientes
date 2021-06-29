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
    private boolean partidaEnCurso = true;
    

    public JuegoFrt(ManejadorVentanas parent, Tablero tablero, Jugador[] jugadores) {
        //this.jugadores = jugadores;
        this.tablero = tablero;
        this.parent = parent;
        initComponents();
        reiniciarValoresJugadores(jugadores);
        contenedor.setLayout(new GridLayout(this.tablero.getFilas(), this.tablero.getColumnas()));
        contenedor.setPreferredSize(new Dimension(70 * this.tablero.getFilas(), 55 * this.tablero.getColumnas()));
        dibujarTablero();
        
        motor = new MotorJuego(jugadores, mostrarNumDado, mostrarTurnoDe, tablero, this.parent,  this.dadojLabel, this.fichaTurnojLabel);
        TiempoPartida tiempo = new TiempoPartida();
        tiempo.start();
    }
    
    private void reiniciarValoresJugadores(Jugador[] jugadores){
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].reiniciarValores();
        }
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
        mostrarTurnoDe = new javax.swing.JLabel();
        fichaTurnojLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dadojLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mostrarNumDado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tiempojLabel = new javax.swing.JLabel();

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

        jPanel1.setOpaque(false);

        mostrarTurnoDe.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        mostrarTurnoDe.setForeground(new java.awt.Color(1, 1, 1));
        mostrarTurnoDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarTurnoDe.setText("jLabel1");

        fichaTurnojLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarTurnoDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fichaTurnojLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(mostrarTurnoDe, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fichaTurnojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarNumDado.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        mostrarNumDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(mostrarNumDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 130, 20));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Obtuviste un");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 10, 140, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(78, 78, 78));
        jLabel2.setText("Tiempo transcurrido:");

        tiempojLabel.setText("tiempo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiempojLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tiempojLabel)))
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
            if(motor.getGanador() != null){
                partidaEnCurso = false;
                parent.mostrarInicio(this);
            }
        }
    }//GEN-LAST:event_dadojLabelMouseClicked

    private class TiempoPartida extends Thread{
        
         private int contador = 0;
        
        @Override
        public void run(){
            
            while(partidaEnCurso){
                contador++;
                tiempojLabel.setText(""+contador);
                 try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    System.err.println("Ocurrio un error en el hilo Contador");
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel dadojLabel;
    private javax.swing.JLabel fichaTurnojLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mostrarNumDado;
    private javax.swing.JLabel mostrarTurnoDe;
    private javax.swing.JLabel tiempojLabel;
    // End of variables declaration//GEN-END:variables
}
