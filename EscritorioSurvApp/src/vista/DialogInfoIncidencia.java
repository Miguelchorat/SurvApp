package vista;

import javax.swing.JLabel;
import modelo.Incidencia;

/**
 *
 * @author chorat
 */
public class DialogInfoIncidencia extends javax.swing.JDialog {

    private Incidencia incidencia;
    
    public DialogInfoIncidencia(java.awt.Frame parent, boolean modal,Incidencia incidencia) {
        super(parent, modal);
        initComponents();
        this.setTitle("Información");
        this.setLocationRelativeTo(null);
        this.incidencia = incidencia;
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
        jPanelSeparador = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setMinimumSize(new java.awt.Dimension(400, 310));
        setResizable(false);

        jPanelInfo.setBackground(new java.awt.Color(250, 250, 250));
        jPanelInfo.setMaximumSize(new java.awt.Dimension(400, 225));
        jPanelInfo.setMinimumSize(new java.awt.Dimension(400, 225));
        jPanelInfo.setPreferredSize(new java.awt.Dimension(400, 225));

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

        jPanelSeparador.setBackground(new java.awt.Color(0, 0, 0));
        jPanelSeparador.setMaximumSize(new java.awt.Dimension(358, 1));
        jPanelSeparador.setMinimumSize(new java.awt.Dimension(358, 1));

        javax.swing.GroupLayout jPanelSeparadorLayout = new javax.swing.GroupLayout(jPanelSeparador);
        jPanelSeparador.setLayout(jPanelSeparadorLayout);
        jPanelSeparadorLayout.setHorizontalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanelSeparadorLayout.setVerticalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLabelTitulo.setBackground(new java.awt.Color(250, 250, 250));
        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("INFORMACIÓN");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(223, 83));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(223, 83));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(223, 83));

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabelTituloAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabelTituloAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelSeparador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
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
            .addComponent(jPanelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    public void llenarInfo(){
        jLabelAutor.setText(incidencia.getNombreUsuario());
        if(incidencia.getNombreAdministrador()==null)
            jLabelAdmin.setText("----");
        else
            jLabelAdmin.setText(incidencia.getNombreAdministrador());
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
            java.util.logging.Logger.getLogger(DialogInfoIncidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogInfoIncidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogInfoIncidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogInfoIncidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogInfoIncidencia dialog = new DialogInfoIncidencia(new javax.swing.JFrame(), true , null);
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
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloAdmin;
    private javax.swing.JLabel jLabelTituloAutor;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelSeparador;
    // End of variables declaration//GEN-END:variables
}
