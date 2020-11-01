package vista;

import java.awt.Color;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Usuario;
import util.Protocolo;

/**
 *
 * @author chorat
 */
public class PanelRegistrarse extends javax.swing.JPanel implements Protocolo {
    
    private PanelInicial panelInicial;
    
    public PanelRegistrarse() {
    }
    
    public PanelRegistrarse(PanelInicial panelInicial) {
        this.panelInicial = panelInicial;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSeparador1 = new javax.swing.JPanel();
        jPanelSeparador2 = new javax.swing.JPanel();
        jLabelCrearCuenta = new javax.swing.JLabel();
        jLabelTituloCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jButtonRegistrarse = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();
        jLabelTituloContraseña = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(485, 345));
        setMinimumSize(new java.awt.Dimension(485, 345));
        setPreferredSize(new java.awt.Dimension(485, 345));

        jPanelSeparador1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSeparador1.setMaximumSize(new java.awt.Dimension(60, 345));
        jPanelSeparador1.setMinimumSize(new java.awt.Dimension(60, 345));

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

        jLabelCrearCuenta.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        jLabelCrearCuenta.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCrearCuenta.setText("Crear una cuenta");
        jLabelCrearCuenta.setMaximumSize(new java.awt.Dimension(465, 35));
        jLabelCrearCuenta.setMinimumSize(new java.awt.Dimension(465, 35));
        jLabelCrearCuenta.setPreferredSize(new java.awt.Dimension(465, 35));

        jLabelTituloCorreo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelTituloCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloCorreo.setText("CORREO ELECTRÓNICO");
        jLabelTituloCorreo.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelTituloCorreo.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelTituloCorreo.setPreferredSize(new java.awt.Dimension(465, 15));

        jTextFieldCorreo.setMaximumSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.setMinimumSize(new java.awt.Dimension(465, 35));
        jTextFieldCorreo.setPreferredSize(new java.awt.Dimension(465, 35));

        jLabelNombreUsuario.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombreUsuario.setText("NOMBRE DE USUARIO");
        jLabelNombreUsuario.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelNombreUsuario.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelNombreUsuario.setPreferredSize(new java.awt.Dimension(465, 15));

        jTextFieldNombreUsuario.setMaximumSize(new java.awt.Dimension(465, 35));
        jTextFieldNombreUsuario.setMinimumSize(new java.awt.Dimension(465, 35));
        jTextFieldNombreUsuario.setPreferredSize(new java.awt.Dimension(465, 35));

