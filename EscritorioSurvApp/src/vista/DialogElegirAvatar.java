package vista;

/**
 *
 * @author chorat
 */
public class DialogElegirAvatar extends javax.swing.JDialog {

    private VistaPrincipal vp;
    
    public DialogElegirAvatar(java.awt.Frame parent, boolean modal) {        
        super(parent, modal);
        this.vp = (VistaPrincipal) parent;
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEleccionAvatar = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        panelEleccionAvatar = new vista.PanelEleccionAvatar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanelEleccionAvatar.setBackground(new java.awt.Color(250, 250, 250));
        jPanelEleccionAvatar.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanelEleccionAvatar.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabelTitulo.setBackground(new java.awt.Color(250, 250, 250));
        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Elige un Avatar");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(378, 45));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(378, 45));
        jLabelTitulo.setOpaque(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(378, 45));

        panelEleccionAvatar = new vista.PanelEleccionAvatar(vp.getPanelInicial().getPanelGeneral(),this);

        javax.swing.GroupLayout jPanelEleccionAvatarLayout = new javax.swing.GroupLayout(jPanelEleccionAvatar);
        jPanelEleccionAvatar.setLayout(jPanelEleccionAvatarLayout);
        jPanelEleccionAvatarLayout.setHorizontalGroup(
            jPanelEleccionAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEleccionAvatarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEleccionAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(panelEleccionAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEleccionAvatarLayout.setVerticalGroup(
            jPanelEleccionAvatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEleccionAvatarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEleccionAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEleccionAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEleccionAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
            java.util.logging.Logger.getLogger(DialogElegirAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogElegirAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogElegirAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogElegirAvatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogElegirAvatar dialog = new DialogElegirAvatar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelEleccionAvatar;
    private vista.PanelEleccionAvatar panelEleccionAvatar;
    // End of variables declaration//GEN-END:variables
}
