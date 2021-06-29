package frontend;

import backend.clases.Jugador;
import backend.clases.Tablero;
import backend.manejadores.CargarDatos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JugarFrt extends javax.swing.JPanel {

    private ManejadorVentanas parent;
    private Tablero tablero;
    private Jugador[] jugadores;
    private int numJugadores;
    private ArrayList<Jugador> tJugadores;
    private int totalJugadores = 0;
    private JTextField[] idJugadores;

    public JugarFrt(ManejadorVentanas parent) {
        this.parent = parent;
        tJugadores = parent.getJugadores();
        initComponents();

        if (!parent.getJugadores().isEmpty()) {
            ponerAccionABotones();
        } else {
            this.notasjLabel.setText("Aun no hay jugadores!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bgRegresarjPanel = new javax.swing.JPanel();
        btnRegresarjLabel = new javax.swing.JLabel();
        contenedorjPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bgCargarjPanel = new javax.swing.JPanel();
        btCargarjLabel = new javax.swing.JLabel();
        bgAceptarjPanel = new javax.swing.JPanel();
        btAceptarjLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        notasjLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
            .addComponent(btnRegresarjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgRegresarjPanelLayout.setVerticalGroup(
            bgRegresarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresarjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(bgRegresarjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, -1, -1));

        contenedorjPanel.setBackground(new java.awt.Color(25, 130, 196));

        javax.swing.GroupLayout contenedorjPanelLayout = new javax.swing.GroupLayout(contenedorjPanel);
        contenedorjPanel.setLayout(contenedorjPanelLayout);
        contenedorjPanelLayout.setHorizontalGroup(
            contenedorjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorjPanelLayout.setVerticalGroup(
            contenedorjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(contenedorjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 200, 230));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel2.setText("Ingresa el id de los jugadores");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        bgCargarjPanel.setBackground(new java.awt.Color(255, 202, 58));

        btCargarjLabel.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btCargarjLabel.setForeground(new java.awt.Color(1, 1, 1));
        btCargarjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btCargarjLabel.setText("CARGAR TABLERO");
        btCargarjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(btCargarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        btAceptarjLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(btAceptarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgAceptarjPanelLayout.setVerticalGroup(
            bgAceptarjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btAceptarjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        add(bgAceptarjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 200, 57));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridBagLayout());

        btn1.setBackground(new java.awt.Color(255, 0, 0));
        btn1.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        btn1.setForeground(new java.awt.Color(254, 254, 254));
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel8.add(btn1, new java.awt.GridBagConstraints());

        btn2.setBackground(new java.awt.Color(155, 2, 2));
        btn2.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        btn2.setForeground(new java.awt.Color(254, 254, 254));
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel8.add(btn2, new java.awt.GridBagConstraints());

        btn3.setBackground(new java.awt.Color(0, 224, 255));
        btn3.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        btn3.setForeground(new java.awt.Color(254, 254, 254));
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel8.add(btn3, gridBagConstraints);

        btn5.setBackground(new java.awt.Color(137, 233, 35));
        btn5.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        btn5.setForeground(new java.awt.Color(254, 254, 254));
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel8.add(btn5, gridBagConstraints);

        btn6.setBackground(new java.awt.Color(254, 254, 254));
        btn6.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        btn6.setForeground(new java.awt.Color(1, 1, 1));
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel8.add(btn6, gridBagConstraints);

        btn4.setBackground(new java.awt.Color(248, 207, 85));
        btn4.setFont(new java.awt.Font("Roboto Medium", 0, 60)); // NOI18N
        btn4.setForeground(new java.awt.Color(254, 254, 254));
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel8.add(btn4, gridBagConstraints);

        add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, 310));

        notasjLabel.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        notasjLabel.setForeground(new java.awt.Color(255, 0, 0));
        add(notasjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 330, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        jLabel3.setText("Numero de jugares");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        jLabel4.setText("Numero de jugares");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
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
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChosser.getSelectedFile();
            CargarDatos cargarDatos = new CargarDatos();
            cargarDatos.cargarDatos(archivo.getAbsolutePath(), parent);
            this.tablero = cargarDatos.getTablero();
        }
    }//GEN-LAST:event_btCargarjLabelMouseClicked

    private ActionListener ponerAccionABoton(int indice) {
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                contenedorjPanel.removeAll();

                jugadores = new Jugador[indice];
                numJugadores = indice;

                idJugadores = new JTextField[indice];

                contenedorjPanel.setLayout(new GridLayout(6, 2));
                contenedorjPanel.setPreferredSize(new Dimension(200, 25 * indice));

                for (int i = 0; i < indice; i++) {
                    JLabel label = new JLabel("Id jugador " + (i + 1));
                    label.setSize(90, 20);
                    label.setFont(new Font("Roboto Light", 1, 15));
                    JTextField id = new JTextField();
                    id.setSize(90, 20);
                    id.setBackground(new Color(25, 130, 196));
                    id.setFont(new Font("Roboto Light", 1, 15));
                    idJugadores[i] = id;

                    contenedorjPanel.add(label);
                    contenedorjPanel.add(id);
                }

                contenedorjPanel.updateUI();
            }
        };
        return accion;
    }

    public void ponerAccionABotones() {
        btn1.addActionListener(ponerAccionABoton(1));
        btn2.addActionListener(ponerAccionABoton(2));
        btn3.addActionListener(ponerAccionABoton(3));
        btn4.addActionListener(ponerAccionABoton(4));
        btn5.addActionListener(ponerAccionABoton(5));
        btn6.addActionListener(ponerAccionABoton(6));
    }

    private void btCargarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCargarjLabelMouseEntered
        bgCargarjPanel.setBackground(new Color(138, 201, 38));
    }//GEN-LAST:event_btCargarjLabelMouseEntered

    private void btCargarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCargarjLabelMouseExited
        bgCargarjPanel.setBackground(new Color(255, 202, 58));
    }//GEN-LAST:event_btCargarjLabelMouseExited

    private void btAceptarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAceptarjLabelMouseClicked
        boolean existe = evaluarSiIdExisten();

        if (existe) {
            
        } else {
            elegirJugadores();
            JuegoFrt juego = new JuegoFrt(parent, tablero, jugadores);
            this.setVisible(false);
            juego.setVisible(true);
            parent.cambiarVentana(juego);
        }
    }//GEN-LAST:event_btAceptarjLabelMouseClicked

    public void elegirJugadores(){
        for (int i = 0; i < jugadores.length; i++) {
            for (int j = 0; j < tJugadores.size(); j++) {
                if(tJugadores.get(j).getId() ==  Integer.valueOf(idJugadores[i].getText())){
                    jugadores[i] = tJugadores.get(j);
                }
            }
        }
    }
    
    
    public boolean evaluarSiIdExisten() {
        boolean existe = true;
        boolean mostrarMensaje = false;
        String texto = "No existe el id do los jugadores";
        for (int i = 0; i < idJugadores.length; i++) {
            existe = buscarSiExiste(Integer.valueOf(idJugadores[i].getText()));

            if (existe == false) {
                mostrarMensaje = true;
                texto += ", Jugador " + (i + 1);
                existe = true;
            }
        }

        if (mostrarMensaje) {
            AvisosFrt.mostrarMensaje(parent, texto);
        }

        return mostrarMensaje;
    }

    public boolean buscarSiExiste(int id) {
        boolean existe = false;
        for (int i = 0; i < tJugadores.size(); i++) {
            if (tJugadores.get(i).getId() == id) {
                existe = true;
            }
        }

        return existe;
    }


    private void btAceptarjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAceptarjLabelMouseEntered
        bgAceptarjPanel.setBackground(new Color(138, 201, 38));
    }//GEN-LAST:event_btAceptarjLabelMouseEntered

    private void btAceptarjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAceptarjLabelMouseExited
        bgAceptarjPanel.setBackground(new Color(255, 202, 58));
    }//GEN-LAST:event_btAceptarjLabelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgAceptarjPanel;
    private javax.swing.JPanel bgCargarjPanel;
    private javax.swing.JPanel bgRegresarjPanel;
    private javax.swing.JLabel btAceptarjLabel;
    private javax.swing.JLabel btCargarjLabel;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JLabel btnRegresarjLabel;
    private javax.swing.JPanel contenedorjPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel notasjLabel;
    // End of variables declaration//GEN-END:variables
}
