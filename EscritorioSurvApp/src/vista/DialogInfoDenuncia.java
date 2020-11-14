package vista;

import modelo.Denuncia;

/**
 *
 * @author chorat
 */
public class DialogInfoDenuncia extends javax.swing.JDialog {

    private Denuncia denuncia;
    
    public DialogInfoDenuncia(java.awt.Frame parent, boolean modal,Denuncia denuncia) {
        super(parent, modal);
        initComponents();
        this.setTitle("Información");
        this.setLocationRelativeTo(null);
        this.denuncia = denuncia;
        llenarInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInfo = new javax.swing.JPanel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabelTituloAutor = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelTituloAdmin = new javax.swing.JLabel();
        jLabelAdmin = new javax.swing.JLabel();
        panelHerramientaVentanaDialog = new vista.PanelHerramientaVentanaDialog();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 200));
        setResizable(false);

        jPanelInfo.setBackground(new java.awt.Color(250, 250, 250));
        jPanelInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 150, 250)));
        jPanelInfo.setMaximumSize(new java.awt.Dimension(400, 200));
        jPanelInfo.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanelInfo.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanelInfo.setRequestFocusEnabled(false);

        jButtonCerrarSesion.setBackground(new java.awt.Color(50, 150, 250));
        jButtonCerrarSesion.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jButtonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setText("Cerrar");
        jButtonCerrarSesion.setMaximumSize(new java.awt.Dimension(350, 50));
        jButtonCerrarSesion.setMinimumSize(new java.awt.Dimension(350, 50));
        jButtonCerrarSesion.setPreferredSize(new java.awt.Dimension(350, 50));
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jLabelTituloAutor.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTituloAutor.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTituloAutor.setText("AUTOR:");

        jLabelAutor.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelAutor.setText("e");

        jLabelTituloAdmin.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelTituloAdmin.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTituloAdmin.setText("SEGUIMIENTO :");

        jLabelAdmin.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelAdmin.setText("e");

        panelHerramientaVentanaDialog = new vista.PanelHerramientaVentanaDialog(this,"INFORMACIÓN DENUNCIA");

        

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelHerramientaVentanaDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabelTituloAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabelTituloAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addComponent(panelHerramientaVentanaDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    public void llenarInfo(){
        jLabelAutor.setText(denuncia.getUsuario().getNombre());
        System.out.println(denuncia.getAdministrador().getNombre());
        if(denuncia.getAdministrador().getNombre()==null || denuncia.getAdministrador().getNombre().equals(""))
            jLabelAdmin.setText("----");
        else
            jLabelAdmin.setText(denuncia.getAdministrador().getNombre());
    }
    
    
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
            java.util.logging.Logger.getLogger(DialogInfoDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogInfoDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogInfoDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogInfoDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogInfoDenuncia dialog = new DialogInfoDenuncia(new javax.swing.JFrame(), true , null);
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
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelTituloAdmin;
    private javax.swing.JLabel jLabelTituloAutor;
    private javax.swing.JPanel jPanelInfo;
    private vista.PanelHerramientaVentanaDialog panelHerramientaVentanaDialog;
    // End of variables declaration//GEN-END:variables
}