        jButtonRegistrarse.setBackground(new java.awt.Color(50, 150, 250));
        jButtonRegistrarse.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        jButtonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.setMaximumSize(new java.awt.Dimension(465, 50));
        jButtonRegistrarse.setMinimumSize(new java.awt.Dimension(465, 50));
        jButtonRegistrarse.setPreferredSize(new java.awt.Dimension(465, 50));
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });

        jLabelLogin.setFont(new java.awt.Font("Rubik", 0, 11)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(50, 150, 250));
        jLabelLogin.setText("¿Ya tienes una cuenta?");
        jLabelLogin.setMaximumSize(new java.awt.Dimension(135, 14));
        jLabelLogin.setMinimumSize(new java.awt.Dimension(135, 14));
        jLabelLogin.setPreferredSize(new java.awt.Dimension(135, 14));
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseExited(evt);
            }
        });

        jLabelTituloContraseña.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabelTituloContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTituloContraseña.setText("CONTRASEÑA");
        jLabelTituloContraseña.setMaximumSize(new java.awt.Dimension(465, 15));
        jLabelTituloContraseña.setMinimumSize(new java.awt.Dimension(465, 15));
        jLabelTituloContraseña.setPreferredSize(new java.awt.Dimension(465, 15));

        jPasswordField.setMaximumSize(new java.awt.Dimension(465, 35));
        jPasswordField.setMinimumSize(new java.awt.Dimension(465, 35));
        jPasswordField.setPreferredSize(new java.awt.Dimension(465, 35));
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSeparador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTituloCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelTituloContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanelSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelSeparador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSeparador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTituloCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTituloContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButtonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
        limpiarTitulos();
        try {
            if(comprobarCampos()){
                panelInicial.getVp().iniciarSocket();
                panelInicial.getVp().getSalida().writeInt(REGISTRARSE);
                String pass = panelInicial.getVp().encriptarMensaje(String.copyValueOf(jPasswordField.getPassword()));
                Date fecha_alta = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
                Usuario user = new Usuario(0,jTextFieldNombreUsuario.getText(),pass,jTextFieldCorreo.getText(),0,fecha_alta);
                panelInicial.getVp().getSalida().writeUTF(panelInicial.getVp().getGson().toJson(user));
                
                int estado = panelInicial.getVp().getEntrada().readInt();
                if(estado==REGISTRARSE_CORREO_ERROR){
                    jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - Ya registrado");
                    jLabelTituloCorreo.setForeground(Color.red);
                }
                if(estado==REGISTRARSE_NOMBRE_CUENTA_ERROR){
                    jLabelNombreUsuario.setText("NOMBRE DE USUARIO - Ya registrado");
                    jLabelNombreUsuario.setForeground(Color.red);
                }
                if(estado==REGISTRARSE_EXITOSO){
                    JOptionPane.showMessageDialog(this,"Registro satisfactorio");
                    this.setVisible(false);
                    cambiarPanel();
                }
                if(estado==REGISTRARSE_FALLIDO)
                    JOptionPane.showMessageDialog(this,"Hubo un error inesperado en el registro");
            }
        } catch (IOException ex) {
        } catch(NullPointerException npe){
            JOptionPane.showMessageDialog(this,"Hubo un problema al intentar conectarse al servidor.");
        }
    }//GEN-LAST:event_jButtonRegistrarseActionPerformed

    private void jLabelLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseEntered
       jLabelLogin.setText("<html><u>¿Ya tienes una cuenta?</u></html>");
    }//GEN-LAST:event_jLabelLoginMouseEntered

    private void jLabelLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseExited
        jLabelLogin.setText("¿Ya tienes una cuenta?");
    }//GEN-LAST:event_jLabelLoginMouseExited

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        cambiarPanel();
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed
    
    public void cambiarPanel(){
        this.setVisible(false);
        panelInicial.getPanelLogin().setVisible(true);
        panelInicial.getPanelLogin().limpiarCampos();
    }
    
    public void limpiarCampos(){
        jTextFieldCorreo.setText("");
        jTextFieldNombreUsuario.setText("");
        jPasswordField.setText("");
        limpiarTitulos();
    }
    
    public void limpiarTitulos(){
        jLabelNombreUsuario.setText("NOMBRE DE USUARIO");
        jLabelNombreUsuario.setForeground(new Color(102,102,102));
        jLabelTituloContraseña.setText("CONTRASEÑA");
        jLabelTituloContraseña.setForeground(new Color(102,102,102));
        jLabelTituloCorreo.setText("CORREO ELECTRÓNICO");
        jLabelTituloCorreo.setForeground(new Color(102,102,102));
    }
    
    public boolean comprobarCampos(){
        boolean comprobacion = true;
        if(jTextFieldNombreUsuario.getText().isEmpty()){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - No válido");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldNombreUsuario.getText().length()<3){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - Demasiado corto");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldNombreUsuario.getText().length()>16){
            jLabelNombreUsuario.setText("NOMBRE DE USUARIO - Demasiado largo");
            jLabelNombreUsuario.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length<6){
            jLabelTituloContraseña.setText("CONTRASEÑA - Demasiado corta");
            jLabelTituloContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length>16){
            jLabelTituloContraseña.setText("CONTRASEÑA - Demasiada larga");
            jLabelTituloContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        if(jPasswordField.getPassword().length==0){
            jLabelTituloContraseña.setText("CONTRASEÑA - Está Vacio");
            jLabelTituloContraseña.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldCorreo.getText().length()>32){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - Demasiado largo");
            jLabelTituloCorreo.setForeground(Color.red);
            comprobacion = false;
        }
        if(jTextFieldCorreo.getText().equals("")){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - Está Vacio");
            jLabelTituloCorreo.setForeground(Color.RED);
            comprobacion = false;
        }
        if(!panelInicial.comprobarCorreo(jTextFieldCorreo.getText())){
            jLabelTituloCorreo.setText("CORREO ELECTRÓNICO - No válido");
            jLabelTituloCorreo.setForeground(Color.red);
            comprobacion = false;
        }
        return comprobacion;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JLabel jLabelCrearCuenta;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelTituloContraseña;
    private javax.swing.JLabel jLabelTituloCorreo;
    private javax.swing.JPanel jPanelSeparador1;
    private javax.swing.JPanel jPanelSeparador2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
