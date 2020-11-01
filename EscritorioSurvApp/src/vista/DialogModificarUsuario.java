package vista;

import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Usuario;
import util.Protocolo;
import util.TipoAvatar;

/**
 *
 * @author chorat
 */
public class DialogModificarUsuario extends javax.swing.JDialog implements Protocolo{

    private PanelGeneral panelGeneral;
    private Usuario usuario;
    
    public DialogModificarUsuario(java.awt.Frame parent, boolean modal,PanelGeneral panelGeneral,Usuario user) {
        super(parent, modal);
        initComponents();
        this.panelGeneral = panelGeneral;
        rellenarCampos(user);
        this.setLocationRelativeTo(null);
        this.usuario = user;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelSeparador = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelAvatar = new javax.swing.JLabel();
        jComboBoxAvatar = new javax.swing.JComboBox<>();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelAvatarAdministrar = new javax.swing.JLabel();
        jCheckBoxAdministrar = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Usuario");
        setMinimumSize(new java.awt.Dimension(380, 500));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(250, 250, 250));
        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel.setMaximumSize(new java.awt.Dimension(380, 500));
        Panel.setMinimumSize(new java.awt.Dimension(380, 500));
        Panel.setPreferredSize(new java.awt.Dimension(380, 500));

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Modificar Usuario");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(358, 75));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(358, 75));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(358, 75));

        jPanelSeparador.setBackground(new java.awt.Color(0, 0, 0));
        jPanelSeparador.setMaximumSize(new java.awt.Dimension(358, 1));
        jPanelSeparador.setMinimumSize(new java.awt.Dimension(358, 1));
        jPanelSeparador.setPreferredSize(new java.awt.Dimension(358, 1));

        javax.swing.GroupLayout jPanelSeparadorLayout = new javax.swing.GroupLayout(jPanelSeparador);
        jPanelSeparador.setLayout(jPanelSeparadorLayout);
        jPanelSeparadorLayout.setHorizontalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        jPanelSeparadorLayout.setVerticalGroup(
            jPanelSeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLabelNombre.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre.setText("NOMBRE DE CUENTA");
        jLabelNombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelNombre.setMaximumSize(new java.awt.Dimension(358, 35));
        jLabelNombre.setMinimumSize(new java.awt.Dimension(358, 35));
        jLabelNombre.setPreferredSize(new java.awt.Dimension(358, 35));

        jTextFieldNombre.setMaximumSize(new java.awt.Dimension(358, 35));
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(358, 35));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(358, 35));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabelCorreo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCorreo.setText("CORREO ELECTRÓNICO");
        jLabelCorreo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelCorreo.setMaximumSize(new java.awt.Dimension(358, 35));
        jLabelCorreo.setMinimumSize(new java.awt.Dimension(358, 35));
        jLabelCorreo.setPreferredSize(new java.awt.Dimension(358, 35));

        jTextFieldCorreo.setMaximumSize(new java.awt.Dimension(358, 35));
        jTextFieldCorreo.setMinimumSize(new java.awt.Dimension(358, 35));
        jTextFieldCorreo.setPreferredSize(new java.awt.Dimension(358, 35));
        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });

        jLabelAvatar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelAvatar.setForeground(new java.awt.Color(102, 102, 102));
        jLabelAvatar.setText("AVATAR");
        jLabelAvatar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelAvatar.setMaximumSize(new java.awt.Dimension(358, 35));
        jLabelAvatar.setMinimumSize(new java.awt.Dimension(358, 35));
        jLabelAvatar.setPreferredSize(new java.awt.Dimension(358, 35));

        jComboBoxAvatar.setMaximumSize(new java.awt.Dimension(358, 35));
        jComboBoxAvatar.setMinimumSize(new java.awt.Dimension(358, 35));
        jComboBoxAvatar.setPreferredSize(new java.awt.Dimension(358, 35));

        jButtonAceptar.setBackground(new java.awt.Color(50, 150, 250));
        jButtonAceptar.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setMaximumSize(new java.awt.Dimension(150, 35));
        jButtonAceptar.setMinimumSize(new java.awt.Dimension(150, 35));
        jButtonAceptar.setPreferredSize(new java.awt.Dimension(150, 35));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(50, 150, 250));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(150, 35));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(150, 35));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(150, 35));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelAvatarAdministrar.setBackground(new java.awt.Color(68, 172, 4));
        jLabelAvatarAdministrar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelAvatarAdministrar.setForeground(new java.awt.Color(102, 102, 102));
        jLabelAvatarAdministrar.setText("ADMINISTRAR");

        jCheckBoxAdministrar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabelAvatarAdministrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxAdministrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBoxAvatar, 0, 0, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelSeparador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAvatarAdministrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxAdministrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jPanelSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        try {
            panelGeneral.getVp().iniciarSocket();
            panelGeneral.getVp().getSalida().writeInt(MODIFICAR_USUARIO);
            usuario.setNombre(jTextFieldNombre.getText());
            usuario.setCorreo(jTextFieldCorreo.getText());
            usuario.setAvatar(jComboBoxAvatar.getSelectedIndex());
            if(jCheckBoxAdministrar.isSelected())
                usuario.setAdministrar(1);
            else
                usuario.setAdministrar(0);
            panelGeneral.getVp().getSalida().writeUTF(panelGeneral.getVp().getGson().toJson(usuario));
            panelGeneral.getPanelUsuario().vaciarLista();
            panelGeneral.getPanelUsuario().busqueda();
            this.setVisible(false);
        } catch (IOException ex) {
        } catch (NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    public void rellenarCampos(Usuario usuario){
        jTextFieldNombre.setText(usuario.getNombre());
        jTextFieldCorreo.setText(usuario.getCorreo());
        
        if(usuario.isAdministrar()==1){
            jCheckBoxAdministrar.setSelected(true);
        }
        
        for(TipoAvatar avatar: TipoAvatar.values()){
            jComboBoxAvatar.addItem(avatar.getNumero()+"");
        }
        jComboBoxAvatar.setSelectedIndex(usuario.getAvatar());
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
            java.util.logging.Logger.getLogger(DialogModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogModificarUsuario dialog = new DialogModificarUsuario(new javax.swing.JFrame(), true, null, null);
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
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JCheckBox jCheckBoxAdministrar;
    private javax.swing.JComboBox<String> jComboBoxAvatar;
    private javax.swing.JLabel jLabelAvatar;
    private javax.swing.JLabel jLabelAvatarAdministrar;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelSeparador;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
