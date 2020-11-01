package vista;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Sesion;
import modelo.Usuario;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class PanelLogin extends javax.swing.JPanel implements Protocolo{

    private PanelInicial panelInicial;
    
    public PanelLogin() {
    }
    
    public PanelLogin(PanelInicial panelInicial) {
        this.panelInicial = panelInicial;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBienvenido = new javax.swing.JLabel();
        jLabelTituloCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelTituloContraseña = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelContraseñaOlvidada = new javax.swing.JLabel();
        jButtonIniciarSesion = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelRegistrarse = new javax.swing.JLabel();
        jPanelSeparador1 = new javax.swing.JPanel();
        jPanelSeparador2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(485, 345));
        setMinimumSize(new java.awt.Dimension(485, 345));

        jLabelBienvenido.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(102, 102, 102));
        jLabelBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenido.setText("¡Bienvenido!");
        jLabelBienvenido.setMaximumSize(new java.awt.Dimension(465, 35));
        jLabelBienvenido.setMinimumSize(new java.awt.Dimension(465, 35));
        jLabelBienvenido.setPreferredSize(new java.awt.Dimension(465, 35));

        jLabelTituloCorreo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelTituloCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloCorreo.setText("CORREO ELECTRÓNICO");
        jLabelTituloCorreo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTituloCorreo.setMaximumSize(new java.awt.Dimension(465, 35));
        jLabelTituloCorreo.setMinimumSize(new java.awt.Dimension(465, 35));
        jLabelTituloCorreo.setPreferredSize(new java.awt.Dimension(465, 35));

        jTextFieldCorreo.setMaximumSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.setMinimumSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.setPreferredSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });

        jLabelTituloContraseña.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelTituloContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloContraseña.setText("CONTRASEÑA");
        jLabelTituloContraseña.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTituloContraseña.setMaximumSize(new java.awt.Dimension(465, 35));
        jLabelTituloContraseña.setMinimumSize(new java.awt.Dimension(465, 35));
        jLabelTituloContraseña.setPreferredSize(new java.awt.Dimension(465, 35));

        jPasswordField.setMaximumSize(new java.awt.Dimension(465, 35));
        jPasswordField.setMinimumSize(new java.awt.Dimension(465, 35));
        jPasswordField.setPreferredSize(new java.awt.Dimension(465, 35));

        jLabelContraseñaOlvidada.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabelContraseñaOlvidada.setForeground(new java.awt.Color(50, 150, 250));
        jLabelContraseñaOlvidada.setText("¿Has olvidado la contraseña?");
        jLabelContraseñaOlvidada.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelContraseñaOlvidada.setMaximumSize(new java.awt.Dimension(165, 15));
        jLabelContraseñaOlvidada.setMinimumSize(new java.awt.Dimension(165, 15));
        jLabelContraseñaOlvidada.setPreferredSize(new java.awt.Dimension(165, 15));
        jLabelContraseñaOlvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelContraseñaOlvidadaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelContraseñaOlvidadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelContraseñaOlvidadaMouseExited(evt);
            }
        });

        jButtonIniciarSesion.setBackground(new java.awt.Color(50, 150, 250));
        jButtonIniciarSesion.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarSesion.setText("Iniciar Sesión");
        jButtonIniciarSesion.setMaximumSize(new java.awt.Dimension(465, 50));
        jButtonIniciarSesion.setMinimumSize(new java.awt.Dimension(465, 50));
        jButtonIniciarSesion.setPreferredSize(new java.awt.Dimension(465, 50));
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitulo.setText("¿Necesitas una cuenta?");
        jLabelTitulo.setMaximumSize(new java.awt.Dimension(120, 14));
        jLabelTitulo.setMinimumSize(new java.awt.Dimension(120, 14));
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(135, 14));

        jLabelRegistrarse.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabelRegistrarse.setForeground(new java.awt.Color(50, 150, 250));
        jLabelRegistrarse.setText("Registrarse");
        jLabelRegistrarse.setMaximumSize(new java.awt.Dimension(80, 14));
        jLabelRegistrarse.setMinimumSize(new java.awt.Dimension(80, 14));
        jLabelRegistrarse.setPreferredSize(new java.awt.Dimension(80, 14));
        jLabelRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRegistrarseMouseExited(evt);
            }
        });

        jPanelSeparador1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSeparador1.setMaximumSize(new java.awt.Dimension(60, 345));
        jPanelSeparador1.setMinimumSize(new java.awt.Dimension(60, 345));
        jPanelSeparador1.setPreferredSize(new java.awt.Dimension(60, 345));

        javax.swing.GroupLayout jPanelSeparador1Layout = new javax.swing.GroupLayout(jPanelSeparador1);
        jPanelSeparador1.setLayout(jPanelSeparador1Layout);
        jPanelSeparador1Layout.setHorizontalGroup(
            jPanelSeparador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanelSeparador1Layout.setVerticalGroup(
            jPanelSeparador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jPanelSeparador2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSeparador2.setMaximumSize(new java.awt.Dimension(60, 345));
        jPanelSeparador2.setMinimumSize(new java.awt.Dimension(60, 345));
        jPanelSeparador2.setPreferredSize(new java.awt.Dimension(60, 345));

        javax.swing.GroupLayout jPanelSeparador2Layout = new javax.swing.GroupLayout(jPanelSeparador2);
        jPanelSeparador2.setLayout(jPanelSeparador2Layout);
        jPanelSeparador2Layout.setHorizontalGroup(
            jPanelSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanelSeparador2Layout.setVerticalGroup(
            jPanelSeparador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContraseñaOlvidada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTituloCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelTituloContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanelSeparador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelContraseñaOlvidada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanelSeparador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSeparador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jLabelContraseñaOlvidadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContraseñaOlvidadaMouseEntered
        jLabelContraseñaOlvidada.setText("<html><u>¿Has olvidado la contraseña?</u></html>");
    }//GEN-LAST:event_jLabelContraseñaOlvidadaMouseEntered

    private void jLabelContraseñaOlvidadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContraseñaOlvidadaMouseExited
        jLabelContraseñaOlvidada.setText("¿Has olvidado la contraseña?");
    }//GEN-LAST:event_jLabelContraseñaOlvidadaMouseExited

    private void jLabelRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarseMouseEntered
        jLabelRegistrarse.setText("<html><u>Registrarse</u></html>");
    }//GEN-LAST:event_jLabelRegistrarseMouseEntered

    private void jLabelRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarseMouseExited
        jLabelRegistrarse.setText("Registrarse");
    }//GEN-LAST:event_jLabelRegistrarseMouseExited

    private void jLabelRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarseMouseClicked
        this.setVisible(false);
        panelInicial.getPanelRegistrarse().setVisible(true);
        panelInicial.getPanelRegistrarse().limpiarCampos();
    }//GEN-LAST:event_jLabelRegistrarseMouseClicked

    private void jLabelContraseñaOlvidadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContraseñaOlvidadaMouseClicked
        this.setVisible(false);
        panelInicial.getPanelRecuperarCuenta().setVisible(true);
        panelInicial.getPanelRecuperarCuenta().limpiarCampos();
    }//GEN-LAST:event_jLabelContraseñaOlvidadaMouseClicked

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        comprobarInicioSesion();
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    public void limpiarCampos(){
        jTextFieldCorreo.setText("");
        jPasswordField.setText("");
        limpiarTitulos();
    }
    
    public void limpiarTitulos(){
        jLabelTituloContraseña.setText("CONTRASEÑA");
        jLabelTituloContraseña.setForeground(new Color(102,102,102));
        jLabelTituloCorreo.setText("CORREO ELECTRÓNICO");
        jLabelTituloCorreo.setForeground(new Color(102,102,102));
    }
    
    public boolean comprobarInicioSesion(){
        boolean comprobacion = false;
        limpiarTitulos();
        try {
            if(comprobarCampos()){
                panelInicial.getVp().iniciarSocket();
                panelInicial.getVp().getSalida().writeInt(INICIAR_SESION);
                String pass = panelInicial.getVp().encriptarMensaje(String.copyValueOf(jPasswordField.getPassword()));
                Sesion sesion = new Sesion(jTextFieldCorreo.getText(),pass);
                panelInicial.getVp().getSalida().writeUTF(panelInicial.getVp().getGson().toJson(sesion));
                int result = panelInicial.getVp().getEntrada().readInt();
                if(result == SESION_INICIADA){
                    comprobacion = true;
                    panelInicial.getVp().setUsuario(panelInicial.getVp().getGson().fromJson((String)panelInicial.getVp().getEntrada().readUTF(), Usuario.class));
                    iniciarSesion();
                }
                else
                    JOptionPane.showMessageDialog(panelInicial, "Correo o contraseña no válida.");
            }
        } catch (IOException ioe) {
            System.out.println("Problema en la E/S del login");
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
        return comprobacion;
    }
    
    public void iniciarSesion(){
        
        panelInicial.getPanelCentral().setVisible(false);
        panelInicial.getPanelGeneral().setVisible(true);
        panelInicial.panelesSeparador(false);
        panelInicial.getPanelGeneral().getPanelPerfil().cargarDatos();
        limpiarCampos();
    }
    
    public boolean comprobarCampos(){
        boolean comprobacion = true;
        
        if(!panelInicial.comprobarCorreo(jTextFieldCorreo.getText())){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - No válido");
            jLabelTituloCorreo.setForeground(Color.RED);    
            comprobacion = false;
        }
        if(jTextFieldCorreo.getText().equals("")){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - Está Vacio");
            jLabelTituloCorreo.setForeground(Color.RED);
            comprobacion = false;
        }
        if(jTextFieldCorreo.getText().length()>32){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - Demasiado largo");
            jLabelTituloCorreo.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length<6){
            jLabelTituloContraseña.setText("CONTRASEÑA - Demasiado corta");
            jLabelTituloContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length==0){
            jLabelTituloContraseña.setText("CONTRASEÑA - Está Vacio");
            jLabelTituloContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length>16){
            jLabelTituloContraseña.setText("CONTRASEÑA - Demasiada larga");
            jLabelTituloContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        return comprobacion;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelContraseñaOlvidada;
    private javax.swing.JLabel jLabelRegistrarse;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloContraseña;
    private javax.swing.JLabel jLabelTituloCorreo;
    private javax.swing.JPanel jPanelSeparador1;
    private javax.swing.JPanel jPanelSeparador2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables
}
