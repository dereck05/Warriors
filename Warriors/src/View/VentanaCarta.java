/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;


/**
 *
 * @author Gloriana
 */
public class VentanaCarta extends javax.swing.JFrame {

    /**
     * Creates new form Prueba
     */
    public VentanaCarta() {
        initComponents();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        panelStats = new javax.swing.JPanel();
        lblForVida = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        lblForCampo = new javax.swing.JLabel();
        lblCampo = new javax.swing.JLabel();
        lblForCosto = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblForGolpes = new javax.swing.JLabel();
        lblGolpes = new javax.swing.JLabel();
        lblForAparicion = new javax.swing.JLabel();
        lblAparicion = new javax.swing.JLabel();
        panelDibujo = new javax.swing.JPanel();
        lblDibujo = new javax.swing.JLabel();
        panelLabelForAtaques = new javax.swing.JPanel();
        lblForAtaques = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelAtaques = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 600));

        jPanel3.setMinimumSize(new java.awt.Dimension(400, 620));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 620));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        panelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        panelTitulo.setMinimumSize(new java.awt.Dimension(400, 40));
        panelTitulo.setPreferredSize(new java.awt.Dimension(400, 40));

        lblNombre.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Orco");

        lblNivel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel.setText("13");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(276, 276, 276)
                .addComponent(lblNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblNivel))
                .addContainerGap())
        );

        jPanel3.add(panelTitulo);

        panelStats.setMinimumSize(new java.awt.Dimension(400, 115));

        lblForVida.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblForVida.setText("Vida:");

        lblVida.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblVida.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVida.setText("100");

        lblForCampo.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblForCampo.setText("Campo:");

        lblCampo.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblCampo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCampo.setText("3");

        lblForCosto.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblForCosto.setText("Costo:");

        lblCosto.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblCosto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCosto.setText("11");

        lblForGolpes.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblForGolpes.setText("Golpes:");

        lblGolpes.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblGolpes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGolpes.setText("8");

        lblForAparicion.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblForAparicion.setText("Aparición:");

        lblAparicion.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblAparicion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAparicion.setText("7");

        javax.swing.GroupLayout panelStatsLayout = new javax.swing.GroupLayout(panelStats);
        panelStats.setLayout(panelStatsLayout);
        panelStatsLayout.setHorizontalGroup(
            panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addComponent(lblForCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(lblForCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addComponent(lblForVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE))
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(109, 109, 109)
                .addGroup(panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addComponent(lblForAparicion, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(lblForGolpes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblAparicion, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                    .addComponent(lblGolpes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        panelStatsLayout.setVerticalGroup(
            panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addComponent(lblForVida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblForCampo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblForCosto))
                    .addGroup(panelStatsLayout.createSequentialGroup()
                        .addGroup(panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStatsLayout.createSequentialGroup()
                                .addComponent(lblVida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCampo))
                            .addGroup(panelStatsLayout.createSequentialGroup()
                                .addComponent(lblForGolpes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblForAparicion))
                            .addGroup(panelStatsLayout.createSequentialGroup()
                                .addComponent(lblGolpes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAparicion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCosto)))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel3.add(panelStats);

        panelDibujo.setMinimumSize(new java.awt.Dimension(400, 305));
        panelDibujo.setPreferredSize(new java.awt.Dimension(400, 305));

        lblDibujo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelDibujoLayout = new javax.swing.GroupLayout(panelDibujo);
        panelDibujo.setLayout(panelDibujoLayout);
        panelDibujoLayout.setHorizontalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDibujoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDibujo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDibujoLayout.setVerticalGroup(
            panelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );

        jPanel3.add(panelDibujo);

        panelLabelForAtaques.setBackground(new java.awt.Color(0, 0, 0));
        panelLabelForAtaques.setMinimumSize(new java.awt.Dimension(400, 40));
        panelLabelForAtaques.setPreferredSize(new java.awt.Dimension(400, 40));

        lblForAtaques.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lblForAtaques.setForeground(new java.awt.Color(255, 255, 255));
        lblForAtaques.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForAtaques.setLabelFor(panelAtaques);
        lblForAtaques.setText("Ataques:");

        javax.swing.GroupLayout panelLabelForAtaquesLayout = new javax.swing.GroupLayout(panelLabelForAtaques);
        panelLabelForAtaques.setLayout(panelLabelForAtaquesLayout);
        panelLabelForAtaquesLayout.setHorizontalGroup(
            panelLabelForAtaquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLabelForAtaquesLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lblForAtaques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(166, 166, 166))
        );
        panelLabelForAtaquesLayout.setVerticalGroup(
            panelLabelForAtaquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLabelForAtaquesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblForAtaques, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(panelLabelForAtaques);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(400, 120));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(480, 120));

        panelAtaques.setBackground(new java.awt.Color(204, 204, 204));
        panelAtaques.setMaximumSize(new java.awt.Dimension(65534, 65534));
        panelAtaques.setMinimumSize(new java.awt.Dimension(400, 120));
        panelAtaques.setPreferredSize(new java.awt.Dimension(480, 120));
        panelAtaques.setLayout(new javax.swing.BoxLayout(panelAtaques, javax.swing.BoxLayout.X_AXIS));
        jScrollPane1.setViewportView(panelAtaques);

        jPanel3.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCarta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblAparicion;
    public javax.swing.JLabel lblCampo;
    public javax.swing.JLabel lblCosto;
    public javax.swing.JLabel lblDibujo;
    private javax.swing.JLabel lblForAparicion;
    private javax.swing.JLabel lblForAtaques;
    private javax.swing.JLabel lblForCampo;
    private javax.swing.JLabel lblForCosto;
    private javax.swing.JLabel lblForGolpes;
    private javax.swing.JLabel lblForVida;
    public javax.swing.JLabel lblGolpes;
    public javax.swing.JLabel lblNivel;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblVida;
    public javax.swing.JPanel panelAtaques;
    public javax.swing.JPanel panelDibujo;
    private javax.swing.JPanel panelLabelForAtaques;
    private javax.swing.JPanel panelStats;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
