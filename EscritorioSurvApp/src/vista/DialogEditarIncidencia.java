package vista;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Incidencia;
import util.EstadoAdmin;
import util.EstadoIncidencia;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class DialogEditarIncidencia extends javax.swing.JDialog implements Protocolo{

    private PanelGeneral panelGeneral;
    private Incidencia incidencia;
    
    public DialogEditarIncidencia(java.awt.Frame parent, boolean modal,PanelGeneral pg,Incidencia incidencia) {
        super(parent, modal);
        initComponents();
        this.setTitle("Estado");
        this.setLocationRelativeTo(null);
        this.panelGeneral = pg;
        this.incidencia = incidencia;
        llenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInfo = new javax.swing.JPanel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabelCambiarEstado = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        panelHerramientaVentanaDialog = new vista.PanelHerramientaVentanaDialog();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));
        setUndecorated(true);
        setResizable(false);

        jPanelInfo.setBackground(new java.awt.Color(250, 250, 250));
        jPanelInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 150, 250)));
        jPanelInfo.setMaximumSize(new java.awt.Dimension(400, 200));
        jPanelInfo.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanelInfo.setPreferredSize(new java.awt.Dimension(400, 200));

        jButtonCerrarSesion.setBackground(new java.awt.Color(50, 150, 250));
        jButtonCerrarSesion.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jButtonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCerrarSesion.setText("Aceptar");
        jButtonCerrarSesion.setMaximumSize(new java.awt.Dimension(350, 50));
        jButtonCerrarSesion.setMinimumSize(new java.awt.Dimension(350, 50));
        jButtonCerrarSesion.setPreferredSize(new java.awt.Dimension(350, 50));
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jLabelCambiarEstado.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jLabelCambiarEstado.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCambiarEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCambiarEstado.setText("CAMBIAR ESTADO");

        panelHerramientaVentanaDialog = new vista.PanelHerramientaVentanaDialog(this,"EDITAR INCIDENCIA");

        
        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHerramientaVentanaDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCambiarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jComboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addComponent(panelHerramientaVentanaDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        try {
            panelGeneral.getVp().getSalida().writeInt(CAMBIAR_ESTADO_INCIDENCIA);            
            EstadoAdmin estadoAdmin = new EstadoAdmin(
                    panelGeneral.getVp().getUsuario().getId(),
                    incidencia.getId(),EstadoIncidencia.valueOf(""+jComboBoxEstado.getSelectedItem()));
            if(jComboBoxEstado.getSelectedItem().equals(EstadoIncidencia.ESPERANDO.name()))
                estadoAdmin.setAdmin(-1);           
            panelGeneral.getVp().getSalida().writeUTF(panelGeneral.getVp().getGson().toJson(estadoAdmin));
            int result = panelGeneral.getVp().getEntrada().readInt();
            if(result!=CAMBIAR_ESTADO_INCIDENCIA_EXITOSA)
                JOptionPane.showMessageDialog(panelGeneral.getVp(), "No se pudo cambiar el estado por un error inesperado");
        } catch (IOException ex) {
            Logger.getLogger(DialogModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed
    
    public void llenarComboBox(){
        for(EstadoIncidencia estado: EstadoIncidencia.values()){
            jComboBoxEstado.addItem(estado.name());
        }
        jComboBoxEstado.setSelectedIndex(incidencia.getEstado().ordinal());
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
            java.util.logging.Logger.getLogger(DialogEditarIncidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogEditarIncidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogEditarIncidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogEditarIncidencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogEditarIncidencia dialog = new DialogEditarIncidencia(new javax.swing.JFrame(), true , null, null);
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
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabelCambiarEstado;
    private javax.swing.JPanel jPanelInfo;
    private vista.PanelHerramientaVentanaDialog panelHerramientaVentanaDialog;
    // End of variables declaration//GEN-END:variables
}
